package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase
{
public static WebDriver driver;
public static Properties prop;

public TestBase() 
{
try
{
prop=new Properties();	  
FileInputStream ip=new FileInputStream("C:\\Users\\asit.n\\Desktop\\JAVA and Selenium\\Workspace\\SpinecareCom.QA\\src\\main\\java\\com\\qa\\config\\config.properties");
prop.load(ip);
}
catch(FileNotFoundException e) 
{
e.printStackTrace();
}
catch(IOException e) 
{
e.printStackTrace();
}
}

public static void initialization() 
{
String browserName= prop.getProperty("browser");

if (browserName.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver","C://Users//asit.n//Desktop//JAVA and Selenium//chromedriver.exe");
driver = new ChromeDriver();
}
else if(browserName.equals("ff"))
{
System.setProperty("webdriver.gecko.driver",":‪C://Users//asit.n//Desktop//JAVA and Selenium//geckodriver-v0.23.0-win64//geckodriver.exe");
driver = new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
}


}

