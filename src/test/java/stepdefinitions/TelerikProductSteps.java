package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TelerikProductPage;
import utilities.Driver;

import java.time.Duration;

public class TelerikProductSteps {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    TelerikProductPage telerikProductPage = new TelerikProductPage();
    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
Driver.getDriver().get("http://www.telerik.com");
    }
    @When("Kullanici Cookies ile ilgili onayi kabul eder")
    public void kullanici_cookies_ile_ilgili_onayi_kabul_eder() {
        //telerikProductPage.cookie.click();
        System.out.println("burayı atla");
    }
    @When("Kullanici ust menu bardan Pricing linkine tiklar")
    public void kullanici_ust_menu_bardan_pricing_linkine_tiklar() {
        telerikProductPage.pricing.click();
    }
    @When("Kullanici bir paketi buy now butonu ile sepete ekler")
    public void kullanici_bir_paketi_buy_now_butonu_ile_sepete_ekler() {
        telerikProductPage.buyNow.click();
    }
    @When("Kullanici ana sayfaya tekrar geri gider")
    public void kullanici_ana_sayfaya_tekrar_geri_gider() {
        telerikProductPage.homePage.click();
    }
    @Then("Kullanici sepet simgesi uzerindeki rakami dogrular")
    public void kullanici_sepet_simgesi_uzerindeki_rakami_dogrular() {
        String expected = "1";
        Assert.assertEquals(expected, telerikProductPage.counter.getText());
    }
}
