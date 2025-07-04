import com.csvreader.CsvReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class UserBookingsView extends JPanel {

    private static DefaultListModel<String> bookingListModel;
    private JList<String> bookingList;

    public UserBookingsView(Consumer<String> switchTo) {
        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("My Bookings", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // a list to hold user bookings
        bookingListModel = new DefaultListModel<>();
        bookingList = new JList<>(bookingListModel);
        bookingList.setFont(new Font("SansSerif", Font.PLAIN, 16));

        //scroll panel for displaying the bookings
        JScrollPane scrollPane = new JScrollPane(bookingList);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane, BorderLayout.CENTER);

        // bottom panel with action buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        //cancel button action
        addButton(buttonPanel, "Cancel Booking", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    onCancelBooking();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        //extend button action
        addButton(buttonPanel, "Extend Booking Time", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onExtendBooking();
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        //switch back to dash button
        addButton(buttonPanel, "Back to Dashboard", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchTo.accept("UserDashboard");
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

    //this method will work based on parking space data, for now I just wrote some example code
    private void onCancelBooking() throws Exception{
        if (bookingList.getSelectedValue() != null) {
            String lot = bookingList.getSelectedValue().split(": ")[0];
            String index = bookingList.getSelectedValue().split(": ")[1].split(" ")[1];
            CsvReader reader = new CsvReader("data/parkingSpaceData.csv");
            reader.readHeaders();
            while(reader.readRecord()){
                if(reader.get("lot").equals(lot) && reader.get("index").equals(index)){
                    //update the space to be empty
                    MainSystem.getInstance().getLots().get(Integer.parseInt(lot))
                            .setSpace(Integer.parseInt(index), "EmptyState", "Empty", "Empty");
                    //update file
                    MainSystem.getInstance().updateFile("data/parkingSpaceData.csv");
                    break;
                }
            }
            bookingListModel.removeElement(bookingList.getSelectedValue());

            JOptionPane.showMessageDialog(this, "Booking canceled successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to cancel.");
        }
    }

    //this method will work based on parking space data, for now I just wrote some example code
    private void onExtendBooking() {
        if (bookingList.getSelectedValue() != null) {
            JOptionPane.showMessageDialog(this, "Booking time extended for: " + bookingList.getSelectedValue());
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to extend.");
        }
    }

    //temp method for filling the view without actual data
    public static void populateUserBookings() throws Exception{
        bookingListModel.removeAllElements();//without this previous bookings stack on top of each other
        CsvReader reader = new CsvReader("data/parkingSpaceData.csv");
        reader.readHeaders();
        while(reader.readRecord()){
            String user = reader.get("user");
            if(user.equals(MainSystem.currentUser.getUsername())){
                bookingListModel.addElement(reader.get("lot") +
                        ": Parking Space " + reader.get("index") +
                        ": "+ reader.get("car"));
            }
        }
    }
}