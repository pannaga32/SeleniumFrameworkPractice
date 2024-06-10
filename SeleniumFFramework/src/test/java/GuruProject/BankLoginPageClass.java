package GuruProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BankLoginPageClass {
	

	
	
	
	By user_id=By.name("uid");
	By pass_word=By.name("password");
	By login=By.name("btnLogin");
	
	public BankLoginPageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
		

		public void username(String text1)
		{
		driver.findElement(user_id).sendKeys(text1);
		}
		
		
		public void password(String text2)
		{
		
		
		driver.findElement(pass_word).sendKeys(text2);
		}
		
		
		public void login_button()
		{
		
		driver.findElement(By.name("btnLogin")).click();
	}
}
	
	
















































/*WebDriver driver=null;
	
By user_name=By.name("uid");


By pass_word=By.name("password");

By login=By.name("btnLogin");

public BankLoginPageClass(WebDriver driver)
{
	this.driver=driver;
}


public void username(String text1)
{
	driver.findElement(user_name).sendKeys(text1);
}
	


public  void password(String text2)
{
	driver.findElement(pass_word).sendKeys(text2);
}
	


public  void login_button()
{
	driver.findElement(login).click();
}
	
}*/
	

	
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


	/*WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();


	driver.get("https://demo.guru99.com/V1/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("uid")).sendKeys("mngr552092");

	driver.findElement(By.name("password")).sendKeys("tysUrUh");

	driver.findElement(By.name("btnLogin")).click();

	driver.close();*/










