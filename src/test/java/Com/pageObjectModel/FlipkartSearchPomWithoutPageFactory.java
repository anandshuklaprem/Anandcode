package Com.pageObjectModel;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSearchPomWithoutPageFactory {

	
		WebDriver w;// global variable
		
		public FlipkartSearchPomWithoutPageFactory (WebDriver wd) {
			w=wd;
		}
		
		By search =By.name("q");
		By searchIcon=By.cssSelector("button[type=\"submit\"]");
		By product =By.className("k7wcnx");
		By AddToCart =By.cssSelector("button[class=\"dSM5Ub ugg2XR IUmgrZ\"]");
		By prev0rnext =By.cssSelector("a[class=\"jgg0SZ\"]");
		
		
		//Set of action
		
		public void search(String Search) {
			w.findElement(this.search).sendKeys(Search);
		}
		
		public void searchIcon(String Search) {
        w.findElement(this.search).sendKeys(Search);
		}
		
		public void searchByEnter(String Search) {
			w.findElement(this.search).sendKeys(Search,Keys.ENTER);
		}
		
		public void SelectFristProductyOnly() {
			w.findElement(product).click();
		}
		
		public void SpecificProductyOnly(String ProductName) throws InterruptedException {
			while(true) {
				Thread.sleep(1000);
			List<WebElement>products = w.findElements(product);
			for (WebElement product: products) {
				if(product.getText().toString().contains(ProductName)) {
					product.click();
					return;
					
				}
			}
			List<WebElement>pn = w.findElements(prev0rnext);
			for (WebElement n:pn) {
				if(n.getText().toString().equalsIgnoreCase("next")) {
					Actions act =new Actions(w);
					act.moveToElement(n).click().perform();
				}
					}
			}
		}
		
		private String main;
		public void SwitchToEmbeddWindow() {
			String mainWindow =w.getWindowHandle();
			main =mainWindow;
			Set<String> childWindow =w.getWindowHandles();
			for(String c: childWindow) {
				if (!c.equals(mainWindow)) {
					w.switchTo().window(c);
					
				}
			}
			
		}
		public void SwitchToMainWindow() {
			w.switchTo().window(main);
			
		
}
		
		public void AddToCart() {
			w.findElement(AddToCart).click();
			}
		}
