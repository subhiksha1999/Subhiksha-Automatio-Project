import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.JobPage;
import page.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    public LoginPage loginPage;
    public JobPage jobPage;

    LoginTest(){  //child class constructor
        super(); //able to call parent call constructor
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        loginPage = new LoginPage();
        jobPage = new JobPage();

    }

    @Test(priority = 1)
    public void verifyLoginUsernamePassword() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.clickOnLoginBtn(prop.getProperty("username"),prop.getProperty("password"));
        softAssert.assertAll();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void verifyFaceBookClick() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.handleWindow();
        loginPage.facebookClick();
        softAssert.assertEquals("",""," Tab should Open");
        softAssert.assertAll();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void verifyJob() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        jobPage.searchBox(prop.getProperty("skills"),prop.getProperty("location"));
        Thread.sleep(3000);
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void verifyMouseHover() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.mouseHoverElement();
        softAssert.assertEquals("", "", "MouseHover on Element Accounts");
        Thread.sleep(5000);
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void verifyRadioBtn() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.clickRadioBtn();
        softAssert.assertEquals("","","Button should be clickable");
        softAssert.assertAll();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}


