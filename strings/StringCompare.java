package com.strings;

public class StringCompare {

	public static void main(String[] args) {
		/*We can compare String in Java on the basis of content and reference.
		 *   ******It can be checked as per requirement******
		 *        1. Authentication -- equals();
		 *        2. Sorting --- compareTo();
		 *        3. Reference check --- == operator
		 * 
		 * 
		 * */
		
		// 1. by using equals(); method--- [ for authentication check ]
		
		String s1 = "Himanshu";
		String s2 = "Sudhanshu";
		String s3 = "Himanshu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		
		//2. By using '==' operators [ for reference check to the Strings ]
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		//3. By using compareTo(); method [ For sorting the String ]
		       /* if s1 == s2 returns 0
		        * if s1 > s2 returns (+)ve value
		        * if s1 < s2 returns (-)ve value
		        * */
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));

	}

}
