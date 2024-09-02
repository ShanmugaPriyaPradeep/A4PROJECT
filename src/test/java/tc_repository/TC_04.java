package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import genericutil.PropertiesUtil;
import objectLibrary.CreateNewLeadPage;
import objectLibrary.HomePage;
import objectLibrary.LeadsHomePage;

public class TC_04 extends BaseClass {
	@Test(groups= {"smoke","regression"})
public void tc_02() throws Exception
{  
	JavaUtility JUTIL=new JavaUtility();
	   int num=JUTIL.getRandomNumber(1000);
	   ExcelUtil EUTIL=new ExcelUtil();
	   String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 10, 1);
	   String LASTNAME=EUTIL.readDataFromExcel("Leads", 10, 2);
	   String COMPANY=EUTIL.readDataFromExcel("Leads", 10, 3);
	   String STRT=EUTIL.readDataFromExcel("Leads", 10, 4);
	   String PBOX=EUTIL.readDataFromExcel("Leads", 10, 5);
	   String PCODE=EUTIL.readDataFromExcel("Leads", 10, 6);
	   String CITY=EUTIL.readDataFromExcel("Leads", 10, 7);
	   String CTRY=EUTIL.readDataFromExcel("Leads", 10, 8);
	   String STAT=EUTIL.readDataFromExcel("Leads", 10, 9);
	   HomePage hp=new HomePage(driver);
	   hp.clickonLeads();
	   LeadsHomePage lp=new LeadsHomePage(driver);
	   lp.clickOnNewLeadBtn();
	   CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
	   CNL.createLead(FIRSTNAME+num, LASTNAME, COMPANY, STRT, PBOX, PCODE, CITY, CTRY, STAT);
	   Thread.sleep(3000);
	   System.out.println("tc_04 executed successfully");

}
}
