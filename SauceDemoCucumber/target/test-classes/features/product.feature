Feature: test inventory and in item pages
	Scenario: test the A to Z name filter
		Given user navigate to inventory page

		When user clicks on AtoZ filter
		Then products should be sorted by name from A to Z
		
	Scenario: test the Z to A  name filter
		Given user navigate to inventory page

		When user clicks on ZtoA filter
		Then products should be sorted by name from Z to A
		
	Scenario: test the low to high price filter
		Given user navigate to inventory page

		When user clicks on price low to high filter
		Then products should be sorted by price from low to high
				
				
	Scenario: test the high to low price filter
		Given user navigate to inventory page
		When user clicks on price high to low filter
		Then products should be sorted by price from high to low

	Scenario: test the product name click buttons
		Given user navigate to inventory page
		When user clicks on product names then back
		Then user should be navigated to the inventory page

	Scenario: test the add to cart and remove buttons in products
		Given user navigate to inventory page
		When user clicks on add to cart btn then the remove buttons when it appears
		Then cart count increses then decreases

	Scenario: test the inproducts cart buttons
		Given user navigate to inventory page
		When user clicks on a product then clicks on add to cart in the product page
		Then cart count increases