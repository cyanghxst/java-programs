import java.io.*;
import java.util.*;

public class FileIO2 {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the input file name: ");
		String inputFileName = keyboard.nextLine();

		System.out.print("\nPlease enter the output file name: ");
		String outputFileName = keyboard.nextLine();

		Scanner inFile = new Scanner(new File(inputFileName));
		PrintWriter outFile = new PrintWriter(new PrintWriter(outputFileName));

		while (inFile.hasNextLine()) {
			String line = inFile.nextLine();
			System.out.println(line);
			outFile.println(line);
		}

		inFile.close();
		outFile.close();
	}
}
