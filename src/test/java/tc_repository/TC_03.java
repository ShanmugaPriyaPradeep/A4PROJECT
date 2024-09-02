package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import objectLibrary.CreateNewLeadPage;
import objectLibrary.HomePage;
import objectLibrary.LeadsHomePage;

public class TC_03 extends BaseClass {
@Test(groups= {"sanity"})
	public void tc_03() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		   int num=JUTIL.getRandomNumber(1000);
		   ExcelUtil EUTIL=new ExcelUtil();
		   String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 7, 1);
		   String LASTNAME=EUTIL.readDataFromExcel("Leads", 7, 2);
		   String COMPANY=EUTIL.readDataFromExcel("Leads", 7, 3);
		   String TITLE=EUTIL.readDataFromExcel("Leads", 7, 4);
		   String PHONE=EUTIL.readDataFromExcel("Leads", 7, 5);
		   String MOBILE=EUTIL.readDataFromExcel("Leads", 7, 6);
		   String EMAIL=EUTIL.readDataFromExcel("Leads", 7, 7);
		   String NOE=EUTIL.readDataFromExcel("Leads", 7, 8);
		  
		   HomePage hp=new HomePage(driver);
		   hp.clickonLeads();
		   LeadsHomePage lp=new LeadsHomePage(driver);
		   lp.clickOnNewLeadBtn();
		   CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
          CNL.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE);
          Thread.sleep(30000);
   	   System.out.println("tc_03 executed successfully");

	}
}
