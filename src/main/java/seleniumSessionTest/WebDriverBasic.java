package seleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasic {

	public static void main(String[] args) {

		// opne browser
		// chrome driver =class
		// webdriver is interface
		// driver is refrence varibale of webdriver
		// Top costing
		/*
		 * ChromeOptions co = new ChromeOptions();
		 * co.addArguments("--remote-allow-origins=*");
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/viveksingh/Documents/drivers/chromedriver"); WebDriver driver = new
		 * ChromeDriver(co); // top costing
		 */
		// lunch the url

		WebDriver driver = new SafariDriver();
		driver.get("https://www.amazon.in/");
		// get the title

		String titleTag = driver.getTitle();
		System.out.println("page title" + titleTag);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesrce = driver.getPageSource();
		System.out.println(pagesrce);

		driver.quit();

	}

}
