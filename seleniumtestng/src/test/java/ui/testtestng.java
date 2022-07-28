package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtestng {

	@Test
	public void logintest() {
		
		String ExpectTitle= "Electronics, Cars, Fashion, Collectibles & More | ebay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com");
		String actualtitle= driver.getTitle();
		System.out.println("ebay");
		Assert.assertEquals(actualtitle,ExpectTitle);
	
	}

}
