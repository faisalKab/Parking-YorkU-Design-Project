import org.junit.*;

import static org.junit.Assert.*;

public class UserFactoryJunit {

	@Test
	public void testStudentDefaults() {
		Student student = new Student("studentUsername", "studentPassword");
		
		assertEquals("studentUsername", student.getUsername());
		assertEquals("studentPassword", student.getPassword());
		assertEquals(5, student.getRate());
		assertEquals(false, student.isApproved());
	}
	
	@Test
	public void testFacultyDefaults() {
		FacultyMember faculty = new FacultyMember("facultyUsername", "facultyPassword");
		
		assertEquals("facultyUsername", faculty.getUsername());
		assertEquals("facultyPassword", faculty.getPassword());
		assertEquals(8, faculty.getRate());
		assertEquals(false, faculty.isApproved());
	}
	
	@Test
	public void testNonFacultyDefaults() {
		NonFacultyStaff nonFaculty = new NonFacultyStaff("nonfacultyUsername", "nonfacultyPassword");
		
		assertEquals("nonfacultyUsername", nonFaculty.getUsername());
		assertEquals("nonfacultyPassword", nonFaculty.getPassword());
		assertEquals(10, nonFaculty.getRate());
		assertEquals(false, nonFaculty.isApproved());
	}
	
	@Test
	public void testVisitorDefaults() {
		Visitor visitor = new Visitor("visitorUsername", "visitorPassword");
		
		assertEquals("visitorUsername", visitor.getUsername());
		assertEquals("visitorPassword", visitor.getPassword());
		assertEquals(15, visitor.getRate());
		assertEquals(true, visitor.isApproved());
	}
	
	@Test
	public void testApprovalUpdate() {
		Student student = new Student("name", "password");
		
		assertEquals(false, student.isApproved());
		
		student.setApproved(true);
		
		assertEquals(true, student.isApproved());
	}
	
	@Test
	public void testCreateStudent() {
	    UserFactory factory = new UserFactory();
	    User user = factory.createUser("student", "user1", "pass1");

	    assertTrue(user instanceof Student);
	    assertEquals("user1", user.getUsername());
	    assertEquals(5, user.getRate());
	}

	@Test
	public void testCreateFacultyMember() {
	    UserFactory factory = new UserFactory();
	    User user = factory.createUser("facultymember", "user2", "pass2");

	    assertTrue(user instanceof FacultyMember);
	    assertEquals("user2", user.getUsername());
	    assertEquals(8, user.getRate());
	}

	@Test
	public void testCreateNonFacultyStaff() {
	    UserFactory factory = new UserFactory();
	    User user = factory.createUser("nonfacultystaff", "user3", "pass3");

	    assertTrue(user instanceof NonFacultyStaff);
	    assertEquals("user3", user.getUsername());
	    assertEquals(10, user.getRate());
	}

	@Test
	public void testCreateVisitor() {
	    UserFactory factory = new UserFactory();
	    User user = factory.createUser("visitor", "user4", "pass4");

	    assertTrue(user instanceof Visitor);
	    assertEquals("user4", user.getUsername());
	    assertEquals(15, user.getRate());
	}
	
	@Test
	public void testInvalidUserType() {
	    UserFactory factory = new UserFactory();

	    try {
	        factory.createUser("invalidType", "someUser", "somePass");
	        fail("Expected IllegalArgumentException to be thrown");
	    } catch (IllegalArgumentException e) {
	        assertEquals("Invalid user type: invalidType", e.getMessage());
	    }
	}
}
