package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {
	
private static Properties property;  // property object same name as the file
	
	static {
		try {                                                  // env.properties has to have the same file name
			File file = new File("./src/test/resources/testdata/env.properties");  // java import/io
			FileInputStream input = new FileInputStream(file);           // java import/io
			property = new Properties();
			property.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return property.getProperty(key);              // the thing to remember is the return of the value of the key we using
	}

}
