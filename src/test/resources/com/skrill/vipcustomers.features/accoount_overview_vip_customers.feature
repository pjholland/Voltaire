Feature: vip_customers

	Scenario: A VIP customer has logged in successfully and the VIP Members box is displayed
		Given I am on the skrill login page
		When  I enter my details as a "VIP" customer
		Then  I should see the Account Overview page
		Then the vip members box should be displayed