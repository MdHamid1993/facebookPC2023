package com.facebok.CreatePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLOginPage {
	
	WebDriver driver;

	/**
	 * @param driver
	 */
	public PageFactoryLOginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how= How.XPATH, using="//input[@id='email']") WebElement userName;
	public WebElement getUserName(String enterUserName) {
		userName.sendKeys(enterUserName);
		return userName;
	}
	
	@FindBy(how=How.ID, using="pass") WebElement password;
	public WebElement getPassword(String enterpassword) {
		password.sendKeys(enterpassword);
		return password;
	}
	
	@FindBy(how=How.XPATH, using= "//button[@name='login']") WebElement logIn;
	public WebElement getLogInButton() {
		logIn.click();
		return logIn;
	}
	
}
