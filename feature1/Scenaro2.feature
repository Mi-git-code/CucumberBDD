Feature: Fado Produkt

  @t3
  Scenario: eine LampenArt
    Given Ich bin auf dem Website
    And Ich klicke auf die Lampen-Art TISCHLEUCHTEN aus
    When Ich kliche auf TISCHLEUCHTEN mit der Marke FADO
    Then Ich navigiere auf seine Seite
    And Ich lege das Produkt in den Warenkorb
