Feature: Element Page Tests

  @Elements @ButtonsPage
  Scenario: Elements - Buttons -  Click Me Butonu Testi
    When DemoQA Ana sayfasinda "Elements" sayfasini ac
    When DemoQA Elements bolumundeki "Buttons" menusunu ac
    When Buttons sayfasinda Click Me buttonuna bas
    Then Gelen mesajin 'You have done a dynamic click' oldugunu kontrol et


  @Elements @WebTablePages
  Scenario: Elements - Web Tables -  Tabloya Yeni Kayit Ekle ve Degistir
    When DemoQA Ana sayfasinda "Elements" sayfasini ac
    And DemoQA Elements bolumundeki "Web Tables" menusunu ac
    When Web Tables sayfasinda "Add" butonuna bas
    And Isim alanini "Arda" olarak doldur
    And Soyisim alanini "Ufan" olarak doldur
    And Yas alanini "22" olarak doldur
    And E-Posta alanini "ufan@arda.com" olarak doldur
    And Gelir alanini "20000" olarak doldur
    And Departman alanini "IT" olarak doldur
    And Web Tables sayfasinda "Submit" butonuna bas
    Then Son girilen kaydi dogrula
    And Wait for 5 seconds
    When Son girilen kaydi editle
    And Isim alanini "Ufan" olarak doldur
    And Soyisim alanini "Arda" olarak doldur
    And Yas alanini "33" olarak doldur
    And E-Posta alanini "arda@ufan.com" olarak doldur
    And Gelir alanini "30000" olarak doldur
    And Departman alanini "QA" olarak doldur
    And Web Tables sayfasinda "Submit" butonuna bas
    Then Son girilen kaydi dogrula