Feature: Kullanici arama yapabilmelidir

  Background
    Given Kullanıcı https://www.telerik.com/support/demos sayfasina gider

  Scenario Outline:Kullanici arama kutusunda arama yapabilmelidir ve sonucunu gorebilmelidir
    Given Kullanici ana sayfaya yonlenir Cookie için gelen seçeneklerden Accept and Close’a tıklar
    And Kullanici ana sayfaya yonlenir üst menü bar dan arama simgesine tıklar
    And Kullanici search box kutusuna "<aranacak_kelime>" yazar.
    And Kullanici arama butonuna tıklar.
    Then Arama sonucu çıkan ilk seçeneğin ilgili kelimeleri barındırdığı Assert edilir.
    And Kullanici sayfayı kapatır.
    Examples:
      | aranacak_kelime |
      | keyword test    |

      | data testing    |