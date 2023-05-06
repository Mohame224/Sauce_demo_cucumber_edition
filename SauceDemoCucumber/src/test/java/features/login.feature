#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Test the login finctionality


  Scenario: login with valid credentials
    Given user navigates to website url
    When user provides "standard_user" and "secret_sauce" and clicks login btn
    Then inventory page should appear



  Scenario Outline: login with invalid credentials
    Given user navigates to website url
    When user provides "<username>" and "<password>" and clicks login btn
    Then verify that "<error_message>" appears

    Examples: 
      | username      | password     | error_message  |
      | standard_user |              |Epic sadface: Password is required|
      |               |secret_sauce  |Epic sadface: Username is required|
      |               |              |Epic sadface: Username is required|  
      |hatem          |    bblawy    |Epic sadface: Username and password do not match any user in this service|  

      
        Scenario: check login ui logo
    Given user navigates to website url

    Then logo is displayed
    
        Scenario: check login ui login btb
    Given user navigates to website url

    Then login button is displayed
    
        Scenario: check login ui username
    Given user navigates to website url

    Then username field is displayed
    
    
        Scenario: check login ui password
    Given user navigates to website url

    Then password field is displayed
    
    
 