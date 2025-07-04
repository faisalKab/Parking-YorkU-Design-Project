import com.csvreader.CsvReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ManagementAccountsView extends JPanel {

    private static DefaultListModel<String> accountListModel;
    private JList<String> accountList;

    public ManagementAccountsView(Consumer<String> switchTo) {
        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("Pending Account Approvals", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // a list to hold user accounts
        accountListModel = new DefaultListModel<>();
        accountList = new JList<>(accountListModel);

        //scroll panel for displaying the accounts
        accountList.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(accountList);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane, BorderLayout.CENTER);

        //populatePendingAccounts(); //temp method to test out code

        // bottom panel with action buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        addButton(buttonPanel, "Approve", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onApproveAccount();
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        addButton(buttonPanel, "Deny", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDenyAccount();
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        addButton(buttonPanel, "Back to Dashboard", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchTo.accept("ManagementDashboard");
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        add(buttonPanel, BorderLayout.SOUTH);
    }

    //helper method for making the buttons
    private void addButton(JPanel panel, String text, AbstractAction action) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));
        button.setMaximumSize(new Dimension(250, 50));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(action);
        panel.add(button);
    }

    //temp method for filling the view without actual data
    public static void populatePendingAccounts() throws Exception {
        accountListModel.removeAllElements();//without this previous accounts stack on top of each other
        CsvReader reader = new CsvReader(MainSystem.userFilePath);
        reader.readHeaders();
        while(reader.readRecord()){
            if(reader.get("approved").equals("false")){
                String user = reader.get("email");
                String type = reader.get("type");
                accountListModel.addElement(type + " Account - " + user);

            }
        }
    }

    //this method will work based on account data, for now I just wrote some example code
    private void onApproveAccount() {
        if (accountList.getSelectedValue() != null) {
            String selectedAccount = accountList.getSelectedValue();
            updateAccount(true);
            accountListModel.removeElement(selectedAccount);
            JOptionPane.showMessageDialog(this, "Account Approved: " + selectedAccount);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an account to approve.");
        }
    }

    //this method will work based on account data, for now I just wrote some example code
    private void onDenyAccount() {
        if (accountList.getSelectedValue() != null) {
            String selectedAccount = accountList.getSelectedValue();
            updateAccount(false);
            accountListModel.removeElement(selectedAccount);
            JOptionPane.showMessageDialog(this, "Account Denied: " + selectedAccount);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an account to deny.");
        }
    }

    private void updateAccount(boolean approved){
        String user = accountList.getSelectedValue().split(" - ")[1];
        try {
            CsvReader reader = new CsvReader(MainSystem.userFilePath);
            reader.readHeaders();
            while(reader.readRecord()){
                if(reader.get("email").equals(user)){
                    MainSystem.getInstance().approveAccount(user, approved);
                    MainSystem.getInstance().updateFile(MainSystem.userFilePath);//update file
                    populatePendingAccounts();//reload the view
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}