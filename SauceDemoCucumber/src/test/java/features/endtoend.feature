Feature: Test the functionality pf the full website as the customer should interact normally

Scenario: Test the functionality pf the full website as the customer should interact normally
Given user navigates to website url
When user provides "standard_user" and "secret_sauce" and clicks login btn
When user clicks on product names then navigates back
When user presses on cart badge
When user presses checkout 
When user fills all info then presses continue
When user continue the purchase
Then order completion Text should appear