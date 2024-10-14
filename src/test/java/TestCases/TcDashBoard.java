package TestCases;

import org.testng.annotations.Test;

import PageObject.Loginpage;

public class TcDashBoard extends BaseClass{
	@Test
	public void logintest() {
		Loginpage lp=new Loginpage(driver);
		lp.SetUsername(username);
		lp.setPassword(password);
		lp.setLoginButtton();
	}

}
