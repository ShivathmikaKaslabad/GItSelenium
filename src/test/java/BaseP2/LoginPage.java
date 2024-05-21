package BaseP2;

import org.openqa.selenium.By;
import BaseP1.BaseC1;

public class LoginPage extends BaseC1 {

	public static By EmailId = By.id("email");
	public static By passwordId = By.xpath("//input[@name = 'pass']");
	public static By Login = By.xpath("//*[@name = 'login']");
	
	public static void Enter_EmailId(String Email)
	{
		driver.findElement(EmailId).sendKeys(Email);
	}
	public static void Enter_password(String password )
	{
		driver.findElement(passwordId).sendKeys(password);
}
	public static void Login()
	{
		driver.findElement(Login).click();	
	}
}