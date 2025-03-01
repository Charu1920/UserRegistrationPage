package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountPageTest {
	
	        @Test
	        public void testURLValidation() {
	        String expectedURL = "https://www.facebook.com/";
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL, "URL validation failed");
	    }

}
