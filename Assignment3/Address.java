package Assignment3;

public class Address {
    private String address;

    public void printAddress() {
        System.out.println("Ship ordered items to " + getAddress());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
