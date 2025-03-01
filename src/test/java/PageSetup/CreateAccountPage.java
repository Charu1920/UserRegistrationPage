package PageSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	 WebDriver driver;
	 
	    @FindBy(xpath = "//input[@tabindex=1]")
	    WebElement firstlastNameField;
	    
	    @FindBy(xpath ="//input[@tabindex=2]")
	    WebElement CompanyName;
	    
	    
	    @FindBy(xpath = "//input[@tabindex=4]")
	    WebElement Email;
	 
	    @FindBy(xpath ="//input[@tabindex=5]")
	    WebElement password;
	    
	    @FindBy(xpath ="//*[@id=\"wrapper\"]/div/main/article/section[3]/div[2]/but")
	    WebElement button;
	    
	    @FindBy(xpath ="//button[@id=\"submit-btn\"]")
	    WebElement signUp;
	 
	    
	    public CreateAccountPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterName(String name) {
	    	firstlastNameField.clear();
	        firstlastNameField.sendKeys(name);
	    }
	 
	    public void enterCompanyName(String companyName) {
	    	CompanyName.clear();
	    	CompanyName.sendKeys(companyName);
	    }
	    
	    public void enterEmail(String email) {
	    	Email.clear();
	    	Email.sendKeys(email);
	    }
	    
	    public void enterPassword(String pass) {
	    	password.clear();
	    	password.sendKeys(pass);
	    }
	    public void checkbtn() {
	    	button.click();
	    }
	    
	    public void signUpbtn() {
	    	signUp.click();
	    }
	 
	    
}
