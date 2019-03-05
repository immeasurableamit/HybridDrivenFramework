package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class magentoTest 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\java\\Revision\\HybridDrivenFramework\\src\\com\\abc\\utilities\\hybrid.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String urlData = p.getProperty("url");
		String emailData = p.getProperty("email");
		String passData = p.getProperty("password");
		String myacctKey = p.getProperty("myacct");
		String emailKey = p.getProperty("myacct");
		
	}
}
