package com.eCommerce.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties pro;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getApplicationUrl() {

		String url = pro.getProperty("baseUrl");

		return url;

	}
	
	public String getUserName() {
		
		String uname = pro.getProperty("userName");
		
		return uname;
	}
	
	public String getPassword() {
		
		String password = pro.getProperty("password");
		
		return password;
	}
	
	

}
