package gaujau;

import java.util.*;

public class sample {
	
	public static void main(String[] args) {
		
		
		
		try(Scanner mau = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			int z1 = mau.nextInt();
			
			System.out.println("Enter second number: ");
			int z2= mau.nextInt();
			
			int sum = z1/z2;
			System.out.println(sum);
		}
	}
}
