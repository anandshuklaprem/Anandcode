package Com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyntraWithoutpagefactorymodel {
	
	WebDriver w;
	public MyntraWithoutpagefactorymodel(WebDriver wd) {
		w=wd;
		
	}
	
	By search =By.cssSelector("input[placeholder=\"Search for products, brands and more\"]");
	
	By searchIcon=By.cssSelector("button[type=\"submit\"]");
	By product =By.cssSelector("h4[class=\"product-product\"]");
	By AddTOBag  =By.cssSelector("div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center");
	
	
	public void search(String Search) {
		w.findElement(this.search).sendKeys(Search);
	}
		
		public void searchByEnter(String Search) {
			w.findElement(this.search).sendKeys(Search,Keys.ENTER);
		}
	
		public void selectAnProduct() {
			w.findElement(product).click();
		}
		
		public void AddTOBag () {
			w.findElement(AddTOBag).click();
		
}
}