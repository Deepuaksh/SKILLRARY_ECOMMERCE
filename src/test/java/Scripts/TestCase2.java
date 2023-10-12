package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryAppPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink(driver);
		utilities.childBrowser(driver);
		DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
		dS.feedBackBtn();
		DownloadInvoicePage iP=new DownloadInvoicePage(driver);
		iP.InvoiceButton();
		
	}
		
}
