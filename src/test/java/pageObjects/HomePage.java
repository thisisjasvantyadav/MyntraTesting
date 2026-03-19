package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Profile']")
	WebElement profileIcon;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
<<<<<<< HEAD
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchIcon;
	
	@FindBy(xpath="//div[@class='sort-sortBy']")
	WebElement sortBy;
	

	public boolean isHomePageDisplayed() {
		return (profileIcon.isDisplayed() && searchBox.isDisplayed());
	}
	
	public void searchItem(String itemName) {
		searchBox.sendKeys(itemName);
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public boolean isProductsPageVisible() {
		return sortBy.isDisplayed();
=======


	public boolean isHomePageDisplayed() {
		return (profileIcon.isDisplayed() && searchBox.isDisplayed());
>>>>>>> e914b0fc70eabf57ee85d6863d4cb35c1078af92
	}
}
