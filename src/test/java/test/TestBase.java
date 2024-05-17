package test;

import org.testng.annotations.BeforeSuite;

import base.Base;
import utility.ConfigReader;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class TestBase extends Base
	{
		@BeforeSuite
		public void launchBrowser() throws IOException
			{
				initializedriver(ConfigReader.getProperty("appUrl"));
			}

		@AfterSuite
		public void afterSuite() 
			{
				//closebrowser(driver);
			}

}
