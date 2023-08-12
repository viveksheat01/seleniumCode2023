package seleniumSessionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementConcecept {
	static WebDriver driver;

	public static void main(String[] args) {

		// craete the web element + perform on ot -- click , get next , isdosplayed

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");
		driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
// 1
		// driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("naveen@123");
// 2 
		// WebElement emailId = driver.findElement(By.id("input-email"));
		// WebElement password = driver.findElement(By.id("input-password"));
		// emailId.sendKeys("naveen@gmail.com");
		// password.sendKeys("naveen@123");
// 3 By locator approrch

		/*
		 * By emailid = By.id("input-email"); By passWord = By.id("input-password");
		 * WebElement emai_lId = driver.findElement(emailid); WebElement pass_word =
		 * driver.findElement(passWord); emai_lId.sendKeys("naveen@gmail.com");
		 * pass_word.sendKeys("naveen@123");
		 */
// 4 by locator + generic function

		/*
		 * By email_id = By.id("input-email"); By pass_wrd = By.id("input-password");
		 * getElement(email_id).sendKeys("naveen@gmail.com");
		 * getElement(pass_wrd).sendKeys("naveen@123");
		 */

//5 by locator + generic function -- getElement() and action methods

		/*
		 * By email_id = By.id("input-email"); By pass_wrd = By.id("input-password");
		 * doSendKeys(email_id, "naveen@gmail.com"); doSendKeys(pass_wrd, "naveen@123");
		 */
//6 by locator + generic function -- getElement() and action methods + and  action methods in a util class
		By email_id = By.id("input-email");
		By pass_wrd = By.id("input-password");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(email_id, "naveen@gmail.com");
		eleutil.doSendKeys(pass_wrd, "naveen@123");

// 7th 

	}

}
