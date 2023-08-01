package com.webmath.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/object.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception for the ReadConfig:"+e.getMessage());
			
		}
		
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public int getLengthNumber()
	{
		int length_num=0;
		String length_number=pro.getProperty("length_number");
		try
		{
		length_num=Integer.parseInt(length_number);
		return length_num;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Exception is"+e.getMessage());
		}
		return length_num;
		
	}

	

}
