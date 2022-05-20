package uk.co.library.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cucumber.utility.Utility;

public class ResultPage extends Utility {
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String resultPage(){
        return getTextFromElement(resultText);
    }





}
