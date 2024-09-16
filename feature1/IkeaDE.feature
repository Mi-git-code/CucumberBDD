#@t4
Feature: IKEA DE

  @t2
  Scenario: eine Kategorie auswahlen
    Given Ich bin auf dem deutschen IKEA Website
    And Ich bestätige Cookie
    When Ich klicke auf der Kategorie PRODUKTE
    And Ich klicke auf das Produkt BELEUCHTUNG aus
    And ich klicke auf eine Beleuchtungsart LAMPEN&LEUCHTEN
    Then Ich navigiere auf der nächsten Seite: LAMPEN&LEUCHTEN

 
