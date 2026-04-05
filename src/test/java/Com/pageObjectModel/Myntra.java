package Com.pageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws Exception {
		WebDriver w =new ChromeDriver();
		MyntraWithoutpagefactorymodel repo =new MyntraWithoutpagefactorymodel(w);
		w.get("https://www.myntra.com/");
		Thread.sleep(2000);
		repo.searchByEnter("watch");
		Thread.sleep(2000);
		repo.selectAnProduct();
		Thread.sleep(2000);
		String main =w.getWindowHandle();
		Set<String>mainAndChild =w.getWindowHandles();
		for(String mac : mainAndChild) {
			
			if(!mac.equals(main)) {
				w.switchTo().window(mac);
			}
		}
	
		Thread.sleep(2000);
		repo.AddTOBag();
		
			

	}

}
