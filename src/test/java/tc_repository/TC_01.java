package tc_repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import genericutil.SeleniumUtility;
import objectLibrary.CreateNewLeadPage;
import objectLibrary.HomePage;
import objectLibrary.LeadsHomePage;
@Listeners(genericutil.ListenersImplementaionClass.class)
public class TC_01 extends BaseClass {
	@Test(retryAnalyzer =  genericutil.RetryAnalyzerImplementationClass.class)//(groups= {"regression"})
   public  void le_01() throws Exception
   {
	   JavaUtility JUTIL=new JavaUtility();
	   int num=JUTIL.getRandomNumber(1000);
	   ExcelUtil EUTIL=new ExcelUtil();
	   String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 1, 1);
	   String LASTNAME=EUTIL.readDataFromExcel("Leads", 1, 2);
	   String COMPANY=EUTIL.readDataFromExcel("Leads", 1, 3);
	   
	   Thread.sleep(3000);
	   HomePage hp=new HomePage(driver);
	   hp.clickonLeads();
	   LeadsHomePage lp=new LeadsHomePage(driver);
	   lp.clickOnNewLeadBtn();
	   CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
	   CNL.createLead(FIRSTNAME+num, LASTNAME, COMPANY);
	   Thread.sleep(3000);
	   System.out.println("tc_01 executed successfully");

   }
}

