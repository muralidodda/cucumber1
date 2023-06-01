Feature: Login Functionality

Background: 
Given User navigates to Login Page

Scenario Outline: Login functionality with Valid Credentials
When Enter Valid Username <Username>
And Enter Valid Password <Password>
And clcik on Login button
Then User should login Scuccessfully 

Examples:
|Username								 |Password |
|mrkrao@gmail.com |12345    |
|dmrkrao@gmail.com |123456789|

Scenario: Login functionality Invalid Credentials
When Enter Invalid Username "mkrao@gmail.com"
And Enter Invalid Password "123456"
And clcik on Login button
Then User should displayed warning  msg

Scenario: Login functionality Valid Usernmae and Invalid Password
When Enter valid Username "mrkrao@gmail.com"
And Enter Invalid Password "123367"
And clcik on Login button
Then User should displayed warning  msg

Scenario: Login functionality InValid Usernmae and Valid Password
When Enter Invalid Username "mrk@gmail.com"
And Enter valid Password "12345"
And clcik on Login button
Then User should displayed warning  msg

Scenario: Login functionality without providing any Credentials
When User dont entered any credentials
And clcik on Login button
Then User should displayed warning  msg