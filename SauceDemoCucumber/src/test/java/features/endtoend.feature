Feature: Test the functionality pf the full website as the customer should interact normally

Scenario: Test the functionality pf the full website as the customer should interact normally
Given user navigates to website url
When user provides correct "standard_user" and "secret_sauce" and clicks login btn
When user clicks on product names then back
When user presses the cart btn
When user press the checkout btn
When user fills all info then presses the continue btn 
When user presses continue
Then order completion Text should appear