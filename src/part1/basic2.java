package part1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic2 {
	
	@Test(groups= {"Smoke"})
	public void test1(){
		System.out.println("Test 1");
	}
	
	@Parameters({"URL1"})
	@Test 
	public void test2(String urlname){
		System.out.println(urlname);
	}
	
	@BeforeMethod(groups= {"Smoke"})
	
	public void beforemethod() 
	{
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println("I will execute after every method");
	}

}
