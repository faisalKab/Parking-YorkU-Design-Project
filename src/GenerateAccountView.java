import com.csvreader.CsvReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class GenerateAccountView extends JPanel {
    private static DefaultListModel<String> accountListModel;
    private JList<String> accountList;

    public GenerateAccountView(Consumer<String> switchTo) {

        setLayout(new BorderLayout(10, 10));


        JLabel titleLabel = new JLabel("Account Management", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);


        accountListModel = new DefaultListModel<>();
        accountList = new JList<>(accountListModel);

        JScrollPane scrollPane = new JScrollPane(accountList);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Accounts List"));
        add(scrollPane, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        JButton backButton = new JButton("Back to Main");
        backButton.addActionListener((ActionEvent e) -> {
            if (switchTo != null) {
                switchTo.accept("ManagementDashboard");
            }
        });
        buttonPanel.add(backButton);


        JButton generateButton = new JButton("Generate New Account");
        generateButton.addActionListener((ActionEvent e) -> {
            if (switchTo != null) {
                MainSystem.managers.add(SuperManager.getInstance().createManagerAccount());
                MainSystem.getInstance().updateFile(MainSystem.managerFilePath);
                JOptionPane.showMessageDialog(null, "New Account Generated.");
                try {
                    populateAccounts();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        buttonPanel.add(generateButton);


        add(buttonPanel, BorderLayout.SOUTH);

        // Populate the default data (you can fill in real data dynamically if needed)
        //populateAccounts();
    }

    // Method to populate the account list with data (can be improved with real data from a backend/database)
    public static void populateAccounts() throws Exception {
        accountListModel.removeAllElements();//without this previous accounts stack on top of each other
        CsvReader reader = new CsvReader(MainSystem.managerFilePath);
        reader.readHeaders();
        while(reader.readRecord()){
            String user = reader.get("email");
            String pass = reader.get("password");
            accountListModel.addElement("Username: " + user + " Password: " + pass);
        }
    }
}
