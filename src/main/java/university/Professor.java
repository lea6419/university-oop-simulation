package university;
/**
 * Represents a professor in the university.
 * Inherits from Person and implements the teaching behavior.
 */
public class Professor extends Person{
    private String department;

    public Professor(String name, int age, String address, String department) {
        super(name, age, address);
        this.department=department;

    }

    @Override
    public String getRole() {
        return "Professor";
    }
    public String teach() {
        return getName() + " is teaching in " + department + " department.";
    }
}
