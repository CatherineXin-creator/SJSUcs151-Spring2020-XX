package Assignment3;

public class Executive extends Employee {

    public Executive() {
        this.yearlySalary = yearlySalary;
        this.yearlyBonus = yearlyBonus;
    }

    double yearlySalary = 100000.0;
    double yearlyBonus = 42586.91;

    public void computePay() {
        double payForYear = yearlySalary + yearlyBonus;
        System.out.println("The total salary for this employee is: $" + Math.round(payForYear));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public void introduction() {
        System.out.println();
        System.out.println("Executive Information:");
        System.out.println("First Name:           " + getFirstName());
        System.out.println("Last Name:            " + getLastName());
        System.out.println("Age:                  " + getAge());
        System.out.println("SSN:                  " + getSsn());
        System.out.println("Id #:                 " + getEmployeeId());
        System.out.println("Direct Deposit:       " + getDirectDeposit());
        System.out.println("Special Accommodation:" + getSpecialAccommodation());
        System.out.println("Yearly Salary:       $" + getYearlySalary());
        System.out.println("Yearly Bonus:        $" + getYearlyBonus());
        computePay();
    }

}
