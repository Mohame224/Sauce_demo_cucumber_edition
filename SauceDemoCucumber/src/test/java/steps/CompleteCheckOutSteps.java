package steps;

import org.testng.Assert;

import base.Action;
import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CompleteCheckOutPreview;
import pageobjects.ProductsPage;

public class CompleteCheckOutSteps  extends SetupDriver{
	@Given("user logs in to the website and add products to cart then proceeds to check out and fills his info then presses continue then continue")
	public void user_logs_in_to_the_website_and_add_products_to_cart_then_proceeds_to_check_out() {


		CompleteCheckOutPreview page=new CompleteCheckOutPreview();
		page.navigate();
	}




	@When("user presses the back btn")
	public void user_presses_the_back_btn() {
		CompleteCheckOutPreview page=new CompleteCheckOutPreview();
		page.pressBack();
	}


	@Then("user navigates to inventory page and cart number disappears")
	public void user_navigates_to_inventory_page_and_cart_number_disappears() {
		Action ac=new Action(driver);

		ProductsPage productspage = new ProductsPage();
		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		boolean exists = driver.findElements(productspage.cartNumber).size() == 0;

		Assert.assertTrue(exists);

	}

}
