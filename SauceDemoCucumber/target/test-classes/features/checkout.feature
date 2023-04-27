Feature: test the checkout page functionality
Scenario: test the cancel btn
Given user logs to the website and add items to the cart then navigate to cart and presses checkout
When user presses the cancel btn
Then user should be navigated to the cart page


Scenario: test the continue btn

Given user logs to the website and add items to the cart then navigate to cart and presses checkout
When user fills all info then presses the continue btn
Then user should be navigated to the checkout preview page
