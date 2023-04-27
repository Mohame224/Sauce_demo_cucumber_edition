Feature: test the order completion page functionality

Scenario: test the bacl btn
Given user logs in to the website and add products to cart then proceeds to check out and fills his info then presses continue then continue
When user presses the back btn
Then user navigates to inventory page and cart number disappears