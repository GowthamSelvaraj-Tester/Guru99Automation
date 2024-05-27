package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LaunchPageObject 
	{
		public WebDriver driver;
		
		public LaunchPageObject(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver,this);
			}
		@FindBy(xpath="//*[@id='navbar-brand-centered']/ul/li[3]/a")
		public WebElement insuranceOption;
		
	}
