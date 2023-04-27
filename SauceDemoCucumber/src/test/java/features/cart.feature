Feature: test the cart functionality
Scenario: test the continue shopping btn
	Given user logs in the website and addts products to cart then press the cartt btn
	When user press the continue shopping btn
	Then user should be navigated to inventory page
Scenario: test the remove product btn
	Given user logs in the website and addts products to cart then press the cartt btn
	When user press the remove product btn
	Then cart count should decrease and the product name should disappear
Scenario: test the checkout  btn
	Given user logs in the website and addts products to cart then press the cartt btn
	When user press the checkout btn
	Then user should be navigated to checkout page
