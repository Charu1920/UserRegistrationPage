package Selenium_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
		
		WebElement customerID = driver.findElement(By.name("fldLoginUserId"));
		customerID.sendKeys("23132423");
		
		driver.findElement(By.linkText("CONTINUE")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.quit();
	}

}
