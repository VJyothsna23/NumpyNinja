package Module2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TS01 {
	
	@BeforeMethod //Executes before every method
	public void beforeMethod(){
		System.out.println("Excecuting Before every method in TS01");
	}
	
	@Test(groups = {"smoke", "Sanity"})// Grouping this method in smoke and sanity groups so that every time we run these testing groups,this method gets executed.
	public void test001(){
		System.out.println("Excecuting test001 of TS01- Module 2");
	}
	
	@Test(groups = {"smoke"})
	public void test002(){
		System.out.println("Excecuting test002 of TS01- Module 2");
	}
	
	@Test
	public void test003(){
		System.out.println("Excecuting test003 of TS01- Module 2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Excecuting After every method in TS01");
	}
	
	@DataProvider // This is a data provider method. This is used to pass the data to a test case.
	public Object[][] data001(){
		
		Object[][] data1 = {{"Jack","password1"}, {"Jill","password2"} }; // declaring a 2-d array.
		// we are creating a 2-dimensional object array so we can use it for any type of data.
		return data1;// data provider method must return data.
	}
	
	@Test(dataProvider = "data001")
	public void login(String name, String pwd) {
		
		System.out.println("The data set which is being executed is :" + name+ " and " + pwd);
	}
	

}
