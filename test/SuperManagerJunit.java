import org.junit.*;
import static org.junit.Assert.*;

public class SuperManagerJunit {

	@Test
	public void testSingletonInstance() {
		SuperManager super1 = SuperManager.getInstance();
		SuperManager super2 = SuperManager.getInstance();
		
		assertSame("SuperManager should return the same instance as per Singleton requirements", super1, super2);
	}
	
	@Test
	public void testCreatedManagerHasValidPassword() {
		
		SuperManager superManager = SuperManager.getInstance();
		Manager manager = superManager.createManagerAccount();
		String password = manager.getPassword();
		 
		assertTrue("Password should be 8 characters long.", (password.length() == 8));
		assertTrue("Password should contain at least one uppercase letter.", password.matches(".*[A-Z].*"));
		assertTrue("Password should contain at least one number.", password.matches(".*\\d.*"));
		assertTrue("Password should contain at least one special character.", password.matches(".*[!@#$%^&*].*"));
	}
	
	@Test
	public void testCreatedManagerHasValidUsername() {
		
		SuperManager superManager = SuperManager.getInstance();
		Manager manager = superManager.createManagerAccount();
		String username = manager.getUsername();
		
		assertTrue("Username must be 8 characters long", (username.length() == 8));
		assertTrue("Username should not contain symbols", username.matches("^[A-Za-z0-9]+$"));
	}
	
	@Test
	public void testOnlySuperManagerCanCreateAccounts() {
		SuperManager superManager = SuperManager.getInstance();
		Manager regularManager = new Manager("username", "password");
		ManagerProxy proxyWithSuper = new ManagerProxy(superManager);
		ManagerProxy proxyWithRegular = new ManagerProxy(regularManager);
		
		Manager createdManager = proxyWithSuper.createManagerAccount();
		assertNotNull("SuperManager can create manager accounts", createdManager);
		
		try {
			proxyWithRegular.createManagerAccount();
			fail("Expects UnsupportedOperationException to be thrown when regular Manager tries to create account");
		}
		catch (UnsupportedOperationException e) {
			assertEquals("Only SuperManager can create manager accounts.", e.getMessage());
		}
	}
	
	@Test
	public void testGetters() {
		Manager manager = new Manager("username123", "password123");
		
		assertEquals("username123", manager.getUsername());
		assertEquals("password123", manager.getPassword());
	}
	
}
