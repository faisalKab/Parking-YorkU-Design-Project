//state design pattern
interface ParkingSpaceState{
    void book(ParkingSpace space);
    void empty(ParkingSpace space);
    void setMaintenance(ParkingSpace space);
}
class EmptyState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space Booked");
        space.setState(new OccupiedState());
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking Space already Empty");
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space set to maintenance");
    }
}
class OccupiedState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space already occupied");
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking space is now free.");
        space.setState(new EmptyState());
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space can not be set to maintenance as its already booked");
    }
}
class MaintenanceState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space can not be booked as its already under maintenance");
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking space is now free.");
        space.setState(new EmptyState());
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space already in maintenance");
    }
}
public class ParkingSpace {
    private ParkingSpaceState state;
    private int index;
    private String currentUser;
    private String currentCar;

    public ParkingSpace(int num, String state, String user, String car) {
        this.index = num;
        this.state = this.mapStateFromString(state);
        this.currentUser = user;
        this.currentCar = car;
    }
    public int getIndex(){
        return index;
    }
    public String getCurrentUser(){
        return currentUser;
    }
    public String getCurrentCar(){
        return currentCar;
    }
    public ParkingSpaceState getState(){
        return state;
    }
    public void setState(ParkingSpaceState state){
        this.state = state;
    }
    public void book(String car){
        state.book(this);
    }
    public void empty(){
        state.empty(this);
    }
    public void setMaintenance(){
        state.setMaintenance(this);
    }
    private ParkingSpaceState mapStateFromString(String state) {
        switch (state) {
            case "EmptyState":
                return new EmptyState();
            case "OccupiedState":
                return new OccupiedState();
            case "MaintenanceState":
                return new MaintenanceState();
        }
        return null;
    }

}
