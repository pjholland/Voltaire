Feature: vip_customers

	@in_progress
	Scenario: A VIP customer has logged in successfully and the VIP Members box is displayed
		Given I am on the skrill login page
		When  I enter my details as a "VIP" customer
		Then the vip members box should be displayed