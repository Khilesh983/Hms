package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;

	public DashBoard(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='pro-user-name ml-1']")
	private WebElement clickpetient;

	@FindBy(xpath = "[//*[@id='side-menu']/li[3]/ul/li[1]/a]")
	private WebElement regesterpetient;
	
	
	public void ClickPetient() {
		clickpetient.click();
	}
	public void RegesterPetient() {
		regesterpetient.click();
	}

}
