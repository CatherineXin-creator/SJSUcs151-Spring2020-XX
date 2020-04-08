package Assignment6;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Course extends ArrayList<Course> {
    private String courseName, courseDescription, department, timeStarts, dayHasClass;

    public Course(String courseName, String courseDescription, String department, String timeStarts, String dayHasClass) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.timeStarts = timeStarts;
        this.dayHasClass = dayHasClass;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", department='" + department + '\'' +
                ", timeStarts='" + timeStarts + '\'' +
                ", dayHasClass='" + dayHasClass + '\'' +
                '}';
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

    public String getDayHasClass() {
        return dayHasClass;
    }

    public void setDayHasClass(String dayHasClass) {
        this.dayHasClass = dayHasClass;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }
}
