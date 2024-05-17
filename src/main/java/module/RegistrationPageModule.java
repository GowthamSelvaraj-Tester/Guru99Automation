package module;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import actions.Actions;
import io.qameta.allure.Step;
import pageObject.RegistrationPageObject;
import utility.ConfigReader;

public class RegistrationPageModule 
	{
		WebDriver driver;
		
	     private RegistrationPageObject elements;
	     private Actions reuse;
	     
		public RegistrationPageModule(WebDriver driver) 
			{
				this.driver = driver;
				this.reuse = new Actions(driver);
				this.elements = new RegistrationPageObject(driver);
			}
		
		@Step("Register Account")
		public void Register(Map<String, String>testMapData)
			{
				//reuse.selectbyvalue(elements.tileList,testMapData.get(ConfigReader.getProperty("title")));
				reuse.entertext(elements.firstName,testMapData.get(ConfigReader.getProperty("firstName")));
				reuse.entertext(elements.surName,testMapData.get(ConfigReader.getProperty("surName")));
				reuse.entertext(elements.phoneNumber,testMapData.get(ConfigReader.getProperty("phoneNum")));
				reuse.selectbyvalue(elements.year,testMapData.get(ConfigReader.getProperty("year")));
				reuse.selectbyvalue(elements.month,testMapData.get(ConfigReader.getProperty("month")));
				reuse.selectbyvalue(elements.date,testMapData.get(ConfigReader.getProperty("date")));
				reuse.selectbyvalue(elements.licensePeriod,testMapData.get(ConfigReader.getProperty("provision")));
				reuse.selectbyvalue(elements.licensePeriodYears,testMapData.get(ConfigReader.getProperty("licensePeriod")));
				reuse.selectbyvalue(elements.occupation,testMapData.get(ConfigReader.getProperty("occupation")));
				reuse.entertext(elements.address,testMapData.get(ConfigReader.getProperty("street")));
				reuse.entertext(elements.city,testMapData.get(ConfigReader.getProperty("city")));
				reuse.entertext(elements.country,testMapData.get(ConfigReader.getProperty("country")));
				reuse.entertext(elements.postcode,testMapData.get(ConfigReader.getProperty("postcode")));
				reuse.entertext(elements.email,testMapData.get(ConfigReader.getProperty("email")));
				reuse.entertext(elements.password,testMapData.get(ConfigReader.getProperty("password")));
				reuse.entertext(elements.confirmPassword,testMapData.get(ConfigReader.getProperty("confirmpassword")));	
			}
	}
