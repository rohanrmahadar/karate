Feature: Patch API call testing feature

Background:
* header Content-type = 'application/json'
* def jsonObject = 
"""
{
		"name": "sarang",
    "job": "consultant"
}

"""

Scenario: update user using patch call
Given url baseUrl+'/api/users'
And path 2
And request jsonObject
When method PATCH
Then status 200 
And print response
And match $.job == "consultant"