package ConfigureProperties;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class configureProperties2 {
	final static String CONFIGURE_FILE_PATH="./src/ConfigureProperties/conf.properties2";
	 static Properties pr;
	public static void main(String[] args) {
		try {
			FileInputStream in= new FileInputStream(CONFIGURE_FILE_PATH);
			 pr= new Properties();
			 pr.load(in);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browsername=pr.getProperty("browser");
		System.out.println(browsername);
		String url=pr.getProperty("url");
		System.out.println( url);
		String username=pr.getProperty("username");
		System.out.println(username);
		String password=pr.getProperty("password");
		System.out.println(password);
		pr.setProperty("browser","chrome");
		String update=pr.getProperty("browser");
		System.out.println(update);
		pr.setProperty("version","12.34");
		String updateversion=pr.getProperty("version");
		System.out.println(updateversion);
		
		

	}

}
