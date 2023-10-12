package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage 
{
	//Declaration
	//address of feedbackinvoice
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement InvoiceBtn;
	
	//initialization
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void InvoiceButton()
	{
		InvoiceBtn.click();
	}
	
}
