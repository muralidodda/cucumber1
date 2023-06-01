@all
Feature: Feature to test Amazon Search Functionality
				Searching of various categories should be possible along with product search


Background:
Given I visit the website as Guest user


@SmokeTest
Scenario: Search for the products under Books category
Using Search functionality, User should be able to search for books

When I select the books option from the dropdown
And I click on Search Icon button
Then I should see the Books page loaded
And I should see Books at Amazon as heading

@SmokeTest
Scenario: Search for the products under Baby category
Using Search functionality, User should be able to search for Baby products

When I select the 'Baby' option from the dropdown
And I click on Search Icon button
Then I should see the Baby page loaded
And I should see 'The Baby Store at Amazon'as heading


Scenario: Search for the products under Computers&Accessories  category
Using Search functionality, User should be able to search for Computers&Accessories

When I select the 'Computers&Accessories' option from the dropdown
And I click on Search Icon button
Then I should see the Computers page loaded
And I should see 'Computers&Accessories' as heading

Scenario: Search for the products under Clothing&Accessories category
Using Search functionality, User should be able to search for Clothing&Accessories 

When I select the 'Clothing&Accessories'option from the dropdown
And I click on Search Icon button
Then I should see the Clothing page loaded
And I should see 'Clothing&Accessories' as heading