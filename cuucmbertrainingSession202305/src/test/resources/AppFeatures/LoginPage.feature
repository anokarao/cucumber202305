Feature: Login Page Feature

Background:
Given Navigate to url 'http://automationexercise.com'
And User click on Signup or Login button

Scenario: Login Feature with correct credentials
When user enters Email and Password
|Email|Password|
|anokarao@gmail.com|test123|
And Clicks on login button
Then screen should show "Logged in as Anokar"


Scenario: Login Feature with incorrect credentials

When user enters Email and Password
|Email|Password|
|anokarao@gmail.com|test12|
And Clicks on login button
Then login validation should show "Your email or password is incorrect!"

Scenario: Logout Feature
When user enters Email and Password
|Email|Password|
|anokarao@gmail.com|test123|
And Clicks on login button
Then screen should show "Logged in as Anokar"
And Click on Logout
And screen should show " Signup / Login"