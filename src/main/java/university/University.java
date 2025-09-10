package university;

/**
 * Main class to demonstrate the University system.
 * Creates students, professors, and courses, adds participants,
 * and prints their roles and activities for demonstration.
 */
public class University {
    public static void main(String[] args) {

        // יצירת סטודנטים
        Student s1 = new Student("Lea", 22, "Bnei Brak", "S12345");
        Student s2 = new Student("David", 24, "Tel Aviv", "S67890");

        // יצירת פרופסורים
        Professor p1 = new Professor("Dr. Cohen", 45, "Jerusalem", "Computer Science");
        Professor p2 = new Professor("Dr. Levy", 50, "Haifa", "Mathematics");

        // יצירת קורסים
        UndergraduateCourse ugCourse = new UndergraduateCourse("Intro to Programming", "CS101");
        GraduateCourse gCourse = new GraduateCourse("Advanced AI", "CS501", "Machine Learning");

        // הוספת משתתפים לקורסים
        ugCourse.addParticipant(s1);
        ugCourse.addParticipant(s2);
        ugCourse.addParticipant(p1);

        gCourse.addParticipant(p1);
        gCourse.addParticipant(p2);

        // הדפסת פרטי הקורסים והמשתתפים
        System.out.println("Undergraduate Course: " + ugCourse.getCourseName());
        for (Person p : ugCourse.getParticipants()) {
            System.out.println(p.getName() + " - " + p.getRole());
            // שימוש בפונקציות ספציפיות לכל סוג
            if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println(student.study());
            } else if (p instanceof Professor) {
                Professor professor = (Professor) p;
                System.out.println(professor.teach());
            }
        }


        System.out.println("\nGraduate Course: " + gCourse.getCourseName());
        for (Person p : gCourse.getParticipants()) {
            System.out.println(p.getName() + " - " + p.getRole());
            if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println(student.study());
            } else if (p instanceof Professor) {
                Professor professor = (Professor) p;
                System.out.println(professor.teach());
            }

        }
    }
}
