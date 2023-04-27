Feature: test the checkout preview page functionality
Scenario: test the completion btn
Given user logs to website then adds products and navigates to cart then presses continue and adds his information then press continue
When user presses continue
Then user should be navigated to order completion page

Scenario: test the cancellation btn

Given user logs to website then adds products and navigates to cart then presses continue and adds his information then press continue
When user presses cancel
Then user should be navigated to inventory page
