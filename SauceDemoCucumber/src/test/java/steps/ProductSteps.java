package steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.collect.Ordering;

import base.Action;
import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.InProductPage;
import pageobjects.ProductsPage;

public class ProductSteps extends SetupDriver {
	@Given("user navigate to inventory page")
	public void navigateToInventory() {
		ProductsPage page = new ProductsPage();
		page.navigation();
	}

	@When("user clicks on AtoZ filter")
	public void selectAtoZFilter() {
		ProductsPage page = new ProductsPage();
		Select select = new Select(driver.findElement(page.select_filter_btn));

		select.selectByValue("az");
	}

	@When("user clicks on ZtoA filter")
	public void selectZtoAFilter() {
		ProductsPage page = new ProductsPage();
		Select select = new Select(driver.findElement(page.select_filter_btn));

		select.selectByValue("za");
	}

	@When("user clicks on price low to high filter")
	public void selectLowToHighFilter() {
		ProductsPage page = new ProductsPage();
		Select select = new Select(driver.findElement(page.select_filter_btn));

		select.selectByValue("lohi");
	}

	@When("user clicks on price high to low filter")
	public void selectHighToLowFilter() {
		ProductsPage page = new ProductsPage();
		Select select = new Select(driver.findElement(page.select_filter_btn));

		select.selectByValue("hilo");
	}

	@When("user clicks on product names then back")
	public void clickOnProductNamesThenBack() {
		ProductsPage page = new ProductsPage();
		Action ac = new Action(driver);
		for (int i = 0; i < driver.findElements(page.products).size(); i++) {
			driver.findElements(page.products).get(i).click();
			ac.backNavigate();
		}
	}

	@When("user clicks on add to cart btn then the remove buttons when it appears")
	public void clickOnAddToCartBtnThenRemoveBtn(){
		ProductsPage page = new ProductsPage();

		for (WebElement option : driver.findElements(page.add_to_cart_btn)) {
			option.click();
		}

		Assert.assertEquals(Integer.toString(driver.findElements(page.products).size()),
				driver.findElement(page.cartNumber).getText());
		for (WebElement option : driver.findElements(page.remove_btn)) {
			option.click();
		}

	}

	@When("user clicks on a product then clicks on add to cart in the product page")
	public void clickOnAddToCart() {
		ProductsPage page = new ProductsPage();
		Action ac = new Action(driver);
		InProductPage page2 = new InProductPage();
		for (int i = 0; i < driver.findElements(page.products).size(); i++) {
			driver.findElements(page.products).get(i).click();
			ac.implicitWait(2000);
			page2.pressaddtoCartButton();
			ac.implicitWait(2000);
			page2.pressBackButton();

		}
	}

	@Then("products should be sorted by name from A to Z")
	public void checkAtoZSort() {
		ProductsPage page = new ProductsPage();
		List<String> sorted = new ArrayList<String>();
		for (WebElement option : driver.findElements(page.products)) {

			sorted.add(option.getText());
		}
		boolean sortedCheck = Ordering.natural().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);
	}

	@Then("products should be sorted by name from Z to A")
	public void checkZtoASort() {
		ProductsPage page = new ProductsPage();
		List<String> sorted = new ArrayList<String>();
		for (WebElement option : driver.findElements(page.products)) {

			sorted.add(option.getText());
		}
		boolean sortedCheck = Ordering.natural().reverse().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);
	}

	@Then("products should be sorted by price from low to high")
	public void checkLowToHighFilter() {
		ProductsPage page = new ProductsPage();
		List<Float> sorted = new ArrayList<Float>();

		for (WebElement option : driver.findElements(page.item_price)) {

			sorted.add(Float.parseFloat(option.getText().replace("$", "")));
		}
		boolean sortedCheck = Ordering.natural().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);
	}

	@Then("products should be sorted by price from high to low")
	public void checkHighToLowFilter() {
		ProductsPage page = new ProductsPage();
		List<Float> sorted = new ArrayList<Float>();

		for (WebElement option : driver.findElements(page.item_price)) {

			sorted.add(Float.parseFloat(option.getText().replace("$", "")));
		}
		boolean sortedCheck = Ordering.natural().reverse().isOrdered(sorted);

		Assert.assertTrue(sortedCheck);

	}

	@Then("user should be navigated to the inventory page")
	public void checkCurrentUrl() {
		Action ac = new Action(driver);
		String curenturl = prop.getProperty("incentory_url");
		Assert.assertNotEquals(ac.getCurrentURL(), curenturl);
	}

	@Then("cart count increses then decreases")
	public void CheckCartNumber() {
		ProductsPage page = new ProductsPage();
		boolean exists = driver.findElements(page.remove_btn).size() == 0;
		Assert.assertTrue(exists);
	}

	@Then("cart count increases")
	public void checkCartCount()  {

		ProductsPage page = new ProductsPage();

		InProductPage page2 = new InProductPage();
		Assert.assertEquals(Integer.toString(driver.findElements(page.products).size()),
				driver.findElement(page2.cartNumber).getText());
	}
}
