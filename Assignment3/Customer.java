package Assignment3;

public class Customer extends Person {
    String customerId;
    String paymentMethod;

    Customer() {

    }

    public Customer(String customerId, String paymentMethod) {
        this.customerId = customerId;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        System.out.println("This customer prefers to use " + getPaymentMethod() + " to pay the bill.");
    }

    public void introduction() {
        System.out.println();
        System.out.println("Customer Information:");
        System.out.println("First Name:           " + getFirstName());
        System.out.println("Last Name:            " + getLastName());
        System.out.println("Age:                  " + getAge());
        System.out.println("SSN:                  " + getSsn());
        System.out.println("Id #:                 " + getCustomerId());
        makePayment();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override

    public String toString() {
        return super.toString();
    }
}
