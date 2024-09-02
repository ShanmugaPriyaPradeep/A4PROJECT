package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is the pom class for leads home page
 */
public class LeadsHomePage {
	@FindBy(xpath="//img[@title='Create Lead...']")
      private WebElement createNewLeadButton;
     public LeadsHomePage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
	public WebElement getCreateNewLeadButton() {
		return createNewLeadButton;
	}
	/*
	 * this is the business library to click on new button
	 */
   public void clickOnNewLeadBtn()
   {
	   createNewLeadButton.click();
   }

}
