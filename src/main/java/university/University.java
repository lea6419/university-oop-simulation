package university;

public class University {
    public static void main(String[] args) {
        // יצירת סטודנט ופרופסור
        Student s1 = new Student("Lea", 22, "Bnei Brak", "S12345");
        Professor p1 = new Professor("Dr. Cohen", 45, "Jerusalem", "Computer Science");

        // יצירת קורסים
        UndergraduateCourse ugCourse = new UndergraduateCourse("Intro to Programming", "CS101");
        GraduateCourse gCourse = new GraduateCourse("Advanced AI", "CS501", "Machine Learning");

        // הוספת משתתפים
        ugCourse.addParticipant(s1);
        ugCourse.addParticipant(p1);

        gCourse.addParticipant(p1);

        // הדפסת פרטי הקורסים
        System.out.println("Undergraduate Course: " + ugCourse.getCourseName());
        for (Person p : ugCourse.getParticipants()) {
            System.out.println(p.getName() + " - " + p.getRole());
        }

        System.out.println("\nGraduate Course: " + gCourse.getCourseName());
        for (Person p : gCourse.getParticipants()) {
            System.out.println(p.getName() + " - " + p.getRole());
        }
    }
}
