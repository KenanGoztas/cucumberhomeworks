package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikProductPage {


    public TelerikProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy( xpath = "//button=[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;
    @FindBy(className = "TK-Menu-Item-Link TK-Item--Selected")
    public WebElement pricing;
    @FindBy(xpath = "(//a[@class='Btn Btn--prim4 u-db'][normalize-space()='Buy now'])[2]")
    public WebElement buyNow;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    public WebElement homePage;

    @FindBy(xpath = "//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement counter;




}
