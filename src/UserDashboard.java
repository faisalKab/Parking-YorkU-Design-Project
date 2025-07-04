import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class UserDashboard extends JPanel {

    private Consumer<String> switchTo;

    public UserDashboard(Consumer<String> switchTo) {
        this.switchTo = switchTo;

        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("User Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)); // this layout allows for vertical allignment

        // add buttons
        buttonPanel.add(Box.createVerticalStrut(50)); // spacing
        addDashboardButton(buttonPanel, "Create Booking", "UserBookLot");
        buttonPanel.add(Box.createVerticalStrut(50)); // spacing
        addDashboardButton(buttonPanel, "My Bookings", "UserBookings");
        buttonPanel.add(Box.createVerticalStrut(50)); // spacing
        addDashboardButton(buttonPanel, "Logout", "Login");

        // add the button panel to the center
        add(buttonPanel, BorderLayout.CENTER);
    }

    //helper method for adding buttons
    private void addDashboardButton(JPanel buttonPanel, String text, String panelToSwitchTo) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));                      //font
        button.setMaximumSize(new Dimension(200, 100));                           //size
        button.setAlignmentX(Component.CENTER_ALIGNMENT);                                     //center-align
        button.addActionListener(e -> switchTo.accept(panelToSwitchTo));           //sets what panel this button wil switch to
        buttonPanel.add(button);
    }
}