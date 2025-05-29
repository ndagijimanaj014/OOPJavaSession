package builderpattern;

public class Ecommerce {
	public void login() {
		System.out.println("User login");
		
	}
	public Ecommerce login(String username,String password) {
		System.out.println("User login " +username+" "+password);
		return this;//return the current class object,constructor to initialize class Instance variable and encapsulation by generating getter and setter.
	}
	public Ecommerce search() {
		System.out.println("search by default");
		return this;
	}
public Ecommerce search(String productname,String version,String color) {
	System.out.println("search our product"+productname + "version " +" "+version +" "+ "color " +" "+color);
	return this;
	}
public Ecommerce search(String productname,int price) {
	System.out.println("search our product " +productname+" price"+" "+price);
	return this;
	}
public Ecommerce addtocart(String productname) {
	System.out.println("addtocart "+productname);
	return this;
}
public Ecommerce payment(String cc,String cvv,String expdate,String zip) {
	System.out.println("payment with via credit card " +cc+ " "+cvv+ " "+expdate+ " "+zip);
	return this;
	
}
public Ecommerce adress(String houseNumber,String StreetName,String city,String state,String zip) {
	System.out.println("send to this adress " +houseNumber +" "+ StreetName+ " "+city+ " "+state+ " "+zip);
	return this;
}
public Ecommerce logout() {
	System.out.println("logout.....");
	return this;
}
	
	


}
