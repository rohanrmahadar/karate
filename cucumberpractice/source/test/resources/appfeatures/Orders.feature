Feature: Home Page
				In order to check my order details
				As a registered user 
				I want to specify the features of order details page
				
Background:
 					Given A registred user exists
 					Given User is on amazon login page
 					When User enters username
 					And User enters password
 					And User clicks on login button
 					Then User navigates to order page
				
Scenario: Check previous order details
				When User clicks on Order link
				Then User navigates to order page
				
Scenario: Check Open order details
				When User clicks on open orders link
				Then User navigates to open orders page

Scenario: Check Cancelled order details
				When User clicks on Cancelled orders link
				Then User checks cancelled orders details