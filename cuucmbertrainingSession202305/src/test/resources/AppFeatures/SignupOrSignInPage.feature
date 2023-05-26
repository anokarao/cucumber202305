Feature: Login Page Feature

Background:
Given Navigate to url 'http://automationexercise.com'
And User click on Signup or Login button

Scenario: Verify New User Signup! is visible
Then page title should be "Automation Exercise - Signup / Login"

Scenario: verify the signup title
When user enter name and email address
|Name|Email|
|Anokar|anokarao@gmail.com|
And clicks on signup button
Then page title should be "Automation Exercise - Signup"

Scenario: Register user with existing email
Given user enter name and email address
|Name|Email|
|Anokar|anokarao@gmail.com|
And clicks on signup button
When signup validation message should be "Email Address already exist!"

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