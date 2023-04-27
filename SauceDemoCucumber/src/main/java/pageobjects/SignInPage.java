package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.SetupDriver;

public class SignInPage extends SetupDriver {

//	@FindBy(id = "user-name")
//	public WebElement usernam;
	
	public By usernam=(By.id("user-name"));

//	@FindBy(id = "password")
//	public WebElement pass;
	
	public By pass=(By.id("password"));

//	@FindBy(id = "login-button")
//	public WebElement login_btn;
	
	public By login_btn=(By.id("login-button"));

//	@FindBy(className = "login_logo")
//	public WebElement logo;
	
	public By logo=(By.className("login_logo"));

//	@FindBy(className = "error-button")
//	public WebElement errorBtn;
	
	public By errorBtn=(By.id("error-button"));
	
//	@FindBy(xpath="//div[@class=\"error-message-container error\"]")
//	public WebElement errormsg;
	
	public By errormsg=(By.xpath("//div[@class=\"error-message-container error\"]"));

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	public String missing_password="Epic sadface: Password is required";
//	public String missing_username="Epic sadface: Username is required";
//	public String invalid_info="Epic sadface: Username and password do not match any user in this service";
//	public String locked_out_user="Epic sadface: Sorry, this user has been locked out.";

	
	public void navigate() {
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	
	public void typeUserName(String username) {
		Action ac=new Action(driver);
		driver.findElement(usernam).clear();
		ac.typing(driver.findElement(usernam), username);
	}
	
	public void typePassword(String password) {
		Action ac=new Action(driver);
		driver.findElement(pass).clear();
		ac.typing(driver.findElement(pass), password);
	}
	
	public void clickLogin() {
		Action ac=new Action(driver);
		ac.click(driver.findElement(login_btn));
	}


}
