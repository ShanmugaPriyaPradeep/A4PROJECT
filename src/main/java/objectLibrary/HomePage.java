package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutil.SeleniumUtility;

public class HomePage {
    @FindBy(xpath="(//a[text()='Leads'])[1]")
	private  WebElement leads;
   
    @FindBy(xpath="(//a[text()='Organizations'])[1]")
     private WebElement org;
  
    @FindBy(xpath="(//td[@class='small'])[2]")
     private WebElement prefrences;
    
    @FindBy(xpath="//a[text='Sign Out']")
    private WebElement signoutOption; 
     
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPrefrences() {
		return prefrences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
    public void clickonLeads()
    {
    	leads.click();
    }
    public void clickonOrg()
    {
    	org.click();
    }
    public void logOutOperation(WebDriver driver) throws Exception
    {
    	SeleniumUtility sutil=new SeleniumUtility();
    	sutil.moveCursorToAnElement(driver,prefrences);
    	Thread.sleep(3000);
    	sutil.moveCursorToAnElement(driver,signoutOption);
    	//Thread.sleep(3000);
    	//sutil.clickOperation(driver,signoutOption);
    }
}
