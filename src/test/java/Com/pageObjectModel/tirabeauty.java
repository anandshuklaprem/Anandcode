package Com.pageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tirabeauty {

	public static void main(String[] args) throws Exception {
		WebDriver w =new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.tirabeauty.com/");
		TiraBeautyPOMPagefactoryModel repo =new TiraBeautyPOMPagefactoryModel(w);
		Thread.sleep(2000);
		repo.Search("perfume");
		Thread.sleep(3000);
		repo.specificProduct("Carolina Herrera Good Girl Eau De Parfum");
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
