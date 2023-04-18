package com.facebok.CreateTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebok.CreatePage.PageFactoryLOginPage;
import com.facebok_baseTest.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryLOginTest extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() {
		driver = openApp();
	}

	@Test
	public void test() {
		PageFactoryLOginPage pg = new PageFactoryLOginPage(driver);
		pg.getUserName("wywq");
		pg.getPassword("uieyu");
		pg.getLogInButton();
	}
}
