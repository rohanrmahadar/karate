Feature: Post API call data driven testing feature 

Scenario Outline: create users
Given url baseUrl+'/api/users'
And request {"name": <name>,"job": <job>}
When method POST
Then status 201 
And print response

Examples:
|read('../data/inputdata.csv')|
