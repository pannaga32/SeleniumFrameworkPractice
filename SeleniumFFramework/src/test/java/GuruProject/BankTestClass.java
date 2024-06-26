package GuruProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

public class BankTestClass extends BankBaseClass {

	@Test
	
	public void test() throws InterruptedException
	{
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		logger.info("URL is invoked");
		
		BankPageClass test=new BankPageClass(driver);
		test.userid(uid);
		Thread.sleep(3000);
		logger.info("Userid is entered");
		test.password(pass);
		
		
		Thread.sleep(3000);
		logger.info("Password is entered");
		
		test.login();
		logger.info("Loggedi in successfully");
		
		

	}

}
