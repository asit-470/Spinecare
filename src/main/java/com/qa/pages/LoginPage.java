package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;



public class LoginPage extends TestBase {
	
@FindBy(xpath="//input[@id='txtLoginName']")
WebElement username;

@FindBy(xpath=" //input[@id='txtPassword']")
WebElement password;

@FindBy(xpath="//input[@id='btnSignin']")
WebElement loginbtn;



public LoginPage() {
	PageFactory.initElements(driver, this);
}
public String validateloginpagetitle() {
	return driver.getTitle();
	
	
}
public Homepage login(String un,String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	
	loginbtn.click();
	
	return new Homepage();
}
}
