package org.testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGUsingDataProvider {

	@Test(dataProvider = "data", dataProviderClass = Sample.class)
	private void tc0(String s, String s1) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace_UptoMaven\\TestNG1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);

	}

}
