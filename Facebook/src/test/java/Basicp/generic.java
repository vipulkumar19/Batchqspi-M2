package Basicp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class generic {

	WebDriver driver;
	protected Loginpage lp;
	@BeforeMethod
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com");
		
		
	}
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
}
