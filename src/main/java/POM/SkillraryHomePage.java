package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage 
{
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrary app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address for search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;
	
	//address of cookie icon
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initiliazation
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void skillrarydemoapplink(WebDriver driver)
	{
		skillrarydemoapp.click();
	}
	public void searchTextfield(String data)
	{
		searchTf.sendKeys(data);
	}
	public void searchicon()
	{
		searchicon.click();
	}
	public void cookiesicon()
	{
		cookies.click();
	}
	
	
	
	
	
	
	
	
	
}
