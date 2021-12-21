
@smoke
Feature: To validate the forgot password functionality

Scenario: To validate the forgot password with invalid mobilenumber
Given User should launch the chrome browser and load the facebook url
When User should Click the forgot password link
And  User should type the invalid mobile Number for D Map
							# Without Header - 1D Map -Map<String,String>
							|dhoni|7856754671|
							|raina|8767768733|			
							|vijay|7676738738|
												
And User should click the search button
Then user should navigate to password reset recover page

