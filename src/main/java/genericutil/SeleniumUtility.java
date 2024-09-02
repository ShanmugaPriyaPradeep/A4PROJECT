package genericutil;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
   //WebDriver driver=null;
   Actions act=null;
   Select s=null;
   /*
    * this is generic method for implicit wait
    */
   public void implicitWait(WebDriver driver,int particularSeconds)
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
   }
   /*this is a generic method to perform maximization operation
    * 
    */
   public void maximizeWindow(WebDriver driver)
   {
	   driver.manage().window().maximize();
   }
   /*
    * this is a generic method to perform right click  operation
    */
   public void rightClickOnAnElement(WebDriver driver,WebElement element)
   {
	   act=new Actions(driver);
	   act.contextClick(element).perform();
   }
   /*
    * this is a generic method to perform  click  operation
    */
   public void clickOperation(WebDriver driver,WebElement element)
   {
	   act=new Actions(driver);
	   act.click(element).perform();
   }
   /*
    * this is a generic method to perform drag and drop  operation
    */
   public void dragAndDropOperetion(WebDriver driver,WebElement src,WebElement target)
   {
	   act=new Actions(driver);
	   act.dragAndDrop(src, target).perform();
   }
   /*
    * this is a generic method to perform drag to an element by using offset  operation
    */
   public void dragAPointer(WebDriver driver,WebElement src,int xOffset,int yOffset)
   {
	   act=new Actions(driver);
	   act.dragAndDropBy(src, xOffset, yOffset).perform();
   }
   /*
    * this is a generic method to perform scroll down operation
    */
   
   public void scrollToAParticularElement(WebDriver driver,WebElement element)
   {
	   act=new Actions(driver);
	   act.scrollToElement(element).perform();   
   }
   /*
    * this is a generic method to perform move a cursor to an particular element operation
    */
   public void moveCursorToAnElement(WebDriver driver,WebElement element )
   {
	   act=new Actions(driver);
	   act.moveToElement(element).perform();;	   
   }
   /*
    * this is a generic method to perform hold an element operation
    */
   public void holdAnElement(WebDriver driver,WebElement element)
   {
	   act=new Actions(driver);
	   act.clickAndHold(element).perform();
   }
   /*
    * this is a generic method to perform scroll down operation
    */
   public void releaseAnElement(WebDriver driver,WebElement element)
   {
	   act=new Actions(driver);
	   act.release(element).perform();
   }
   /*
    *=================================Select class Generic Functions=================================== 
    */
   /*
    * this is a generic method to select an option based on index
    */
   public void selectAnElementByIndex(WebElement element,int indexNum)
   {
	   s=new Select(element);
	   s.selectByIndex(indexNum);
   }
   /*
    *this is a generic method to select an option based on text 
    */
   public void selectByAnVisibleText(WebElement element,String text)
   {
	   s=new Select(element);
	   s.selectByVisibleText(text);
   }
   /*
    * this is a generic method to select an option based on value
    */
   public void selectByValue(WebElement element,String value)
   {
	   s=new Select(element);
	   s.selectByValue(value);
   }
   /*this is a generic method to de-select an option based on index
    * 
    */
   public void deSelectAnElementByIndex(WebElement element,int indexNum)
   {
	   s=new Select(element);
	   s.deselectByIndex(indexNum);
   }
   /*
    * this is a generic method to de-select an option based on visibleText
    */
   public void deSelectByAnVisibleText(WebElement element,String text)
   {
	   s=new Select(element);
	   s.deselectByVisibleText(text);
    }
  /*
   * this is a generic method to de-select an option based on value
   */
   public void deSelectByValue(WebElement element,String value)
   {
	   s=new Select(element);
	   s.deselectByValue(value);
   }
   /*
    * this is a generic method to de-select all the selected options
    */
   public void deSelectAllOptions(WebElement element)
   {
	   s=new Select(element);
	   s.deselectAll();
   }
   /*
    *  this is a generic method to fetch all the selected option from a multi-select option
    */
   public List<WebElement> fetchAllSelectedOptions(WebElement element)
   {
	   s=new Select(element);
	   List<WebElement>all=s.getAllSelectedOptions();
	   return all;
   }
   /*
    * this is a generic method to fetch all the  option from a multi-select option
    */
   public List<WebElement> fetchAllOptions(WebElement element)
   {
	   s=new Select(element);
	   List<WebElement>all=s.getOptions();
	   return all;
} 
   /*
    * ======================ALERT====================
    * this is a generic method to accept the alert
    */
   public void acceptalert(WebDriver driver)
	   {
		   driver.switchTo().alert().accept();
	   }
	   /*
	    * this is a generic method to dismiss the alert
	    */
	   public void dismissAlert(WebDriver driver)
	   {
		   driver.switchTo().alert().dismiss();
	   }
   /*
    * this is a generic method to Switch frame based on child index
    */
	   public void switchToChildFrame(WebDriver driver,int childFrameindex)
	   {
		   driver.switchTo().frame(childFrameindex);
	   }
}