package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionProgram1 {
	@Test
public void hardAssertionStrictcomparission()
{
	String expectedData="raja";
	String actualData="Raja";
	Assert.assertEquals(actualData, expectedData);
	System.out.println("strict Comparision passed !!!!! ");			
}
	@Test
public void containsLevelComparision() 
{
	String expectedData="raja";
	String actualData="maharaja";
	Assert.assertTrue(actualData.contains(expectedData) );
	System.out.println("contains Comparision passed !!!!! ");			

}
}
