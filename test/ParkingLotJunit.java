import org.junit.*;
import static org.junit.Assert.*;
public class ParkingLotJunit {
    private ParkingLot lot;

    @Before
    public void setUp() {
        lot = new ParkingLot("Test Lot");
    }

    @Test
    public void testInitialization() {
        assertEquals("Test Lot", lot.getLotName());
        assertTrue("Lot should be enabled", lot.getEnabled());
        assertEquals(100, lot.getSpaces().length);
    }

    @Test
    public void testSetAndGetEnabled() {
        lot.setEnabled(false);
        assertFalse(lot.getEnabled());

        lot.setEnabled(true);
        assertTrue(lot.getEnabled());
    }

    @Test
    public void testSetAndGetSpace() {
        lot.setSpace(5, "OccupiedState", "testUser", "ABC123");
        ParkingSpace space = lot.getSpace(5);

        assertEquals(5, space.getIndex());
        assertEquals("OccupiedState", space.getState().getClass().getSimpleName());
        assertEquals("testUser", space.getCurrentUser());
        assertEquals("ABC123", space.getCurrentCar());
    }

    @Test
    public void testAddAndGetBooking() {
        Booking booking = new Booking(
                10,
                "Jeep",
                "Visa 43211234",
                3,
                45.00,
                15.00,
                "user@example.com"
        );

        lot.addBooking(booking);

        Booking retrieved = lot.getBooking(10);
        assertNotNull(retrieved);
        assertEquals(10, retrieved.getSpaceIndex());
        assertEquals("Jeep", retrieved.getCarInfo());
        assertEquals("Visa 43211234", retrieved.getPaymentInfo());
        assertEquals(3, retrieved.getDuration());
        assertEquals(45.00, retrieved.getTotalCost(), 0.001);
        assertEquals(15.00, retrieved.getDeposit(), 0.001);
        assertEquals("user@example.com", retrieved.getEmail());
    }

    @Test
    public void testRemoveBooking() {
        Booking booking = new Booking(
                20,
                "Jeep",
                "Visa 43211234",
                3,
                45.00,
                15.00,
                "user@example.com"
        );

        lot.addBooking(booking);
        assertNotNull(lot.getBooking(20));

        lot.removeBooking(20);
        assertNull(lot.getBooking(20));
    }
}
