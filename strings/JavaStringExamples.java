package com.strings;

public class JavaStringExamples {

	public static void main(String[] args) {
		/* Strings are immutable in java it  means it cannot be changed
		 When we create a new string it will create new instance 
		 For mutability we have to create stringBuilder and stringBuffer 
		 classes
		 1. In Java String is an Object 
		 2. We can create string by using String litrals and by using new keyword
		 
		 */
		
		
		//String Litrals--------- [It is created by using double quotes "  " ]
		String s1 = "Hello World";
		
		/*Each time you create a string literal, the JVM checks the
		 *  "string constant pool" first. If the string already exists in the
		 *   pool, a reference to the pooled instance is returned. If the string
		 *   doesn't exist in the pool, a new string instance is created and
		 *   placed in the pool.:*/
		
		String s2 = "Hello World"; //It doesn't create a new instance 
		
		/*   NOTE :: To make Java more memory efficient (because no new objects are
		 *  created if it exists already in the string constant pool).
		 * 
		 * */
		
		//By using new keywords
		String name = new String("Himanshu Vaidya");
		
		/*In such case, JVM will create a new string object in normal 
		  (non-pool) heap memory, and the literal "Himanshu Vaidya" will be placed in
		  the string constant pool. The variable s will refer to the object in 
		  a heap (non-pool).
		 */
		
		//String Examples--------
		
		char[] arr = {'h', 'i', 'm', 'a', 'n', 's', 'h', 'u'};
		String name1 = new String(arr);
		System.out.println("String By using bew :: "+ name1);
		
		String wish = "Hello, Good Morning!";
		System.out.println("String by using litral :: "+ wish);
		
	}

}
