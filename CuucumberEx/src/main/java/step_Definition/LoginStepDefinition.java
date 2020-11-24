package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver,chrome.driver", "C:\\chaithra\\seleniumassignments\\CuucumberEx\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
	   // throw new PendingException();
		
	}

	@When("^title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM()  {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals( "CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	   
	}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("username")).sendKeys(arg1);
	driver.findElement(By.name("password")).sendKeys(arg2);
}

	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button()  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login =driver.findElement(By.xpath("//input[@type = 'submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO", title);
	}
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
	    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

	}

	@Then("^user enters contact details \"([^\"]*)\"and \"([^\"]*)\">and \"([^\"]*)\">$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	    @Then("^close the browser$")
	    public void close_browser()
	    {
	    	driver.quit();
	    }
	   
	}



