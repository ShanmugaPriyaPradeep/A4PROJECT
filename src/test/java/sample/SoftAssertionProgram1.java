package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionProgram1 {
	@Test
public void strictLevelComparision()
{
	String expectedData="raja";
	String actualData="Raja";
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actualData, expectedData);;
	System.out.println("strict Comparision passed !!!!! ");			
  sa.assertAll();
}
	@Test
public void containsnLevelComparision()
{
	String expectedData="raja";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String actualData="maharaja";
	SoftAssert sa=new SoftAssert();
	sa.assertTrue(actualData.contains(expectedData));
	System.out.println("contains Comparision passed !!!!! ");			

	sa.assertAll();
}
}
