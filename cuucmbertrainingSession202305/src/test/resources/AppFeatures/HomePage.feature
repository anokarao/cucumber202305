Feature: Home page

Scenario: verify the page title
Given Navigate to url 'http://automationexercise.com'
Then page title should be "Automation Exercise"

Scenario: verify the testcases button

When Navigate to url 'http://automationexercise.com'
And user clicks on Test cases button
Then screen should show "Automation Practice Website for UI Testing - Test Cases"

