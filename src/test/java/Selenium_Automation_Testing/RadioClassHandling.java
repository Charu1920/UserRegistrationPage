package Selenium_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioClassHandling {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://demoqa.com/radio-button");
        
   Thread.sleep(2000);   
   driver.findElement(By.xpath("//input[@id ='yesRadio']")).click();
   Thread.sleep(2000);   
   driver.findElement(By.xpath("//input[@id='impressiveRadio'])")).click();
   Thread.sleep(2000);   
   driver.findElement(By.xpath("//input[@id='//input[@id='noRadio'])")).click();
	}

}
