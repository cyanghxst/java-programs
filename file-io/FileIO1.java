import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("file.txt"));
             PrintWriter outFile = new PrintWriter(new FileWriter("output.txt"))) {
            while (scanner.hasNextLine()) { 
                String line = scanner.nextLine();
                System.out.println(line);
                outFile.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
