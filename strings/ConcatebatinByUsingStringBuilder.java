package com.strings;

public class ConcatebatinByUsingStringBuilder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Himanshu");
		StringBuilder s2 = new StringBuilder(" Vaidya");
		StringBuilder fullName = s1.append(s2);
		
		System.out.println(fullName);

	}

}
