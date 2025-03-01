package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageSetup.FacebookLoginPage;
//import utils.BaseTest;
//import utils.TestData;

public class FacebookLoginTest{
	 
	    @Test
	    public void testURLValidation() {
	        String expectedURL = "https://www.facebook.com/";
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL, "URL validation failed");
	    }
	 
	    @Test
	    public void testTitleValidation() {
	        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
	        String expectedTitle = "Facebook – log in or sign up";
	        String actualTitle = loginPage.getPageTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Title validation failed");
	    }
}
