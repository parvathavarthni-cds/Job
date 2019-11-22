Feature: SD request validation on portfolio level
This Feature Details with the SD request function for the DG Adviser on portfolio level

@RegressionTest @SmokeTest
Scenario: Login into Hive application and navigate to portfolio screen
Given the adviser user is on hive login screen
When user enters the credientials and logs in to the application 
And user selects any Portfolio in the portfolio dropdown
Then user should get navigate to the Portfolio summary screen
 	
@RegressionTest @SmokeTest
Scenario: portfolio Search Validation using portfolio ID
Given user is on portfolio summary screen 'PWL1 test'
When user enters portfolio ID into the search bar
 Then portfolio related to the given ID should be shown on the result page
 	
@RegressionTest @SmokeTest
Scenario: Validate the portoflio list sorting by portfolio name
Given user is on portfolio summary screen 'PWL1 test'
When user clicks the name column from the portfolio dropdown list
Then portfolio list should be sorted by portfolio names

@RegressionTest @SmokeTest
Scenario: Verify the request group in the side tray
Given adviser user is on portfolio summary screen
When user clicks the 'New request' button in the portfolio level
Then user should see the request groups in the side tray

@RegressionTest @SmokeTest
Scenario: create general query at portfolio level
Given user selected the general Query ticket through portfolio level 'New Request' button by keeping the portfolio level request list open
When the user enters details in the sd form fields
And the users submit the sd request
Then the user should see the success message on the side tray
And the user should see the banner on the portfolio request list under portfolio tab

@RegressionTest @SmokeTest
Scenario: Validate the portfolio request search function
Given adviser user is on portfolio summary screen
When user clicks the request tab on the portfolio screen
And user enters any 'Request id' in the Request_ID filter
Then user should see the result based on the entered 'Request id'

@RegressionTest @SmokeTest
Scenario: Validate the reporter dropdown filter at portfolio request
Given the user is on portfolio level request list
When the user selects reporter name as 'Me' from the reporter filter dropdown
Then the user should see the result based on 'Me'

@RegressionTest @SmokeTest
Scenario: Validate the status dropdown filter at portfolio request
Given the user is on portfolio level request list
When the user selects request type as “General query” from the type filter
Then the user should see the result based on the selected type

@RegressionTest @SmokeTest
Scenario: Validate the status dropdown filter at portfolio request
Given the user is on portfolio level request list
When user choose the status as 'Closed' in the status filter
Then the user should see the result based on the 'Closed' status

@RegressionTest @SmokeTest
Scenario: Validate the date picker on portfolio request
Given the user is on portfolio level request list
When the user selects 'today' option in the date picker
Then the user should see all the requests which are created on the current day

@RegressionTest @SmokeTest
Scenario: Validate the custom range selector in date picker global level
Given the user is on portfolio level request list
When the user enters the custom range on 'From' and 'To' text fields
Then the user should see all the requests which are created on the selected range

@RegressionTest @SmokeTest
Scenario: Validate the request count in portfolio request list while user selected the filter
Given the user is on portfolio level request list
And the first 50 request details are displaying on first page
When the user searching for reporter as 'Gunaseelan Palanisamy' and request type as 'General query'
And the user clicks the second page from the pagination
Then the next 50 result related to the selected filters should be displayed on the request list

@RegressionTest @SmokeTest
Scenario: close the sd request from portfolio request
Given the user is on portfolio level request list
When the user selects the open request from request list
And changes the status as ‘closed’
Then banner message should be displayed on the portfolio request list under request tab
And after the page refresh banner should disappear and ticket details should be updated

