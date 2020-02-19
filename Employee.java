<<<<<<< HEAD
package Assignment2;

public class Employee extends Person {
    int employeeId;
    String employeeStatus;
    double startDate;
    double hourlyPay;
    double yearlyPay;

    public Employee(String s, String contractor, double i, double i1, double i2) {
    }

    public Employee(int i, String contractor, int i1, int i11, int i2) {

    }

    public Employee() {

    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public double getStartDate() {
        return startDate;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getYearlyPay() {
        return yearlyPay;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setStartDate(double startDate) {
        this.startDate = startDate;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setYearlyPay(int yearlyPay) {
        this.yearlyPay = yearlyPay;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public void employeeInfo() {
        System.out.println("Employee ID: #" + getEmployeeId());
        System.out.println("This employee is a " + getEmployeeStatus());
    }

    public void calculatePay() {
        double salary;
        double daysWorked = getStartDate();
        double hrPay = getHourlyPay();
        double yrPay = getYearlyPay();
        if (hrPay != 0 && yrPay == 0) {
            salary = hrPay * daysWorked;
        } else {
            salary = yrPay * daysWorked;
        }

        System.out.println("The amount should pay for this employee: $" + Math.round(salary));
        System.out.println();
    }
}
=======
package Assignment2;

public class Employee extends Person {
    int employeeId;
    String employeeStatus;
    double startDate;
    double hourlyPay;
    double yearlyPay;

    public Employee(String s, String contractor, double i, double i1, double i2) {
    }

    public Employee(int i, String contractor, int i1, int i11, int i2) {

    }

    public Employee() {

    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public double getStartDate() {
        return startDate;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getYearlyPay() {
        return yearlyPay;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setStartDate(double startDate) {
        this.startDate = startDate;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setYearlyPay(int yearlyPay) {
        this.yearlyPay = yearlyPay;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public void employeeInfo() {
        System.out.println("Employee ID: #" + getEmployeeId());
        System.out.println("This employee is a " + getEmployeeStatus());
    }

    public void calculatePay() {
        double salary;
        double daysWorked = getStartDate();
        double hrPay = getHourlyPay();
        double yrPay = getYearlyPay();
        if (hrPay != 0 && yrPay == 0) {
            salary = hrPay * daysWorked;
        } else {
            salary = yrPay * daysWorked;
        }

        System.out.println("The amount should pay for this employee: $" + Math.round(salary));
        System.out.println();
    }
}
>>>>>>> 54c0caf4cb2055ce7bf3a7e8908f42970735a27c
