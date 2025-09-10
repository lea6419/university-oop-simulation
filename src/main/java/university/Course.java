package university;

import java.util.List;

/**
 * Interface representing a university course.
 * Defines methods to manage course information and participants.
 */
public interface Course {

    /**
     * Returns the name of the course.
     *
     * @return course name
     */
    String getCourseName();

    /**
     * Returns the course code.
     *
     * @return course code
     */
    String getCourseCode();

    /**
     * Adds a participant (Person) to the course.
     *
     * @param person Person to add
     */
    void addParticipant(Person person);

    /**
     * Returns the list of participants in the course.
     *
     * @return list of participants
     */
    List<Person> getParticipants();
}
