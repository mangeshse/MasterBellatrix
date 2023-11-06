Feature: Scenarios mentioned in this test the search component for different products

Scenario: Verify search results for falcon
	Given Application is launched completely
	When User searches falcon in search component and get product title
	
Scenario: Verify invalid search product
	Given Application is launched 
	When  User searches invalid in search component
	Then Verify get text
	