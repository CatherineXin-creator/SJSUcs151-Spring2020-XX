package Assignment3;

public class Employee extends Person {


    String employeeId;
    String directDeposit;
    String specialAccommodation;

    //Employee employee = new Employee(firstName,lastName,age,ssn,employeeId,directDeposit,specialAccommodation);


    public Employee(String firstName, String lastName, int age, String ssn, String employeeId, String directDeposit, String specialAccommodation) {

    }

    public Employee() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(String directDeposit) {
        this.directDeposit = directDeposit;
    }

    public String getSpecialAccommodation() {
        return specialAccommodation;
    }

    public void setSpecialAccommodation(String specialAccommodation) {
        this.specialAccommodation = specialAccommodation;
    }
}
