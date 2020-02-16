package Assignment2;

public class StudentTest extends Student {

    StudentTest(String firstname, String lastname, int age, double gpa, String major, String department) {
        super(firstname, lastname, age, gpa, major, department);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setFirstname("John");
        st.setLastname("Smith");
        st.setAge(20);
        st.setGpa(3.6);
        st.setMajor("Computer Science");
        st.setDepartment("School of Computer Science ");
        Student.Course course = st.new Course();
        course.printSchedule();

    }

}
