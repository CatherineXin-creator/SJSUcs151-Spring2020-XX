package Assignment6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public int getLastNameLength() {
        return lastName.length();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "\nPerson : " + "   " + lastName + ", " + firstName + "   " + age + "\n";
    }
}
