package seleniumSessionTest;

import org.openqa.selenium.WebDriver;

public class GetAttributrConcepts {

	public static void main(String[] args) {
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.lunchBrowser("chrome");
		brutil.lunchUrl("https://www.amazon.com/");
		System.out.println(brutil.getPageTile());
	}

}
