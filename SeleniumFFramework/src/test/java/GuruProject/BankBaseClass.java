package GuruProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.ReadConfig;

public class BankBaseClass {
	
	WebDriver driver;
	Logger logger;
	
	ReadConfig readconfig=new ReadConfig();
	
	public String URL=readconfig.getapplicationurl();
	public String uid=readconfig.getuserid();
	public String pass=readconfig.getpassword();
	
	
	@BeforeTest
	public void setup()
	{

		System.setProperty("webdriver.gecko.driver", readconfig.getfirefox());
	
		driver=new FirefoxDriver();
		
		
		//System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
		
		// driver=new ChromeDriver();
		 
	 logger=LogManager.getLogger();
		 
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
