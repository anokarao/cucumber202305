Feature: Login/signup Page Feature

Background:
Given Navigate to url
And User click on Signup or Login button

Scenario: Login Feature with correct credentials
When user enters Email and Password and Clicks on Login button
|Email|Password|
|anokarao@gmail.com|test123|
Then screen should show "Logged in as Anokar" 

Scenario: Login Feature with incorrect credentials
When user enters Email and Password and Clicks on Login button
|Email|Password|
|anokarao@gmail.com|test12|
Then SigninValidation should show "Your email or password is incorrect!"

Scenario: verify the signup title
When user enter name and email address and clicks on signup button
|Name|Email|
|Anokar|anokarb1996@gmail.com|
Then page title should be "Automation Exercise - Signup"

Scenario: Register user with existing email
Given user enter name and email address and clicks on signup button
|Name|Email|
|Anokar|anokarao@gmail.com|
Then Signupvalidation should show "Email Address already exist!"