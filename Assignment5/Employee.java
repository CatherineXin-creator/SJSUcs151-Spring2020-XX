package Assignment5;

public class Employee {
    private String firstName, lastName, employeeId;
    private double hourlyPay;

    public void computePay(int hourWorked) throws TooManyHoursWorkedException {

        if (hourWorked < 0) {
            throw new NumberFormatException("the working number can not be negative!");
        }
        if (hourWorked <= 40) {
            double payAmount = hourWorked * hourlyPay;
            System.out.println("The amount payed for this employee: $" + payAmount);
        } else {
            throw new TooManyHoursWorkedException("The part time employee can not work more than 40 hours a week.");
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

}
