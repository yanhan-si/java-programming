package lesson1.creating_classes;

public class Student extends Person{
    private String studentId;
    public Student(String firstname, String lastname, String studentid) {
        super(firstname, lastname);
        this.studentId = studentid;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return super.toString() + " student ID " + studentId;
    }
}
