package gaujau;

import java.util.Scanner;

public class jama {

	public static void main(String[] args) {
		try (Scanner myObj = new Scanner(System.in)) {
			String userName;
			String userPostal;
			int age;

			// Enter username and press Enter
			System.out.println("Enter username, postal code, and age");
			userName = myObj.nextLine();
			userPostal = myObj.nextLine();
			age = myObj.nextInt();

			System.out.println("Username is: " + userName);
			System.out.println("Potal code :" + userPostal);
			System.out.println(userName + " age :" + age);
		}
	}
}
