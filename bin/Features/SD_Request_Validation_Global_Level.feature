Feature: SD request validation on global level
	This Feature Details with the SD request function for the DG Adviser on global level
	
@RegressionTest @SmokeTest
Scenario: Login into Hive application
Given adviser user is on hive login screen
When the user enters the username and password
Then application should be navigates to the Adviser Dashboard

@RegressionTest @SmokeTest
Scenario: Verify the SD request side tray
Given adviser user is on Dashboard request view
When user clicks the New request button from the global header
Then side tray should open and user should see the SD form groups

@RegressionTest @SmokeTest
Scenario: validate the most used section in the request Side tray - Payments
Given user is on request side tray by clicking the global 'New Request' button
When user clicks on the 'payments' button in the most used section
Then Payment related SD tickets should be visible on the screen

@RegressionTest @SmokeTest
Scenario: validate the most used section in request Side tray - Report an issue
Given user is on request side tray by clicking the global 'New Request' button
When user clicks on the 'Report an issue' button in the most used section
Then Queries related SD tickets should be visible on the screen

@RegressionTest @SmokeTest
Scenario: validate the most used section in request Side tray - Support Request
Given user is on request side tray by clicking the global 'New Request' button
When user clicks on the 'Support Request' button in the most used section
Then Hive support request form should open on the side tray

@RegressionTest @SmokeTest
Scenario: Validate the SD request search
Given user is on Hive Dashboard screen
When user clicks the global request dropdown
And Enter SD request id on Request search box
Then result should be displayed based on the given request id

@RegressionTest @SmokeTest
Scenario: Validate the Portfolio search function
Given user is on global SD request list view
When user enters portfolio name as ‘PWL1 Test’ into the portfolio search box
Then result should be displayed based on the given portfolio name

@RegressionTest @SmokeTest
Scenario: Validate the reporter dropdown filter at Global request
Given user is on global SD request list view
When user selects reporter name as “Gunaseelan Palanisamy” from the reporter filter dropdown
Then result should be displayed based on the selected reporter name

@RegressionTest @SmokeTest
Scenario: Validate the type dropdown filter at Global request
Given user is on global SD request list view
When user selects request type as “General query” from the type filter dropdown
Then result should be displayed based on the selected request type

@RegressionTest @SmokeTest
Scenario: Validate the status dropdown filter at global request
Given user is on global SD request list view
When user choose the status as “Open” from the status filter dropdown
Then result should be displayed based on the selected status type

@RegressionTest @SmokeTest
Scenario: create general query at global level
Given user selected the general Query ticket through global 'New Request' button by keeping the global request list open
When user enters details in the sd form fields
And submit the sd request
Then success message should be displayed on the side tray
And Banner should be displayed on the global request list

@RegressionTest @SmokeTest
Scenario: Validate the date picker on global request
Given user is on global SD request list view
When user selects the today option from the date picker
Then all the requests which are created at current day should be displayed on the request table

@RegressionTest @SmokeTest
Scenario: Validate the custom range selector in date picker global level
Given user is on global SD request list view
When user enters the custom range on ‘From’ and ‘To’ text fields
Then requests which are created between those From and To dates should be displayed on the request table

@RegressionTest @SmokeTest
Scenario: Validate the request count in global request list while user selected the filter
Given user is on global SD request list view
And first 50 request details are displaying on first page
When user searching for portfolio as “PWl1 Test”, reporter as “me” and SD type as “General Query”
And user clicks the second page from pagination
Then next 50 result related to the selected filters should be displayed on the request list

@RegressionTest @SmokeTest 
Scenario: Validate the attachment option
Given user selected one SD form from the global request list
When the user adds the attachment for the opened SD request
And clicks on the 'post' button
Then attachment link should be dispalyed on the attachment section

@RegressionTest @SmokeTest
Scenario: Validate the comment section
Given user selected one SD form from the global request list
When the user types some message in 'write a message' textbox
And clicks on the 'post' button
Then the added message should be shown under the comments section

@RegressionTest @SmokeTest
Scenario: Validate SD ticket creation and share with organization feature
Given user selected the general Query ticket through global 'New Request' button by keeping the global request list open
When user enters details in the sd form fields
And selects the 'share with organization' option and submits the request
Then success message should be displayed on the side tray

@RegressionTest @SmokeTest
Scenario: Validate SD ticket creation and share with specific people feature
Given user selected the general Query ticket through global 'New Request' button by keeping the global request list open
When user enters details in the sd form fields
And selects the 'share with specific people' option and submits the request
Then success message should be displayed on the side tray

@RegressionTest @SmokeTest
Scenario: close the sd request from global request dropdown
Given user is on global SD request list view
When user selects the checkbox for one open request
And selects the 'change to close' button
Then Banner should be displayed on the global request list view
 
