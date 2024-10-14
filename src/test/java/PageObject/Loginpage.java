package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='emailaddress']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passWord;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement logbutton;

	public void SetUsername(String uname) {
		userName.sendKeys(uname);

	}

	public void setPassword(String pass) {
		passWord.sendKeys(pass);
	}

	public void setLoginButtton() {
		logbutton.click();
	}
}
