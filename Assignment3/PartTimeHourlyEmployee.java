package Assignment3;

public class PartTimeHourlyEmployee extends Employee {
    double hourlySalary;
    double hoursWorked;
    double overWorkTime;

    PartTimeHourlyEmployee() {

    }

    public PartTimeHourlyEmployee(double hourlySalary, double hoursWorked, double overWorkTime) {
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
        this.overWorkTime = overWorkTime;

    }

    public void computePay() {
        double payForYear = hourlySalary * (hoursWorked + overWorkTime);
        System.out.println("The total salary for this employee is: $" + Math.round(payForYear));

    }

    public void introduction() {
        System.out.println();
        System.out.println("Part-time Hourly Employee Information:");
        System.out.println("First Name:           " + getFirstName());
        System.out.println("Last Name:            " + getLastName());
        System.out.println("Age:                  " + getAge());
        System.out.println("SSN:                  " + getSsn());
        System.out.println("Id #:                 " + getEmployeeId());
        System.out.println("Direct Deposit:       " + getDirectDeposit());
        System.out.println("Special Accommodation:" + getSpecialAccommodation());
        System.out.println("Hourly Salary:       $" + getHourlySalary());
        System.out.println("Hours Worked:         " + getHoursWorked());
        System.out.println("Extra Hours Worked:   " + getOverWorkTime());

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

    public double getOverWorkTime() {
        return overWorkTime;
    }

    public void setOverWorkTime(double overWorkTime) {
        this.overWorkTime = overWorkTime;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
