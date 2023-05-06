package steps;

import org.testng.Assert;

import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CheckOutPreviewPage;
import pageobjects.CompleteCheckOutPreview;

public class CheckOutPreviewSteps extends SetupDriver {
	@Given("user in to checkout preview page")
	public void user_logs_to_website_then_adds_products_and_navigates_to_cart_then_presses_continue_and_adds_his_information_then_press_continue() {
		CheckOutPreviewPage page = new CheckOutPreviewPage();

		page.navigation();
	}



	@When("user continue the purchase")
	public void user_presses_continue() {
		CheckOutPreviewPage page = new CheckOutPreviewPage();

		page.pressFinish();
	}



	@Then("user should be navigated to order completion page")
	public void user_should_be_navigated_to_order_completion_page() {
		CompleteCheckOutPreview completecheckoutpreview=new CompleteCheckOutPreview();

		Assert.assertTrue(driver.findElement(completecheckoutpreview.complete_container).isDisplayed());

	}


	@When("user cancels order")
	public void user_presses_cancel() {
		CheckOutPreviewPage page = new CheckOutPreviewPage();

		page.pressCancel();
	}


}
