package nextgen;

public class Assgnment2 {
	public double twoNumbers(double a,double b) {
		
		double prod=a*b;
		//System.out.println("the product of two double numbers is :"+prod);
		return prod;
		
	}

	public static void main(String[] args) {
		// Define a method that returns the product of two double numbers.
		
		Assgnment2 ass= new Assgnment2();
		double a = ass.twoNumbers(5, 2);
		System.out.println(a);
		
		
	}

}
