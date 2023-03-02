Feature: Kullanici sepete bir urun ekler ve sepet simgesi uzerinde
  bu urun sayisindaki artisi gorur

  Background:
    Given Kullanici ana sayfaya gider

  @product
  Scenario: Sepete bir ürün eklenince sepet simegesi üzerindeki sayı bir artsin

    When Kullanici Cookies ile ilgili onayi kabul eder
    And Kullanici ust menu bardan Pricing linkine tiklar
    And Kullanici bir paketi buy now butonu ile sepete ekler
    And Kullanici ana sayfaya tekrar geri gider
    Then  Kullanici sepet simgesi uzerindeki rakami dogrular
