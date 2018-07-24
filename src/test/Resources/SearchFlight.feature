Feature: Search Flight OneWay

  Scenario: Search Flight One way
    Given Open "https://www.cleartrip.com/" url on "chrome" browser
    When Select "RoundTrip" Flight
    And Traveling from "Pune, IN - Lohegaon (PNQ)" to "Bhubaneswar, IN - Biju Patnaik (BBI)"
    And Search Flight for Traveling Date is "Fri, 27 Jul, 2018"
    Then Check the Flight Lists
