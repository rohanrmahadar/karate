Feature: Amazon search

Scenario: Search a product

Given  I have a search field on amazon
When I search for product with name "Apple macbook pro" and price 100000
When User enters following details
|Rohan|mahadar|rohan@gmail.com|karad|
|Tushar|gursale|tushar@yahoo.com|karad|
|sachin|kusurkar|sachin@hotmail.com|karad|
When User enters following details with columns
|firstname|lastname|email|location|
|Rohan|mahadar|rohan@gmail.com|karad|
|Tushar|gursale|tushar@yahoo.com|karad|
|sachin|kusurkar|sachin@hotmail.com|karad|
Then Product with name "Apple macbook pro" should be displayed

  
		
  
