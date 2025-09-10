package university;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a graduate course.
 * Implements the Course interface and includes a research focus.
 */
public class GraduateCourse implements Course {
    private String courseName;
    private String courseCode;
    private String researchFocus;
    private List<Person> participants;

    /**
     * Constructor to initialize a GraduateCourse object.
     *
     * @param courseName    Name of the course
     * @param courseCode    Code of the course
     * @param researchFocus Research focus of the course
     */
    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
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

    /**
     * Returns the research focus of the graduate course.
     *
     * @return research focus
     */
    public String getResearchFocus() {
        return researchFocus;
    }
}
