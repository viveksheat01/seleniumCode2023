package seleniumSessionTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultileLevelParentChildMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.lunchBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		brutil.lunchUrl("https://www.bigbasket.com/");

	}

	public static void selectMenuLevelMenu4Item(String htmlTag, String levelMenu, String levelMenu2, String levelMenu3,
			String LevelMenu4) throws InterruptedException {

		WebElement shopByCatL1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		Actions act = new Actions(driver);
		act.moveToElement(shopByCatL1).build().perform();

		Thread.sleep(2000);

		WebElement berragesL2 = driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));

		Thread.sleep(2000);
		WebElement TeaL3 = driver.findElement(By.xpath("(//a[text()='Tea'])[2]"));

		WebElement greenTeaL4 = driver.findElement(By.xpath("(//a[text()='Green Tea'])[2]"));

	}

}
