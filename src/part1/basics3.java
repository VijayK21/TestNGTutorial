package part1;
import org.testng.annotations.*;
public class basics3 {

@BeforeSuite
public void beforesuite() {
	System.out.println("Before suite");
}

@AfterSuite
public void aftersuite() {
	System.out.println("After suite");
}
	
@Test 
public void school(){
	System.out.println("sunbeam");
}

@Test(groups= {"Smoke"})
public void clg() {
	System.out.println("vit");
}

@Test
public void work() {
	System.out.println("chennai");
}

@BeforeTest
public void beforetest() {
	System.out.println("before test folder");
}

@AfterTest
public void aftertest() {
	System.out.println("after test folder");
}



}
