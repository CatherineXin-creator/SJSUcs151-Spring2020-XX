package Assignment5;

public class Course {
    public String courseName, courseDescription, department, timeStarts, dayToMeet;

    public Course() {
    }

    public Course(String courseName, String courseDescription, String department, String timeStarts, String dayToMeet) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.timeStarts = timeStarts;
        this.dayToMeet = dayToMeet;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTimeStarts() {
        return timeStarts;
    }

    public void setTimeStarts(String timeStarts) {
        this.timeStarts = timeStarts;
    }

    public String getDayToMeet() {
        return dayToMeet;
    }

    public void setDayToMeet(String dayToMeet) {
        this.dayToMeet = dayToMeet;
    }

}
