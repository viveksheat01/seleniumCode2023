package seleniumSessionTest;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;

	public WebDriver lunchBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");
			driver = new ChromeDriver(co);

			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/viveksingh/Documents/drivers/geckodriver");

			driver = new FirefoxDriver();
		case "safari":
			driver = new SafariDriver();

		default:
			System.out.println("Please pass the right browser........." + browserName);

			break;
		}

		return driver;

	}

	public void lunchUrl(String url) {
		if (url == null) {
			System.out.println("url is null");
			throw new FramworkException("URLISNULL");

		}
		if (url.length() == 0) {
			System.out.println("url is empty");

			throw new FramworkException("URL IS EMPTY");

		}
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is missing inthe url");

			throw new FramworkException("http(s) missing ");

		}

		driver.get(url);

	}

	public void lunchUrl(URL url) {
		String newUrl = String.valueOf(url);
		if (newUrl == null) {
			System.out.println("url is null");
			throw new FramworkException("URLISNULL");

		}
		if (newUrl.length() == 0) {
			System.out.println("url is empty");

			throw new FramworkException("URL IS EMPTY");

		}
		if (newUrl.indexOf("http") != 0 && newUrl.indexOf("https") != 0) {
			System.out.println("http(s) is missing inthe url");

			throw new FramworkException("http(s) missing ");

		}

		driver.navigate().to(url);

	}

	public String getPageTile() {
		return driver.getTitle();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
