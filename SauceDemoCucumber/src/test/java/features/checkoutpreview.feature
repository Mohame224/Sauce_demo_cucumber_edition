Feature: test the checkout preview page functionality
Scenario: test the completion btn
Given user on checkout preview page
When user continue the purchase
Then user should be navigated to order completion page

Scenario: test the cancellation btn

Given user on checkout preview page
When user cancels order
Then user should be navigated to inventory page
