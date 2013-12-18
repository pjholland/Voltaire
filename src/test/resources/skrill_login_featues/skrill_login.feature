@skrill
Feature: as a user i want to log in to the Skrill website

	@current
	Scenario: I log onto skrill
		Given I am on the skrill login page
		And I enter my details as a "Send Money" customer
		And I click the submit button
		Then  I should see the Account Overview page
		And all the elements of the page should be visible
		#And the user logs out

