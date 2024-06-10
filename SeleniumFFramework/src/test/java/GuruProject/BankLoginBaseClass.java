package GuruProject;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BankLoginBaseClass  {
	
	WebDriver driver=null;
	Logger logger;
	
	
	@BeforeTest
	public void setup()
	{
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
	
	
	
	
	
	
	
	
	

	/*WebDriver driver;
	Logger logger;
	
	ReadConfig readconfig=new ReadConfig();
	
	public  String URL=readconfig.getapplicationurl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	
	
	
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getchrome());
		
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefox());
			
			driver=new FirefoxDriver();
		}
		
		
		 logger=LogManager.getLogger();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}*/
	
	
	
	
	
	
	
	
	



