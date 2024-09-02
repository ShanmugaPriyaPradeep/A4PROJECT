package genericutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectLibrary.HomePage;
import objectLibrary.LoginPage;

public class BaseClass {
	 public  static WebDriver driver=null;
	    SeleniumUtility sutil=null;
	    PropertiesUtil putil=new PropertiesUtil();
	  @BeforeSuite(alwaysRun=true)
	    public void createConnection()
	    {
	    	System.out.println("connection succesfully !!!!!!");
	    }
	  @BeforeClass(alwaysRun=true)
	    public void launchBrowser() throws Exception
	    {
	    	String Url=putil.getDataForGeneric("url");
	    	sutil=new SeleniumUtility();
	    	driver=new ChromeDriver();
	    	sutil.implicitWait(driver,10);
	    	sutil.maximizeWindow(driver);
	    	driver.get(Url);
	    	System.out.println("launching successfully!!!!!!");
	    }
	  @BeforeMethod(alwaysRun=true)
	    public void loginApp() throws Exception
	    {
	    	String USERNAME=putil.getDataForGeneric("username");
	    	String PASSWORD=putil.getDataForGeneric("password");
	    	LoginPage lp=new LoginPage(driver);
	    	lp.loginOperation(USERNAME, PASSWORD);
	    	System.out.println("login successfully!!!!!!");
	    	Thread.sleep(4000);
	    }
	  @AfterMethod(alwaysRun=true)
	    public void logoutApp() throws Exception
	    {
	    	HomePage hp=new HomePage(driver);
	    	hp.logOutOperation(driver);
	    	System.out.println("logout successfully!!!!!");
	    }
	  @AfterClass(alwaysRun=true)
	    public void closeApp()
	    {
	    	System.out.println("app closed successfully!!!!"); 
			}
	    @AfterSuite(alwaysRun=true)
	    public void closeConnection()
	    {
	    	System.out.println("connection closed successfully!!!!!");
	    }

}
