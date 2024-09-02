package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import objectLibrary.CreateNewOrgPage;
import objectLibrary.HomePage;
import objectLibrary.OrgHomePage;

public class LE_03 extends BaseClass{
	@Test
	public void org_03() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		   int num=JUTIL.getRandomNumber(1000);
		   ExcelUtil EUTIL=new ExcelUtil();
		   String ORGNAME=EUTIL.readDataFromExcel("Organization", 7, 1);
		   String WEBSITE=EUTIL.readDataFromExcel("Organization", 7, 2);
		   String BILLINGADD=EUTIL.readDataFromExcel("Organization", 7, 3);
		   String BILLINCITY=EUTIL.readDataFromExcel("Organization", 7, 4);
		   String BILLINGSTATE=EUTIL.readDataFromExcel("Organization", 7, 5);
		   Thread.sleep(3000);
		   HomePage hp=new HomePage(driver);
		   hp.clickonOrg();
		 OrgHomePage OP=new OrgHomePage(driver);
		 OP.clickOnOrgBtn();
		 CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		 CNO.createOrganisation(ORGNAME, WEBSITE, BILLINGADD, BILLINCITY, BILLINGSTATE);
		  Thread.sleep(3000);
	         System.out.println("testCase_03 executed succesfully");
	}

}

