package org.testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	@Parameters("browser")
	@Test
	private void tc0(String s) {
		if (s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

		} else if (s.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

		} else {
			System.out.println("Invalid Browser");
		}

	}

}
