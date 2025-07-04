import java.util.*;
import java.io.FileWriter;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.util.regex.*;

//maybe treat this as a facade design pattern
public class MainSystem {
    private static MainSystem instance;
    //need to track who is logged in
    public static User currentUser;
    public static ManagerRole currentManager;
    //file for storing user info
    public static final String userFilePath = "data/userData.csv";
    //file for storing maanger accounts
    public static final String managerFilePath = "data/managerData.csv";
    //file for sotring lot info
    public static final String lotFilePath = "data/lotData.csv";
    public static final String parkingSpaceFilePath = "data/parkingSpaceData.csv";

    public ArrayList<ParkingLot> lots = new ArrayList<>();
    public static ArrayList<Manager> managers = new ArrayList<>();
    private ArrayList<User> approvedUsers = new ArrayList<>();
    private ArrayList<User> pendingUsers = new ArrayList<>();
    private UserFactory userFactory = new UserFactory();
    private MainSystem(){
        loadData();
        //below code is commented out but can be edited and uncommented to add users to files manually
//
//        this.registerAccount("Visitor", "Josh", "j123");
//        this.registerAccount("Student", "Ben", "b123");
//
//        SuperManager sp = SuperManager.getInstance();
//        this.managers.add(sp.createManagerAccount());
//        this.managers.add(sp.createManagerAccount());
//        this.managers.add(sp.createManagerAccount());
//
//        this.lots.add(new ParkingLot("Lot 1"));
//        this.lots.add(new ParkingLot("Lot 2"));
//        this.lots.add(new ParkingLot("Lot 3"));
//
//        updateFile( userFilePath );
//        updateFile( managerFilePath );
//        updateFile( lotFilePath );
//        updateFile( parkingSpaceFilePath );

    }

    public static MainSystem getInstance(){
        if(instance == null){
            instance = new MainSystem();
        }
        return instance;
    }
    public ArrayList<ParkingLot> getLots(){
        return lots;
    }
    public ArrayList<Manager> getManagers(){
        return managers;
    }
    public ArrayList<User> getApprovedUsers(){
        return approvedUsers;
    }
    public ArrayList<User> getPendingUsers(){
        return pendingUsers;
    }

    public void registerAccount(String type,String username, String password){
        if (type.equals("Visitor")) { //visitor approved by default
            approvedUsers.add(userFactory.createUser(type, username, password));
        } else {
            pendingUsers.add(userFactory.createUser(type, username, password));
        }
    }
    public boolean isRegistered(String username){
    	//If a user is already registered (or pending), return true else return false
    	for (User user : approvedUsers) {
    		if (user.getUsername().equals(username)) {
    			return true;
    		}
    	}
    	//This is the condition we can decide to keep or remove depending on if we want to count pending users as registered.
    	for (User user : pendingUsers) {
    		if (user.getUsername().equals(username)) {
    			return true;
    		}
    	}
    	return false;
    }
    public void approveAccount(String username, boolean approved){
        for (User user : pendingUsers) {
            if (user.getUsername().equals(username)) {
                if (approved) {
                    user.setApproved(true);
                    approvedUsers.add(user);
                    pendingUsers.remove(user);
                    break;
                }else{
                    user.setApproved(false);
                    pendingUsers.remove(user);
                }
            }
        }
    }
    
    //Function to validate usernames (emails) and passwords based on our criteria
    public boolean validateFields(String username, String password) {
    	try {
    		validateUsername(username);
    		validatePassword(password);
    		return true;
    	}
    	catch (IllegalArgumentException e){
    		System.out.println("Validation failed: " + e.getMessage());
    		return false;
    	}
    }
    
    
    private Boolean validateUsername(String username) {
    	//This is actually validation for our email
    	if (username == null || username.isEmpty()) {
    		throw new IllegalArgumentException("Email can not be empty");
    	}
    	if (isRegistered(username)) {
    		throw new IllegalArgumentException("Email is already taken");
    	}
    	
    	String usernameConditions = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    	
    	if (!Pattern.matches(usernameConditions, username)) {
    		throw new IllegalArgumentException("Invalid Email Format");
    	}
    	
    	return true;
    }
    
