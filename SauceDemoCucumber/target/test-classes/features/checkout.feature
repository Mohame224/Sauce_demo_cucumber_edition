Feature: test the checkout page functionality
Scenario: test the cancel btn
Given user navigate to checkout with items in cart
When user cancel order
Then user should be navigated to the cart page


Scenario: test the continue btn

Given user navigate to checkout with items in cart
When user fills all info then presses continue
Then user should be navigated to the checkout preview page
