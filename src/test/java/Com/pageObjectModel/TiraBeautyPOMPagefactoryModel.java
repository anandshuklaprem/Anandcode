package Com.pageObjectModel;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TiraBeautyPOMPagefactoryModel {

public  TiraBeautyPOMPagefactoryModel(WebDriver w) {
	
	PageFactory.initElements(w, this);
	

}

@FindBy (css="input[placeholder=\"Search\"]")
WebElement search;

@FindBy (css="h3[class=\"productName--Ys8wX\"]")
List<WebElement> products;


@FindBy (css="button[class=\"primary--SOMm7 undefined customBtn--MfL84 false  no-tap-highlight\"]")
WebElement AddTOBag;





public void Search (String Search) {
	search.sendKeys(Search,Keys.ENTER);
}

public void specificProduct(String name) {
	for (WebElement product : products) {
		if (product.getText().contains(name)) {
			product.click();
			break;
		}
	}
}



public void AddTOBag () {
	AddTOBag.click();


}}