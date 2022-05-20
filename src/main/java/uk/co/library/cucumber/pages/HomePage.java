package uk.co.library.cucumber.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.cucumber.driverfactory.ManageDriver;
import uk.co.library.cucumber.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = " //iframe[@id='gdpr-consent-notice']")
    WebElement gdprIframe;
    @CacheLookup
    @FindBy(xpath = "//span//div//span[contains(text(),'Accept All')]")
    WebElement acceptAllButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearch;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

public void clickOnGdprIframe(){
    switchToIFrame(gdprIframe);
    clickOnElement(acceptAllButton);
    driver.switchTo().defaultContent();
}


    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter job title " + jobTitle + "into job field " + jobTitleField.toString());
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        log.info("Enter location " + location + "into location field " + locationField.toString());
    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Select distance " + distance + "into distance field " + distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearch);
        log.info("click on more search optioin " + moreSearch.toString());
    }

    public void enterMinSalary(String salary) {
        sendTextToElement(salaryMin, salary);
        log.info("Enter Minmum salary " + salary + "into salary field " + salaryMin.toString());
    }

    public void enterMaxSalary(String salary) {
        sendTextToElement(salaryMax, salary);
        log.info("Enter Max salary " + salary + "into salary field " + salaryMax.toString());
    }

    public void selectSalaryType(String sType) {
        sendTextToElement(salaryType, sType);
        log.info("Select salary type " + sType + "into salary field " + salaryType.toString());
    }

    public void selectJobType(String jType) {
        selectByVisibleTextFromDropDown(jobType, jType);
        log.info("Select job type " + jobType + "into job field " + jobType.toString());
    }

    public void clickOnJobsButton() {
        clickOnElement(findJobs);
        log.info("Click on job button " + findJobs.toString());

    }
   public String verifyResultPage(){
        String message = getTextFromElement(resultText);
        log.info("Getting text from elecment " + resultText.getText());
        return message;
   }

}
