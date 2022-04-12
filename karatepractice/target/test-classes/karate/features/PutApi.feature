Feature: put API call testing feature

Background:
* header Content-type = 'application/json'
* def jsonObject = 
"""
{
		"name": "rohan",
    "job": "professional II"
}

"""

Scenario: update user using put call
Given url baseUrl+'/api/users'
And path 2
And request jsonObject
When method PUT
Then status 200 
And print response
And match $.job == "professional II"