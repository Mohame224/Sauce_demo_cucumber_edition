package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Action;
import base.SetupDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MenuPage;
import pageobjects.ProductsPage;
import pageobjects.SignInPage;

public class MenuSteps extends SetupDriver {
	@Given("users navigates to website and logs in")
	public void navigateToWebsite() {
		MenuPage menupage = new MenuPage();
		menupage.navigate();
	}

	@When("user presses on side menu")
	public void clickOnSideMenu() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		ac.click(driver.findElement(menupage.menu_btn));
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarlogout), 2);
	}

	@And("user presses on logout")
	public void pressOnLogOut() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		ac.click(driver.findElement(menupage.sidebarlogout));

	}

	@And("user presses on about")
	public void pressOnAbout() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebaraboutlink), 2);

		ac.click(driver.findElement(menupage.sidebaraboutlink));

	}

	@And("user presses on all items")
	public void pressOnAllItems() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarallitemslink), 2);

		ac.click(driver.findElement(menupage.sidebarallitemslink));

	}

	@And("press reset app state from sidebar")
	public void pressOnResetAppState() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarresetappstatelink), 2);

		ac.click(driver.findElement(menupage.sidebarresetappstatelink));

	}

	@Then("url navigates to loginpage")
	public void checkNavigationToLoginPage() {
		SignInPage signinpage = new SignInPage();
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(driver.findElement(signinpage.usernam), 2);

		Assert.assertTrue(driver.findElement(signinpage.usernam).isDisplayed());
	}

	@Then("url navigates to about page")
	public void checkNavigationToAboutPage() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(driver.findElement(By.className("css-zgf6by")), 2);
		Assert.assertTrue(driver.findElement(By.className("css-zgf6by")).isDisplayed());
	}

	@Then("url navigates to inventory page")
	public void checkNavigationToInventoryPage() {
		Action ac = new Action(driver);
		ProductsPage productspage = new ProductsPage();
		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());
	}

	@Then("cart number turns to 0")
	public void checkCartNumber() {
		ProductsPage productspage = new ProductsPage();

		Action ac = new Action(driver);

		ac.explicitWaitTillElementVisibility(driver.findElement(productspage.products), 2);
		boolean exists = driver.findElements(productspage.cartNumber).size() == 0;
		Assert.assertTrue(exists);
	}
	
	
	
	@Then ("check sidebar UI")
	public void checkSideBarUI() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
	ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebar), 2);

	Assert.assertTrue(driver.findElement(menupage.sidebar).isDisplayed());
	}
	
	@Then ("check about link")
	public void checkAboutUI() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
	ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarallitemslink), 2);

	Assert.assertTrue(driver.findElement(menupage.sidebarallitemslink).isDisplayed());
	}
	
	@Then ("check reset app state link")
	public void checkResetStateUI() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
	ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebaraboutlink), 2);

	Assert.assertTrue(driver.findElement(menupage.sidebaraboutlink).isDisplayed());
	}
	
	@Then ("check logout link")
	public void checkLogOutUI() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
	ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarlogout), 2);

	Assert.assertTrue(driver.findElement(menupage.sidebarlogout).isDisplayed());
	}
	
	@Then ("check all items link")
	public void checkAllItemsLinkUI() {
		MenuPage menupage = new MenuPage();
		Action ac = new Action(driver);
	ac.explicitWaitTillElementVisibility(driver.findElement(menupage.sidebarresetappstatelink), 2);
	Assert.assertTrue(driver.findElement(menupage.sidebarresetappstatelink).isDisplayed());
}}
