package Com.TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationDemo {

	
	@BeforeSuite
	
	public void bs() {
		System.out.println("This method is belong to bs");
	}
	@BeforeTest
	public void bt() {
		System.out.println("This method is belong to bt");
	}
	@BeforeClass
	public void bc() {
		System.out.println("This method is belong to bc");
	}
	@BeforeMethod
	
	public void bm() {
		System.out.println("This method is belong to bm");
	}
	

@Test
	
	public void cond3() {
		System.out.println("This is Third test condition");
	}

@Test

public void cond2() {
	System.out.println("This is Second test condition");
}

@Test

public void cond1() {
	System.out.println("This is Frist test condition");
}


@AfterSuite

public void As() {
	System.out.println("This method is belong to As");
}
@AfterTest
public void At() {
	System.out.println("This method is belong to At");
}
@AfterClass
public void Ac() {
	System.out.println("This method is belong to Ac");
}
@AfterMethod

public void Am() {
	System.out.println("This method is belong to Am");
}



}

