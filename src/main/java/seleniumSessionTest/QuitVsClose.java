package seleniumSessionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitVsClose {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/viveksingh/Documents/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		// get the title

		String titleTag = driver.getTitle();
		System.out.println("page title" + titleTag); // getTitle

		String url = driver.getCurrentUrl();
		System.out.println(url);
		// driver.quit(); // closed browser
		driver.close();

		/*
		 * driver = new SafariDriver(); driver.get("https://www.amazon.in/"); String
		 * titleTag1 = driver.getTitle();
		 * 
		 * System.out.println("page title" + titleTag1);
		 */
	}

}
