Feature: Kullanici sepete bir urun ekler ve sepet simgesi uzerinde

  Background:
    Given Kullanici ana sayfaya gider

  @product
  Scenario: Sepete bir ürün eklenince sepet simegesi üzerindeki sayı bir artsin

    When Kullanici Cookies ile ilgili onayi kabul eder