package ConfigureProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureRead {
	private final String CONFIGURE_FILE_PATH="src/ConfigureProperties/conf.properties1";
	private  Properties pr;
	
    public Properties initproperties() {
    	try {
			FileInputStream in = new FileInputStream(CONFIGURE_FILE_PATH);
			 pr= new Properties();
			pr.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pr;
    	
    }
}
