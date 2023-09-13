package oops.com.concepts;



public class SuperObject implements Cloneable {
	int rollNo;
	String name;
	
	SuperObject(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	public static void main(String[] args) throws CloneNotSupportedException {
		/*The Object class is the parent class of all the classes
		 *  in java by default. In other words, it is the topmost class of java.*/
		SuperObject s1 = new SuperObject(10, "Himanshu");
		SuperObject s2 = (SuperObject) s1.clone();
		System.out.println(s1.rollNo + " " + s1.name);
		System.out.println(s2.rollNo + " " + s2.name);
	}

}
