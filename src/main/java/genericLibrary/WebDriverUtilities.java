package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//1.handling dropdown
	public void dropDowns(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2.Right click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//3.double click
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//4.Mouse over
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//5.Drag and Drop
	public void dragAndDropping(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	//6.Alter pop up
	public void alterPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//7.handlicng childBrowser
	public void childBrowser(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//8.Scrolling using get locations
	public void scrollBar(WebDriver driver ,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	//9.Scrolling with webelelment
	public void scrollBar(WebDriver driver, WebElement ele) 
	{ 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", ele); 
	}
	
	//10.for click using JavaScript execution
	public void clicking(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
}
