package Assignment5;

import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a integer: ");
        int value = scanner.nextInt();
        System.out.println("Hexadecimal format of " + value + " is " + Integer.toHexString(value).toUpperCase());
    }
}
