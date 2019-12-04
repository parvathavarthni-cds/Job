Feature: ADD Sell order side tray validation 
	#This feature will validate the Add sell order side tray functionalities

	# @RegressionTest @SmokeTest 
	Scenario: Validate the Place an order button on PV Screen for the portfolios which is up-to-date 
	Given user is on Hive DashBoard screen 
	When user selects any portfolio from portfolio dropdown which is up-to-date 
	Then page should be navigated to selected Portfolio summary screen and ‘Place an Order’ button should be enabled on PV screen 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the Place order side tray 
	Given user is on Portfolio screen 
	When the user clicks the ‘Place an order’ button 
	Then place order side tray should open 
	And place order, portfolio dropdown should be pre-populated the selected portfolio tab 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the search portfolio from side tray 
	Given user is on place an order side tray 
	When user clicks the portfolio dropdown in `place an order` side tray 
	Then user should be able to search different portfolios from the portfolio dropdown 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the sell order screen 
	Given user is on place an order side tray 
	When the user clicks the sell order button 
	Then ‘Add a sell order’ extended side tray should be display 
	
	# Validate sell Extended Side tray
	# @RegressionTest @SmokeTest
	Scenario: Validate the cancel button in extended side tray 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user clicks the cancel button from the extended side tray 
	Then extended side tray should be closed and the user should navigate back to place order side tray 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the portfolio holding searchbox 
	Given user is on ‘Add a sell order’ extended side tray 
	When user search for any portfolio holding using the searchbox 
	Then user should get the result based on the search keyword and select the portfolio_holding 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the exit price 
	Given user is on ‘Add a sell order’ extended side tray 
	When user finds the availble exit price of that portfolio holding on extended side tray 
	Then available exit price for that unit should be displayed with est.label
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the Order amount field on add sell order screen 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user clicks anywhere in the screen without entering anything on the order amount field 
	Then error message should be displayed under the order amount screen 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the order amount field validation 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user enters the Special character and text values in the order amount text box 
	Then user should not be allowed to enter the special character and text values into the order amount field 

	# @RegressionTest @SmokeTest
	Scenario: Validate the add button on the ‘add a sell order button’ 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user didn’t enter/select anything on the screen 
	Then ‘Add’ button should be in disable mode 
	
	# @RegressionTest @SmokeTest
	Scenario: validate the maximum order amount 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user enters more than available units 
	Then error message should be displayed under the order amount text box 
	
	# @RegressionTest @SmokeTest
	Scenario: validate order amount and available units are the same 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user enter the enters the order amount which is equal to available units 
	Then user should get the 'Full redemption' message under the order value text box 

#	Scenario: validate the Minimum order amount
#	Given user is on ‘Add a sell order’ extended side tray
#	When the order value is less than the transaction fee
#	Then user should not allow placing the order and error message should be displayed on the screen and +add or update button should be disabled
#	
	# @RegressionTest @SmokeTest
	Scenario: Validate the order value calculation 
	Given user is on ‘Add a sell order’ extended side tray 
	When the user enters the order units 
	Then order units should be multiplied with the exit price and the result should be subtracted with a transaction fee 
	And Final calculated value should be displayed as order value est with 2 decimal places 
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the Advice given ’No’ radio button
	Given user is on ‘Add a sell order’ extended side tray 
	When user select the ’No’ option
	Then 'Advice given' details should not be displayed
	
	# @RegressionTest @SmokeTest
	Scenario: validate the Advice given ‘Yes’ radio button
	Given user is on ‘Add a sell order’ extended side tray 
	When user select the ’Yes’ option
	Then advice reason, date, summary and advice method fields should be display under the advice given label
	And Date field should have todays's field as default
	And add button should be enabled
	
	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the disclaimer footer message
#	Given user is on ‘Add a sell order’ extended side tray 
#	When the user selects the disclaimer footer message checkbox along with complete all the mandatory fields
#	Then add button should be enabled
#	
	# @RegressionTest @SmokeTest
	Scenario: Validate the draft order page
	Given user is on ‘Add a sell order’ extended side tray 
	When the user clicks the add button from Add a sell order extended side tray
	Then order should be saved as draft order and should be displayed on the place order screen
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the draft order
	Given user is on the draft order screen
	When user click the available draft order
	Then add sell order extended side tray should open and user should be able to edit the order

	# @RegressionTest @SmokeTest
	Scenario: validate the edit order
	Given user is on the edit order screen
	When user changes the different asset or order value
	And click the update button
	Then updated new changes should be displayed in the draft order screen
	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the multiple orders
#	Given user is on the draft order screen
#	When the user clicks the sell button and places the another order
#	Then newly placed order should be displayed under the previous order on the draft order screen
	
	# @RegressionTest @SmokeTest
	Scenario: validate the close order button
	Given user is on the draft order screen
	When user clicks the close button for any draft order card
	Then confirmation pop-up message should be displayed on the screen
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the Go back button on the confirmation popup
	Given user is can able to view the confirmation pop-up for close order
	When the user clicks the Go back button
	Then that order should not be closed and order should be displayed on the draft order screen
	
	# @RegressionTest @SmokeTest
	Scenario: Validate the cancel order button on the confirmation popup
	Given user is can able to view the confirmation popup for close order
	When the user clicks the cancel order button
	Then that particular order should be get disappear from the draft order screen
    
#Preview Order screen scenarios
#
#	# @RegressionTest @SmokeTest
#	Scenario: validate the preview screen
#	Given user is on the draft order screen
#	When the user clicks the preview button from the draft order screen
#	Then User should navigate to the preview order screen
#	And transaction summary value on preview order screen and addition of draft orders value should be same
#	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the Preview order screen
#	Given user is on the preview order screen
#	When the user finds before and after portfolio impact of the available units
#	Then available units should be reduced based on the order units for that Asset type
#	And Asset name and asset code should be displayed under the before and after impacts of Units
#	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the back button on preview order screen
#	Given user is on the preview order screen
#	When user clicks the back button
#	Then User should be navigated to the order draft screen
#	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the Confirm order button
#	Given user is on the draft order screen
#	When the user clicks the preview button from the draft order screen
#	And the user didn’t select the disclaimer checkbox
#	Then Confirm order button should be in disable mode
#	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the disclaimer acknowledgement pop-up
#	Given user is on the preview order screen
#	When user clicks the disclaimer link from the preview order screen footer
#	Then Disclaimer popup should be display
#	
#	# @RegressionTest @SmokeTest
#	Scenario: validate the disclaimer checkbox
#	Given user is on the preview order screen
#	When  User selects the disclaimer checkbox
#	Then  Order Confirm button should be enabled
#	
#	# @RegressionTest @SmokeTest
#	Scenario: Validate the order confirmation button
#	Given  user is on the preview order screen
#	When  User click the order confirm button after selecting all the mandatory fields
#	Then  Order should be submitted
#	And  unique reference number should be generated for each order on order confirmation screen
#	
