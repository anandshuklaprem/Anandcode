package Com.DataDriven;

import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foodmandu {

	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("./src/test/resources/testFoodmandu.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet =work.getSheet("Sheet1");
		for(int i=1; i<=sheet.getLastRowNum();i++) {
		XSSFRow  row =sheet.getRow(i);
		XSSFCell Email =row.getCell(0);
		XSSFCell Password =row.getCell(1);
		
//interface
		Logger log=LogManager.getFormatterLogger();
		WebDriver w =null;
		try {
			 w = new ChromeDriver();
			 log.info("chrome browser has been lunch");
			
		} catch (Exception e) {
			log.error("chrome browser has not been lunch"+e);
		}
		
        
        w.get("https://foodmandu.com/");     
        
        Thread.sleep(2000);
        w.findElement(By.cssSelector("button[ng-click=\"OpenLoginForm()\"]")).click();
        
        try {
			log.info("lofin page has been opened");
		} catch (Exception e) {
			log.error("lofin page has not been opened"+e);
		}
        Thread.sleep(2000);
        w.findElement(By.name("Email")).sendKeys(Email.toString());
        try {
			log.info("Email has been opened");
		} catch (Exception e) {
			log.error("email has not been opened"+e);
		}
        Thread.sleep(2000);
        w.findElement(By.name("Password")).sendKeys(Password.toString());
        try {
			log.info("password accessed");
		} catch (Exception e) {
			log.error("password not accessed"+e);
		}
        Thread.sleep(2000);
        w.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        try {
			log.info("submit buttom opened");
		} catch (Exception e) {
			log.error("submit buttom not opened"+e);
		}
        
        XSSFCell expectedTitle =row.getCell(3);
        
        try {
        String actualTitle =w.findElement(By.cssSelector("li[title=\"My profile\"]")).getAttribute("title");
        log.info("check pass");
        if (actualTitle.equals(expectedTitle.toString())) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
        } 
        catch(Exception e) {
        	if (e.toString().contains(expectedTitle.toString())) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
        	
        }
        Thread.sleep(2000);
	    w.quit();
	    log.info("work done");
		}
	}

}

/////////////proto.me    site   email demokonhaitu pass test@1234Gm
