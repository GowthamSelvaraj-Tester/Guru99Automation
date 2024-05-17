package script;

import org.openqa.selenium.WebDriver;

import module.InsurancePageModule;
import module.LaunchPageModule;

public class NavigationScript 
	{
		@SuppressWarnings("unused")
		private WebDriver driver;
		
		private LaunchPageModule launchmodule;
		private InsurancePageModule insurancemodule;
		
		public NavigationScript(WebDriver driver)
			{
				this.driver = driver;
				launchmodule = new LaunchPageModule(driver);
				insurancemodule = new InsurancePageModule(driver);
			}
		
		public void navigation()
			{
				launchmodule.navigatetoInsurance();
				insurancemodule.navigatetoRegisterScreen();
			}
	}
