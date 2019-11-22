Feature: Hive user profile validation 
	This Feature Details with the user profile function for the hive user
	#	@SmokeTest @RegressionTest
	@RegressionTest @SmokeTest
	Scenario: Validate the user activity popup 
	Given adviser is on user profile details screen 
	When the user clicks the details button on the profile details screen 
	Then the user activity details should be shown on the profile details screen 
	
	@RegressionTest @SmokeTest
	Scenario: Validate the change password function with an invalid current password 
	Given adviser is on the change password screen
	When the user enters the invalid current password and clicks the update button 
	Then error message should be shown on the same page 
	
	@RegressionTest @SmokeTest
	Scenario: validate the new password textbox validations 
	Given adviser is on the change password screen 
	When the user enters the three digit password on the new password field 
	Then invalid new password error message should be shown on the same page 
	
#	@RegressionTest @SmokeTest
#	Scenario: validate the change password screen 
#	Given adviser is on the change password screen
#	When the user changes the password 
#	Then success message should be shown on the same page 
#	
#	@RegressionTest @SmokeTest
#	Scenario: validate login with updated password 
#	Given adviser is on login pasge
#	When user log-out from the application and log in again with the new password 
#	Then the user should get successfully prompted to sign in again
	