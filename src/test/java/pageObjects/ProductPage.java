package pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//li[contains(@class,'product-base')])[1]")
	WebElement product;
	
	@FindBy(xpath="//span[contains(@class,'desktop-badge')]")
	WebElement bagBadge;
	
	

	public void clickProduct() {
		product.click();
	}
	
	public void switchToNewWindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
	}
	
	
	public void clickAddToBag() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement size = wait.until(
			ExpectedConditions.elementToBeClickable(
				By.xpath("(//button[contains(@class,'size-buttons-size-button')])[1]")
			)
		);
		size.click();
		
		WebElement addBtn = wait.until(
			ExpectedConditions.elementToBeClickable(
				By.xpath("//div[contains(text(),'ADD TO BAG')]")
			)
		);
		addBtn.click();
	}
	
	
	public boolean isAdded() {
		return bagBadge.isDisplayed();
	}
}
