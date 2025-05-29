package ConfigureProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureProperties {
	static final  String CONFIGURE_FILE_PATH="./src/ConfigureProperties/conf.properties";
static Properties pr;
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream (CONFIGURE_FILE_PATH);
			 pr= new Properties();
			try {
			pr.load(in);
			} catch (IOException e) {
				
				e.printStackTrace();
			
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		String browsername=pr.getProperty("browser");
		System.out.println(browsername);
		
	}
}

	


