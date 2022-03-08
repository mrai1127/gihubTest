package gaujau;

import java.util.*;

public class SDemo {
	
	  public static void main(String[] args)
	    {
	        try (// Declare the object and initialize with
			        // predefined standard input object
		Scanner scan = new Scanner(System.in)) {
			// String input
	        String name = scan.nextLine();
	  
	        // Character input
	        char gender = scan.next().charAt(0);
	  
	        // Numerical data input
	        // byte, short and float can be read
	        // using similar-named functions.
	        int age = scan.nextInt();
	        long mobileNo = scan.nextLong();
	        double cgpa = scan.nextDouble();
	  
	        // Print the values to check if the input was correctly obtained.
	        System.out.println("Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("Age: "+age);
	        System.out.println("Mobile Number: "+mobileNo);
	        System.out.println("CGPA: "+cgpa);
		}
	        
	       }
	    }

