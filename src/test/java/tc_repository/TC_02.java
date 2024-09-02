package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import objectLibrary.CreateNewLeadPage;
import objectLibrary.HomePage;
import objectLibrary.LeadsHomePage;

public class TC_02 extends BaseClass {
	@Test(groups= {"smoke"})
public void tc_02() throws Exception
{
	JavaUtility JUTIL=new JavaUtility();
	   int num=JUTIL.getRandomNumber(1000);
	   ExcelUtil EUTIL=new ExcelUtil();
	   String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 4, 1);
	   String LASTNAME=EUTIL.readDataFromExcel("Leads", 4, 2);
	   String COMPANY=EUTIL.readDataFromExcel("Leads", 4, 3);
	   String TITLE=EUTIL.readDataFromExcel("Leads", 4, 4);
	   String PHONE=EUTIL.readDataFromExcel("Leads", 4, 5);
	   String MOBILE=EUTIL.readDataFromExcel("Leads", 4, 6);
	   String EMAIL=EUTIL.readDataFromExcel("Leads", 4, 7);
	   String NOE=EUTIL.readDataFromExcel("Leads", 4, 8);
	   String STRT=EUTIL.readDataFromExcel("Leads", 4, 9);
	   String PBOX=EUTIL.readDataFromExcel("Leads", 4, 10);
	   String PCODE=EUTIL.readDataFromExcel("Leads", 4, 11);
	   String CITY=EUTIL.readDataFromExcel("Leads", 4, 12);
	   String CTRY=EUTIL.readDataFromExcel("Leads", 4, 13);
	   String STAT=EUTIL.readDataFromExcel("Leads", 4, 14);
	   HomePage hp=new HomePage(driver);
	   hp.clickonLeads();
	   LeadsHomePage lp=new LeadsHomePage(driver);
	   lp.clickOnNewLeadBtn();
	   CreateNewLeadPage CNL=new CreateNewLeadPage(driver);
	   CNL.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE, STRT, PBOX, PCODE, CITY, CTRY, STAT);
	   Thread.sleep(3000);
	   System.out.println("tc_02 executed successfully");

}

}
