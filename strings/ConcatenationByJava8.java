package com.strings;

import java.util.StringJoiner;

public class ConcatenationByJava8 {

	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(" ");
		s.add("Himanshu");
		s.add("Kumar");
		s.add("Vaidya");
		
		System.out.println(s);

	}

}
