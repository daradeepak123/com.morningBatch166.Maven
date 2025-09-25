package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtils {
	
	//"\\src\\main\\resources\\config.properties"
	

	public static String readPropertyData(String path,String PropertyValue) throws Exception {
		
		File file=new File(System.getProperty("user.dir")+path);
		FileInputStream fis=new FileInputStream(file);
		Properties o=new Properties();
		o.load(fis);
		String prop=o.getProperty(PropertyValue);
		return prop;

	}

}
