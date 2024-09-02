package tc_repository;

import org.testng.annotations.Test;

import genericutil.BaseClass;
import genericutil.ExcelUtil;
import genericutil.JavaUtility;
import objectLibrary.CreateNewOrgPage;
import objectLibrary.HomePage;
import objectLibrary.OrgHomePage;

public class LE_01 extends BaseClass{
@Test
	public void org_01() throws Exception
	{
		 JavaUtility JUTIL=new JavaUtility();
		   int num=JUTIL.getRandomNumber(1000);
		   ExcelUtil EUTIL=new ExcelUtil();
		   String ORGNAME=EUTIL.readDataFromExcel("Organization", 1, 1);
		   String WEBSITE=EUTIL.readDataFromExcel("Organization", 1, 2);
		   String EMPLOYEES=EUTIL.readDataFromExcel("Organization", 1, 3);
		   Thread.sleep(3000);
		   HomePage hp=new HomePage(driver);
		   hp.clickonOrg();
		 OrgHomePage OP=new OrgHomePage(driver);
		 OP.clickOnOrgBtn();
		 CreateNewOrgPage CNO=new CreateNewOrgPage(driver);
		 CNO.createOrganisation(ORGNAME, WEBSITE, EMPLOYEES);
         Thread.sleep(3000);
         System.out.println("testCase_03 executed succesfully");
}

}
