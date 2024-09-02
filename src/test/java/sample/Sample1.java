package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority=1 ,invocationCount = 5)
public void createUser()
{
	System.out.println("user created !!!");
}
	@Test(priority=2,dependsOnMethods = {"createUser"})	
	//@Test(invocationCount = 0)
public void modifyUser()
{
	System.out.println("user modified!!");
}
	@Test(priority=3)
	@Ignore
public void deleteUser()
{
	System.out.println("user deleted!!");
}
}
