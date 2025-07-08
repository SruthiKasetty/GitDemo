package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(dataProvider="getdata")
	public void weblogincarloan(String Username, String pwd)
	{
		System.out.println("WebLOgin Car loan");
		System.out.println(Username);
		System.out.println(pwd);
	}
	@Parameters({"URL"})
	@Test
	public void mobilelogincarloan(String url)
	{
		System.out.println("Mobile Login Car Loan");
		System.out.println(url);
		
	}
	
	@Test(dependsOnMethods="weblogincarloan")
	public void LoginAPiCarloan()
	{
		System.out.println("API LOgin Car Loan");
	}
	@DataProvider
	public Object[][] getdata()
	{
		//username and pwd =good credit history
		//no credit history
		//fraudulent credit history
		
		Object[][] obj=new Object[3][2];
		obj[0][0]="first user name";
		obj[0][1]="first password";
		obj[1][0]="2 user name";
		obj[1][1]="2 password";
		obj[2][0]="3 user name";
		obj[2][1]="3 password";
		return obj;
	}

}
