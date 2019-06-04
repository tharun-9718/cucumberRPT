package PageObjecModel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageImplementation {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	PageFactory locateElements=PageFactory.initelements(driver,PageClass.class);
	locateElements.loginMethod("abc@gmail.com","abc");
	}
	
}
