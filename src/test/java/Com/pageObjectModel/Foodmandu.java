package Com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foodmandu {

	public static void main(String[] args) {
		WebDriver w =new ChromeDriver();
		w.get("https://foodmandu.com/");
		FoodmanduPOMWithPageFactory repo =new FoodmanduPOMWithPageFactory(w);
		repo.Login();
		repo.sendEmail("ANANDSHUKLA@gmail.com");
		repo.sendpassword("guyioklm");
		repo.Loginbtn();
	}

}
