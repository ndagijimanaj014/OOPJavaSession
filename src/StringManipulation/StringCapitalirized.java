package StringManipulation;

public class StringCapitalirized {

	public static void main(String[] args) {
		String str="this is my training java selenium batch";
		String s[]=str.split(" ");
		String newstr="";
		for(String e:s) {
			char c=e.charAt(0);
			//System.out.println(c);
			//String a=String.valueOf(e.charAt(0)).toUpperCase();
			//System.out.println(a);
			newstr=newstr+e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toUpperCase())+" ";
			
			
		}
		System.out.println(newstr);

	}

}
