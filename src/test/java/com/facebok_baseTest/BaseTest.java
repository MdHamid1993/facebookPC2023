package com.facebok_baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	public WebDriver openApp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		return driver;

	}

	public WebDriver ChromApp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		return driver;

	}

	public WebDriver edgeApp() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		return driver;

	}

	public WebDriver fireFoxApp() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		return driver;
		
	}
	
}
