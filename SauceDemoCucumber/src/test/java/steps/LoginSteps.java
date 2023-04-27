package steps;

import org.testng.Assert;

import base.SetupDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ProductsPage;
import pageobjects.SignInPage;

public class LoginSteps extends SetupDriver{
	
	@Given("user navigates to website url")
	public void websiteNavigation() {
		SignInPage sign = new SignInPage();
		sign.navigate();
	}
	
    @When ("user provides correct {string} and {string} and clicks login btn")
    public void typingCorrectUserNameAndPassword(String name,String password) {
		SignInPage sign = new SignInPage();
		sign.typeUserName(name);
		sign.typePassword(password);
		sign.clickLogin();
    }
    
    @When ("user provides wrong {string} and {string} and clicks login btn")
    	public void typingWrongUserNameAndPassword(String name,String password) {
		SignInPage sign = new SignInPage();
		sign.typeUserName(name);
		sign.typePassword(password);
		sign.clickLogin();
    }
    
    @Then ("inventory page should appera")
    public void checkInventoryPage() {
    	ProductsPage productspage=new ProductsPage();
		Assert.assertTrue(driver.findElement(productspage.products).isDisplayed());
    }
    @Then ("I verify that {string} appears")
    public void chechErrorMessage(String errormsg) {
		SignInPage sign = new SignInPage();
		Assert.assertEquals(errormsg, driver.findElement(sign.errormsg).getText());
    }
    
    
    @Then ("logo is displayed")
    public void chechLogo( ) {
		SignInPage sign = new SignInPage();
		Assert.assertTrue(driver.findElement(sign.logo).isDisplayed());
    }
    
    
    @Then ("login btn is displayed")
    public void chechLoginBtn( ) {
		SignInPage sign = new SignInPage();
		Assert.assertTrue(driver.findElement(sign.login_btn).isDisplayed());
    }
    
    
    @Then ("username is displayed")
    public void chechUserNameField( ) {
		SignInPage sign = new SignInPage();
		Assert.assertTrue(driver.findElement(sign.usernam).isDisplayed());
    }
    
    
    
    @Then ("password is displayed")
    public void chechPasswordField() {
		SignInPage sign = new SignInPage();
		Assert.assertTrue(driver.findElement(sign.pass).isDisplayed());
    }

}
