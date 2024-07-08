package part1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class basic4 {

	
	@Test(dataProvider="userpwd")
	public void login(String un , String pwd) {
		System.out.println(un);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object[][] userpwd(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "vijay";
		data[0][1] = "vijay";
		
		data[1][0] = "don";
		data[1][1] = "123";
		
		data[2][0] = "john";
		data[2][1] = "456";
		
		
		
		return data;
		
		
	}
	
}
