package script;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import module.RegistrationPageModule;
import utility.ConfigReader;
import utility.ExcelUtility;
import utility.ResourceUtility;

public class RegistrationScript 
	{
		@SuppressWarnings("unused")
		private WebDriver driver;
		private RegistrationPageModule module;
		private String excelSheetPath = ResourceUtility.getFolderPath();
		
		public RegistrationScript(WebDriver driver)
			{
				this.driver = driver;
				module = new RegistrationPageModule(driver);
			}
		
		public void RegistrationTest(String testCaseName)
			{
				try 	
					{
						Map<String,String> testMapData = new ExcelUtility().getdata(testCaseName,excelSheetPath,ConfigReader.getProperty("testSheetName"));
						module.Register(testMapData);
					}
				catch(Exception e)
					{
						e.printStackTrace();
					}
			}
		
	}
