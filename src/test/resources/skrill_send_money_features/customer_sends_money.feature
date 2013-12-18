Feature: Send money


	Scenario:  Customer successfully sends money
		Given I am on the skrill login page
		And I enter my details as a "Send Money" customer
	    When the customer sends money