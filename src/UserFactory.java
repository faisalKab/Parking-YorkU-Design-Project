abstract class User {
    protected String username;
    protected String password;
    protected boolean approved;
    protected int rate;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getRate() {
        return rate;
    }
    public boolean isApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
class Student extends User {
    protected boolean approved;
    public Student(String username, String password) {
        super(username, password);
        this.rate = 5; // specific rate for students
    }
}
class FacultyMember extends User {
    public FacultyMember(String username, String password) {
        super(username, password);
        this.rate = 8; // specific rate for faculty members
    }
}
class NonFacultyStaff extends User {
    public NonFacultyStaff(String username, String password) {
        super(username, password);
        this.rate = 10; // specific rate for non-faculty staff
    }
}
class Visitor extends User {
    public Visitor(String username, String password) {
        super(username, password);
        this.approved = true; //only type that is approved by default
        this.rate = 15; // specific rate for visitors
    }
}
public class UserFactory {
    public User createUser(String userType, String username, String password) {
        switch (userType.toLowerCase()) {
            case "student":
                return new Student(username, password);
            case "facultymember":
                return new FacultyMember(username, password);
            case "nonfacultystaff":
                return new NonFacultyStaff(username, password);
            case "visitor":
                return new Visitor(username, password);
            default:
                throw new IllegalArgumentException("Invalid user type: " + userType);
        }
    }
}