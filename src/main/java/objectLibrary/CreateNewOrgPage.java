package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	@FindBy(xpath="//input[@name='accountname']")
         private WebElement orgName;
    @FindBy(xpath="//input[@name='website']")     
         private WebElement webSite;
    @FindBy(xpath="//input[@id='employees']")     
         private WebElement employees;
    @FindBy(xpath="//input[@id='phone']")         
         private WebElement phn ;
    @FindBy(xpath="//input[@id='otherphone']")         
         private WebElement otherPhn;
    @FindBy(xpath="//input[@id='email1']")      
         private WebElement email;       
    @FindBy(xpath="//textarea[@name='bill_street']") 
         private WebElement billingAddress;
    @FindBy(xpath="//input[@name='bill_city']")     
         private WebElement billingCity;
    @FindBy(xpath="//input[@name='bill_state']")     
         private WebElement billingState;
    @FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")     
        private WebElement saveBtn;
	public CreateNewOrgPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public WebElement getOrgName() {
		return orgName;
	}
	public WebElement getWebSite() {
		return webSite;
	}
	public WebElement getEmployees() {
		return employees;
	}
	public WebElement getPhn() {
		return phn;
	}
	public WebElement getOtherPhn() {
		return otherPhn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getBillingCity() {
		return billingCity;
	}
	public WebElement getBillingState() {
		return billingState;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	
	/*
	 * this is busines library to create an org
	 * for TC-01
	 */
	
     public void createOrganisation(String organaisationName,String web,String emp) {
    	 orgName.sendKeys(organaisationName);
    	 webSite.sendKeys(web);
    	 employees.sendKeys(emp);
    	 saveBtn.click();
     }
     public void createOrganisation(String organaisationName,String web,String emp,String phnNumber,String otherPhnNumber,String emailId) {
    	 orgName.sendKeys(organaisationName);
    	 webSite.sendKeys(web);
    	 employees.sendKeys(emp);
    	 phn.sendKeys(phnNumber);
    	 otherPhn.sendKeys(otherPhnNumber);
    	 email.sendKeys(emailId);
    	 saveBtn.click();
}
     public void createOrganisation(String organaisationName,String web,String billAdd,String billCity,String billState)
     {
    	 orgName.sendKeys(organaisationName);
    	 webSite.sendKeys(web);
    	 billingAddress.sendKeys(billAdd);
    	 billingCity.sendKeys(billCity);
    	 billingState.sendKeys(billState);
     }   
     public void createOrganisation(String organaisationName,String web,String emp,String phnNumber,
    		 String otherPhnNumber,String emailId,String 
    		billAdd,String billCity,String billState)
     {
    	 orgName.sendKeys(organaisationName);
    	 webSite.sendKeys(web);
    	 employees.sendKeys(emp);
    	 phn.sendKeys(phnNumber);
    	 otherPhn.sendKeys(otherPhnNumber);
    	 email.sendKeys(emailId);
    	 billingAddress.sendKeys(billAdd);
    	 billingCity.sendKeys(billCity);
    	 billingState.sendKeys(billState);
    	 saveBtn.click();
}
}