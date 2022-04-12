Feature: login feature

Scenario Outline: Login fail- possible conditions
Given user is on login page
When user clicks on signin page 
Then user is displayed login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password field
And user clicks on login button
Then user gets login failed error message

Examples:
|UserName|Password|
|incorrectusername|12345|
|rohan|incorrectpassword|
|incorrectusername|incorrectpassword|