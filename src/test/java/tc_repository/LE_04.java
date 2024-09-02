package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import objectLibrary.CreateNewOrgPage;
import objectLibrary.HomePage;
import objectLibrary.OrgHomePage;

public class LE_04 extends BaseClass{
	@Test
	public void org_04() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		   int num=JUTIL.getRandomNumber(1000);
		   ExcelUtil EUTIL=new ExcelUtil();
		   String ORGNAME=EUTIL.readDataFromExcel("Organization", 10, 1);
		   String WEBSITE=EUTIL.readDataFromExcel("Organization", 10, 2);
		   String EMPLOYEES=EUTIL.readDataFromExcel("Organization", 10, 3);
		   String PHONE=EUTIL.readDataFromExcel("Organization", 10, 4);
		   String OTHPHONE=EUTIL.readDataFromExcel("Organization", 10, 5);
		   String EMAIL=EUTIL.readDataFromExcel("Organization", 10, 6);
		   String BILLINGADD=EUTIL.readDataFromExcel("Organization", 10, 7);
		   String BILLINCITY=EUTIL.readDataFromExcel("Organization", 10, 8);
		   String BILLINGSTATE=EUTIL.readDataFromExcel("Organization", 10, 9);
		   Thread.sleep(3000);
		   HomePage hp=new HomePage(driver);
		   hp.clickonOrg();
		 OrgHomePage OP=new OrgHomePage(driver);
		 OP.clickOnOrgBtn();
		 CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		 CNO.createOrganisation(ORGNAME, WEBSITE, EMPLOYEES, PHONE, OTHPHONE, EMAIL, BILLINGADD, BILLINCITY, BILLINGSTATE);
		 Thread.sleep(3000);
         System.out.println("testCase_04 executed succesfully");
	}
}
