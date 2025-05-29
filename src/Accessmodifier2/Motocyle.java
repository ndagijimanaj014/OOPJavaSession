package Accessmodifier2;

import Accessmodifier1.Vehicle;

public class Motocyle extends Vehicle {
	@Override
	public void access(String name) {
		System.out.println("vehicle......code");
	}
	@Override
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
		Motocyle m= new Motocyle();
		m.name= "John";
		m.price=3000;
		
		

	}

}
