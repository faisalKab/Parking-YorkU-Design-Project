import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class ManagementDashboard extends JPanel {

    private Consumer<String> switchTo;

    public ManagementDashboard(Consumer<String> switchTo) {
        this.switchTo = switchTo;

        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("Management Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // error label to show restricted access
        JLabel restrictAccess = new JLabel("SUPER MANAGER ONLY");
        restrictAccess.setFont(new Font("SansSerif", Font.BOLD, 14));
        restrictAccess.setForeground(new Color(128, 0, 0));
        restrictAccess.setAlignmentX(Component.CENTER_ALIGNMENT);
        restrictAccess.setVisible(false); //hide by default

        // panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // aadd buttons
        buttonPanel.add(Box.createVerticalStrut(50)); //spacing
        addDashboardButton(buttonPanel, "Approve/Deny Accounts", "AccountsView");
        buttonPanel.add(Box.createVerticalStrut(50)); // spacing
        addDashboardButton(buttonPanel, "Manage Parking Lots", "LotsView");
        buttonPanel.add(Box.createVerticalStrut(50)); // spacing
        JButton generateAccountsButton = createRestrictedButton("Generate Accounts", restrictAccess); //this button has restricted access
        buttonPanel.add(generateAccountsButton);
        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        // reserve space for the error label
        JPanel restrictAccessPanel = new JPanel();
        restrictAccessPanel.setLayout(new BoxLayout(restrictAccessPanel, BoxLayout.Y_AXIS));
        restrictAccessPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        restrictAccessPanel.add(restrictAccess);
        restrictAccessPanel.setMaximumSize(new Dimension(250, 20));

        buttonPanel.add(restrictAccessPanel); // add the restricted access message container
        buttonPanel.add(Box.createVerticalStrut(20)); // spacing

        addDashboardButton(buttonPanel, "Logout", "Login");
        buttonPanel.add(Box.createVerticalStrut(10)); // final spacing

        // add button panel to the center of the dashboard
        add(buttonPanel, BorderLayout.CENTER);
    }

    //helper method for adding buttons
    private void addDashboardButton(JPanel buttonPanel, String text, String panelToSwitchTo) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));
        button.setMaximumSize(new Dimension(250, 100));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(e -> switchTo.accept(panelToSwitchTo));
        buttonPanel.add(button);
    }

    //helper method for the gen accounts button
    private JButton createRestrictedButton(String text, JLabel restrictAccess) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));
        button.setMaximumSize(new Dimension(250, 100));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(e -> {
            //for now this will always restrict access, I will implement this later
            if (MainSystem.currentManager == SuperManager.getInstance()) {
                System.out.println("Super manager access granted.");
                switchTo.accept("GenerateAccountView");

            }else{
                restrictAccess.setVisible(true);

                //timer allows the error to only show for one second
                Timer timer = new Timer(1000, event -> restrictAccess.setVisible(false));
                timer.setRepeats(false);
                timer.start();
            }
        });
        return button;
    }
}