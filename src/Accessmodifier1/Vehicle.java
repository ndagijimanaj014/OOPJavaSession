package Accessmodifier1;

public class Vehicle {
	
	public String name;
	protected int price;
	          double number;
	private int wheel; 
	public void access(String name) {
		System.out.println("vehicle......code");
	}
	protected void access(String name,int num) {
		System.out.println("vehicle......code");
	}
	private void access(int num,String name) {
		System.out.println("vehicle......code");
	}
	
	 void access(int a) {
		System.out.println("vehicle......code");
	}
	
	

	public static void main(String[] args) {
		
		Vehicle V = new Vehicle();
		V.name="honda";
		V.price=500;
		V.number=66;
		V.wheel=4;
	}

}
