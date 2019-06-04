package StepDef;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo1 {
	
WebDriver Driver = null;
@Given("the login page is opened")
public void the_login_page_is_opened() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jars\\chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	Driver.manage().window().maximize();
	Driver.findElement(By.linkText("SignIn")).click();
	System.out.println("the title of the page is"+Driver.getTitle());
	
    
}

@When("users enters lalitha as username")
public void users_enters_lalitha_as_username() {
	Driver.findElement(By.id("userName")).sendKeys("lalitha");
 
   
}

@When("user enters password{int} as password")
public void user_enters_password_as_password(Integer int1) {
	Driver.findElement(By.id("password")).sendKeys("password123");
  

}

@Then("user will Finds a testmeapp homepage")
public void user_will_Finds_a_testmeapp_homepage() {
	Driver.findElement(By.name("Login")).click();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	
   
}
}
