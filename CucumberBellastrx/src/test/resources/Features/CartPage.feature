Feature: Check the cart page content
Scenario: Verify cart page
   Given Launch cart page url 
   When Click on cart tab
   Then Verify empty card text
   
Scenario: Verify empty cart page text
   Given Launch cart page url1 
   When Click on return to shop button
   Then Verify all product
   