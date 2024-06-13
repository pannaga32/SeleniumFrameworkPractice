package GuruProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankPageClass {

	
	WebDriver driver;
	
	
	
	public BankPageClass (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
By user_id=By.name("uid");

By pass_word=By.name("password");

By login_button=By.name("btnLogin");
	
public void userid(String text1)
{
	driver.findElement(user_id).sendKeys(text1);
}


public void password(String text2)

{
	driver.findElement(pass_word).sendKeys(text2);
}




public void login()

{
	driver.findElement(login_button).click();
}
}

	
	
	
	


