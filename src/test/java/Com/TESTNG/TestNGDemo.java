package Com.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGDemo {
	@Test (priority=1,invocationCount=2,enabled=false)//test condition
	
	public void flipkart() {
		WebDriver w= new ChromeDriver();
		w.get("https://www.flipkart.com/");
	}

	@Test (priority=2)
	public void Snapdeal() {
		WebDriver w= new ChromeDriver();
		w.get("https://m.snapdeal.com");
		
	}
}
