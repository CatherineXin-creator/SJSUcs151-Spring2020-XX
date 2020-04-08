package Assignment6;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    private String firstName, lastName, major, department;
    private int age;
    private double gpa;
    private static ArrayList<Course> courses;

    public Student(String firstName, String lastName, String major, String department, int age, double gpa, ArrayList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        courses = new ArrayList<Course>();
    }

    public static void addCourse(ArrayList<Course> course) {

        courses.add((Course) course);

    }

    public static void removeCourse(ArrayList<Course> course) {
        courses.remove(course);

    }

    public static void sortCourses(ArrayList<Course> course, boolean b) {
        courses.sort(Comparator.comparing(Course::getCourseDescription));
        System.out.println(courses);

    }

    public static void methodSortCourses(Course course, boolean sortByDescription) {
        if (sortByDescription = true) {
            sortCourses(courses, true);
        } else {
            System.out.println("Sorry, we only can sort the courses by description");
        }

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}
