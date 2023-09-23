package com.strings;

public class StringBufferClass {

	public static void main(String[] args) {
		/*
		 * StringBuffer class is used to create mutable (modifiable)
		   String objects The StringBuffer class in Java is the same 
		   as String class except it is mutable i.e. it can be changed.
         */
		
		//Constructors
		/*
		 * 1. StringBuffer() creates an empty String with initial capacity of 16
		 * 2. StringBuffer(String str) creates String with the value
		 * 3. StringBuffer(int capacity) Creates String with give capacity
		 * */
		
		StringBuffer s = new StringBuffer();
		s.append("Himanshu Vaidya");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("Mahadeva Jai!");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer(50);
		s2.append("Java is very Popular Language till now!, hence this is widaly used all accross world!!");
		System.out.println(s2);
		
		
		// Inbuild methods of StringBuffer class
		// 1. append() it adds the String to the String created by StringBuffer
		
		// 2. insert(int offset, String s)  it inserts the given String with this string at the given position
		s1.insert(9, " Ki ");
		System.out.println(s1);
		
		// 3. replace("xyz", "abc") above is its example in line number 27
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
		// 4. delete(int start, int end) it  deletes the String from the specified beginIndex to endIndex.
		s2.delete(5, 8);
		System.out.println(s2);
		
		//reverse() method it used to reverses the current String.
		StringBuffer str = new StringBuffer("ManniD");
		str.reverse();
		System.out.println(str);
		
	}

}
