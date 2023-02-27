Feature: Kullanici ebay sitesine gider ve arama kisminda commputer kelimesini doğrular

  Background:
    Given Kullanici ebay sayfasina gider

@search
  Scenario: Kullanici ebay sitesine gidip computer kelimesini arayabilmelidir
    When Kullanıcı Cookies seçeneğini Accept All seçeneği ile kabul eder.
    And Kullanıcı SearchBox kutusuna “computer” kelimesini yazar.
    And Kullanıcı arama butonuna basar.
    And Kullanıcı aşağıdaki resinde bulunan filtre bölmesinden WindowsOn seceneğine tıklar.
    Then Çıkan seçeneklerden en üsteki ürünün WindowsOn özelliği barındırdığı doğrulanır.
    # (Assertion-Validation)