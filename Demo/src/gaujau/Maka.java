package gaujau;

public class Maka {

	 public static void main(String[] args) {
	        int min = 5;
	        int max = 10;

	        printNumbers(min, max);
	        System.out.println();

	        min = 8;

	        printNumbers(min, max);
	    }

	    public static void printNumbers(int min, int max) {
	        while (min < max) {
	            System.out.println(min);
	            min++;
	        }
	    }
}
