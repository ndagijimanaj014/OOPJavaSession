package ConfigureProperties;


import java.util.Properties;

public class AmazonTest {

	public static void main(String[] args) {
		PropertiesReader pr= new PropertiesReader();
		Properties pro=pr.initproperties();
		String browsername=pro.getProperty("browser");
		System.out.println(browsername);
		switch (browsername.toLowerCase()) {
		case "chrome": 
			
		System.out.println("chrome is launched");
		break;
		case "Edge": 
			
			System.out.println("Edge is launched");
			break;
		case "firefox": 
			
			System.out.println("firefox is launched");
			break;
		case "safari": 
			
			System.out.println("safari is launched");
			break;
		
		default:
			System.out.println("pass a right browser");
		break;
		}
		System.out.println(pro.getProperty("url"));
		System.out.println("enter username:"+pro.getProperty("username"));
		System.out.println("enter password:"+pro.getProperty("password"));
		System.out.println("signin button");

	}

}
