package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage 
{
	//Declaration
	//address of course web element
	@FindBy(id="course")
	private WebElement Coursebtn;

	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackBtn;
	
	//address of select category drop down
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//initilization
	public DemoSkillraryAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement  getCoursebtn() 
	{
		return Coursebtn;
	}

	public void feedBackBtn() 
	{
		feedBackBtn.click();
	
	}

	public WebElement  getSelectDd() 
	{
		return selectDd;
	}

	

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

