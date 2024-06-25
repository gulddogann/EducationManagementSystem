package managers;

import entities.Instructor;

public class InstructorManager extends UserManager {
    public void
    addCourse(Instructor instructor, String course) {
        System.out.println("Instructor:" + instructor.getName() + "added course:" + course);

    }

    public void removeCourse(Instructor instructor, String course) {
        System.out.println("Instructor " + instructor.getName() + " removed course: " + course);
    }
}
