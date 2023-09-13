package oops.com.concepts;

public class CallByValueInJava {
	
	private int data;
	public CallByValueInJava(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		CallByValueInJava data = new CallByValueInJava(20);
		System.out.println("Initial Value of data is "+ data.data);
		data.setData(100);
		System.out.println("New value of data is "+ data.data);

	}

}
