package seleniumSessionTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private static WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	// **************************Action Class**********************

	public void selectSubMenu(String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//div[text()='" + parentMenu + "']");
		By childMenuLocator = By.xpath("//div[text()='" + childMenu + "']");

		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));

		Actions act = new Actions(driver);
		act.moveToElement(addons).build().perform();

		Thread.sleep(2000);

		doClick(childMenuLocator);

	}

	// ****************************WaitElement*************************

	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
