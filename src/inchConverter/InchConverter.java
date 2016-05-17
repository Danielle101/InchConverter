package inchConverter;
import java.util.*;
public class InchConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
System.out.println("Welcometo the inch conversion amount!");
System.out.println("Please enter your measurement in inches:");
double userInch=sc.nextDouble();
if (userInch > 0 ){
	double MilliCon= userInch *25.4;
	double CentiCon= userInch *2.54;
	double feetCon= userInch * 0.0833333;
	double yardCon= userInch *0.0277778;
	System.out.println("\nConversion of "+userInch+" inches:\n==========================");
	System.out.println(feetCon + " feet");
	System.out.println(CentiCon + " centimeters");
	System.out.println(MilliCon + " millimeters");
	System.out.println(yardCon + " yards");


	
}
	}

}
