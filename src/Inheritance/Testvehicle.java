package Inheritance;

public class Testvehicle {

	public static void main(String[] args) {
		Car c= new Car();
		c.numDoors();
		c.playmusic();
		c.brand();
		System.out.println(".............");
		Vehicle v = new Vehicle();
		v.brand();
		v.model();
		v.year();
		v.start();
		v.stop();
		
		System.out.println(".............");
		Motorcycle m = new Motorcycle();
		m.engineType();
		m.whilie();
		m.stop();
		System.out.println(".............");
		Truck t = new Truck();
		t.cargoCapacity();
		t.loadCargo();
		t.start();
		
		
		

	}

}
