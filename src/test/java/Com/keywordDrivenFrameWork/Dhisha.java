package Com.keywordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dhisha {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis =new FileInputStream("./src/test/resources/Disha.xlsx");
		
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i=1; i<=4; i++) {
			XSSFRow row =sheet.getRow(i);
			XSSFCell teststep =row.getCell(3);
			
			String[] teststeps =teststep.toString().split("[0-9]");
			WebDriver w =null;
			ReportOfDISHA r =null;
			
		//	System.out.println(teststep);
			
			for(String ts :teststeps) {
				System.out.println(ts);
				Thread.sleep(2000);
				
				if("Launch chrome browser".equalsIgnoreCase(ts.trim())) {
					w=new FirefoxDriver();
					r=new ReportOfDISHA(w);
					Thread.sleep(2000);
				}else if ("navigate to url".equalsIgnoreCase(ts.trim())) {
					w.get("http://103.251.94.38:8080/MIDMS/index.jsp");
					
					Thread.sleep(2000);
					
				}else if ("Enter username".equalsIgnoreCase(ts.trim())) {
					r.username();
					Thread.sleep(2000);
					
					
				}else if ("Enter password".equalsIgnoreCase(ts.trim())) {
					r.password();
					
					Thread.sleep(2000);

				}else if ("Enter capcha".equalsIgnoreCase(ts.trim())) {
					
					Thread.sleep(10000);
					
					
				}else if ("click on keep me sign in checkbox".equalsIgnoreCase(ts.trim())) {
					r.KeepMeSignIn();
					
					
					Thread.sleep(2000);
				}else if ("click on login button".equalsIgnoreCase(ts.trim())) {
					r.Login();
					
					Thread.sleep(2000);
					
				}else if ("click on menu".equalsIgnoreCase(ts.trim())) {
					r.menu();
					Thread.sleep(2000);
					
				}else if ("click on Registration".equalsIgnoreCase(ts.trim())) {
					r.Registration();
					
					Thread.sleep(2000);
					
				}else if ("Select an prefix".equalsIgnoreCase(ts.trim())) {
					r.prefix();
					
					Thread.sleep(2000);
					
				}else if ("Enter FirstName".equalsIgnoreCase(ts.trim())) {
					r.fristName();
					
					Thread.sleep(2000); 
					
				}else if ("Enter LastName".equalsIgnoreCase(ts.trim())) {
					Thread.sleep(2000);
					
					
					r.lastName();
					
				}else if ("Select B to C".equalsIgnoreCase(ts.trim())) {
					r.b2c();
					
					Thread.sleep(2000);
					
				}else if ("Close browser".equalsIgnoreCase(ts.trim())) {
					w.quit();
					
					
				
				}
				
				
				
				
				
			}
			
		}

	}

}
