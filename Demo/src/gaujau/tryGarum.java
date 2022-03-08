package gaujau;

public class tryGarum {

   
   public static void nam(String jNam) {
	 System.out.println("yo tero nam " + jNam);
   }
  
   public static void thar(String ma) {
	   System.out.println("K thari ho "+ ma);
   }
   class kgarum extends tryGarum{
	   
	 public static void maya(String macha) {
	System.out.println("k chalira cha yaha" + macha );
   }
   
   public static void main(String[] args) {
	   nam("Tori");
	   maya("Gori");
	   maya("Mori");
	   thar("tamang");
   }
  }
}