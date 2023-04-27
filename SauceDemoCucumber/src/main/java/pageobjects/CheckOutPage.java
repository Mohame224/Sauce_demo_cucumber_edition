package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.SetupDriver;

public class CheckOutPage extends SetupDriver {
//	@FindBy(className = "social_twitter")
//	public
//	WebElement twitter_btn;
	public By twitter_btn= (By.className("social_twitter"));
	
//	@FindBy(className = "social_facebook")
//	public
//	WebElement facebook_btn;
	public By facebook_btn= (By.className("social_twitter"));
//	@FindBy(className = "social_linkedin")
//	public
//	WebElement linkein_btn;
	public By linkein_btn= (By.className("social_linkedin"));
	
//	@FindBy(id = "cancel")
//	public
//	WebElement cancel_btn;
	public By cancel_btn= (By.id("cancel"));
//	@FindBy(id = "continue")
//	public
//	WebElement continue_btn;
	public By continue_btn= (By.id("continue"));
	
//	@FindBy(id = "first-name")
//	public
//	WebElement first_name;
	public By first_name= (By.id("first-name"));
	
//	@FindBy(id = "last-name")
//	public
//	WebElement last_name;
	public By last_name= (By.id("last-name"));
	
//	@FindBy(id = "postal-code")
//	public
//	WebElement postal_code;
	public By postal_code= (By.id("postal-code"));
	
	
//	@FindBy(className="app_logo")
//	public
//	WebElement logo;
	public By logo= (By.className("app_logo"));
	
//	@FindBy(id="shopping_cart_container")
//	public
//	WebElement shoppingcartcontainer;
	public By shoppingcartcontainer= (By.id("shopping_cart_container"));
	
//	@FindBy(id="react-burger-menu-btn")
//	public
//	WebElement menu_btn;
	public By menu_btn= (By.id("react-burger-menu-btn"));
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
}
	
	public void navigate() {
		CartPage cartpage=new CartPage();
		ProductsPage productspage=new ProductsPage();
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();

		productspage.allItemsAddToCartFronInProduct();
		driver.findElement(productspage.shoppingcartcontainer).click();
		cartpage.pressCheckBtn();
		
	}
	
	public void typeFirstName(String name) {
		Action ac=new Action(driver);
		ac.typing(driver.findElement(first_name), name);
	}
	
	public void typeLastName(String lname) {
		Action ac=new Action(driver);
		ac.typing(driver.findElement(last_name), lname);
	}
	
	public void typePostal(String zip) {
		Action ac=new Action(driver);
		ac.typing(driver.findElement(postal_code),  zip);
	}
	
	public void pressCancel() {
		driver.findElement(cancel_btn).click();

	}
	
	public void pressContinue() {
		driver.findElement(continue_btn).click();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
}
