package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	//WebDriver driver;
	

public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavyashree.hh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="http://demowebshop.tricentis.com/";
	driver.get(url);
	PageClass Pobj= new PageClass(driver);
	Pobj.clicklnc();
	//String username = null;
	Pobj.typeuname();
	Pobj.typepwd();
	Pobj.loginlin();
	System.out.println("title is "+driver.getTitle());
	driver.findElement(Pobj.log).click();
	}
}