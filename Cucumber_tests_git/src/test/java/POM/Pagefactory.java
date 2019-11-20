package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pagefactory {
	
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using="Log in") WebElement login;
	@FindBy(how=How.ID,using="Email") WebElement uname;
	@FindBy(how=How.NAME,using="Password") WebElement pwd;
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement log;
	@FindBy(how=How.LINK_TEXT,using="Log out") WebElement out;
	
	public Pagefactory(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login(String uid,String psd) {
		login.click();
		uname.sendKeys(uid);
		pwd.sendKeys(psd);
		log.click();
	}

}
