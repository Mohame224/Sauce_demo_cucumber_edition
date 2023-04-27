package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.SetupDriver;

public class CartPage extends SetupDriver {
//	@FindBy(className = "social_twitter")
//	public
//	WebElement twitter_btn;
	public By  twitter_btn=(By.className ("social_twitter"));

//	@FindBy(className = "social_facebook")
//	public
//	WebElement facebook_btn;
	public By facebook_btn =(By.className ("social_facebook"));

//	@FindBy(className = "social_linkedin")
//	public
//	WebElement linkein_btn;
	public By  linkein_btn=(By.className ("social_linkedin"));

//	@FindBy(id = "continue-shopping")
//	public
//	WebElement continue_shopping_btn;
	public By  continue_shopping_btn=(By. id("continue-shopping"));

//	@FindBy(id="react-burger-menu-btn")
//	public
//	WebElement menu_btn;
	public By menu_btn =(By. id("react-burger-menu-btn"));
	
//	@FindBy(id = /*"checkout")
//	public
//	WebElement checkout_btn;
	public By checkout_btn =(By.id ("checkout"));
	
//	@FindBy(xpath="//button[text()=\"Remove\"]")
//	public
//	List<WebElement> remove_bt
	public By  remove_btn=(By.xpath ("//button[text()=\"Remove\"]"));
	
//	@FindBy(className="inventory_item_price")
//	public
//	List<WebElement> price;
	public By price =(By.className ("inventory_item_price"));
	
//	know item before sending
//	@FindBy(className = "cart_quantity")
//	public
//	List<WebElement>  cart_quantity_btn;
	public By  cart_quantity_btn=(By.className ("cart_quantity"));

//	@FindBy(className = "cart_item")
//	public
//	List<WebElement> items;
	public By items =(By.className ("cart_item"));

	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void cartNavigationWithItemds() {
		ProductsPage productspage=new ProductsPage();
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();

		productspage.allItemsAddToCartFronInProduct();
		driver.findElement(productspage.shoppingcartcontainer).click();
		
		
	}
	@Test
	public void cartNavigationWithoutItemds() {
		ProductsPage productspage=new ProductsPage();
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();
		driver.findElement(productspage.shoppingcartcontainer).click();
		
		
	}
	
	
	public void pressCheckBtn() {
	driver.findElement(checkout_btn).click();
	}
	

}