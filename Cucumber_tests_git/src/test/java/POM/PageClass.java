package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc= By.linkText("Log in");
	By uname= By.id("Email");
	By pwd= By.id("Password");
	By lin= By.xpath("//input[@value='Log in']");
	By log=By.linkText("Log out");
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklnc() {
		driver.findElement(lnc).click();
	}
	public void typeuname() {
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void typepwd() {
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void loginlin() {
		driver.findElement(lin).click();
	}

}
