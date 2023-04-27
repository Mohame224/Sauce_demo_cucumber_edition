package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import base.SetupDriver;

public class CompleteCheckOutPreview extends SetupDriver {

//	@FindBy(className = "social_twitter")
//	public
//	WebElement twitter_btn;
	public By twitter_btn = (By.className("social_twitter"));

//	@FindBy(className = "social_facebook")
//	public
//	WebElement facebook_btn;
	public By facebook_btn = (By.className("social_facebook"));

//	@FindBy(className = "social_linkedin")
//	public
//	WebElement linkein_btn;
	public By linkein_btn = (By.className("social_linkedin"));

//	@FindBy(className = "app_logo")
//	public
//	WebElement logo;
	public By logo = (By.className("app_logo"));

//	@FindBy(id = "shopping_cart_container")
//	public
//	WebElement shoppingcartcontainer;
	public By shoppingcartcontainer = (By.id("shopping_cart_container"));

//	@FindBy(id = "react-burger-menu-btn")
//	public
//	WebElement menu_btn;
	public By menu_btn = (By.id("react-burger-menu-btn"));

//	@FindBy(id = "back-to-products")
//	public
//	WebElement back_btn;
	public By back_btn = (By.id("back-to-products"));

//	@FindBy(className = "complete-header")
//	public
//	WebElement complete_text;
	public By complete_text = (By.className("complete-header"));

//	@FindBy(className = "pony_express")
//	public
//	WebElement complete_img;
	public By complete_img = (By.className("pony_express"));

//	@FindBy(id = "checkout_complete_container")
//	public
//	WebElement complete_container;
	public By complete_container = (By.id("checkout_complete_container"));

	public CompleteCheckOutPreview() {
		PageFactory.initElements(driver, this);
	}

	public void navigate() {
		CheckOutPreviewPage checkoutpreviewpage = new CheckOutPreviewPage();
		CheckOutPage checkoutpage = new CheckOutPage();
		CartPage cartpage = new CartPage();
		ProductsPage productspage = new ProductsPage();
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();

		productspage.allItemsAddToCartFronInProduct();
		driver.findElement(productspage.shoppingcartcontainer).click();
		cartpage.pressCheckBtn();
		checkoutpage.typeFirstName("jkgyggygiygg");
		checkoutpage.typeLastName("jhhj");
		checkoutpage.typePostal("23123");
		checkoutpage.pressContinue();
		driver.findElement(checkoutpreviewpage.finish_btn).click();
	}

	public void pressBack() {
		driver.findElement(back_btn).click();
	}
}
