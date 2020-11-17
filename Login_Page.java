package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	
	// Object Repo
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		@FindBy(xpath = "//input[@name='pwd']")
		WebElement pswd;
		
		@FindBy(xpath= " //div[contains(text(),'Login ')] ")
		WebElement Subbtn;
		
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getusrnm(String unm)
	{    username.click();
		username.sendKeys(unm);
	}
	public void getpwd(String pwd)
	{ pswd.click();
		pswd.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		Subbtn.click();
	}	

}
