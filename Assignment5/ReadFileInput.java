package Assignment5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileInput {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("quote.txt");
        String data = Files.readString(path);
        System.out.println(data);
    }
}
