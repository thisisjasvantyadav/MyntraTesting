package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//img[@title='nostrum Men Polo Collar Dri-FIT Slim Fit T-shirt']")
	WebElement product;
	
	@FindBy(xpath="//div[3]//div[1]//button[1]//p[1]")
	WebElement sizeChart;
	
	@FindBy(xpath="//div[3]//div[1]//button[1]//p[1]")
	WebElement btnAddToBag;
	
	@FindBy(xpath="//span[contains(@class,'desktop-badge')]")
	WebElement bagBadge;
	
	public void clickProduct() {
		product.click();
	}
	
	public void clickAddToBag() {
		scrollToElement(sizeChart);
		scrollToElement(btnAddToBag);
		btnAddToBag.click();
	}
	
	public boolean isAdded() {
		return bagBadge.isDisplayed();
	}
}
