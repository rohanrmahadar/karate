Feature: post API call testing feature

Background:
* header Content-type = 'application/json'
* def requestPayload = read('../data/request.json')

Scenario: list of users
Given url baseUrl+'/api/users'
And request requestPayload
When method POST
Then status 201 
And print response