package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import utility.ConfigReader;
import utility.GlobalVariable;

public class Base 
	{
			public WebDriver driver;
			
			public WebDriver initializedriver(String appUrl) throws IOException
				{
					String browser = ConfigReader.getProperty("browser");
					
					System.out.println(browser);
					
					if(browser.matches("Chrome")) 
					{
			    		System.getProperty(ConfigReader.getProperty("ChromeDriver"),GlobalVariable.basepath+ConfigReader.getProperty("ChromeDriverLocation"));
			    		ChromeOptions option = new ChromeOptions();
			    		option.addArguments("--disable-infobars");
			    		option.addArguments("--incognito");
			    		driver = new ChromeDriver(option);
			    		driver.manage().window().maximize();
			    		driver.manage().deleteAllCookies();
			    		driver.get(appUrl);
					}
				else if(browser.matches("Firefox"))
					{
						System.getProperty(ConfigReader.getProperty("FirefoxDriver"),GlobalVariable.basepath+ConfigReader.getProperty("FirefoxDriverLocation"));
						FirefoxOptions option = new FirefoxOptions();
						option.addArguments("--disable-infobars");
						option.addArguments("--incognito");
						driver = new FirefoxDriver(option);
						driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
						driver.get(appUrl);
					}
				else if(browser.matches("Edge"))
					{
						System.getProperty(ConfigReader.getProperty("EdgeDriver"),GlobalVariable.basepath+ConfigReader.getProperty("EdgeDriverLocation"));
						EdgeOptions option = new EdgeOptions();
						option.addArguments("--disable-infobars");
						option.addArguments("--incognito");
						driver = new EdgeDriver(option);
						driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
						driver.get(appUrl);
					}
				else
					{
						System.getProperty(ConfigReader.getProperty("Chromedriver"),GlobalVariable.basepath+ConfigReader.getProperty("ChromeDriverLocation"));
						ChromeOptions option = new ChromeOptions();
						option.addArguments("--disable-infobars");
						option.addArguments("--incognito");
						driver = new ChromeDriver(option);
						driver.manage().window().maximize();
						driver.manage().deleteAllCookies();
						driver.get(appUrl);
					}
	
					return driver;
				}
			
			public void closebrowser(WebDriver driver)
				{
					driver.quit();
				}	
	}	
