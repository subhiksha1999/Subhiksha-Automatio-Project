package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.TestUtils;

public class LoginPage extends WebTestBase {

    @FindBy(xpath = "//span[text()='Got it']")
    WebElement popUp;

    @FindBy(xpath = "//img[@alt='naukri social icons']")
    WebElement facebookClick;

    @FindBy(xpath = "//a[@id='login_Layer']")
    WebElement loginClick;

    @FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
    WebElement enterUsername;

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    WebElement enterPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "(//li[@class='nI-gNb-menuItems'])[1]")
    WebElement jobs;

    @FindBy(xpath = "(//li[@class='nI-gNb-menuItems'])[2]")
    WebElement itJobs;

    @FindBy(xpath = "//i[@class='fleft naukicon naukicon-checked']")
    WebElement engineeringRadioBtn;

   // @FindBy(xpath = "//div[@class='saveJobContainer fright grey-text save'])[1]")
    //WebElement saveClick;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnLoginBtn(String username, String password) {
        loginClick.click();
        enterUsername.sendKeys(username);
        enterPassword.sendKeys(password);
        loginBtn.click();

    }

    public void facebookClick() {
        TestUtils.scrollDownByPixel();
        TestUtils.waitUntilElementToBeClick(popUp);
        TestUtils.waitUntilElementToBeClick(facebookClick);
    }

    public void handleWindow() {
        TestUtils.getWindowsHandle();
    }

    public void mouseHoverElement() {
        TestUtils.mouseHoverOnElement(jobs);
        TestUtils.waitUntilElementToBeClick(itJobs);
       // itJobs.click();
    }
    public void clickRadioBtn() {
        TestUtils.mouseHoverOnElement(jobs);
        TestUtils.waitUntilElementToBeClick(itJobs);
        engineeringRadioBtn.click();
    }
}


