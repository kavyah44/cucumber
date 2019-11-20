package StepDefn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmelogin {
	WebDriver driver;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavyashree.hh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	   driver.get(url);
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By .id("userName")).sendKeys("lalitha");
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By .id("password")).sendKeys("password123");
	}

	@Then("user will find the TestMeApp Homepage")
	public void user_will_find_the_TestMeApp_Homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("Login")).click();
	    System.out.println("the page title is "+driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	}
}
