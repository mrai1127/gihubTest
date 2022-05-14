package gaujau;

import java.util.Scanner;
import java.util.*;

public class Ekchin {
		
  public static void main(String[] args){
	  
		        // Initialising selection variable to 0 
		        int selection = 0;
		        int MultiValue = 0;
		        int UserValue = 0;

		        // Initializing the count for loop
		        int i;


		        // Initializing Random1 and Random2 to get random values
		        int Random1;
		        int Random2;


		        // Creating new Scanner
		        Scanner input = new Scanner(System.in);
		        
		        String Exit = null; 

		        do{

		        // Menu to select type of multipication
		        System.out.println("Please select your option");
		        System.out.println("1: Random Multipication table");
		        System.out.println("2: Give your own numbers");

		        // Getting the input from the above menu
		        selection = input.nextInt();

		        switch (selection)
		        {
		            case 1:


		                Random1 = (int)(Math.random() * 1000);
		                Random2 = (int)(Math.random() * 1000);

		                Random1 = Random1/10;

		                System.out.println("You Random Value to pultiply is " + Random1);


		                System.out.println("How long do you want? 2 - 100 ");


		                MultiValue = input.nextInt();


		                for (i = 1; i <= MultiValue; i++ )
		                {
		                    System.out.println("Multipication of " + Random1 + " * " + i + " is: " + Random1 * i);
		                }



		            case 2:

		                System.out.println("What is your Number? ");
		                UserValue = input.nextInt();

		                System.out.println("How long do you want to multiply? ");
		                MultiValue = input.nextInt();

		                for (i = 1; i <= MultiValue; i++ )
		                {
		                    System.out.println("Multipication of " + UserValue + " * " + i + " is: " + UserValue * i);
		                }



		        }

		        System.out.println("Would you like to exit? ");
		         Exit = input.next();

		        }while(!Exit.equals ("y"));    

		    }



		}