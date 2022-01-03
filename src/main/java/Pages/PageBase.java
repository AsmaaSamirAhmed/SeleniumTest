package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
//	protected WebDriverWait driverwait;
	//create constructor
	public PageBase(WebDriver driver)
	{
	PageFactory.initElements(driver, this);		
	}
	protected static void clickButton(WebElement button)
	{
		button.click();
	}
	protected static void sendText(WebElement TextElement,String value)
	{
		TextElement.sendKeys(value);
	}
}
