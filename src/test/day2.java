package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void webloginhomeloan()
	{
		System.out.println("WebLOgin home loan");
	}
	@Parameters({"URL","Username"})
	@Test
	public void mobileloginhomeloan(String url,String username)
	{
		System.out.println("Mobile Login home Loan");
		System.out.println(url);
		System.out.println(username);
		
	}
	
	@Test(dependsOnMethods= {"webloginhomeloan"})
	public void LoginAPihomeloan()
	{
		System.out.println("API LOgin home Loan");
	}
}
