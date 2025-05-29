package nextgen;

public class Swappingnumbers {

	public static void main(String[] args) {
		int a = 5;
		  int b = 10;
		  System.out.println("the value of b before swap is:"+b);
		  System.out.println("the value of a before swap is:"+a);

		  
		//   using * swap the value of a = 10 and the value b = 5
		  a=a*b;//50
		  b=a/b;//5
		  a=a/b;//10
		  System.out.println("the value of b after swap is:"+b);
		  System.out.println("the value of a after swap is:"+a);

	}

}
