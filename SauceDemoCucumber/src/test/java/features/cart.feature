Feature: test the cart functionality
Scenario: test the continue shopping btn
	Given user on cart page
	When user press the continue shopping btn
	Then user should be navigated to inventory page
Scenario: test the remove product btn
	Given user on cart page
	When user remove product
	Then cart count should decrease and the product name should disappear
Scenario: test the checkout  btn
	Given user on cart page
	When user presses checkout 
	Then user should be navigated to checkout page
