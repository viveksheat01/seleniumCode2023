package seleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeBrowser {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(co);

		driver.get("https:google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());

	}

}
