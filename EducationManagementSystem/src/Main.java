import entities.Instructor;
import entities.Student;
import managers.InstructorManager;
import managers.StudentManager;
import managers.UserManager;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        Instructor instructor = new Instructor(1, "John Doe", "john@example.com", "Computer Science");
        Student student = new Student(2, "Jane Smith", "jane@example.com", "Math 101");

        userManager.addUser(instructor);
        userManager.addUser(student);

        instructorManager.addCourse(instructor, "Java Programming");
        studentManager.enrollCourse(student, "Java Programming");

        instructorManager.removeCourse(instructor, "Java Programming");
        studentManager.dropCourse(student, "Java Programming");

        userManager.removeUser(instructor);
        userManager.removeUser(student);

    }
}