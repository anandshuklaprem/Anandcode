package Com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsearchh {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver w =new ChromeDriver();
		 FlipkartSearchPomWithoutPageFactory repo =new FlipkartSearchPomWithoutPageFactory(w);
		 
w.get("https://www.flipkart.com/");
Thread.sleep(1000);
repo.searchByEnter("Mobile");
//repo.SelectFristProductyOnly();
Thread.sleep(1000);
repo.SpecificProductyOnly("realme C61 (Marble Black");
Thread.sleep(1000);
repo.SwitchToEmbeddWindow();
Thread.sleep(1000);
repo.AddToCart();
Thread.sleep(1000);
w.quit();
	}

}
