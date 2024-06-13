package GuruProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class BankTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "D://geckodriver//geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v3/index.php");
		driver.manage().window().maximize();
		
		BankPageClass test=new BankPageClass(driver);
		test.userid("mngr573335");
		Thread.sleep(3000);
		test.password("ymErEmA");
		
		
		Thread.sleep(3000);
		
		test.login();
		
		

	}

}
