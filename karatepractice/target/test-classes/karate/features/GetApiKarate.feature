Feature: API call testing feature

Scenario: list of users
Given url baseUrl+'/api/users'
And param page = 2
When method GET
Then def jsonResponse = response
And print jsonResponse.data[0].first_name

Scenario: list of users with query parameters
* def query = {page : 2, id : 7}
Given url baseUrl+'/api/users'
And params query
When method GET
Then print response

Scenario: single user not found
Given url baseUrl+'/api/users'
And path '23'
When method GET
Then status 404



