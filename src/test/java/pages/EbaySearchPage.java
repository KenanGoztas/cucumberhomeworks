package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbaySearchPage {
    public EbaySearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "gdpr-banner-accept")
    public WebElement cookie;
    @FindBy(xpath = "//button[@id='gdpr-banner-accept']")
    public WebElement acceptAll;

    @FindBy(css = "input#gh-ac")
    public WebElement searchBox;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;
    @FindBy (xpath = "(//div[text()='Windows 10'])[1]")
    public WebElement windows10;

    @FindBy(xpath = "(//span[contains(text(), 'Windows 10')])[4]")
    public WebElement assertWindowsOn;

}
