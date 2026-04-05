package Com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodmanduPOMWithPageFactory {

	public  FoodmanduPOMWithPageFactory(WebDriver w) {
		
		PageFactory.initElements(w, this);
		
}
	
	//webelement
	//object variable or class variable
	@FindBy(css="button[ng-click=\"OpenLoginForm()\"]")
	private WebElement Login;
	@FindBy(css="input[name=\"Email\"]")
	private WebElement email;
	@FindBy(name="Password")
	private WebElement Password;
	
	//Datatype variable = value
	
	@FindBy(css="button[type=\"submit\"]")
	private WebElement loginbtn;
	
	
	//set of action
	public void Login() {
		Login.click();
	}
	
	public void sendEmail(String email) {
		this.email.sendKeys(email);
	}

	public void clearEmail() {
		email.clear();
	}
	public void sendpassword(String Password) {
	this.Password.sendKeys(Password);
	
	}
	
	public void clearpassword() {
		Password.clear();
	}
	
	public void Loginbtn() {
		loginbtn.click();
	}
	
}