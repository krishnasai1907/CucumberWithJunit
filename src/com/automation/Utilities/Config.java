package com.automation.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config { 
	static Properties prop;
	public static String getProperties(String locName,String pageName)
	{
		 prop=new Properties();
		 try
		 {
			 FileInputStream fis=new FileInputStream(MainConfig.getProperties(pageName));
	     prop.load(fis);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 String value=prop.getProperty(locName);
			return value;	
			
	}
	
}
