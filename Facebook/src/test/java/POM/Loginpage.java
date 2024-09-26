package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(name="pass")
	private WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void enterusn() {
		usn.sendKeys("admin");
		
	}
	public void enterpsw() {
		psw.sendKeys("admin@123");
		
	}
public void click_log()
{
	login.click();
}
}
