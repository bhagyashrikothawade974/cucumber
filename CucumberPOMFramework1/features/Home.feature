@tag
Feature: To Validate Home page functionality

@tag1
Scenario: To search for flights
Given Open makemytrip website
When Click on flights tab
And Select from and to city
And Click search button
Then Validate available flights on fligh results page