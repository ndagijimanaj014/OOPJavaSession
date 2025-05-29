package Accessmodifier2;

import Accessmodifier1.Car;
import Accessmodifier1.Vehicle;

public class Cycle {
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
		Vehicle v = new Vehicle();
		Car c = new Car();
		c.name="John";
		
		v.name="Veda";
		
		
		
	
		

	}

}
