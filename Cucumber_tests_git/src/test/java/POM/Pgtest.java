package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pgtest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavyashree.hh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  
	  Pagefactory ele = PageFactory.initElements(driver, Pagefactory.class);
	  ele.login("aravind.guggilla57@gmail.com","aravind");
	  ele.out.click();
  }
}
