package GuruProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BankBaseClass {
	
	WebDriver driver;
	
	
	public String URL="https://demo.guru99.com/v3/index.php";
	public String uid="mngr573335";
	public String 	pass="ymErEmA";
	
	@BeforeTest
	public void setup()
	{

		System.setProperty("webdriver.gecko.driver", "D://geckodriver//geckodriver.exe");
	
		 driver=new FirefoxDriver();
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	

}
