package gaujau;

import java.util.Scanner;

public class jpai {

	public static void main(String[] args) {
		
		Scanner naya = new Scanner(System.in);
		
		System.out.println("Enter your name and phonenumber");
		
		String name = naya.nextLine();
		
		double phonenumber = naya.nextDouble();
		
		System.out.println("The name is " + name);
		System.out.println("Phone number is" + phonenumber);

	}

}
