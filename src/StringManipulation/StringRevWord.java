package StringManipulation;

import java.util.Arrays;

public class StringRevWord {

	public static void main(String[] args) {
		String str= "this is my training java selenium batch";
		String a[]=str.split(" ");
		//System.out.println(Arrays.toString(a));
		String rev="";
		for(String e:a) {
			//System.out.println(e);
			rev=rev+StringRevTest.revString(e)+" ";
		
			}
		System.out.println(rev);

	}

}
