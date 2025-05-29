package StringManipulation;

public class StringRevTest {
	public static String revString(String s){
		
	
		String rev="";
		if(s==null) {
			return null;
			}
		if(s.length()-1==1) {
			return s;
			
		}
		if(s.isBlank()||s.isEmpty()) {
			return s;
			
		}
		
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
			
			
		}
		
		//if(s==null) {
		//	return null; 
		//}
		
		
		return rev;
		
		
	}

	public static void main(String[] args) {
		// this is my training java selenium batch
		//selenium
	System.out.println(revString("selenium"));
	System.out.println(revString("t"));
	System.out.println(revString(" ")); 
	System.out.println(revString(null));
	System.out.println(revString(" batch"));
	System.out.println(revString("123"));
		 
		
		
		
		

	}

}
