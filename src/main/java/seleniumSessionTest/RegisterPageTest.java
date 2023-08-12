package seleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.lunchBrowser("chrome");
		brutil.lunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(brutil.getPageTile());

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confrimPassword = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstname, "vivek");
		eleUtil.doSendKeys(lastname, "Singh");
		eleUtil.doSendKeys(emailId, "vivek@gmail.com");
		eleUtil.doSendKeys(telephone, "1234567890");
		eleUtil.doSendKeys(password, "vivek@123");
		eleUtil.doSendKeys(confrimPassword, "vivek@123");
		brutil.quitBrowser();

	}

}
