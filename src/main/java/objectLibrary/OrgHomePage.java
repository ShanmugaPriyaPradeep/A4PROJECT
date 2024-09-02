package objectLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * this is a pom class for org page
 */
public class OrgHomePage {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
      private WebElement newOrgPage;
	public OrgHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewOrgPage() {
		return newOrgPage;
	}
	/*
	 * business library to click on org button
	 */
      public void clickOnOrgBtn()
      {
    	 newOrgPage.click();
      }
}
