package GuruProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BankBaseClass {
	
	WebDriver driver;
	Logger logger;
	
	
	public String URL="https://demo.guru99.com/v3/index.php";
	public String uid="mngr573335";
	public String 	pass="ymErEmA";
	
	@BeforeTest
	public void setup()
	{

		//System.setProperty("webdriver.gecko.driver", "D://geckodriver//geckodriver.exe");
	
		// driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
	 logger=LogManager.getLogger();
		 
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
