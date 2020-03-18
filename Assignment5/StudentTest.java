package Assignment5;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Smith");
        student.setAge(20);
        student.setGpa((float) 3.6);
        student.setMajor("Computer Science");
        student.setDepartment("School of Computer Science department");
        student.printStudentInfo();
    }
}
