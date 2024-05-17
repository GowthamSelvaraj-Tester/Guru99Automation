package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utility.ConfigReader;

public class RegistrationPageObject 
	{
	    public WebDriver driver;
		
	    public RegistrationPageObject(WebDriver driver)
			{
	    		this.driver = driver;
	    		PageFactory.initElements(driver,this);
			}
		
		@FindBy(name="title")
		public List<WebElement> tileList;
		
		@FindBy(id="user_firstname")
		public WebElement firstName;
		
		@FindBy(id="user_surname")
		public WebElement surName;
		
		@FindBy(id="user_phone")
		public WebElement phoneNumber;
		
		@FindBy(name="year")
		public List<WebElement> year;
		
		@FindBy(name="month")
		public List<WebElement> month;
		
		@FindBy(name="date")
		public List<WebElement> date;
		
		@FindBy(xpath ="//*[@type='radio']")
		public List<WebElement> licensePeriod;
		
		@FindBy(id="user_licenceperiod")
		public List<WebElement> licensePeriodYears;
		
		@FindBy(id="user_occupation_id")
		public List<WebElement> occupation;
		
		@FindBy(id="user_address_attributes_street")
		public WebElement address;
		
		@FindBy(id="user_address_attributes_city")
		public WebElement city;
		
		@FindBy(id="user_address_attributes_county")
		public WebElement country;
		
		@FindBy(id="user_address_attributes_postcode")
		public WebElement postcode;
		
		@FindBy(name="email")
		public WebElement email;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(name="c_password")
		public WebElement confirmPassword;
		
		@FindBy(xpath="//*[@name='submit' and @value='Create']")
		public WebElement createButton;
		
		@FindBy(xpath="//*[@type='reset' and @value='Reset']")
		public WebElement resetButton;
	}
