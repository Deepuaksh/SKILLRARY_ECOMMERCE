package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryAppPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink(driver);
		utilities.childBrowser(driver);
		DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
		utilities.dropDowns(dS.getSelectDd(),pdata.getpropertyData("coursedd"));
		TestingPage tP=new TestingPage(driver);
		utilities.scrollBar(driver,tP.getFbIcon());
		tP.fbIconWebElement();
	}
	
	
	
}

