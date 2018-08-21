package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import page.DelMessage;
import page.ExistIcons;
import page.LoginPage;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class ExistIconsTest {
	private WebDriver driver;
	private ExistIcons icons;

	@BeforeClass
	public void beforeClass() {
		String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://mail.ru");
		icons = new ExistIcons(driver);

	}

	@Test
	public void existIcons() {
		
		AssertJUnit.assertTrue(icons.existIconsPresents());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	

}
