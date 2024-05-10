package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.SetupBrowser;

@SuppressWarnings("unused")
public class TestSetup extends SetupBrowser
	{
		public static WebDriver driver;
		
		static
			{
				try
					{
						String currentdirectory = System.getProperty("user.dir");
						
						String browser = "Firefox";
						
						switch(browser)
							{
								case "Chrome":
									Object launchchromebrowser = launchbrowser("webdriver.chrome.driver",currentdirectory+"//chromedriver//chromedriver.exe");
									driver = new ChromeDriver();
									launch(driver);
									break;
								
								case "Firefox":
									Object launchfirefoxbrowser = launchbrowser("webdriver.firefox.driver", currentdirectory+"//geckodriver//geckodriver.exe");
									driver = new FirefoxDriver();
									launch(driver);
									break;
								
								case "Edge":
									Object launchedgebrowser = launchbrowser("webdriver.edge.driver", currentdirectory+"//edgedriver//msedgedriver.exe");
									driver = new FirefoxDriver();
									launch(driver);
									break;
									
								default:
									Object defaultbrowser = launchbrowser("webdriver.chrome.driver",currentdirectory+"//chromedriver//chromedriver.exe");
									driver = new ChromeDriver();
									launch(driver);
									break;
							}
					}
				catch (Exception e)
					{
					
					}
			}
	
	
		public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
			}
	}
