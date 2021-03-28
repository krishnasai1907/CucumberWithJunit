package com.automation.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class MainConfig {
	static Properties prop;
	private static void setProperties()
	{
		 prop=new Properties();
		 try
		 {
			 FileInputStream fis=new FileInputStream(".\\Resources\\pathsForConfig.properties");
	     prop.load(fis);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	}
	public static String getProperties(String key)
	{
		setProperties();
		String value=prop.getProperty(key);
		return value;
	}
}
