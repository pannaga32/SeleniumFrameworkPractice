package GuruProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.ReadConfig;

public class BankBaseClass {

	private static final String[] String = null;
	WebDriver driver;
	Logger logger;

	ReadConfig readconfig=new ReadConfig();

	public String URL=readconfig.getapplicationurl();
	public String uid=readconfig.getuserid();
	public String pass=readconfig.getpassword();


	@BeforeTest

	@Parameters("browser")
	public void setup(String brws)
	{

		if(brws.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", readconfig.getchrome());

			driver=new ChromeDriver();
		}
		else if(brws.equals("firefox"))
		{


			System.setProperty("webdriver.gecko.driver", readconfig.getfirefox());

			driver=new FirefoxDriver();
		}

		logger=LogManager.getLogger();

	}


	@AfterTest

	public void teardown()
	{
		driver.close();
	}








}
