package oops.com.concepts;

public class CustomWrapperClasses {
	
	private int i;
	
    CustomWrapperClasses() {} //Empty cunstructor
	CustomWrapperClasses(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public String toString() {
		return Integer.toString(i);
	}

	public static void main(String[] args) {
		CustomWrapperClasses c = new CustomWrapperClasses(10);
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(c.getI());
		c.setI(20);
		System.out.println("New Value of c is "+ c);

	}

}
