package Utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	InputStream input;



	public ReadConfig()
	{


		try {
			prop=new Properties();
			String projectpath=System.getProperty("user.dir");

			input=new FileInputStream(projectpath+"//Configuration//config.properties");


			prop.load(input);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.printStackTrace();
		}
	}

	public String getapplicationurl()
	{
		String applicationurl=prop.getProperty("baseurl");
		return applicationurl;
	}
	
	public String getuserid()
	{
		String getuserid=prop.getProperty("username");
		return getuserid;
	}
	
	
	public String getpassword()
	{
		String getpassword=prop.getProperty("password");
		return getpassword;
	}
	

	public String getfirefox()
	{
		String getfirefox=prop.getProperty("firefoxdriver");
		return getfirefox;
	}
	

	public String getchrome()
	{
		String getchrome=prop.getProperty("chromepath");
		return getchrome;
	}
}

