package nextgen;

public class UserClass {
	
	String name; 
	 int age;
	 String city;


	 public static void main(String[] args) {
	  
	  System.out.println("Hello");
	  
	  UserClass u1 = new UserClass();
	  u1.name = "Peter";
	  u1.age = 35;
	  u1.city = "Dallas";
	 // System.out.println(u1.name + " " + u1.age + " " + u1.city);
	  
	  
	  UserClass u2 = new UserClass();
	  u2.name = "Clara";
	  u2.age = 30;
	  u2.city = "Kgl";
	  
	  UserClass u3 = new UserClass();
	  u3.name = "Damas";
	  u3.age = 18;
	  u3.city = "keller";
	  
	  System.out.println(u1.name + " " + u1.age + " " + u1.city); //p 35 D
	  System.out.println(u2.name + " " + u2.age + " " + u2.city); //C 30 K
	  System.out.println(u3.name + " " + u3.age + " " + u3.city);// D 18 ke
	  
	  u1 = u2;
	  
	  System.out.println(u1.name + " " + u1.age + " " + u1.city);//C 30 K
	  System.out.println(u2.name + " " + u2.age + " " + u2.city);//C 30 K
	  System.out.println(u3.name + " " + u3.age + " " + u3.city);// D 18 ke
	}

}
