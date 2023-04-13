package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;
import utils.TestUtils;

public class JobPage extends WebTestBase {

    @FindBy(xpath = "//input[@placeholder='Enter skills / designations / companies']")
    WebElement enterSkills;

    @FindBy (id = "expereinceDD")
    WebElement enterExperience;

    @FindBy (xpath = "//span[text()='1 year']")
    WebElement oneYear;

    @FindBy(xpath = "//input[@placeholder='Enter location']")
    WebElement enterLocation;

    @FindBy(xpath = "//div[text()='Search']")
    WebElement clickSearch;

    @FindBy (xpath = "//div[@title='Chennai']")
    WebElement selectChennai;


    public JobPage() { PageFactory.initElements(driver,this); }

    public void searchBox(String skills,String location) {
        enterSkills.sendKeys(skills);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterExperience.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oneYear.click();
        enterLocation.sendKeys(location);
        selectChennai.click();
        clickSearch.click();
    }
}