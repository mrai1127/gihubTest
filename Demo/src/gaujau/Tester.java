package gaujau;

public class Tester {

	 public void finalize() throws Throwable{
	      System.out.println("Object garbage collected.");
	   }
	   public static void main(String[] args) {

	      Tester t = new Tester();
	      t = null;
	      System.gc();
	   }
}
