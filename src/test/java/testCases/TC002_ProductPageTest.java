package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC002_ProductPageTest extends BaseClass {
	
	@Test
	public void add_product_to_cart() {
		ProductPage productpage = new ProductPage(driver);
		
		productpage.clickProduct();
		productpage.clickAddToBag();
		
		Assert.assertTrue(productpage.isAdded());
	}
}
