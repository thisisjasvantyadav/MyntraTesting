package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomePageTest extends BaseClass {
	
	@Test
	public void checkHomePageVisibility() {
		HomePage homepage = new HomePage(driver);
		boolean isHomePageDisplayed = homepage.isProfileIconDisplayed();
		Assert.assertTrue(isHomePageDisplayed);
	}
	
}
