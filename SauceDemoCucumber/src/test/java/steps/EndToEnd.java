package steps;

import org.testng.Assert;

import base.SetupDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CompleteCheckOutPreview;
import pageobjects.ProductsPage;

public class EndToEnd extends SetupDriver {
	@When("user presses on cart badge")
	public void user_presses_the_cart_btn() {
		ProductsPage productspage=new ProductsPage();
		driver.findElement(productspage.shoppingcartcontainer).click();
	}



	@Then("order completion Text should appear")
	public void order_completion_text_should_appear() {
		CompleteCheckOutPreview completecheckoutpreview=new CompleteCheckOutPreview();

		Assert.assertTrue(driver.findElement(completecheckoutpreview.complete_container).isDisplayed());

	}
}
