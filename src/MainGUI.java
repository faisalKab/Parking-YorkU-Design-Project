import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainGUI extends JFrame{
    private static MainGUI instance;
    CardLayout cardLayout;
    JPanel mainPanel;

    //singleton
    public static MainGUI getInstance(){
        if(instance == null){
            instance = new MainGUI();
        }
        return instance;
    }
    private MainGUI(){
        super("ParkingSoftware"); //window title
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);


        //adding all the panels for different parts of the GUI
        mainPanel.add(new LoginPanel(this::switchTo),"Login");
        mainPanel.add(new UserDashboard(this::switchTo),"UserDashboard");
        //mainPanel.add(new UserBookLot(this::switchTo, MainSystem.currentUser),"UserBookLot");
        mainPanel.add(new UserBookingsView(this::switchTo),"UserBookings");
        mainPanel.add(new ManagementDashboard(this::switchTo),"ManagementDashboard");
        mainPanel.add(new ManagementAccountsView(this::switchTo), "AccountsView");
        mainPanel.add(new ManagementLotsView(this::switchTo), "LotsView");
        mainPanel.add(new GenerateAccountView(this::switchTo), "GenerateAccountView");
        cardLayout.show(mainPanel,"Login");
        this.add(mainPanel);



    }

//we pass this method to each panel, allows us to change panels
public void switchTo(String panel){
    if(Objects.equals(panel, "UserBookings")){//only trigger this when switching to user bookings in order to dynamically update
        try {
            UserBookingsView.populateUserBookings();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Check if we're switching to UserBookLot
    if(Objects.equals(panel, "UserBookLot")){
        // Remove the existing UserBookLot panel if it exists
        Component[] components = mainPanel.getComponents();
        for (Component comp : components) {
            if (comp instanceof UserBookLot) {
                mainPanel.remove(comp);
                break;
            }
        }

        // Add a new UserBookLot panel with the current user
        mainPanel.add(new UserBookLot(this::switchTo), "UserBookLot");
    }
    if(Objects.equals(panel, "AccountsView")){
        try {
            ManagementAccountsView.populatePendingAccounts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    if(Objects.equals(panel, "GenerateAccountView")){
        try {
            GenerateAccountView.populateAccounts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //update all files when anyone switches to a dash board, done to save data more often
    if(Objects.equals(panel, "UserDashboard") || Objects.equals(panel, "ManagementDashboard")){
        MainSystem.getInstance().updateFile(MainSystem.userFilePath);
    }

    cardLayout.show(mainPanel,panel);
}

public static void main(String[] args) {
    System.out.println("Hello, World!");

    JFrame frame = MainGUI.getInstance();                   //MainGUI is implemented as a singleton
    frame.setSize(1280,720);
    frame.setResizable(false);                              //makes it so that the window can not be resized, I did this to make it have a consistent look
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    frame.setVisible(true);
    }

}