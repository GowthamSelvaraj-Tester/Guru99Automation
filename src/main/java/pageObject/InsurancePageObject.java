package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utility.ConfigReader;


public class InsurancePageObject
	{
	    public WebDriver driver;
	    
		public InsurancePageObject(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver,this);
			}
		
		@FindBy(xpath ="//*[contains(text(),'Register')]")
		public WebElement registerOption;
		
		
	}
