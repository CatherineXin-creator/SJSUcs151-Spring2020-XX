package Assignment2;

public class Person {
    String firstname;
    String lastname;
    int age;
    String ssn;
    String address;
    String gender;
    float weight;

    Person() {

    }

    Person(String firstname, String lastname, int age, String ssn, String address, String gender, float weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void introduce() {
        System.out.println("Information of the person you selected: ");
        System.out.println("First name: " + getFirstname());
        System.out.println("Last name: " + getLastname());
        System.out.println("Age: " + getAge());
        System.out.println("SSN: " + getSsn());
        System.out.println("Address: " + getAddress());
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + getWeight());

    }
}

