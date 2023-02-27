Feature: Kullanici arama yapabilmelidir

  Background
    Given Kullanici verilen internet sayfasina gider

  @teleriksearch
  Scenario Outline:Kullanici arama kutusunda arama yapabilmelidir ve sonucunu gorebilmelidir
    When Kullanici ana sayfaya yonlenir Cookie icin gelen seceneklerden Accept and Close’a tiklar
    And Kullanici ana sayfaya yonlenir ust menu bar dan arama simgesine tiklar
    And Kullanici search box kutusuna <aranacak_kelime> yazar
    And Kullanici arama butonuna tiklar.
    Then Arama sonucu çıkan ilk seçeneigin <aranacak_kelime> barindirdigi Assert edilir
    Examples:
      | aranacak_kelime |
      | "keyword test"  |
      | "data testing"  |