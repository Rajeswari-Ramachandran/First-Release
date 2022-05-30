package sampleSelePro;

import java.util.Set;

import javax.servlet.http.*;
import org.openqa.selenium.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.util.Cookie;



public class selProj {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.payilagam.com");
Set<org.openqa.selenium.Cookie> cookies=driver.manage().getCookies();
for(org.openqa.selenium.Cookie c : cookies)
{
	System.out.println(" "+ c);
}
	

/*System.out.println("The URL is :" + driver.getCurrentUrl());
System.out.println("Page Source :"+driver.getPageSource());
System.out.println("Page Title "+ driver.getTitle());
System.out.println("Window Handle :"+driver.getWindowHandle());
System.out.println("Window Handles :"+driver.getWindowHandles());
driver.get("http://www.google.com");
System.out.println("Page Title "+ driver.getTitle());
driver.navigate().back();
System.out.println("Page Title  after Back : "+ driver.getTitle());
driver.navigate().forward();
System.out.println("Page Title  after Forward : "+ driver.getTitle());
driver.navigate().to("https://web.whatsapp.com/");
driver.navigate().refresh();
System.out.println("Page Title  after Refresh : "+ driver.getTitle());*/
	}

}
