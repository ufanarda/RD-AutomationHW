Feature: Element Page Tests

  @Elements @ButtonsPage
  Scenario: Elements - Buttons -  Click Me Butonu Testi
    When DemoQA Ana sayfasinda "Elements" sayfasini ac
    And DemoQA Elements bolumundeki "Buttons" menusunu ac
    And Buttons sayfasinda Click Me buttonnuna bas
    Then Gelen mesajin 'You have done a dynamic click' oldugunu kontrol et