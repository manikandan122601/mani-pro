Feature: To validate the login functionality of facebook page
Background:
Given User should launch the chrome browser and load facebook page

Scenario: Validate the login page with invalid username and invalid password
When User should type type the username in the facebook page
And I need to print the title of my page
And User should type the Passward in the facebook page
				# without Header - 2D List
				|674574357734|756459435890|75745745383|8754534857783|
				|754343289473|897638943739|78687834583|7638738756437|
				|893564354545|987435753446|98743548577|8765474357643|

And User should click the login button
Then User should navigate to incorrect credential page

Scenario Outline: Validate the login page with valid username and invalid password

When User should type type the username "<user>" in the facebook page
And I need to print the title of my page
And User should type the passward in the facebook page "<pass>"
And User should click the login button
Then User should navigate to incorrect credential page

Examples: 

         |user|pass|
         |java|java@123|
        
