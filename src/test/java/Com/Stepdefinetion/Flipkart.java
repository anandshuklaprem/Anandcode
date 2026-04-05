package Com.Stepdefinetion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {

	

	@Given("launch an chrome browser")
	public void launch_an_chrome_browser() {
		Driver.w = new ChromeDriver();
		Driver.w.manage().window().maximize();
	    
	}
	@Given("Navigate to flipkart site")
	public void navigate_to_flipkart_site() throws Exception {
		Thread.sleep(2000);
		Driver.w.get("https://www.flipkart.com/");
	}
	@When("Enter {string} in search module in homepage")
	public void enter_in_search_module_in_homepage(String Search) throws Exception {
		Thread.sleep(2000);
		Driver.w.findElement(By.name("q")).sendKeys(Search, Keys.ENTER);
	}
	@When("validate mobile pagehas been open by pagetitle and the title is {string}")
	public void validate_mobile_pagehas_been_open_by_pagetitle_and_the_title_is_mobile_buy_products_online_at_best_price_in_india_all_categories_flipkart_com(String expectedTitle) throws Exception {
		Thread.sleep(2000);
		 Assert.assertEquals(Driver.w.getTitle(), expectedTitle);
	
	}
	
	@Given("search an {string} in search module in homepage")
	public void search_an_in_search_module_in_homepage(String Search) throws Exception {
		Thread.sleep(2000);
		Driver.w.findElement(By.name("q")).sendKeys(Search, Keys.ENTER);
	}
	@When("click on a first product")
	public void click_on_a_first_product() throws Exception {
		Thread.sleep(2000);
	  Driver.w.findElement(By.className("k7wcnx")).click();
	}

	@Then("close an chrome browser")
	public void close_an_chrome_browser() throws Exception {
		Thread.sleep(2000);
		 Driver.w.quit();
	}

	
}
