package module;

import org.openqa.selenium.WebDriver;

import actions.Actions;
import io.qameta.allure.Step;
import pageObject.LaunchPageObject;

public class LaunchPageModule 
	{
		WebDriver driver;
		
		private LaunchPageObject elements;
		private Actions reuse;
		
		public LaunchPageModule(WebDriver driver)
			{
				this.driver=driver;
				this.reuse = new Actions(driver);
				this.elements = new LaunchPageObject(driver);
			}
		
		@Step("Launch Browser")
		public void navigatetoInsurance()
			{
				reuse.click(elements.insuranceOption);
			}
	}
