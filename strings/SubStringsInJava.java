package com.strings;

import java.util.Arrays;

public class SubStringsInJava {

	public static void main(String[] args) {
		/*A part of String called SubString.
		 * In build-in  method substring start index is included and end index is
		 * excluded.
		 * 
		 * 
		 * */
		
		String s = "We are the sons of Lord-Shiva!";
		String newS = s.substring(7);
		System.out.println(newS);
		
		String newS2 = s.substring(3, 10);
		System.out.println(newS2);
		
		
		/* .split() method of java
		 *  --------- It takes arguements in the form of regExp
		 * */
		String desc = "We are the sons and daughter of lord Sihiva!";
		String[] descArr = desc.split("\\.");
		System.out.println(Arrays.toString(descArr));
	}

}
