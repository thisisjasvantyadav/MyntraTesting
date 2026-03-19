package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Profile']")
	WebElement profileIcon;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchBox;
	
	@FindBy(xpath="//span[contains(text(),'Sort by')]")
	WebElement sortBy;
	

	public boolean isHomePageDisplayed() {
		return (profileIcon.isDisplayed() && searchBox.isDisplayed());
	}
	
	public void searchItem(String itemName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.elementToBeClickable(searchBox));
	    searchBox.click();
	    searchBox.clear();
	    searchBox.sendKeys(itemName);
	    wait.until(ExpectedConditions.visibilityOf(searchBox));

	    searchBox.sendKeys(Keys.ENTER);
	}
	
	public boolean isProductsPageVisible() {
		return driver.getCurrentUrl().toLowerCase().contains("tshirt");
	}
	
	

}
