package Com.TESTNG;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Nykaa {
	ThreadLocal<WebDriver> w = new ThreadLocal<WebDriver>();
	@Parameters("bs")
	@BeforeMethod
	public void launchBrowser(String browser) throws Exception {
		if(browser.equals("chrome")) {
			w.set(new ChromeDriver());
		}else if (browser.equals("Firefox")) {
			w.set (new FirefoxDriver());
		}else if (browser.equals("Edge")) {
			w.set (new EdgeDriver());
		}
		Thread.sleep(2000);
		w.get().get("https://www.nykaa.com/");
	}
	
	@Test
	public void search() throws Exception {
		Thread.sleep(2000);
		w.get().findElement(By.name("search-suggestions-nykaa")).sendKeys("shoes",Keys.ENTER);
	Thread.sleep(2000);
	Assert.assertEquals(w.get().getCurrentUrl(),"https://www.nykaa.com/search/result/?q=shoes&root=search&searchType=Manual&sourcepage=home");
	
	
	
}

	
	@Test
	public void category() throws Exception  {
		Thread.sleep(2000);
		w.get().findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[9]/a")).click();
		String main =w.get().getWindowHandle();
		Set<String>multi =w.get().getWindowHandles();
		Thread.sleep(2000);
		for (String m:multi) {
			if(!m.equals(main)){
				w.get().switchTo().window(m);
				
			}
		}
		
		
		SoftAssert soft =new SoftAssert();
		soft.assertEquals(w.get().getTitle(),"Men's Store");
		w.get().close();
		w.get().switchTo().window(main);
		soft.assertAll();
		
	}
	
	@Test
	public void bag() throws Exception {
		Thread.sleep(2000);
		w.get().findElement(By.id("header-bag-icon")).click();
		Thread.sleep(2000);
		Assert.assertEquals(w.get().findElement(By.cssSelector("span[data-test-id=\"header-title\"]")).getText(),"Bag");
	}
	
	@AfterMethod
	public void closerBrowser() {
		w.get().quit();
	}
}

//
//
//
//
//
//package Com.TESTNG;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//
//
//public class Nykaa {
//	WebDriver w;
//	@Parameters("bs")
//	@BeforeMethod
//	public void launchBrowser(String browser) throws Exception {
//		if(browser.equals("chrome")) {
//			w=new ChromeDriver();
//		}else if (browser.equals("Firefox")) {
//			w=new FirefoxDriver();
//		}else if (browser.equals("Edge")) {
//			w=new EdgeDriver();
//		}
//		
//		w.manage().window().maximize();
//		Thread.sleep(2000);
//		w.get("https://www.nykaa.com/");
//	}
//	
//	@Test
//	public void search() throws Exception {
//		Thread.sleep(2000);
//	w.findElement(By.name("search-suggestions-nykaa")).sendKeys("shoes",Keys.ENTER);
//	Thread.sleep(2000);
//	Assert.assertEquals(w.getCurrentUrl(),"https://www.nykaa.com/search/result/?q=shoes&root=search&searchType=Manual&sourcepage=home");
//	
//	
//	
//}
//
//	
//	@Test
//	public void category() throws Exception  {
//		Thread.sleep(2000);
//		w.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[9]/a")).click();
//		String main =w.getWindowHandle();
//		Set<String>multi =w.getWindowHandles();
//		Thread.sleep(2000);
//		for (String m:multi) {
//			if(!m.equals(main)){
//				w.switchTo().window(m);
//				
//			}
//		}
//		
//		
//		SoftAssert soft =new SoftAssert();
//		soft.assertEquals(w.getTitle(),"Men's Store");
//		w.close();
//		w.switchTo().window(main);
//		soft.assertAll();
//		
//	}
//	
//	@Test
//	public void bag() throws Exception {
//		Thread.sleep(2000);
//		w.findElement(By.id("header-bag-icon")).click();
//		Thread.sleep(2000);
//		Assert.assertEquals(w.findElement(By.cssSelector("span[data-test-id=\"header-title\"]")).getText(),"Bag");
//	}
//	
//	@AfterMethod
//	public void closerBrowser() {
//		w.quit();
//	}
//}
//
