Feature: Home page
Background: 
Given Navigate to url

Scenario: verify the page title
Then page title should be "Automation Exercise"

Scenario: verify the Signup or Login button
When User click on Signup or Login button
Then page title should be "Automation Exercise - Signup / Login"

Scenario: verify the testcases button
When user clicks on Test cases button
Then page title should be "Automation Practice Website for UI Testing - Test Cases"

Scenario: verify Delete Account button
When User click on Signup or Login button
And user enter name and email address and clicks on signup button
|Name|Email|
|Anokar|testb1996@gmail.com|
When user enters Acc info and clicks on create account button
|Title|Name|Password|DOB|newsLetter|splOffers|FirstName|LastName|Company|Address|Address2|Country|State|City|Zipcode|mobile|
|Mr.|test|test@1234|8-7-1994|Y|Y|test|qa|cap|jharsa|gurgaon|India|Haryana|gurgaon|122003|9876543210|
And page title should be "Automation Exercise - Account Created"
And message should be "ACCOUNT CREATED!" 
And clicks on continue button
Then screen should show "Logged in as test"
Then clicks on Delete Account
Then Delete account message should show "ACCOUNT DELETED!"

#Scenario: Logout Feature
#When user enters Email and Password and Clicks on login button 
#|Email|Password|
#|anokarao@gmail.com|test123|
#Then screen should show "Logged in as Anokar" 
#And Click on Logout
#And menu should show " Signup / Login"