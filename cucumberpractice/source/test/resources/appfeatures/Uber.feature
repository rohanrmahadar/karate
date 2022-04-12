@All
Feature: Uber booking feature

@Smoke
Scenario: Booking cab sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts journey
And Driver ends journey
Then User pays 10000 Rs

@Smoke @Regression
Scenario: Booking cab suv
Given User wants to select a car type "suv" from uber app
When User selects car "suv" and pick up point "karad" and drop location "Pune"
Then Driver starts journey
And Driver ends journey
Then User pays 10000 Rs

@Prod
Scenario: Booking cab mini
Given User wants to select a car type "mini" from uber app
When User selects car "mini" and pick up point "Pune" and drop location "Mumbai"
Then Driver starts journey
And Driver ends journey
Then User pays 10000 Rs