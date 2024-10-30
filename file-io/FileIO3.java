import java.io.*;
import java.util.*;

public class FileIO3 {
    public static void main(String[] args) throws IOExceptions {
        Scanner inFile = new Scanner(new File("file.txt"));
        PrintWriter outFile = new PrintWriter(new FileWriter("out.txt"));
        String line;

        while (inFile.hasNextLine()) {
            line = inFile.nextLine();
            System.out.println(line);
            outFile = outFile.nextLine();
        }

        inFile.close();
        outFile.close();
    }
}
