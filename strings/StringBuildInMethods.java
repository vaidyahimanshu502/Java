package com.strings;

public class StringBuildInMethods {

	public static void main(String[] args) {
		/* toUpperCase() and toLowerCase()-----------
		 * */
		String s = "Lord-Shiva";
		System.out.println(s.toUpperCase()); // it prints in upper letters
		System.out.println(s.toLowerCase()); // it prints in lower letters
		
		// .trim() method.---- it removes the white spaces from an string
		String s1 = "             Lord-Shiva";
		System.out.println(s1.trim());
		
		//StartsWith() and endWith() methods----------
		   // 1. startWith() it returns true or false if string starts with the
		   //    arguement mentioned in it
		
		System.out.println(s.startsWith("Lord"));
		
		//endsWith() and endWith() methods----------
		   // 1. endsWith() it returns true or false if string ends with the
		   //    arguement mentioned in it
		
		System.out.println(s.endsWith("a"));
		
		
		//charAt() method of string --- used to traverse over string by using indices.
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(7));
		
		//.length() method------ it returns length of the string
		
		System.out.println(s.length());
		
		//.valueof()
		int num = 10;
		String s3 = String.valueOf(num);
		System.out.println(s3+num);
		
		//.replace() method 
		String para = "Java is a programming language, Java is good Programing language";
		String replacePara = para.replace("Java", "JavaScript");
		
		System.out.println(replacePara);

	}

}
