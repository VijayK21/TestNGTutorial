package part1;
import org.testng.annotations.*;
public class basics {

@BeforeClass
public void beforeclass() {
	System.out.println("before class");
}

@Test(timeOut=3000,enabled = true) 
public void demo(){
	System.out.println("TestNG");
}

@Test(groups= {"Smoke"})
public void name() {
	System.out.println("Vijay");
}

@Test(dependsOnMethods= {"demo","name"})
public void age() {
	System.out.println("23");
}


}
