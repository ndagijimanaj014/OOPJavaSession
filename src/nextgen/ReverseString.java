package nextgen;

public class ReverseString {
	public static String test(String name) {
		
		String rev ="";
		for(int i=name.length()-1;i>=0;i--) {
			rev= rev+name.charAt(i);
			
		
		}
		return rev;
	}

	public static void main(String[] args) {
		//ReverseNumber n= new ReverseNumber();
		String reverse = test("the next gen automation");
		System.out.println("the reverse of name is :"+reverse);
			
		}

	}


