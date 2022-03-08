package gaujau;

public class Damm {

	
	public float a, b, c;
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}

	public double Area() {
		double area = a*b;
		return area;
	}
	public double Frea() {
		double mark = a*c;
		return mark;
	}
	public double Mrea() {
		double lark = c*b;
		return lark;
	}
   public static void main(String [] args) {
	   
	   Damm mann = new Damm();
	   
	   mann.setA(120);
	   mann.setC(50);
	   mann.setB(90);
	   
	   double Area = mann.Area(); 
		  double Frea = mann.Frea(); 
		  double Mrea = mann.Mrea();
	   
	   System.out.println("First value is : " + Area );
	   System.out.println("First value is : " + Frea);
	   System.out.println("First value is : " + Mrea);
   }

}

