package Com.DataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProton {

	public static void main(String[] args) throws Exception {

		// Excel file open
		FileInputStream fis = new FileInputStream("./src/test/resources/Proton.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// Expected value (login verify ke liye)
		String expectedTitle = "Settings";

		// Row loop
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);
			XSSFCell emailCell = row.getCell(0);
			XSSFCell passwordCell = row.getCell(1);

			String email = emailCell.toString();
			String password = passwordCell.toString();

			WebDriver w = new ChromeDriver();
			w.manage().window().maximize();

			w.get("https://account.proton.me/login");
			Thread.sleep(2000);

			// Excel se username & password
			w.findElement(By.id("username")).sendKeys(email);
			w.findElement(By.id("password")).sendKeys(password);
			w.findElement(By.cssSelector("button[type='submit']")).click();

			Thread.sleep(5000);

			try {
				String actualTitle = w.findElement(
						By.cssSelector("li[data-testid='settings-drawer-app-button:settings-icon']"))
						.getAttribute("title");

				if (actualTitle.equals(expectedTitle)) {
					System.out.println("Row " + i + " : Login PASS");
				} else {
					System.out.println("Row " + i + " : Login FAIL");
				}

			} catch (Exception e) {
				System.out.println("Row " + i + " : Login FAIL (Element not found)");
			}

			w.quit();
		}

		workbook.close();
	}
}


