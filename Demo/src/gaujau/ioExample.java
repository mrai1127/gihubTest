package gaujau;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ioExample {

	public static void main(String args[]) {
		// Create Scanner object
		Scanner scan = new Scanner("Names:Raju;Pawan;Suresh");
		// Declare the delimiter
		scan.useDelimiter(";");
		/*
		 * Initialize the String pattern which signifies that the String token contains
		 * characters of the alphabet only
		 */
		Pattern pattern = Pattern.compile("[A-Za-z]*");
		while (scan.hasNext()) {
			if (scan.hasNext(pattern)) {
				System.out.println(scan.nextLine());
				// Check if there is an IO exception
				System.out.println("Exception Output: " + scan.ioException());
			} else
				scan.next();
		}
		scan.close();
	}
}
