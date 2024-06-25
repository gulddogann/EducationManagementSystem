package managers;

import entities.Student;

public class StudentManager extends UserManager {
    public void enrollCourse(Student student, String course) {
        System.out.println("Student " + student.getName() + " enrolled in course: " + course);
    }

    public void dropCourse(Student student, String course) {
        System.out.println("Student " + student.getName() + " dropped course: " + course);
    }
}
