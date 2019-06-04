package PageObjecModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {

	WebDriver driver;
	@FindBy(linkText="Log in") WebElement login;
	@FindBy(how =How.ID,using="Email") WebElement username;
	@FindBy(how =How.ID,using="Password") WebElement password;
	@FindBy(how =How.XPATH,using="//input[@value='Log in']") WebElement log;

	public void PageFactory(WebDriver driver) {
		this.driver= driver;
		
	}
	public void loginMethod(String uid,String pwd) {
		login.click();
		username.sendKeys(uid);
		password.sendKeys(pwd);
		log.click();
	}
	}
	