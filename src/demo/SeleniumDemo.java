package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
	@Test
	public void OpenBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.Google.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
