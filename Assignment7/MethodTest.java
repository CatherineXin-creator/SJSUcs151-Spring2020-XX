package Assignment7;

import java.util.Arrays;
import java.util.Collection;

public class MethodTest {


    public static <T> int count(Collection<T> c) {

        return c.size();
    }


    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList("Abe", "Banana", "Cat", "Dog", "Ela");
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collection<Double> dec = Arrays.asList(2.5, 50.1, 6.8, 9.7, 1.45, 5.32, 84.26, 87.9);
        int count1 = MethodTest.count(strings);
        int count2 = MethodTest.count(ci);
        int count3 = MethodTest.count(dec);
        System.out.println("Number of elements = " + count1);
        System.out.println("Number of elements = " + count2);
        System.out.println("Number of elements = " + count3);

    }

}
