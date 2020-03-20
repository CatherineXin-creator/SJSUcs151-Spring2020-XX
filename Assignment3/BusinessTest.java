package Assignment3;

public class BusinessTest {
    public static void main(String[] args) {

        Address shippingAddress = new Address();
        shippingAddress.setAddress("658 Apple Dr, San Jose, CA, 95098");

        Executive executive = new Executive();
        executive.setFirstName("Kc");
        executive.setLastName("Wang");
        executive.setAge(48);
        executive.setSsn("784952");
        executive.setEmployeeId("928");
        executive.setDirectDeposit("Yes");
        executive.setSpecialAccommodation("No");
        executive.introduction();
        executive.computePay();


        FullTimeSalaryEmployee fullTimeSalaryEmployee = new FullTimeSalaryEmployee();
        fullTimeSalaryEmployee.setFirstName("Joe");
        fullTimeSalaryEmployee.setLastName("Smith");
        fullTimeSalaryEmployee.setAge(45);
        fullTimeSalaryEmployee.setSsn("484950");
        fullTimeSalaryEmployee.setEmployeeId("141");
        fullTimeSalaryEmployee.setDirectDeposit("Yes");
        fullTimeSalaryEmployee.setSpecialAccommodation("No");
        fullTimeSalaryEmployee.setYearlySalary(84059.00);
        fullTimeSalaryEmployee.setYearlyBonus(19573.37);
        fullTimeSalaryEmployee.setWeekWorked(32);
        fullTimeSalaryEmployee.introduction();
        fullTimeSalaryEmployee.computePay();

        FullTimeHourlyEmployee fullTimeHourlyEmployee = new FullTimeHourlyEmployee();
        fullTimeHourlyEmployee.setFirstName("Catherine");
        fullTimeHourlyEmployee.setLastName("Zhang");
        fullTimeHourlyEmployee.setAge(24);
        fullTimeHourlyEmployee.setSsn("472859");
        fullTimeHourlyEmployee.setEmployeeId("078");
        fullTimeHourlyEmployee.setDirectDeposit("No");
        fullTimeHourlyEmployee.setSpecialAccommodation("No");
        fullTimeHourlyEmployee.setHourlySalary(16);
        fullTimeHourlyEmployee.setHoursWorked(469);
        fullTimeHourlyEmployee.introduction();
        fullTimeHourlyEmployee.computePay();


        PartTimeHourlyEmployee partTimeHourlyEmployee = new PartTimeHourlyEmployee();
        partTimeHourlyEmployee.setFirstName("Steven");
        partTimeHourlyEmployee.setLastName("McGrath");
        partTimeHourlyEmployee.setAge(35);
        partTimeHourlyEmployee.setSsn("473829");
        partTimeHourlyEmployee.setEmployeeId("199");
        partTimeHourlyEmployee.setDirectDeposit("Yes");
        partTimeHourlyEmployee.setSpecialAccommodation("No");
        partTimeHourlyEmployee.setHourlySalary(16);
        partTimeHourlyEmployee.setHoursWorked(28);
        partTimeHourlyEmployee.setOverWorkTime(3);
        partTimeHourlyEmployee.introduction();
        partTimeHourlyEmployee.computePay();

        Contractor contractor = new Contractor();
        contractor.setFirstName("Mike");
        contractor.setLastName("Han");
        contractor.setAge(52);
        contractor.setSsn("485392");
        contractor.setEmployeeId("857");
        contractor.setDirectDeposit("No");
        contractor.setSpecialAccommodation("No");
        contractor.setHourlySalary(12);
        contractor.setHoursWorked(15);
        contractor.introduction();
        contractor.computePay();


        Customer customer = new Customer();
        customer.setFirstName("Cong");
        customer.setLastName("He");
        customer.setAge(22);
        customer.setSsn("177778");
        customer.setCustomerId("520");
        customer.setPaymentMethod("Cash");
        customer.introduction();
        shippingAddress.printAddress();


    }
}
