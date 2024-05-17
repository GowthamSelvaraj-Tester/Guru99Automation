package module;

import org.openqa.selenium.WebDriver;

import actions.Actions;
import io.qameta.allure.Step;
import pageObject.InsurancePageObject;

public class InsurancePageModule 
	{
		WebDriver driver;
		
		private InsurancePageObject elements;
		private Actions reuse;
		
		public InsurancePageModule(WebDriver driver)
			{
				this.driver = driver;
				this.reuse = new Actions(driver);
				this.elements = new InsurancePageObject(driver);
			}
		
		@Step("Navigate to RegistrationScreen")
		public void navigatetoRegisterScreen()
			{
				reuse.click(elements.registerOption);
			}
	}
