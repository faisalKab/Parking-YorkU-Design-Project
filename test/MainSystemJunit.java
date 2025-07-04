import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class MainSystemJunit {
    private MainSystem system;

    @Before
    public void setUp() {
        system = MainSystem.getInstance();

        // cases assume an empty list
        // the system normally loads data from files, and we cant test for things like correct size if we do that
        system.getApprovedUsers().clear();
        system.getPendingUsers().clear();
    }

    @Test
    public void testSingletonInstance() {
        MainSystem system2 = MainSystem.getInstance();
        assertSame("Should return the same instance", system, system2);
    }

    @Test
    public void testRegisterVisitorGoesToApproved() {
        system.registerAccount("Visitor", "visitor@test.com", "Password1!");
        List<User> approved = system.getApprovedUsers();
        assertEquals(1, approved.size()); //confirming that only one instance of it is added
        assertEquals("visitor@test.com", approved.get(0).getUsername());
    }

    @Test
    public void testRegisterStudentGoesToPending() {
        system.registerAccount("Student", "student@test.com", "Password1!");
        List<User> pending = system.getPendingUsers();
        assertEquals(1, pending.size()); //confirming that only one instance of it is added
        assertEquals("student@test.com", pending.get(0).getUsername());
    }

    @Test
    public void testApproveAccountMovesUser() {
        system.registerAccount("Student", "student@test.com", "Password1!");
        system.approveAccount("student@test.com", true);

        boolean foundInApproved = false;
        for (User user : system.getApprovedUsers()) {
            if (user.getUsername().equals("student@test.com")) {
                foundInApproved = true;
                break;
            }
        }

        boolean foundInPending = false;
        for (User user : system.getPendingUsers()) {
            if (user.getUsername().equals("student@test.com")) {
                foundInPending = true;
                break;
            }
        }

        assertTrue("User should be in approved list", foundInApproved);
        assertFalse("User should not be in pending list", foundInPending);
    }

    @Test
    public void testValidateFieldsValid() {
        boolean result = system.validateFields("newuser@test.com", "Secure1@pass");
        assertTrue(result);
    }

    @Test
    public void testValidateFieldsInvalidUsername() {
        boolean result = system.validateFields("badEmail", "Secure1@pass");
        assertFalse(result);
    }

    @Test
    public void testValidateFieldsWeakPassword() {
        boolean result = system.validateFields("user@example.com", "weakpass");
        assertFalse(result);
    }

    @Test
    public void testValidateUsername_Empty() {
        boolean valid = system.validateFields("", "Valid1@pass");
        assertFalse(valid);
    }

    @Test
    public void testValidateUsername_InvalidFormat() {
        boolean valid = system.validateFields("invalid-email", "Valid1@pass");
        assertFalse(valid);
    }

    @Test
    public void testValidateUsername_AlreadyTaken() {
        system.registerAccount("Visitor", "duplicate@test.com", "Valid1@pass");
        boolean valid = system.validateFields("duplicate@test.com", "Another1@pass");
        assertFalse(valid);
    }

    @Test
    public void testValidatePassword_TooWeak() {
        boolean valid = system.validateFields("newuser@test.com", "weakpass");
        assertFalse(valid);
    }

    @Test
    public void testValidatePassword_ValidPassword() {
        boolean valid = system.validateFields("strongpass@test.com", "Strong1@pass");
        assertTrue(valid);
    }

    @Test
    public void testIsRegisteredDetectsApproved() {
        system.registerAccount("Visitor", "exist@test.com", "Pass1@word");
        assertTrue(system.isRegistered("exist@test.com"));
    }

    @Test
    public void testIsRegisteredDetectsPending() {
        system.registerAccount("Student", "pending@test.com", "Pass1@word");
        assertTrue(system.isRegistered("pending@test.com"));
    }

    @Test
    public void testIsRegisteredReturnsFalse() {
        assertFalse(system.isRegistered("notexist@test.com"));
    }

    @Test
    public void testGetLotsReturnsReference() {
        List<ParkingLot> lots = system.getLots();
        assertNotNull(lots);
    }

    @Test
    public void testGetManagersReturnsReference() {
        List<Manager> result = system.getManagers();
        assertNotNull(result);
    }

    @Test
    public void testGetApprovedUsersReturnsReference() {
        List<User> result = system.getApprovedUsers();
        assertNotNull(result);
    }

    @Test
    public void testGetPendingUsersReturnsReference() {
        List<User> result = system.getPendingUsers();
        assertNotNull(result);
    }

    // these 2 make sure the program doesnt break when calling the file methods
    // not testing the actual file contents as that would require much more code
    @Test
    public void testUpdateAllFilesDoesNotThrow() {
        system.updateAllFiles(); //checks for exception
        assertTrue(true); // if we reach here, no exception thrown
    }


    @Test
    public void testLoadDataDoesNotThrow() {
        system.loadData(); //checks for exception
        assertTrue(true); // if we reach here, no exception thrown
    }
}
