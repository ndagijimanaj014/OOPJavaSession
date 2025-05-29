package Accessmodifier1;

public class Car extends Vehicle  {
	
	@Override
	public void access(String name) {
		System.out.println("car......code");
	}
	@Override
	public void access(String name,int num) {
		System.out.println("car......code");
	}
	//@Override
	protected void access(int num,String name) {
		System.out.println("car......code");
	}
	@Override
	 void access(int a) {
		System.out.println("car......code");
	}

	public static void main(String[] args) {
		Car c= new Car();
		c.name="olivier";
		c.number=45;
		c.price=2000;
		
		

	}

}
