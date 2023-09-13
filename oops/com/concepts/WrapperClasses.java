package oops.com.concepts;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * boolean -- Boolean
		 * char -- Character
		 * int -- Integer
		 * float -- Float
		 * double -- Double
		 * etc.
		 * */
		
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println(a + " " + i + " " + j);
		
		// Unboxing
		
		Integer b = new Integer(9);
		int x = b.intValue();
		int y = b;
		
		System.out.println(b + " " + x + " " + y);

	}

}
