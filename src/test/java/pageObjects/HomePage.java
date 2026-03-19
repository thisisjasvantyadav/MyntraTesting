package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Profile']")
	WebElement profileIcon;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
	
	public boolean isProfileIconDisplayed() {
		return (profileIcon.isDisplayed() && searchBox.isDisplayed());
	}

	public boolean isHomePageDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
