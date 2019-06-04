package PageObjecModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePOM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.09\\Desktop\\selenium jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageFactory PObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clicklink();
		String.username=null;
		PObject.typepassword(password);
		PObject.clickonloginlyn();
		System.out.println("title pf the page is"+driver.getTitle());
	}

}
