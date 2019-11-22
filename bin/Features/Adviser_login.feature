Feature: DG Login Screen validation
	This Feature Details with the login function for the PW users
#	@SmokeTest @RegressionTest
	
	@RegressionTest @SmokeTest
	Scenario: validate enabling and disabling the TFA page on dg admin screen
	Given DG admin user is on admin settings page
	When user changes the otp settings to 'each and every login'
	Then OTP screen should be display for every login
	
	@RegressionTest @SmokeTest
	Scenario: Validate Invalid Username
	Given adviser is on the hive login page
	When the user enters the wrong username and valid password
	Then user should get the error message for the wrong username and password

	@RegressionTest @SmokeTest
	Scenario: validate the invalid password
	Given adviser is on the hive login page
	When the user enters the valid username and invalid password
	Then user should get the error message for the wrong username and password

	@RegressionTest @SmokeTest
	Scenario: Validate multiple login failure
	Given adviser is on the hive login page
	When the user enters wrong login credentials for the fifth time
	Then Error message should on the login page and user account should get blocked
	
	@RegressionTest @SmokeTest
	Scenario: Validate Forgot password screen
	Given adviser is on forgot password screen
	When the user enters the email id and clicks the send instructions to my email button
	Then email request triggered and status updated on user table in the database
	
	@RegressionTest @SmokeTest
  	Scenario: Validate the TFA screen
	Given adviser is on the hive login page
	When the user logs in with the valid username and password
	Then TFA device selection screen should ask the user to select the Email or SMS shown on the screen
	
	@RegressionTest @SmokeTest
	Scenario: Validate the TFA code by the email
	Given adviser is on TFA screen
	When the user selects the Email option
	Then TFA code should be sent to that user email account
	
	@RegressionTest @SmokeTest
	Scenario: Validate the TFA code by the mobile
	Given adviser is on TFA screen
	When the user selects the change device button and chooses mobile option
	Then TFA code should be sent to that user mobile number
	
	@RegressionTest @SmokeTest
	Scenario: Validate invalid TFA code
	Given adviser is on TFA screen
	When the user enters the invalid code
	Then error message shown on the same page
	
	@RegressionTest @SmokeTest
	Scenario: Validate TFA screen
	Given adviser is on TFA screen
	When the user enters the valid code
	Then user successfully login and navigates to the hive application
  