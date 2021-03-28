@tag
Feature: To test the data

  I want to use this template for my feature file
  @tag1
  Scenario Outline: Title of your scenario
    Given User enters the Url "https://opensource-demo.orangehrmlive.com/"
    When User landed on webpage
    Then User enter the "<username>" and "<password>"
    Then User click on submit button
    Then User landed on home page
    Then User close the Browser
    
    Examples:
    |username|password|
    |admin|admin123|
