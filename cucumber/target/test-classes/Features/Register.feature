@all
Feature: User Registration

Background: 
Given User navigate to Register Account Page

@Register @Mandatoryfields @Smoke 
Scenario: Register with Mandatory Fields
When User enters firstname "Murali" into the First Name field
And enters lastname "Dodda" into the last Name field
And enters email address "muraliramakrishnarao@gmail.com" into the Email field
And enters Phone number  "9381047476" into the Phone number field
And enters Password "Murali98" into the Password field
And enters Password "Murali98" into the Password Confirm field
And selects privacy policy field
And Clicks on Continue button
Then Account should get successfully Created

@Register @Allfields @Regression
Scenario: Register with All Fields
When User enters firstname "Murali" into the First Name field
And enters lastname "Dodda" into the last Name field
And enters email address "muraliramakrishnarao@gmail.com" into the Email field
And enters Phone number  "9381047476" into the Phone number field
And enters Password "Murali98" into the Password field
And enters Password "Murali98" into the Password Confirm field
And Selects Yes for Newsletters
And selects privacy policy field
And Clicks on Continue button
Then Account should get successfully Created

@Register @Nodetails @Smoke @Regression
Scenario: Register Without Providing Any Fields
When User dont enter details into any fields 
And Clicks on continue button
Then Warning Messages should be displayed for the Mandatory Fileds

 
@Register @DuplicateEmailfield @Smoke
Scenario: Register with Duplicate Email field
When User enters firstname "Murali" into the First Name field
And enters lastname "Dodda" into the last Name field
And enters email address "muraliramakrishnarao@gmail.com" into the Email field
And enters Phone number  "9381047476" into the Phone number field
And enters Password "Murali98" into the Password field
And enters Password "Murali98" into the Password Confirm field
And Selects Yes for Newsletters
And selects privacy policy field
And Clicks on Continue button
Then Warning msg informing the user about the duplicate email field should be displayeds



