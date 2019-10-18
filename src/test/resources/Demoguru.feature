@FunctionalTest	
Feature: Checks the customer registration functionality

	Background:
		Given User is on demo guru page
	
	@SmokeTest
  Scenario: Verify that user can able to select the telecom project
   When User clicks the telecom project
   Then User navigates to the telecom page.
	
	@RegressionTest
  Scenario: Verify that user can able to select the add customer in the telecom page
    When User clicks the add customer
    Then User navigates to the add customer page.
   
  @SanityTest
   Scenario: Verify that user can able to enter the customer details in the telecom page
   	When User enters the details with the firstname,lastname,email,address
   	|Divakar|Muthu||divakarganesh21@gmail.com|test|
    |Vishal|Easwar||vishaleaswar14@gmail.com|test|
   	And the user enters the mobile no
   	|7904798321|
    |8939588207|
   	Then the user can able to get the confirmation message.
   	
   	