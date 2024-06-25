package entities;

public class Student extends User {
    private String entrolledCourse;

    public String getEntrolledCourse() {
        return entrolledCourse;
    }

    public void setEntrolledCourse(String entrolledCourse) {
        this.entrolledCourse = entrolledCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "entrolledCourse='" + entrolledCourse + '\'' +
                '}';
    }

    public Student(int id, String name, String email, String entrolledCourse) {
        super(id, name, email);
        this.entrolledCourse = entrolledCourse;



    }
}
