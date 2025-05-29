package StringManipulation;

public class StringConcatinate {

	public static void main(String[] args) {
		String y="23";
		int i=Integer.parseInt(y);//String to integer
		System.out.println(i+20);
		double x=Double.parseDouble(y);
		System.out.println(x+20);//String to double
		String Execute="selenium";
		boolean flag=Boolean.parseBoolean(Execute);
		if(flag) {
			System.out.println("run my test cases");//String to boolean
			
		} else {
			System.out.println("exist");
		}
		int a=45;
		String s=String.valueOf(a);
		System.out.println(s+20);//integer to string
		boolean b=true;
		String s1=String.valueOf(b);
		System.out.println(s1);//boolean to string
		String s2=" ";//blank&empty
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		

	}

}
