Feature: Login Functionality

Scenario: Login functionality with Valid Credentials
Given User Navigates to Login Page
When User enter the following details
			|muralirkrao@gmail.com |12345    |
			|rkrao@gmail.com |123456789|

And clicks on Login button
Then User should get login Scuccessfully 