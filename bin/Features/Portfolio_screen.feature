Feature: DG Adviser Portfolio screen Validation
	This Feature Details with the Investor Portfolio screen function for the DG Adviser
#	@SmokeTest @RegressionTest
	@RegressionTest @SmokeTest
 	Scenario: Validate the Portfolio Dropdwon
  	Given user enters the username and password into login screen
 	When the user clicks the portfolio dropdown from DashBoard
 	Then portfolio details are shown on the DashBoard page
 	
 	@RegressionTest @SmokeTest
 	Scenario: Validate the Portfolio summary screen Values
 	Given user is on adviser dashboard screen
 	When user selects any portfolio from portfolio dropdown
 	Then selected portfolio name and asset details should be display on portfolio summary screen

 	@RegressionTest @SmokeTest
 	Scenario: Validate the Portfolio Valuation screen
 	Given user is on portfolio summary screen
 	When user get the netvalue date from valuvation screen
 	Then date should be matched with datepicker current selected date
 	
# 	API handler
	@RegressionTest @SmokeTest
 	Scenario: Validate the portfolio net value from PW service API
 	Given user is on portfolio summary screen
 	When user gets the portfolio net value from Preamium API
 	Then compare the API value with portfolio net value
 	
 	@RegressionTest @SmokeTest
	Scenario: Validate the date picker result
	Given user is on portfolio summary screen
	When user selects the any previous business date from date picker from investor valuation screen
	Then the data related to the selected date should be displayed on the same screen and message on toaster should shown
	
	@RegressionTest @SmokeTest
	Scenario: Validate the date picker results for Movements
	Given user is on portfolio transactions screen
	When user selects 'From Date' and 'To Date' in portfolio transactions screen
	Then selected date should be display on the datepicker fields

	@RegressionTest @SmokeTest
	Scenario: Validate the date picker result for Cashbook
	Given user is on portfolio cash screen
	When user selects 'From Date' and 'To Date' in portfolio cash screen
	Then selected date should be display on the datepicker fields
 	
 	@RegressionTest @SmokeTest
 	Scenario: Validate the previously selectd investor tab
 	Given adviser left portfolio tab open in the previous session
 	When the user logs in to hive application again
 	Then previously opened portfolio should be shown on the user
 	
 	