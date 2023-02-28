package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EbaySearchPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class EbaySearch {
    WebDriver driver= Driver.getDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    EbaySearchPage ebaySearchPage= new EbaySearchPage();

    @Given("Kullanici ebay sayfasina gider")
    public void kullaniciEbaySayfasinaGider() {
        driver.get("https://www.telerik.com/support/demos");
    }

    @When("Kullanıcı Cookies seçeneğini Accept All seçeneği ile kabul eder.")
    public void kullanıcı_cookies_seçeneğini_accept_all_seçeneği_ile_kabul_eder() {
        //wait.until(ExpectedConditions.invisibilityOf(ebaySearchPage.acceptAll));
        ebaySearchPage.cookie.click();
    }

    @When("Kullanıcı SearchBox kutusuna “computer” kelimesini yazar.")
    public void kullanıcı_search_box_kutusuna_computer_kelimesini_yazar() {
        ebaySearchPage.searchBox.sendKeys("computer");

    }

    @When("Kullanıcı arama butonuna basar.")
    public void kullanıcı_arama_butonuna_basar() {
        ebaySearchPage.submit.click();
    }


    @And("Kullanıcı aşağıdaki resinde bulunan filtre bölmesinden WindowsOn seceneğine tıklar.")
    public void kullanıcıAşağıdakiResindeBulunanFiltreBölmesindenWindowsOnSeceneğineTıklar() {
        ebaySearchPage.windows10.click();
    }


    @Then("Çıkan seçeneklerden en üsteki ürünün WindowsOn özelliği barındırdığı doğrulanır.")
    public void çıkanSeçeneklerdenEnÜstekiÜrününWindowsOnÖzelliğiBarındırdığıDoğrulanır() {

        //Assert.assertEquals("Windows 10", ebaySearchPage.windows10.getText());
        Assert.assertTrue(ebaySearchPage.assertWindowsOn.getText().contains("Windows 10"));

    }
}
