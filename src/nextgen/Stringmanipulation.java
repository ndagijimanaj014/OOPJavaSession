package nextgen;

public class Stringmanipulation {

	public static void main(String[] args) {
		String str="this189 is# my java code and i am Happy";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",str.indexOf("i")+1));
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i")+2)));
		

	}

}
