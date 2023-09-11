package basics.java;

import java.util.Scanner;

public class CelciousToForConversion {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter temp in Celcious :: ");
	   float tempInC = s.nextFloat();
	   float tempInF = ((tempInC * 9)/5) + 32;
	   System.out.println("Temp in Forhen. :: " + tempInF);
	}

}
