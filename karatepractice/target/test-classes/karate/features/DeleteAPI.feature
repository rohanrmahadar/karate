Feature: Delete API call testing feature

Background:
* header Content-type = 'application/json'

Scenario: Delete user
Given url baseUrl+'/api/users'
And path 2
When method DELETE
Then status 204 

