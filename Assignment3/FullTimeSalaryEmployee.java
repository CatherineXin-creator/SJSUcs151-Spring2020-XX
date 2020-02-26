package Assignment3;

public class FullTimeSalaryEmployee extends Employee {
    double yearlySalary;
    double weeksWorked;
    double yearlyBonus;

    public FullTimeSalaryEmployee() {
    }

    public FullTimeSalaryEmployee(double v, double v1, double v2) {
        this.yearlySalary = yearlySalary;
        this.weeksWorked = weeksWorked;
        this.yearlyBonus = yearlyBonus;


    }

    public void computePay() {
        double payForYear = (yearlySalary / 52) * weeksWorked + yearlyBonus;
        System.out.println("The total salary for this employee is: $" + Math.round(payForYear));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void introduction() {
        System.out.println();
        System.out.println("Full-time Salary Employee Information: ");
        System.out.println("First Name:           " + getFirstName());
        System.out.println("Last Name:            " + getLastName());
        System.out.println("Age:                  " + getAge());
        System.out.println("SSN:                  " + getSsn());
        System.out.println("Id #:                 " + getEmployeeId());
        System.out.println("Direct Deposit:       " + getDirectDeposit());
        System.out.println("Special Accommodation:" + getSpecialAccommodation());
        System.out.println("Yearly Salary:       $" + getYearlySalary());
        System.out.println("Yearly Bonus:        $" + getYearlyBonus());
        System.out.println("Weeks Worked:         " + getWeekWorked());
    }


    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getWeekWorked() {
        return weeksWorked;
    }

    public void setWeekWorked(double weekWorked) {
        this.weeksWorked = weekWorked;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}
