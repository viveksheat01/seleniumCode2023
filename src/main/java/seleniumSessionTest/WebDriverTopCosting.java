package seleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverTopCosting {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equals("chrome")) {

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");

			driver = new ChromeDriver(co);

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/viveksingh/Documents/drivers/geckodriver");

			driver = new FirefoxDriver();

		} else if (browser.equals("safari")) {

			driver = new SafariDriver();

		} else {
			System.out.println("Please pass the right browser.........");
		}

		driver.get("https://www.google.com/");

		String titleTag = driver.getTitle();
		System.out.println("page title" + titleTag);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesrce = driver.getPageSource();
		System.out.println(pagesrce);

		driver.quit();

	}

}
