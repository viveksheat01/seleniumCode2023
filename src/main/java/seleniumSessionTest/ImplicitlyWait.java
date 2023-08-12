package seleniumSessionTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// sele 3
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// sele 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
