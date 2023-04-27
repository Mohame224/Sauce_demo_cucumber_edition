Feature: Test side menu
Scenario: press logout from sidebar
	Given users navigates to website and logs in
	When user presses on side menu
	And user presses on logout
	Then url navigates to loginpage
	
Scenario: press about from sidebar
	Given users navigates to website and logs in
		When user presses on side menu
	And user presses on about
	Then url navigates to about page

Scenario: press all items from sidebar
	Given users navigates to website and logs in
		When user presses on side menu
	And user presses on all items
	Then url navigates to inventory page

Scenario: press reset app state from sidebar
	Given users navigates to website and logs in
		When user presses on side menu
	And press reset app state from sidebar
	Then cart number turns to 0


Scenario: check UI menu side bar
	Given users navigates to website and logs in
	Then check sidebar UI
	
	Scenario: check UI about
	Given users navigates to website and logs in
		When user presses on side menu

	Then check about link
	
	
	Scenario: check UI logout
	Given users navigates to website and logs in
		When user presses on side menu

	Then check logout link
	
	
	Scenario: check UI all items
	Given users navigates to website and logs in
		When user presses on side menu

	Then check all items link
	
	
	Scenario: check UI reset app state
	Given users navigates to website and logs in
		When user presses on side menu

	Then check reset app state link