package Assignment6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstName("Joe");
        p1.setLastName("Smith");
        p1.setAge(40);

        Person p2 = new Person();
        p2.setFirstName("Amy");
        p2.setLastName("Gold");
        p2.setAge(32);

        Person p3 = new Person();
        p3.setFirstName("Tony");
        p3.setLastName("Stork");
        p3.setAge(21);

        Person p4 = new Person();
        p4.setFirstName("Sean");
        p4.setLastName("Irish");
        p4.setAge(24);


        Person p5 = new Person();
        p5.setFirstName("Tina");
        p5.setLastName("Brock");
        p5.setAge(28);


        Person p6 = new Person();
        p6.setFirstName("Lenny");
        p6.setLastName("Hep");
        p6.setAge(18);


        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        list.sort(Comparator.comparing(Person::getAge));
        System.out.println("\nSorted by age (ascending): ");
        System.out.println(list);

        list.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("\nSorted by age (descending): ");
        System.out.println(list);

        list.sort(Comparator.comparing(Person::getFirstName));
        System.out.println("\nSorted by first name (ascending): ");
        System.out.println(list);

        list.sort(Comparator.comparing(Person::getFirstName).reversed());
        System.out.println("\nSorted by first name (descending): ");
        System.out.println(list);


        list.sort(Comparator.comparing(Person::getLastNameLength).thenComparing(Person::getLastName));
        System.out.println("\nSorted by the length of last name (ascending): ");
        System.out.println(list);

        list.sort(Comparator.comparing(Person::getLastNameLength).thenComparing(Person::getLastName).reversed());
        System.out.println("\nSorted by the length of last name (descending): ");
        System.out.println(list);


    }
}
