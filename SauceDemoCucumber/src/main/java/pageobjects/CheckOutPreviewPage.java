package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import base.SetupDriver;

public class CheckOutPreviewPage extends SetupDriver {

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

//	@FindBy(className = "inventory_item_name")
//	public
//	List<WebElement> items;
	public By items = (By.className("inventory_item_name"));

//	@FindBy(className = "summary_info_label")
//	public
//	List<WebElement> labels;
	public By labels = (By.className("summary_info_label"));

//	@FindBy(className = "summary_subtotal_label")
//	public
//	WebElement priceBeforeTax;
	public By priceBeforeTax = (By.className("summary_subtotal_label"));

//	@FindBy(className = "summary_tax_label")
//	public
//	WebElement tax;
	public By tax = (By.className("summary_tax_label"));

//	@FindBy(xpath= "//div[@class='summary_info_label summary_total_label']")
//	public
//	WebElement priceAfterTax;
	public By priceAfterTax = (By.xpath("//div[@class='summary_info_label summary_total_label']"));

//	@FindBy(id = "cancel")
//	public
//	WebElement cancel_btn;
	public By cancel_btn = (By.id("cancel"));

//	@FindBy(id = "finish")
//	public
//	WebElement finish_btn;
	public By finish_btn = (By.id("finish"));

	public CheckOutPreviewPage() {
		PageFactory.initElements(driver, this);

	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public Object pressCancel() {
		driver.findElement(cancel_btn).click();
		return new ProductsPage();
	}

	public Object pressFinish() {
		driver.findElement(finish_btn).click();
		return new CompleteCheckOutPreview();
	}

	public void navigation() {
		CheckOutPage checkoutpage = new CheckOutPage();
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
		checkoutpage.typeFirstName("jkgyggygiygg");
		checkoutpage.typeLastName("jhhj");
		checkoutpage.typePostal("23123");
		checkoutpage.pressContinue();

	}

}
