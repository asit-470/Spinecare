package com.qa.stepdefination;

import org.junit.Assert;

import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps extends TestBase  {
	LoginPage lg;
	Homepage hm;
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
	  TestBase.initialization() ;
	}

	@Then("^useron login page$")
	public void useron_login_page() throws Throwable {
		 lg=new LoginPage();
		String s=lg.validateloginpagetitle();
	    System.out.println(s);
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	hm= lg.login(prop.getProperty("username"), prop.getProperty("password"));
	}



	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	  String ss= hm.validatehomepagetitle1();
	System.out.println(ss);
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}

}
