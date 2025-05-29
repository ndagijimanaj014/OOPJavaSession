package ConfigureProperties;

import java.util.Properties;

public class EcomerceTest {

	public static void main(String[] args) {
		ConfigureRead cr=new ConfigureRead();
		Properties pr=cr.initproperties();
		String browsername=pr.getProperty("browser");
		System.out.println(browsername);
		switch (browsername.toUpperCase()) {
		case "SAFARI":
			System.out.println("safari is launched");
			
			break;
		case "CHROME":
			System.out.println("chrome is launched");
			
			break;
		case "EDGE":
			System.out.println("Edge is launched");
			
			break;
		case "FIREFOX":
			System.out.println("firefox is launched");
			
			break;

		default:
			System.out.println("pass the right browser");
			break;
		}
		String url=pr.getProperty("url");
		System.out.println(url);
		String usernamebrowser=pr.getProperty("username");
		System.out.println(usernamebrowser);
		String passwordbrowser=pr.getProperty("password");
		System.out.println(passwordbrowser);
		System.out.println("login in button");
		pr.setProperty("version","12.3");
		String update=pr.getProperty("version");
		System.out.println(update);
		
		

	}

}
