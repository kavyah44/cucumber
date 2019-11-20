package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webshop {
	WebDriver driver;
	
	@Given("user should open the application")
	public void user_should_open_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavyashree.hh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://demowebshop.tricentis.com/";
		driver.get(url);
	}

	@When("user should click on to login link")
	public void user_should_click_on_to_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Email")).sendKeys(username);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]")).click();
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	    
	}

	@Then("message displayed Login Succesfully")
	public void message_displayed_Login_Succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Login succesfully");
	}

}
