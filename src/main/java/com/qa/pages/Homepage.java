package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;



public class Homepage extends TestBase{
	

public Homepage() {
	PageFactory.initElements(driver, this);
}



	public String validatehomepagetitle1() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

}