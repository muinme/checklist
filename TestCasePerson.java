import junit.framework.TestCase;
public class TestCasePerson extends TestCase{
    public static class Person {
        private String firstName;
        private String lastName;
        public Person(String firstName, String lastName) {
            if (firstName == null && lastName == null) {
                throw new IllegalArgumentException("Both names cannot be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFullName() {
            String first = (this.firstName != null) ? this.firstName : "?";
            String last = (this.lastName != null) ? this.lastName : "?";
            return first + last;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
    }
    public TestCasePerson(String name) {
        super(name);
    }
    /**
     * Xac nhan rang name duoc the hien dung dinh dang
     */
    public void testGetFullName() {
        Person p = new Person("Aidan ", "Burke");
        assertEquals("Aidan Burke", p.getFullName());
    }
    /**
     * Xac nhan rang nulls da duoc xu ly chinh xac
     */
    public void testNullsInName() {
        Person p = new Person(null, "Burke");
        assertEquals("? Burke", p.getFullName());
        p = new Person("Tanner", null);
        assertEquals("Tanner ?", p.getFullName());
    }
}
