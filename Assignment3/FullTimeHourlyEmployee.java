package Assignment3;

public class FullTimeHourlyEmployee extends Employee {
    double hourlySalary;
    double hoursWorked;

    public FullTimeHourlyEmployee() {
    }

    public FullTimeHourlyEmployee(double v, double v1) {
    }

    public void computePay() {
        double payForYear = hourlySalary * hoursWorked;
        System.out.println("The total salary for this employee is: $" + Math.round(payForYear));

    }

    public void introduction() {
        System.out.println();
        System.out.println("Full-time Hourly Employee Information:");
        System.out.println("First Name:           " + getFirstName());
        System.out.println("Last Name:            " + getLastName());
        System.out.println("Age:                  " + getAge());
        System.out.println("SSN:                  " + getSsn());
        System.out.println("Id #:                 " + getEmployeeId());
        System.out.println("Direct Deposit:       " + getDirectDeposit());
        System.out.println("Special Accommodation:" + getSpecialAccommodation());
        System.out.println("Hourly Salary:       $" + getHourlySalary());
        System.out.println("Hours Worked:         " + getHoursWorked());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
