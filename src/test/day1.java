package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class day1 {

	@Test
	public void Mailpage()
	{
		System.out.println("Test NG1");
	
	}
	@Test(groups= {"Smoke"})
	public void Setup()
	{
		System.out.println("Test NG2");
	
	}
}
