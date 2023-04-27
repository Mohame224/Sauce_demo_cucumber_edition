package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;


import base.SetupDriver;

public class InProductPage extends SetupDriver {

//	@FindBy(className = "app_logo")
//	public WebElement logo;
	public By logo = (By.className("app_logo"));

//	@FindBy(id = "shopping_cart_container")
//	public WebElement shoppingcartcontainer;
	public By shoppingcartcontainer = (By.id("shopping_cart_container"));

//	@FindBy(id = "react-burger-menu-btn")
//	public WebElement menu_btn;
	public By menu_btn = (By.id("react-burger-menu-btn"));

//	@FindBy(id = "back-to-products")
//	public WebElement back_btn;
	public By back_btn = (By.id("back-to-products"));

//	@FindBy(className = "social_twitter")
//	public WebElement twitter_btn;
	public By twitter_btn = (By.className("social_twitter"));

//	@FindBy(className = "social_facebook")
//	public WebElement facebook_btn;
	public By facebook_btn = (By.className("social_facebook"));

//	@FindBy(className = "social_linkedin")
//	public WebElement linkein_btn;
	public By linkein_btn = (By.className("social_linkedin"));

//	@FindBy(className = "inventory_details_price")
//	public WebElement price;
	public By price = (By.className("inventory_details_price"));

//	@FindBy(xpath = "//button[text()=\"Add to cart\"]")
//	public WebElement add_to_cart_btn;
	public By add_to_cart_btn = (By.xpath("//button[text()='Add to cart']"));

//	@FindBy(className = "inventory_details_img_container")
//	public WebElement img;
	public By img = (By.className("inventory_details_img_container"));

//	@FindBy(xpath = "//button[text()=\"Remove\"]")
//	public WebElement remove;
	public By remove = (By.xpath("//button[text()=\"Remove\"]"));

//	@FindBy(className = "shopping_cart_badge")
//	public WebElement cartNumber;
	public By cartNumber = (By.className("shopping_cart_badge"));

	public InProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void navigation() {
		ProductsPage productspage=new ProductsPage();
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();
		driver.findElement(productspage.products).click();
	}
	public void pressBackButton() {

		driver.findElement(back_btn).click();
		;

	}

	public void pressaddtoCartButton() {
		driver.findElement(add_to_cart_btn).click();

	}

	public void pressCartButton() {
		driver.findElement(shoppingcartcontainer).click();

	}

}
