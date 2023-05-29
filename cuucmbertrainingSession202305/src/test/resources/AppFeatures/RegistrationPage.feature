Feature: Registration page

Background:
Given Navigate to url
And User click on Signup or Login button
And user enter name and email address and clicks on signup button
|Name|Email|
|Anokar|anokarb1996@gmail.com|

Scenario: enter Account information
When user enters Acc info and clicks on create account button
|Title|Name|Password|DOB|newsLetter|splOffers|FirstName|LastName|Company|Address|Address2|Country|State|City|Zipcode|mobile|
|Mr.|test|test@1234|8-7-1994|Y|Y|test|qa|cap|jharsa|gurgaon|India|Haryana|gurgaon|122003|9876543210|
And page title should be "Automation Exercise - Account Created"
And message should be "ACCOUNT CREATED!" 
And clicks on continue button
Then screen should show "Logged in as test"
Then clicks on Delete Account
Then Delete account message should show "ACCOUNT DELETED!"









