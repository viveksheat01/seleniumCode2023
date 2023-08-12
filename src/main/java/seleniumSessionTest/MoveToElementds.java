package seleniumSessionTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementds {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.lunchBrowser("chrome");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		brutil.lunchUrl("https://www.spicejet.com/");

		selectSubMenu("Add-ons", "Student Discount");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void selectSubMenu(String parentMenu, String childMenu) throws InterruptedException {

		By parentMenuLocator = By.xpath("//div[text()='" + parentMenu + "']");
		By childMenuLocator = By.xpath("//div[text()='" + childMenu + "']");

		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));

		Actions act = new Actions(driver);
		act.moveToElement(addons).build().perform();

		Thread.sleep(2000);

		doClick(childMenuLocator);

	}

}
