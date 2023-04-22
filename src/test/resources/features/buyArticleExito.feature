#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@All
Feature: Validate shopping cart
  As a user of Exito
  I want to access the platform
  To purchase online

  Background: Access to the main platform
    Given that I access the platform of the Exito

  @CaseShoppingCart
  Scenario Outline: Validate items in shopping cart
    When I select the items for purchase
    |<category>|<subcategory>|
    Then Verification of the items in my shopping cart

    Examples:
      | category   | subcategory |
      | Dormitorio | Cabeceros   |