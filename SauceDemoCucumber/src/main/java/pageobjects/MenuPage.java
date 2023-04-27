package pageobjects;

import org.openqa.selenium.By;

import base.SetupDriver;

public class MenuPage extends SetupDriver {
	
	public By menu_btn = (By.id("react-burger-menu-btn"));
	public By sidebar = (By.xpath("//div[@class=\"bm-menu-wrap\"]//self::div"));
	public By sidebarallitemslink = (By.xpath("//nav[@class=\"bm-item-list\"]//child::a"));
	public By sidebaraboutlink = (By.xpath("//nav[@class=\"bm-item-list\"]//child::a[2]"));
	public By sidebarlogout = (By.xpath("//nav[@class=\"bm-item-list\"]//child::a[3]"));
	public By sidebarresetappstatelink = (By.xpath("//nav[@class=\"bm-item-list\"]//child::a[4]"));
	
	
	public void navigate() {
		SignInPage signinpage = new SignInPage();
		driver.navigate().to("https://www.saucedemo.com/");

		signinpage.typeUserName("standard_user");
		signinpage.typePassword("secret_sauce");
		signinpage.clickLogin();
		
	}

}
