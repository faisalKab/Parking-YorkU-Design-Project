import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ManagementLotsView extends JPanel {
    private ArrayList<ParkingLot> parkinglots = MainSystem.getInstance().getLots();
    private DefaultListModel<String> lotListModel;
    private JList<String> lotList;
    private JPanel spacePanel;
    private final Color GREEN = new Color(127, 255, 212);
    private final Color RED = new Color(255, 127, 127);

    public ManagementLotsView(Consumer<String> switchTo) {
        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("Parking Lot Management", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // creating a split pane to hold parts of this view
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(300);

        // list that will hold the list of lots
        lotListModel = new DefaultListModel<>();
        lotList = new JList<>(lotListModel);
        lotList.setFont(new Font("SansSerif", Font.PLAIN, 16));

        loadLots();

        // listener for the list of lots
        lotList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && lotList.getSelectedValue() != null) { //only trigger is an actual lot is selected
                int selectedLotIndex = lotList.getSelectedIndex();
                loadSpacesForLot(selectedLotIndex);
            }
        });

        //this is the actual panel that holds the list of lots
        JScrollPane lotScrollPane = new JScrollPane(lotList);
        splitPane.setLeftComponent(lotScrollPane);

        // this panel will display the parking spaces
        spacePanel = new JPanel(new GridLayout(10, 10, 5, 5));
        splitPane.setRightComponent(spacePanel);


        add(splitPane, BorderLayout.CENTER);

        // bottom Panel for adding lot button and back button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton addLotButton = new JButton("Add Parking Lot");
        addLotButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        addLotButton.addActionListener(e -> onAddParkingLot());

        JButton backButton = new JButton("Back to Dashboard");
        backButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        backButton.addActionListener(e -> switchTo.accept("ManagementDashboard"));

        buttonPanel.add(addLotButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    //method for when manager makes a new lot
    private void onAddParkingLot() {
        String newLotName = JOptionPane.showInputDialog(this, "Enter Parking Lot Name:");
        if (newLotName != null && !newLotName.trim().isEmpty()) {
            MainSystem.getInstance().lots.add(new ParkingLot(newLotName));
            this.parkinglots = MainSystem.getInstance().getLots();
            lotListModel.addElement(newLotName);
        }
    }

    //method for loading parking spaces
    private void loadSpacesForLot(int lot) {
        spacePanel.removeAll(); // clear previous spaces

        ParkingSpace[] spaces = parkinglots.get(lot).getSpaces();
        for (ParkingSpace space : spaces) {
            JButton bt = new JButton(String.valueOf(space.getIndex()));
            if (space.getState().getClass().getSimpleName().equals("EmptyState")) {
                bt.setBackground(GREEN);
                bt.addActionListener(e -> {
                    //fill with options
                    toggleSpace((JButton) e.getSource(), lot);

                });
            }else if(space.getState().getClass().getSimpleName().equals("MaintenanceState")){
                bt.setBackground(Color.ORANGE);
                bt.addActionListener(e -> {
                    //edit options
                    toggleSpace((JButton) e.getSource(), lot);
                });
            }else if(space.getState().getClass().getSimpleName().equals("OccupiedState")){
                bt.setBackground(RED);
                bt.addActionListener(e -> {
                    //edit options
                    JOptionPane.showMessageDialog(null, "Space is booked and therefore can not be edited.");
                });
            }
            bt.setOpaque(true);
            bt.setBorderPainted(false);

            spacePanel.add(bt);
        }
        // Refresh the space panel
        spacePanel.revalidate();
        spacePanel.repaint();
    }
    //call this when making the panel, as well as when new lots are made
    private void loadLots(){
        for (ParkingLot lot : this.parkinglots) {
            if (lot.getEnabled()) {// only show user the lot if its enabled
                lotListModel.addElement(lot.getLotName());
            }
        }
    }

    //method for toggles between available and unavailable spaces, might change how this works when I implement more code
    private void toggleSpace(JButton spaceButton, int lotIndex) {
        ParkingLot lot = parkinglots.get(lotIndex);

        if (spaceButton.getBackground().equals(GREEN)) {
            spaceButton.setBackground(Color.ORANGE); // Disable the space
            lot.setSpace(Integer.parseInt(spaceButton.getText()), "MaintenanceState", "Empty", "Empty");
            JOptionPane.showMessageDialog(this, spaceButton.getText() + " is disabled for maintenance.");
        } else {
            spaceButton.setBackground(GREEN); // Enable the space
            lot.setSpace(Integer.parseInt(spaceButton.getText()), "EmptyState", "Empty", "Empty");
            JOptionPane.showMessageDialog(this, spaceButton.getText() + " is now available.");
        }
        loadSpacesForLot(lotIndex); //refresh the lot
    }
}