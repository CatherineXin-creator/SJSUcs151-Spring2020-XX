package Assignment5;

public class EmployeeTest {
    public static void main(String[] args) throws TooManyHoursWorkedException {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setEmployeeId("101");
        employee.setHourlyPay(35);
        employee.computePay(45);


    }
}
