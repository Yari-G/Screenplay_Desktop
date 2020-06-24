#Author ygonzalezg@choucairtesting.com

  Feature: I as a user want to do arithmetic calculation in the Calculadora desktop application
    Scenario: sum of two numbers
      Given that carlos wants to enter the Calculadora desktop application
      When he enters the numbers to sum
      |numero1|numero2|
      | 5     | 4     |
      Then he verifies the mesage Se muestra 9