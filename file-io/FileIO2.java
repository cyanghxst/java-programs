import java.io.*;
import java.util.*;

public class FileIO2 {
	public static void main(String[] args) throws IOException {
		Scanner inFile;
		PrintWriter outFile;
		String line;

		inFile = new Scanner(new File("file.txt"));
		outFile = new PrintWriter(new FileWriter("output.txt"));

		while (inFile.hasNextLine()) {
			line = infile.nextLine();

			System.out.println(line);
			outFile.println(line);
		}

		inFile.close();
		outFile.close();
	}
}
