package steps;

import org.testng.Assert;

import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;
import pageobjects.CheckOutPreviewPage;

public class CheckOutSteps extends SetupDriver {
	@Given("user logs to the website and add items to the cart then navigate to cart and presses checkout")
	public void user_logs_to_the_website_and_add_items_to_the_cart_then_navigate_to_cart_and_presses_checkout() {
		CartPage cartpage = new CartPage();
		cartpage.cartNavigationWithItemds();
		cartpage.pressCheckBtn();
	}



	@When("user presses the cancel btn")
	public void user_fills_all_info_then_presses_the_cancel_btn() {
		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.pressCancel();
	}



	@Then("user should be navigated to the cart page")
	public void user_should_be_navigated_to_the_cart_page() {
		CartPage cartpage = new CartPage();
		Assert.assertTrue(driver.findElement(cartpage.continue_shopping_btn).isDisplayed());

	}



	@When("user fills all info then presses the continue btn")
	public void user_fills_all_info_then_presses_the_continue_btn() {
		CheckOutPage checkoutpage = new CheckOutPage();
		checkoutpage.typeFirstName("fdx");

		checkoutpage.typeLastName("sdggr");

		checkoutpage.typePostal("2133244");

		checkoutpage.pressContinue();
	}



	@Then("user should be navigated to the checkout preview page")
	public void user_should_be_navigated_to_the_checkout_preview_page() {
		CheckOutPreviewPage checkoutpreview = new CheckOutPreviewPage();

		Assert.assertTrue(driver.findElement(checkoutpreview.priceAfterTax).isDisplayed());

	}



}
