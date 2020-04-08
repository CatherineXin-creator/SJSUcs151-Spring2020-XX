package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManipulator {

    public static void sort(ArrayList<Integer> myLst, Boolean ascending) {
        for (int i = 0; i < myLst.size() - 1; i++) {
            int currentMin = myLst.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < myLst.size(); j++) {
                if (currentMin > myLst.get(j)) {
                    currentMin = myLst.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                myLst.set(currentIndex, myLst.get(i));
                myLst.set(i, currentMin);
            }
        }

    }

    public static void swapLargestSmallest(ArrayList<Integer> myLst) {
        int smallest = myLst.get(0);
        int largetst = myLst.get(0);

        for (int i = 1; i < myLst.size(); i++) {
            if (myLst.get(i) > largetst)
                largetst = myLst.get(i);
            else if (myLst.get(i) < smallest)
                smallest = myLst.get(i);


        }
        int largestPosition = 1;
        int smallestPosition = myLst.size() - 1;

        System.out.println("Smallest Number is: " + smallest + "; \tthe position is " + smallestPosition);
        System.out.println("Largest Number is: " + largetst + "; \tthe position is " + largestPosition);

    }

    public static void table(ArrayList<Integer> myLst) {
        Collections.sort(myLst);
        Map<Integer, Long> result =
                new HashMap<>();
        for (Integer integer : myLst) {
            result.merge(integer, 1L, Long::sum);
        }
        result.forEach((item, value) -> System.out.println(item + " - " + value));
    }


    //tester
    /*public static void main(String[] args) {
    //Create a list which has 6 elements and 15 is duplicated;

        ArrayList<Integer> myLst = new ArrayList<Integer>();
        myLst.add(55);
        myLst.add(85);
        myLst.add(45);
        myLst.add(15);
        myLst.add(5);
        myLst.add(15);

        //sort the list from small value to large;
        sort(myLst, true);
        System.out.println(myLst);

        //give the smallest and largest values and the positions;
        swapLargestSmallest(myLst);

        //print out the elements in the list and the numbers they've been occurred;
        table(myLst);

    }*/

}
