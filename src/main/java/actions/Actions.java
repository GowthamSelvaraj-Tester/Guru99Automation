package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigReader;

public class Actions 
	{
	
		WebDriver driver;
		
		public Actions(WebDriver driver)
			{
				this.driver = driver;
			PageFactory.initElements(driver,this);
			}
		
		public void entertext(WebElement element,String value)
			{
				element.clear();
				element.sendKeys(value);
			}
		
		public void click(WebElement element)
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
			}
		
		public void selectbyvalue(List<WebElement> tileList,String value)
			{
				
				for (WebElement element : tileList) 
					{
						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						wait.until(ExpectedConditions.visibilityOf(element));
						Select select = new Select(element);
						select.selectByVisibleText(value);
					}
			}
		public void scrolldrown(WebDriver driver)
			{
			      JavascriptExecutor js = (JavascriptExecutor)driver;
			      js.executeScript("window.scrollBy(0,500)","");
			}
	}
