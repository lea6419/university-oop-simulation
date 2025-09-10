package university;

/**
 * Represents a student in the university.
 * Inherits from Person and implements the study behavior.
 */
public class Student extends Person{

  private  String studentId;

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }
    @Override
    public String getRole() {
        return "Student";
    }
    /**
     * Describes the study activity of the student.
     *
     * @return A string describing the student's study
     */
    public String study() {
        return getName() + " is studying.";
    }
}
