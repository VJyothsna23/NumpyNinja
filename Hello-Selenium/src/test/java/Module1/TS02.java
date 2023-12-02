package Module1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TS02 {
	
	@BeforeClass
	public void before(){
		System.out.println("Executing before class");
	}
	@Test
	public void test001(){
		System.out.println("Excecuting test001 of TS02- Module 1");
		Assert.assertEquals(true, false);// assertion to validate a test case
	}
	
	@Test
	public void test002(){
		System.out.println("Excecuting test002 of TS02- Module 1");
		Reporter.log("I am executing test case 002 in module 2");// This gets printed in the report
	}
	
	@Test
	public void test003(){
		System.out.println("Excecuting test003 of TS02- Module 1");
	}
	
	@AfterClass
	public void after(){
		System.out.println("Executing after class");
	}

}
