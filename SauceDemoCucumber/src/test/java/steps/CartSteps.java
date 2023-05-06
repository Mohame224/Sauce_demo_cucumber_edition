package steps;

import org.testng.Assert;

import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;

public class CartSteps extends SetupDriver{
	@Given("user on cart page")
	public void user_logs_in_the_website_and_addts_products_to_cart_then_press_the_cartt_btn() {
		CartPage cartPage = new CartPage();
		cartPage.cartNavigationWithItemds();
	}

	@When("user press the continue shopping btn")
	public void user_press_the_continue_shopping_btn() {
		CartPage cartPage = new CartPage();
		driver.findElement(cartPage.continue_shopping_btn).click();
	}



	@Then("user should be navigated to inventory page")
	public void user_should_be_navigated_to_inventory_page() {
		String currentUrl = prop.getProperty("inventory_url");
		Assert.assertEquals(currentUrl, driver.getCurrentUrl());
	}


	@When("user remove product")
	public void user_press_the_remove_product_btn() {
		CartPage cartPage = new CartPage();
		int c = driver.findElements(cartPage.remove_btn).size();
		for (int i = 0; i < c; i++) {
			driver.findElement(cartPage.remove_btn).click();
			driver.navigate().refresh();

		}
	}



	@Then("cart count should decrease and the product name should disappear")
	public void cart_count_should_decrease_and_the_product_name_should_disappear() {
		CartPage cartPage = new CartPage();
		boolean exists = driver.findElements(cartPage.remove_btn).size() == 0;
		Assert.assertTrue(exists);

	}


	@When("user presses checkout")
	public void user_press_the_checkout_btn() {
		CartPage cartPage = new CartPage();
		driver.findElement(cartPage.checkout_btn).click();
	}


	@Then("user should be navigated to checkout page")
	public void user_should_be_navigated_to_checkout_page() {
		CheckOutPage checkputpage = new CheckOutPage();
		Assert.assertTrue(driver.findElement(checkputpage.postal_code).isDisplayed());
	}


}
