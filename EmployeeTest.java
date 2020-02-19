<<<<<<< HEAD
package Assignment2;

public class EmployeeTest extends Employee {
    public EmployeeTest(String s, String contractor, int i, int i1, int i2) {
        super(s, contractor, i, i1, i2);
    }

    public static void main(String[] args) {


        Person person1 = new Person("Joe", "Smith", 32, "758394", "273 Apple Ave", "Male", 164.6f);
        Employee employee1 = new Employee();
        employee1.setEmployeeId(101);
        employee1.setEmployeeStatus("Contractor");
        employee1.setStartDate(30);
        employee1.setHourlyPay(60);
        employee1.setYearlyPay(0);
        person1.introduce();
        employee1.employeeInfo();
        employee1.calculatePay();


        Person person2 = new Person("Lisa", "Gray", 28, "574839", "486 Banana Dr", "Female", 136.7f);
        Employee employee2 = new Employee();
        employee2.setEmployeeId(102);
        employee2.setEmployeeStatus("Full time employee");
        employee2.setStartDate(0.036);
        employee2.setHourlyPay(0);
        employee2.setYearlyPay(110000);
        person2.introduce();
        employee2.employeeInfo();
        employee2.calculatePay();


        Person person3 = new Person("Timothy", "Briggs", 23, "538593", "684 Orange Rd", "Male", 157.3f);
        Employee employee3 = new Employee();
        employee3.setEmployeeId(103);
        employee3.setEmployeeStatus("Full time employee");
        employee3.setStartDate(0.077);
        employee3.setHourlyPay(0);
        employee3.setYearlyPay(80000);
        person3.introduce();
        employee3.employeeInfo();
        employee3.calculatePay();


        //Employee employee4 = new Employee("004", "Part time employee", 25, 20, 0);

        Person person4 = new Person("George", "Wallace", 43, "384956", "759 Grape Hill Ave", "Male", 168.7f);
        Employee employee4 = new Employee();
        employee4.setEmployeeId(104);
        employee4.setEmployeeStatus("Part time employee");
        employee4.setStartDate(25);
        employee4.setHourlyPay(20);
        employee4.setYearlyPay(0);
        person4.introduce();
        employee4.employeeInfo();
        employee4.calculatePay();


        Person person5 = new Person("Amy", "Student", 30, "748564", "389 Strawberry", "Female", 189.6f);
        Employee employee5 = new Employee();
        employee5.setEmployeeId(105);
        employee5.setEmployeeStatus("Contractor");
        employee5.setStartDate(45);
        employee5.setHourlyPay(45);
        employee5.setYearlyPay(0);
        person5.introduce();
        employee5.employeeInfo();
        employee5.calculatePay();

    }
}
=======
package Assignment2;

public class EmployeeTest extends Employee {
    public EmployeeTest(String s, String contractor, int i, int i1, int i2) {
        super(s, contractor, i, i1, i2);
    }

    public static void main(String[] args) {


        Person person1 = new Person("Joe", "Smith", 32, "758394", "273 Apple Ave", "Male", 164.6f);
        Employee employee1 = new Employee();
        employee1.setEmployeeId(101);
        employee1.setEmployeeStatus("Contractor");
        employee1.setStartDate(30);
        employee1.setHourlyPay(60);
        employee1.setYearlyPay(0);
        person1.introduce();
        employee1.employeeInfo();
        employee1.calculatePay();


        Person person2 = new Person("Lisa", "Gray", 28, "574839", "486 Banana Dr", "Female", 136.7f);
        Employee employee2 = new Employee();
        employee2.setEmployeeId(102);
        employee2.setEmployeeStatus("Full time employee");
        employee2.setStartDate(0.036);
        employee2.setHourlyPay(0);
        employee2.setYearlyPay(110000);
        person2.introduce();
        employee2.employeeInfo();
        employee2.calculatePay();


        Person person3 = new Person("Timothy", "Briggs", 23, "538593", "684 Orange Rd", "Male", 157.3f);
        Employee employee3 = new Employee();
        employee3.setEmployeeId(103);
        employee3.setEmployeeStatus("Full time employee");
        employee3.setStartDate(0.077);
        employee3.setHourlyPay(0);
        employee3.setYearlyPay(80000);
        person3.introduce();
        employee3.employeeInfo();
        employee3.calculatePay();


        //Employee employee4 = new Employee("004", "Part time employee", 25, 20, 0);

        Person person4 = new Person("George", "Wallace", 43, "384956", "759 Grape Hill Ave", "Male", 168.7f);
        Employee employee4 = new Employee();
        employee4.setEmployeeId(104);
        employee4.setEmployeeStatus("Part time employee");
        employee4.setStartDate(25);
        employee4.setHourlyPay(20);
        employee4.setYearlyPay(0);
        person4.introduce();
        employee4.employeeInfo();
        employee4.calculatePay();


        Person person5 = new Person("Amy", "Student", 30, "748564", "389 Strawberry", "Female", 189.6f);
        Employee employee5 = new Employee();
        employee5.setEmployeeId(105);
        employee5.setEmployeeStatus("Contractor");
        employee5.setStartDate(45);
        employee5.setHourlyPay(45);
        employee5.setYearlyPay(0);
        person5.introduce();
        employee5.employeeInfo();
        employee5.calculatePay();

    }
}
>>>>>>> 54c0caf4cb2055ce7bf3a7e8908f42970735a27c
