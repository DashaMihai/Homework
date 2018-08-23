package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelMessage {
	 private WebDriver driver;
	@FindBy(xpath = "(//*[@class='b-checkbox__box'])[8]")
    private WebElement checkboxMessage;

    @FindBy(xpath = "(//*[text()='Удалить'])[1]")
    private WebElement delMessageButton;
   
   @FindBy(xpath = "//a[text()='Отменить']")
    private WebElement messageLink;
   
    public DelMessage(WebDriver webdriver)
    {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }
   
    public void clickCheckboxMessage() {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(checkboxMessage)).click();
	}
    public void clickDelMessageButton()
    {
    	delMessageButton.click();
    }
    public boolean MessagePresents() {
		return messageLink.isDisplayed();
	}


}
