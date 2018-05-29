
// The below package was created with MyFirstJavaPackage.java
import soto.manny.may.twenty.MyFirstJavaPackage;

public class packageCallingClass{ 

   public static void main( String args[] )
   {
      System.out.println( "Welcome to Java Programming!" );
	  MyFirstJavaPackage callingThePkg = new MyFirstJavaPackage();
	
	  String b[] = new String[100];

	  callingThePkg.main(b);
	  
	  System.out.println("Bye bye, from inside the main function that called the package.");
   } 

} 

