package Selenium_Automation_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserRegistration {

    static WebDriver driver;
	
    @BeforeClass
    public static void SetUp() {
        // Initialize the driver without redeclaring it (use the class-level driver)
        driver = new ChromeDriver();  // Correct usage
        driver.manage().window().maximize();
    }

	
    @Test
	public static void CreateAccountTest(){
		
	      
		  driver.get("https://www.adaptiveu.io/");
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		  
		  driver.findElement(By.xpath("/html/body/header/ul/li[6]/a")).click();
		    
		  
//		  driver.findElement(By.xpath("/html/body/section/article/div[2]/div[1]/span[1]/a")).click();
//	      System.out.println("Current URL: " + driver.getCurrentUrl());
		  
	         
//	      WebElement firstlastNameField = driver.findElement(By.xpath("//input[@tabindex=1]"));
//	      firstlastNameField.sendKeys("jaya Gupta");
//	      
//	      Thread.sleep(2000);   
//	      WebElement CompanyName =driver.findElement(By.xpath("//input[@tabindex=2]"));
//	      CompanyName.sendKeys("Amantya Technologies");
//	      
//	      Thread.sleep(2000);   
//	      WebElement Email = driver.findElement(By.xpath("//input[@tabindex=4]"));
//	      Email.sendKeys("jayagupta823@gmail.com");
//	      
//	      WebElement password = driver.findElement(By.xpath("//input[@tabindex=5]"));
//	      password.sendKeys("Charu@123");
//	      
//	      Thread.sleep(2000);
//	      WebElement button = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/main/article/section[3]/div[2]/button"));
//	      button.click();
//	      
//	      Thread.sleep(2000);
//	      WebElement signUp = driver.findElement(By.xpath("//button[@id=\"submit-btn\"]"));
//	      signUp.click();
	      
	      //-------------------Login Page ---------------------------------------//
	      
	      WebElement LoginEmail = driver.findElement(By.xpath("//input[@id='email']"));
	      LoginEmail.sendKeys("jayagupta823@gmail.com");
	      WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
	      
	      WebElement Loginpassword = driver.findElement(By.xpath("//input[@id='password']"));
	      Loginpassword.sendKeys("Charu@123");
	      WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
	      
	      WebElement Login = driver.findElement(By.xpath("//button[@id='login_submit']"));
	      Login.click(); 
	 
	      System.out.println("loginCurrent URL: " + driver.getCurrentUrl());
	        // Wait for the page to load (url or a specific element present after login)
	      wait.until(ExpectedConditions.urlContains("courses?status=all"));  // Update this with an actual URL part after login
	      System.out.println("Page URL after login: " + driver.getCurrentUrl());
	        
	
//	      WebElement University =driver.findElement(By.xpath("//input[@id='univ_input']"));
//	      University.sendKeys("FET Agra College,Agra");
//	      
//	      WebElement Finishbtn = driver.findElement(By.xpath(" //button[@id='univ_submit']"));
//	      Finishbtn.click();
	      
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='empty-states']/button")));
	      
	      WebElement CreateCourse = driver.findElement(By.xpath(" //div[@class='empty-states']/button"));
	      CreateCourse.click();
	      WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
    	
    	  //driver.get("https://amantyatechnolo.adaptiveu.io/amantya-technologiesfet-agra-collegeagra/courses?status=al");
	   
    	  WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
	      
	      WebElement CourseName = driver.findElement(By.xpath(" //div[@class='field-input']/input"));
	      CourseName.sendKeys("TestN");
	      WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
	      WebElement CreateCourseClick = driver.findElement(By.xpath("//button[@tabindex='2']"));
	      CreateCourseClick.click();
	      WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(5));
	      WebElement CreateCourseclose = driver.findElement(By.xpath(" //span[@class='popup-close']"));
	      CreateCourseclose.click();
	      
	   
	      
    }

}
