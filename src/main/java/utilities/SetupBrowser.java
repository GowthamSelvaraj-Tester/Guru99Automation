package utilities;

import org.openqa.selenium.WebDriver;

public class SetupBrowser 
	{
	
		public static WebDriver driver;
	
		public static Object[][]  launchbrowser(String extension, String driverlocation)
			{	
				System.setProperty(extension, driverlocation);
				return new Object[][] {{extension,driverlocation}};
				
			}
		public static void launch(WebDriver driver)
			{
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://demo.guru99.com/");
			}
		
		public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
			}
	}
