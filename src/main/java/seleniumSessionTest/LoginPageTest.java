package seleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.lunchBrowser("chrome");
		brutil.lunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brutil.getPageTile());
		By email_id = By.id("input-email");
		By pass_wrd = By.id("input-password");
		ElementUtil eleutil = new ElementUtil(driver);

		eleutil.doSendKeys(email_id, "naveen@gamil.com");
		eleutil.doSendKeys(pass_wrd, "naveen@123");

		brutil.quitBrowser();

	}

}
