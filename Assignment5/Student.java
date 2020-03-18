package Assignment5;

public class Student extends Course {
    public String firstName, lastName, major, department;
    public int age;
    public float gpa;
    private Course cs151;
    private Course cs149;
    private Course math161a;
    private Course cs157a;


    public Student() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
    }


    public void printStudentInfo() {
        Course cs151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Course cs149 = new Course("CS149", "Operating System", "CS", "1:30pm", "Tue");
        Course math161a = new Course("Math161a", "Statistics and probability", "MATH", "4:00pm", "Monday");
        Course cs157a = new Course("CS157A", "Introduction to Database Management Systems", "CS", "1:30pm", "Monday");
        System.out.println("Student Info: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:  " + lastName);
        System.out.println("Age:        " + age);
        System.out.println("GPA:        " + gpa);
        System.out.println("Major:      " + major);
        System.out.println("Department: " + department);

        System.out.println("\nClasses taking Info: ");
        System.out.println(cs151.getCourseName() + "\n" + cs151.getCourseDescription() + "\n" + cs151.getDepartment() + "\n" + cs151.getTimeStarts() + "  " + cs151.getDayToMeet() + "\n");
        System.out.println(cs149.getCourseName() + "\n" + cs149.getCourseDescription() + "\n" + cs149.getDepartment() + "\n" + cs149.getTimeStarts() + "  " + cs149.getDayToMeet() + "\n");
        System.out.println(math161a.getCourseName() + "\n" + math161a.getCourseDescription() + "\n" + math161a.getDepartment() + "\n" + math161a.getTimeStarts() + "  " + math161a.getDayToMeet() + "\n");
        System.out.println(cs157a.getCourseName() + "\n" + cs157a.getCourseDescription() + "\n" + cs157a.getDepartment() + "\n" + cs157a.getTimeStarts() + "  " + cs157a.getDayToMeet() + "\n");
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
