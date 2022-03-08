package gaujau;

import java.util.ArrayList;

public class Sikau {

	public static void main(String[] agrs) {
		
		int m = 6;
		
		ArrayList<Integer> murali = new ArrayList<Integer>(m);
		
		for (int n = 1; n <= m; n++)
           
	    murali.add(n);
		
		System.out.println(murali);
          
		murali.remove(2);
		
		System.out.println(murali);
		
	}
}
