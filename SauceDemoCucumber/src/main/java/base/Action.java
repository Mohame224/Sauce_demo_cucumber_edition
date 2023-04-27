package base;



import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action {
	WebDriver driver;

	// initializing driver by constructor
	public Action(WebDriver driver) {
		this.driver = driver;
	}

	// check if element is displayed
	public boolean isDisplayed(WebElement ele) {

		if (ele.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	// click on web element
	public void click(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	// type into web element
	public void typing(WebElement ele, String info) {
		ele.sendKeys(info);
	}
	//implicit wait
	@SuppressWarnings("deprecation")
	public void implicitWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	//get url
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void backNavigate() {
		driver.navigate().back();
	}

	public void explicitWaitTillElementVisibility(WebElement ele,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time))  ;
				wait.until(ExpectedConditions.visibilityOf(ele) );
	}

}
