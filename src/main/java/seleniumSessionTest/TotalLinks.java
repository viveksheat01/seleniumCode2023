package seleniumSessionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.lunchBrowser("chrome");
		brutil.lunchUrl("https://www.amazon.com/");
		System.out.println(brutil.getPageTile());

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("total links :" + linkList.size());

		/*
		 * for (int i = 0; i < linkList.size(); i++) { String text =
		 * linkList.get(i).getText(); // System.out.println(text);
		 * 
		 * // how to avoid blank text if (!(text.length() == 0)) {
		 * System.out.println(text);
		 * 
		 * } }
		 */

		// for each loop

		for (WebElement e : linkList) {
			String text = e.getText();
			if (!(text.length() == 0)) {
				System.out.println(text);

			}
		}

	}

}
