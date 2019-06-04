package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef2 {
	WebDriver Driver = null;

@Given("user login page is opened")
public void user_login_page_is_opened() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jars\\chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	Driver.manage().window().maximize();
	Driver.findElement(By.linkText("SignIn")).click();
	System.out.println("the title of the page is"+Driver.getTitle());
	
}

@When("user enters {string} as a username and {string} as a password")
public void user_enters_as_a_username_and_as_a_password(String string,String  string2) {
	Driver.findElement(By.id("userName")).sendKeys("lalitha");
	Driver.findElement(By.id("password")).sendKeys("password123");
	
    
}

@When("user click on Login button")
public void user_click_on_Login_button() {
	Driver.findElement(By.name("Login")).click();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
}

@Then("will Finds a testmeapp homepage")
public void will_Finds_a_testmeapp_homepage() {
	
}


}
