package Assignment2;

public class Student {
    String firstname;
    String lastname;
    int age;
    double gpa;
    String major;
    String department;


    Student(String firstname, String lastname, int age, double gpa, String major, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    public Student() {

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDepartment() {
        return department;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    class Course {
        void printSchedule() {

            System.out.println("First name: " +

                    getFirstname());
            System.out.println("Last name: " +

                    getLastname());
            System.out.println("Age: " +

                    getAge());
            System.out.println("GPA: " +

                    getGpa());
            System.out.println("Major: " +

                    getMajor());
            System.out.println("Department: " +

                    getDepartment());
        }
    }

}


