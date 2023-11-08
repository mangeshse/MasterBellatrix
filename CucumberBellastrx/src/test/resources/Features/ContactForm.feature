Feature: Scenarios mentioned in this test check different contact details

Scenario:verify valid credential in contact form
	Given Launched application 1
	When Enter all valid details
	Then  Contact Form should  get submitted
	And Verify submitted get text message 
	
Scenario:verify invalid credential in contact form
	Given Launched application 2
	When Enter all invalid details
	Then Contact Form should not get submitted 
	And verify error text message
	
Scenario:verify blank contact form
	Given Launched application 3
	When  click on submit button 
	Then  verify error text message
	
Scenario: verify contact page should not accept invalid  email id 
    Given Launched application 5
    When Enter invalid email id in the email field 
    Then Contact Form should not get submitted 
    And verify error text message