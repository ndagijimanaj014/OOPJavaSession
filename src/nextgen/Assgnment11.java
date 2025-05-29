package nextgen;

public class Assgnment11 {
	public boolean compareStrings(String str1,String str2) {
		
		if(str1.length()==str2.length()) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		return true;
		
	}

	public static void main(String[] args) {
		// Method with Return Value (boolean) and with Parameters (String, String):

        //Assignment: Write a method to compare two strings and return true if they are equal, false otherwise.

         //Signature: public boolean compareStrings(String str1, String str2)

		Assgnment11 ass =new Assgnment11();
		ass.compareStrings("peter","paul");
		boolean a =ass.compareStrings("waw","waw");

	}

}
