package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.SetupDriver;

public class ProductsPage extends SetupDriver {

//	@FindBy(className = "app_logo")
//	public WebElement logo;
	public By logo = (By.className("app_logo"));

//	@FindBy(id = "shopping_cart_container")
//	public WebElement shoppingcartcontainer;
//	
	public By shoppingcartcontainer = (By.id("shopping_cart_container"));
	


//	@FindBy(id = "react-burger-menu-btn")
//	public WebElement menu_btn;

	public By menu_btn = (By.id("react-burger-menu-btn"));

//	@FindBy(className = "product_sort_container")
//	public WebElement select_filter_btn;
//	
	public By select_filter_btn = (By.className("product_sort_container"));

//	@FindBy(className="inventory_item_name")
//	public
//	List<WebElement> products;
	public By products = By.className("inventory_item_name");

//	@FindBy(xpath="//button[text()=\"Add to cart\"]")
//	public
//	List<WebElement> add_to_cart_btn;
	public By add_to_cart_btn = (By.xpath("//button[text()=\"Add to cart\"]"));

//	@FindBy(xpath="//button[text()=\"Remove\"]")
//	public
//	List<WebElement> remove_btn;
	public By remove_btn = (By.xpath("//button[text()=\"Remove\"]"));

//	@FindBy(className="inventory_item_price")
//	public
//	List<WebElement> item_price;
	public By item_price = (By.className("inventory_item_price"));

//	@FindBy(className = "social_twitter")
//	public WebElement twitter_btn;

	public By twitter_btn = (By.className("social_twitter"));

//	@FindBy(className = "social_facebook")
//	public WebElement facebook_btn;

	public By facebook_btn = (By.className("social_facebook"));

//	@FindBy(className = "social_linkedin
//	public WebElement linkein_btn;

	public By linkein_btn = (By.className("social_linkedin"));

//	@FindBy(className = "shopping_cart_badge")
//	public WebElement cartNumber;
	public By cartNumber = (By.className("shopping_cart_badge"));

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public void navigation() {

		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();
		

	}

	public void allItemsClick() {
		for (int i = 0; i < driver.findElements(products).size(); i++) {
			driver.findElements(products).get(i).click();
			driver.navigate().back();
		}
	}

	public void allItemsAddToCartFronInProduct() {
		InProductPage inproductpage=new InProductPage();	
		for (int i = 0; i < driver.findElements(products).size(); i++) {
			driver.findElements(products).get(i).click();
			driver.findElement(inproductpage.add_to_cart_btn).click();
			driver.navigate().back();
		}
	}
	public void firstItemClick() {
		driver.findElement(products).click();
	}

	public void addToCartclick() {
		for (int i = 0; i < driver.findElements(add_to_cart_btn).size(); i++) {
			driver.findElements(add_to_cart_btn).get(i).click();
		}
	}

	public void clickonCart() {
		driver.findElement(shoppingcartcontainer).click();
	}
}