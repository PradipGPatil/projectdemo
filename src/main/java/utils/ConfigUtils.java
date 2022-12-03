
package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
		//here we made static method because without creating object we can access the method

		public static Properties readProperty(String filename) throws IOException {
			FileInputStream fin=new FileInputStream(filename);
			
			Properties property=new Properties();
			property.load(fin);
			return property;
		}
}
