package university;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an undergraduate course.
 * Implements the Course interface.
 */
public class UndergraduateCourse implements Course {
    private String courseName;
    private String courseCode;
    private List<Person> participants;
    /**
     * Constructor to initialize an UndergraduateCourse object.
     *
     * @param courseName Name of the course
     * @param courseCode Code of the course
     */
    public UndergraduateCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.participants = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public void addParticipant(Person person) {
        participants.add(person);
    }

    @Override
    public List<Person> getParticipants() {
        return participants;
    }
}
