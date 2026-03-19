package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomePageTest extends BaseClass {
	
	@Test
	public void checkHomePageVisibility() {
		HomePage homepage = new HomePage(driver);
		boolean isHomePageDisplayed = homepage.isHomePageDisplayed();
		Assert.assertTrue(isHomePageDisplayed);
	}
	
	@Test
	public void verify_search_product() {
		HomePage homepage = new HomePage(driver);
		homepage.searchItem("tshirt");
		homepage.clickSearchIcon();
		
		Assert.assertTrue(homepage.isProductsPageVisible());
	}
	
}
