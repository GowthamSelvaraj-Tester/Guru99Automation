package test;

import org.testng.annotations.Test;

import io.qameta.allure.Story;
import script.NavigationScript;
import script.RegistrationScript;

public class TestRunners extends TestBase 
	{
		
		@Story("Launch Browser")
		@Story("Navigate to RegistrationScreen")
		@Story("Register Account")
		@Test
		public void TC001_RegisterUser() 
			{
				String testCaseName = new Object(){}.getClass().getEnclosingMethod().getName();
				NavigationScript navscript = new NavigationScript(driver);
				navscript.navigation();
				RegistrationScript registerscript = new RegistrationScript(driver);
				registerscript.RegistrationTest(testCaseName);
			}
}
