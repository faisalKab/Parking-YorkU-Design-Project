import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LoginPanel extends JPanel {
    private final MainSystem mainSystem = MainSystem.getInstance();
    private JComboBox<String> userTypeDropdown;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JButton switchModeButton;
    private JLabel modeLabel;
    private JLabel dropdownLabel;
    private JLabel actionMessage;
    private boolean isRegisterMode = false;
    private Consumer<String> switchTo;

    public LoginPanel(Consumer<String> switchTo) {
        //method for switching panels
        this.switchTo = switchTo;
        // main layout, using box to center everything vertically
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.LIGHT_GRAY);

        // used for making space at the top
        add(Box.createVerticalGlue());

        // text at the top that indicates login/register
        modeLabel = new JLabel("Login", JLabel.CENTER);
        modeLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        modeLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(modeLabel);

        // spacing
        add(Box.createVerticalStrut(20));

        // label above the dropdown indicating contents
        dropdownLabel = new JLabel("Select Login Type:");
        dropdownLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        dropdownLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(dropdownLabel);

        // dropdown for user/manger login types
        userTypeDropdown = new JComboBox<>(new String[]{"User", "Manager"});
        userTypeDropdown.setMaximumSize(new Dimension(300, 30));
        userTypeDropdown.setAlignmentX(CENTER_ALIGNMENT);
        add(userTypeDropdown);

        // spacing
        add(Box.createVerticalStrut(20));

        // username field
        usernameField = new JTextField(15);
        usernameField.setMaximumSize(new Dimension(300, 30));
        usernameField.setAlignmentX(CENTER_ALIGNMENT);
        usernameField.setBorder(BorderFactory.createTitledBorder("Username"));
        add(usernameField);

        // spacing
        add(Box.createVerticalStrut(20));

        // password field
        passwordField = new JPasswordField(15);
        passwordField.setMaximumSize(new Dimension(300, 30));
        passwordField.setAlignmentX(CENTER_ALIGNMENT);
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        add(passwordField);

        // spacing
        add(Box.createVerticalStrut(20));

        // submit button
        submitButton = new JButton("Submit");
        submitButton.setMaximumSize(new Dimension(200, 40));
        submitButton.setAlignmentX(CENTER_ALIGNMENT);
        add(submitButton);

        // spacing
        add(Box.createVerticalStrut(20));

        // button that lets you switch between login/register
        switchModeButton = new JButton("Switch to Register");
        switchModeButton.setMaximumSize(new Dimension(300, 40));
        switchModeButton.setAlignmentX(CENTER_ALIGNMENT);
        add(switchModeButton);

        // spacing
        add(Box.createVerticalStrut(10));

        // bottom label that displays success or failure of login or register
        actionMessage = new JLabel("", JLabel.CENTER);
        actionMessage.setFont(new Font("SansSerif", Font.BOLD, 14));
        actionMessage.setAlignmentX(CENTER_ALIGNMENT);
        actionMessage.setVisible(false); // Initially hidden
        add(actionMessage);

        // used for making space at the bottom
        add(Box.createVerticalGlue());

        // action listeners for the buttons
        switchModeButton.addActionListener(new SwitchModeListener());
        submitButton.addActionListener(new SubmitButtonListener());
    }

    // action listener for the switching to login/register
    private class SwitchModeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { //this triggers when button is clicked
            isRegisterMode = !isRegisterMode; // switch the mode

            if (isRegisterMode) {
                // switch to register mode
                modeLabel.setText("Register");
                dropdownLabel.setText("Select User Type:");
                //userTypeDropdown.setModel(new DefaultComboBoxModel<>(new String[]{"Student", "Faculty Member", "Non-Faculty Staff", "Visitor"}));
                userTypeDropdown.setModel(new DefaultComboBoxModel<>(new String[]{"Student", "Facultymember", "NonFacultystaff", "Visitor"}));
                switchModeButton.setText("Switch to Login");
            } else {
                // switch to login mode
                modeLabel.setText("Login");
                dropdownLabel.setText("Select Login Type:");
                userTypeDropdown.setModel(new DefaultComboBoxModel<>(new String[]{"User", "Manager"}));
                switchModeButton.setText("Switch to Register");
            }

            // Hide the success message whenever the mode changes
            actionMessage.setVisible(false);
        }
    }

    // action listener for submit button
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //the following if pervents empty fields and auto-ends the method if empty
            if (usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
                actionMessage.setText("Please fill in all fields.");
                actionMessage.setForeground(new Color(128, 0, 0));
                displayMessage();
                return;
            }
            if (isRegisterMode) {//they are registering
                if(mainSystem.isRegistered(usernameField.getText())){
                    actionMessage.setText("Username already exists, please try again.");
                    actionMessage.setForeground(new Color(128, 0, 0));
                    displayMessage();
                }else if(MainSystem.getInstance().validateFields(usernameField.getText(), passwordField.getText())){
                    if(userTypeDropdown.getSelectedItem().equals("Visitor")){
                        mainSystem.registerAccount("Visitor", usernameField.getText(), passwordField.getText()); //register in main system
                        actionMessage.setText("Visitor account created, please login to continue.");
                        mainSystem.updateFile(mainSystem.userFilePath);
                    }else{
                        mainSystem.registerAccount(userTypeDropdown.getSelectedItem().toString(), usernameField.getText(), passwordField.getText()); //register in main system
                        actionMessage.setText(userTypeDropdown.getSelectedItem() + " account created, requires approval from administrator.");
                        mainSystem.updateFile(mainSystem.userFilePath);
                    }
                    actionMessage.setForeground(new Color(0, 128, 0));
                    displayMessage();
                }else{
                    actionMessage.setText("<html>Username/Password format invalid, please try again.<br>Username must be an email<br>Password must be at least 8 characters and contain an uppercase, number, and symbol.</html>");
                    actionMessage.setForeground(new Color(128, 0, 0));
                    actionMessage.setVisible(true);
                    Timer timer = new Timer(8000, event -> actionMessage.setVisible(false));
                    timer.setRepeats(false);
                    timer.start();
                }
            } else { //they are logging in
                // simulate login success
                if(userTypeDropdown.getSelectedItem().equals("User")){ //login in as user
                    ArrayList<User> users = mainSystem.getApprovedUsers();
                    ArrayList<User> pendingUsers = mainSystem.getPendingUsers();
                    for(User u : users){
                        if(u.getUsername().equals(usernameField.getText()) && u.getPassword().equals(passwordField.getText())){
                            actionMessage.setText("Login successful.");
                            actionMessage.setForeground(new Color(0, 128, 0));
                            actionMessage.setVisible(true);
                            //added a timer to login after 1.5 swcond delay
                            Timer timer = new Timer(1000, event -> {
                                actionMessage.setVisible(false);
                                MainSystem.currentUser = u;
                                switchTo.accept("UserDashboard");
                            });
                            timer.setRepeats(false);
                            timer.start();
                            return;
                        }
                    }
                    for(User u : pendingUsers){
                        if(u.getUsername().equals(usernameField.getText()) && u.getPassword().equals(passwordField.getText())){
                            actionMessage.setText("Account pending approval, please contact administrator.");
                            actionMessage.setForeground(new Color(128, 0, 0));
                            displayMessage();
                            return;
                        }
                    }
                    actionMessage.setText("Username/Password combination invalid, please try again.");
                    actionMessage.setForeground(new Color(128, 0, 0));
                    displayMessage();
                }
                if (userTypeDropdown.getSelectedItem().equals("Manager")) {//logging in as manager
                    ArrayList<Manager> maangers = mainSystem.getManagers();
                    for(Manager m : maangers){
                        if(m.getUsername().equals(usernameField.getText()) && m.getPassword().equals(passwordField.getText())){
                            actionMessage.setText(" Manager Login successful.");
                            actionMessage.setForeground(new Color(0, 128, 0));
                            actionMessage.setVisible(true);
                            //added a timer to login after 1.5 swcond delay
                            Timer timer = new Timer(1000, event -> {
                                actionMessage.setVisible(false);
                                MainSystem.currentManager = m;
                                switchTo.accept("ManagementDashboard");
                            });
                            timer.setRepeats(false);
                            timer.start();
                            return;
                        }
                    }
                    //super manager login
                    if(usernameField.getText().equals("SUPERMAN") && passwordField.getText().equals("123456789")){
                        actionMessage.setText("Super Manager Login successful.");
                        actionMessage.setForeground(new Color(0, 128, 0));
                        actionMessage.setVisible(true);
                        //added a timer to login after 1.5 swcond delay
                        Timer timer = new Timer(1000, event -> {
                            actionMessage.setVisible(false);
                            MainSystem.currentManager = SuperManager.getInstance();
                            switchTo.accept("ManagementDashboard");
                        });
                        timer.setRepeats(false);
                        timer.start();
                        return;
                    }
                    actionMessage.setText("Username/Password combination invalid, please try again.");
                    actionMessage.setForeground(new Color(128, 0, 0));
                    displayMessage();
                }
            }
        }
    }

    //method for making the message show and go away after two second
    public void displayMessage() {
        actionMessage.setVisible(true);
        Timer timer = new Timer(2000, event -> actionMessage.setVisible(false));
        timer.setRepeats(false);
        timer.start();
    }

}