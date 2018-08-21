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

import page.CleanBasket;
import page.LoginPage;
import page.MessageSend;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class CleanBasketTest {
	private WebDriver driver;
	private LoginPage loginPage;
	private CleanBasket cleanBasket;

	@BeforeClass
	public void beforeClass() {
		String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://mail.ru");
		loginPage = new LoginPage(driver);
		cleanBasket = new CleanBasket(driver);

	}

	@Test
	public void sendMessage() {
		loginPage.enterLoginAndPass("dashamihai", "dasha2912900");
		loginPage.clickEnterButton();
		cleanBasket.clickBasketButton();
		cleanBasket.clickCleanFolderButton();
		cleanBasket.clickYESButton();
		AssertJUnit.assertTrue(cleanBasket.EmptyBasketLinkPresents());
		}

  @AfterClass
  public void afterClass()
  {
      driver.quit();
  }

}



