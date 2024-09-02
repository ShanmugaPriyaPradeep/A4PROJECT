package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
 @FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName ; 
 @FindBy(xpath="//input[@name='lastname']")	
	private WebElement lastName; 
 @FindBy(xpath="//input[@name='company']")
	private WebElement company; 
 @FindBy(xpath="//input[@name='designation']")
	private WebElement title ; 
 @FindBy(xpath="//input[@name='phone']")
	private WebElement phone; 
 @FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile; 
 @FindBy(xpath="//input[@name='email']")
	private WebElement email; 
 @FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployee; 
 @FindBy(xpath="//textarea[@name='lane']")	
	private WebElement street; 
 @FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox; 
 @FindBy(xpath="//input[@name='code']")
	private WebElement postalCode; 
 @FindBy(xpath="//input[@name='city']")
	private WebElement city ; 
 @FindBy(xpath="//input[@name='country']")
	private WebElement country; 
 @FindBy(xpath="//input[@name='state']")
	private WebElement state;
 @FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
public CreateNewLeadPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getCompany() {
	return company;
}
public WebElement getTitle() {
	return title;
}
public WebElement getPhone() {
	return phone;
}
public WebElement getMobile() {
	return mobile;
}
public WebElement getEmail() {
	return email;
}
public WebElement getNoOfEmployee() {
	return noOfEmployee;
}
public WebElement getStreet() {
	return street;
}
public WebElement getPoBox() {
	return poBox;
}
public WebElement getPostalCode() {
	return postalCode;
}
public WebElement getCity() {
	return city;
}
public WebElement getCountry() {
	return country;
}
public WebElement getState() {
	return state;
}
public WebElement getSaveBtn() {
	return saveBtn;
}
 public void createLead(String fname,String lname,String comp)
 {
	 firstName.sendKeys(fname);
	 lastName.sendKeys(lname);
	 company.sendKeys(comp);
	 saveBtn.click();
 }
 public void createLead(String fname,String lname,String comp,String tit,String phn,String mob,
		 String mail,String noofemployee,String strt,String pB,String pC,String cit,String count,String stat)
 {
	 firstName.sendKeys(fname);
	 lastName.sendKeys(lname);
	 company.sendKeys(comp);
	 title.sendKeys(tit);
	 phone.sendKeys(phn);
	 mobile.sendKeys(mob);
	 email.sendKeys(mail);
	 noOfEmployee.sendKeys(noofemployee);
     street.sendKeys(strt);
     poBox.sendKeys(pB);
     postalCode.sendKeys(pC);
     city.sendKeys(cit);
     country.sendKeys(count);
     state.sendKeys(stat);  
	 saveBtn.click();
 }
 public void createLead(String fname,String lname,String comp,String tit,String phn,String mob,
		 String mail,String noofemployee)
 {
	 firstName.sendKeys(fname);
	 lastName.sendKeys(lname);
	 company.sendKeys(comp);
	 title.sendKeys(tit);
	 phone.sendKeys(phn);
	 mobile.sendKeys(mob);
	 email.sendKeys(mail);
	 noOfEmployee.sendKeys(noofemployee);
	 saveBtn.click();
 }
 public void createLead(String fname,String lname,String comp,String strt,String pB,String pC,String cit,String count,String stat)
 {
	 firstName.sendKeys(fname);
	 lastName.sendKeys(lname);
	 company.sendKeys(comp); 
	 street.sendKeys(strt);
     poBox.sendKeys(pB);
     postalCode.sendKeys(pC);
     city.sendKeys(cit);
     country.sendKeys(count);
     state.sendKeys(stat);  
	 saveBtn.click();
 }

}
