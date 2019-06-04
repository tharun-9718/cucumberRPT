package StepDef;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DDT {

	WebDriver Driver = null;

@Given("User is open the application")
public void user_is_open_the_application() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jars\\chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	Driver.manage().window().maximize();
	
}

@When("User click on to signin link")
public void user_click_on_to_signin_link() {
	Driver.findElement(By.linkText("SignIn")).click();
	System.out.println("the title of the page is"+Driver.getTitle());
    
}

@When("User enters {string} and {string}")
public void user_enters_and(String username, String password) {
	
	Driver.findElement(By.id("userName")).sendKeys(username);
	Driver.findElement(By.id("password")).sendKeys(password);
	Driver.findElement(By.name("Login")).click();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	Driver.close();
	
	
	
   
}

@Then("Message displayed Login Successfully")
public void message_displayed_Login_Successfully() {
	System.out.println("Login Successful");
   
}


}
