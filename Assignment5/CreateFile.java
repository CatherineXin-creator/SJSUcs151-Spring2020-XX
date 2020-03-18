package Assignment5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("command_line_input.txt"));
            System.out.print("Please text here (end your words with '@q'):");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.contains("@q")) {
                out.write(input);
                out.close();
            } else {
                System.out.println("Error! Please end your input with '@q'");
            }
        } catch (IOException e) {
        }
    }
}