    private Boolean validatePassword(String password) {
        String passwordConditions = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (!Pattern.matches(passwordConditions, password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters and contain an uppercase, number and symbol.");
        }
        return true;
    }
    
    public void loadData(){
        try{
            loadFiles();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //below are methods for files
    //this loads data form the file into this classes lists
    //you wanna call this on program launch to get all data from the files into the porgram
    public void loadFiles() throws Exception{
        System.out.println("Loading files...");
        CsvReader reader = new CsvReader(userFilePath);
        reader.readHeaders();
        //users update
        while(reader.readRecord()){
            String type = reader.get("type");
            String username = reader.get("email");
            String approvalStatus = reader.get("approved");
            String password = reader.get("password");
            if(type.equals("Visitor")){//if visitor its auto approved
                approvedUsers.add(userFactory.createUser(type, username, password));
            }else{//if they are not a visitor check if they are aprroved or not
                if(approvalStatus.equals("true")){
                    approvedUsers.add(userFactory.createUser(type, username, password));
                }else{
                    pendingUsers.add(userFactory.createUser(type, username, password));
                }
            }
        }
        //managers update
        reader = new CsvReader(managerFilePath);
        reader.readHeaders();
        while(reader.readRecord()){
            String username = reader.get("email");
            String password = reader.get("password");
            managers.add(new Manager(username, password));
        }
        //update lots
        reader = new CsvReader(lotFilePath);
        reader.readHeaders();
        while(reader.readRecord()){
            String name = reader.get("name");
            ParkingLot lot = new ParkingLot(name);
            lot.setEnabled(reader.get("enabled").equals("true")); //make the lot enabled if it was enabled in the data sheet
            lots.add(lot);

        }
        //update spaces, will prolly edit later to also update user pesonal booking list
        reader = new CsvReader(parkingSpaceFilePath);
        reader.readHeaders();
        while(reader.readRecord()){
            String lotName = reader.get("lot");
            int index = Integer.parseInt(reader.get("index"));
            String state = reader.get("state");
            String user = reader.get("user");
            String car = reader.get("car");
            for (ParkingLot lot : lots) {
                if (lot.getLotName().equals(lotName)) {
                    lot.setSpace(index, state, user, car);
                    break;
                }
            }
        }
    }
    public void updateAllFiles(){
        System.out.println("Updating all files...");
        try{
            updateFile(userFilePath);
            updateFile(managerFilePath);
            updateFile(lotFilePath);
            updateFile(parkingSpaceFilePath);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //this updates whatever file you call this method with
    //you wanna call this when new users or maanges are made, i will link this to gui
    public void updateFile(String path){
        System.out.println("Updating file: " + path);
        switch (path) {
            case "data/userData.csv":
                try{
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
                    //email,password, approval status, type
                    csvOutput.write("email");
                    csvOutput.write("password");
                    csvOutput.write("approved");
                    csvOutput.write("type");
                    csvOutput.endRecord();
                    //update users file
                    for (User u: this.approvedUsers) {
                        csvOutput.write(u.getUsername());
                        csvOutput.write(u.getPassword());
                        csvOutput.write("true");
                        csvOutput.write(u.getClass().getSimpleName());
                        csvOutput.endRecord();
                    }
                    for (User u: this.pendingUsers) {
                        csvOutput.write(u.getUsername());
                        csvOutput.write(u.getPassword());
                        csvOutput.write("false");
                        csvOutput.write(u.getClass().getSimpleName());
                        csvOutput.endRecord();
                    }
                    csvOutput.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
                return;
            case "data/managerData.csv":
                try{
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
                    //email,password
                    csvOutput.write("email");
                    csvOutput.write("password");
                    csvOutput.endRecord();
                    //update managers file
                    for (Manager u: this.managers) {
                        csvOutput.write(u.getUsername());
                        csvOutput.write(u.getPassword());
                        csvOutput.endRecord();
                    }
                    csvOutput.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
                return;
            case "data/lotData.csv":
                try{
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
                    //name, enabled
                    csvOutput.write("name");
                    csvOutput.write("enabled");
                    csvOutput.endRecord();
                    //update parking lots file
                    for (ParkingLot u: this.lots) {
                        csvOutput.write(u.getLotName());
                        csvOutput.write(u.getEnabled() ? "true" : "false");
                        csvOutput.endRecord();
                    }
                    csvOutput.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
                return;
            case "data/parkingSpaceData.csv":
                try{
                    CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
                    //lot it belongs to, index, state, user, car
                    csvOutput.write("lot");
                    csvOutput.write("index");
                    csvOutput.write("state");
                    csvOutput.write("user");
                    csvOutput.write("car");
                    csvOutput.endRecord();
                    //update spaces file
                    for (ParkingLot u: this.lots) {
                        for (ParkingSpace p: u.getSpaces()) {
                            csvOutput.write(u.getLotName());
                            csvOutput.write(String.valueOf(p.getIndex()));
                            csvOutput.write(p.getState().getClass().getSimpleName());
                            csvOutput.write(p.getCurrentUser());
                            csvOutput.write(p.getCurrentCar());
                            csvOutput.endRecord();
                        }
                    }
                    csvOutput.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
                return;
        }
    }
}
