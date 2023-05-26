Feature: Registration page

Background:
Given Navigate to url 'http://automationexercise.com'
And User click on Signup or Login button
And user enter name and email address
|Name|Email|
|Anokar|anokarao@gmail.com|
And clicks on signup button


Scenario: Register user
Given user enter name and email address
|Name|Email|
|Anokar|anokarb1996@gmail.com|
And clicks on signup button
When user enters Account information
|Title|Name|Password|DOB|FirstName|LastName|Company|Address|Address2|Country|State|City|Zipcode|mobile|
|Mr.|test|test@1234|08-07-1994|test|qa|cap|jharsa|gurgaon|India|Haryana|gurgaon|122003|9876543210|
And clicks on create account button
And page title should be "Automation Exercise - Account Created"
And message should be "Account Created!" 
And clicks on continue button
Then screen should show "Logged in as Anokar"
Then clicks on Delete Account
Then Delete account message should show "ACCOUNT DELETED!"









