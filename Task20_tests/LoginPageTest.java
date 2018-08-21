package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import page.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginPageTest {
	private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void beforeClass()
    {
    	String exePath = "D:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.ru");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest()
    {
        loginPage.enterLoginAndPass("dashamihai", "dasha2912900");
        loginPage.clickEnterButton();
        AssertJUnit.assertTrue(loginPage.logoutLinkPresents());
    }

    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }
}

