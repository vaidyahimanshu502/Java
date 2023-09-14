package com.strings;

public class AddingTwoStr {

	public static void main(String[] args) {
		// we can use concat method to add two strings------
		String str1 = "Himanshu";
		String str2 = "Vaidya";
		String fullName = str1.concat(str2);
		System.out.println(fullName); // It will add without leaving space
		
		//With space
		System.out.println(str1 + " " + str2);

	}

}
