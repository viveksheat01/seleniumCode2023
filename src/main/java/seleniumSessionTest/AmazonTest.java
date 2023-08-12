package seleniumSessionTest;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.lunchBrowser("Chrome");
		brUtil.lunchUrl("https//www.amazon.com/");

		// brUtil.lunchUrl(" ");

		String acTitle = brUtil.getPageTile();
		if (acTitle.contains("Amazon")) {
			System.out.println("correct title");

		} else {
			System.out.println("incorrect title");
		}

	}

}
