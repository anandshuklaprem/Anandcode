package Com.keywordDrivenFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportOfDISHA {

	public ReportOfDISHA(WebDriver w) {
		PageFactory.initElements(w, this);
		
	}
	
	@FindBy(id ="userName")
	 private WebElement username;

	@FindBy(id ="password")
	 private WebElement password;

	@FindBy(css="input[type=\"checkbox\"]")
	 private WebElement KeepMeSignInCheckBox;
	
	@FindBy(id ="SignIn")
	 private WebElement SignIn;
	
     @FindBy(css="a[data-toggle=\"tooltip\"]")
	 private WebElement menu;
     
 	@FindBy(linkText="Registration")
	 private WebElement registration;
 	

 	@FindBy(id="prefix")
	 private WebElement prefix;
 	

 	@FindBy(id="fName")
	 private WebElement fristName;
 	

 	@FindBy(id="lName")
	 private WebElement lastName;
 	

    @FindBy(css="input[id=\"b2c\"]")
	 private WebElement btoc ;
    
    @FindBy(xpath ="//*[@id=\"s2id_patientTypeList\"]/a")
	 private WebElement patientType ;
    
    public void username() {
    	username.sendKeys("Suvarna");
    }
    
    public void password() {
    	password.sendKeys("Suvarna@123");
    }
    
    public void KeepMeSignIn() {
    	KeepMeSignInCheckBox.click();
    }
    
    public void Login() {
    	SignIn.click();
    }
    
    public void menu() {
    	menu.click();
    }
    
    public void Registration() {
    	registration.click();
    }
    
    public void prefix() {
    	Select s1=new Select(prefix);
    	s1.selectByVisibleText("MS.");
    	
    }
    
    public void fristName() {
    	fristName.sendKeys("Akash");
    }
    
    public void lastName() {
    	lastName.sendKeys("Mane");
    }
    
    
    public void b2c() {
    	btoc.click();
    }
 	
 	
 	
 	
	
	
	
	
	


}
