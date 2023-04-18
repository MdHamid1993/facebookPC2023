package com.facebok.CreateTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebok.CreatePage.SignUpPage;
import com.facebok_baseTest.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {
		// driver = openApp();
		// driver = ChromApp();
		// driver = edgeApp();
		driver = fireFoxApp();

	}

	@Test
	public void registation() throws InterruptedException {
		SignUpPage r = new SignUpPage(driver);
		r.getcreateAccount();
		r.getFirstname("asiud");
		r.getLastName("jhgdyg");
		r.getmobileNumber("01454487");
		r.getPass("hg12");

	}
}
