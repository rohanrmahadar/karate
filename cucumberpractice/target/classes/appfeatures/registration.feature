Feature: registration feature

Scenario: Multiple User Registration 
Given user is on registration page
When user enters following details
|rohan|mahadar|rpa|8177892575|karad|
|manjushri|mahadar|SAP|987654321|karad|
|abc|xyz|pqr|123456789|karad|

Then user details are stored successfully
