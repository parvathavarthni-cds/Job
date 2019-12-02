Feature: SD Forms validation through Global Activity
	This Feature Details with the SD Forms function for the DG Adviser
	
	# @RegressionTest @SmokeTest
 	Scenario: Navigate to New Activity side tray
 	Given the user is on hive dashboard screen or portfolio screen
 	When the user clicks the global new activity button from the DashBoard or portfolio screen
 	Then the user should see Request group list
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD Request for new account creation request through global new activity side tray
 	Given the user is on the global new activity side tray
 	When the user selects the 'new account creation' sd from
 	And enters the details for new account creation sd form and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for corporate actions request through global new activity side tray
 	Given the user is on the global new activity side tray
 	When the user selects the 'corporate actions' sd from
 	And enters the details for corporate actions sd form and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for general query request through global new activity side tray
 	Given the user is on the global new activity side tray
 	When the user selects the 'general query' sd from
 	And enters the details for general query request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for add product to apporoved product list request through global new activity side tray
 	Given the user is on the global new activity side tray
 	When the user selects the 'add product to approved product list' sd from
 	And enters the details for add product to approved product list request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Retails superannuation & pension rollover request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Retails superannuation & pension rollover' SD ticket
	And enters the details for Retails superannuation & pension rollover request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Retail Superannuation Insurance request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Retail Superannuation Insurance' SD ticket
	And enters the details for Retail Superannuation Insurance request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
  	Scenario: Create SD request for provide or update a binding nomination request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'provide or update a binding nomination' SD ticket
	And enters the details for provide or update a binding nomination request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Direct debit request for super contributors request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Direct debit request for super contributors' SD ticket
	And enters the details for Direct debit request for super contributors request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Death nomination cancellation & replacement request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Death nomination cancellation & replacement' SD ticket
	And enters the details for Death nomination cancellation & replacement request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Provide Certificate of Incapacity request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Provide Certificate of Incapacity' SD ticket
	And enters the details for Provide Certificate of Incapacity request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Retail Superannuation & Pension query request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Retail Superannuation & Pension query' SD ticket
	And enters the details for Retail Superannuation & Pension query request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Cost bases request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Cost bases' SD ticket
	And enters the details for Cost bases request and submits the sd request
	Then sd request for the above form type should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for set up a nominated bank account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'set up a nominated bank account' SD ticket
	And enters the details for set up a nominated bank account request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for set up a direct debit account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'set up a direct debit account' SD ticket
	And enters the details for set up a direct debit account request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for W_8BEN lodgement request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'W_8BEN lodgement' SD ticket
	And enters the details for W_8BEN lodgement request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Billing updates request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Billing updates' SD ticket
	And enters the details for Billing updates request and submits the sd request
	Then sd request for the above form type should get created
		
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for change account details request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'change account details' SD ticket
	And enters the details for change account details request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for asset transfers request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'asset transfers' SD ticket
	And enters the details for asset transfers request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for close accounts request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'close accounts' SD ticket
	And enters the details for close accounts request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Modify Adviser Details request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Modify Adviser Details' SD ticket
	And enters the details for Modify Adviser Details request and submits the sd request
	Then sd request for the above form type should get created	

	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for trade off-plate managed funds directly with the fund manager request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'trade off-plate managed funds directly with the fund manager' SD ticket
	And enters the details for trade off-plate managed funds directly with the fund manager request and submits the sd request
	Then sd request for the above form type should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for Invest term deposit directly with the bank provider request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Invest term deposit directly with the bank provider' SD ticket
	And enters the details for Invest term deposit directly with the bank provider request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Auto-invest instructions request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Auto-invest instructions' SD ticket
	And enters the details for Auto-invest instructions request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Break an existing term deposit directly with the bank provider request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Break an existing term deposit directly with the bank provider' SD ticket
	And enters the details for Break an existing term deposit directly with the bank provider request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Rollover an existing term deposit directly with the bank provider request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Rollover an existing term deposit directly with the bank provider' SD ticket
	And enters the details for Rollover an existing term deposit directly with the bank provider request and submits the sd request
	Then sd request for the above form type should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for Adviser directly off-platform assets request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Adviser directly off-platform assets' SD ticket
	And enters the details for Adviser directly off-platform assets request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for MWH transaction - managed funds request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'MWH transaction - managed funds' SD ticket
	And enters the details for MWH transaction - managed funds request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Create service desk account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Create service desk account' SD ticket
	And enters the details for Create service desk account request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Deactivate service desk account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Deactivate service desk account' SD ticket
	And enters the details for Deactivate service desk account request and submits the sd request
	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Direct debit (deposit to powerwrap account) request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Direct debit (deposit to powerwrap account)' SD ticket
	And enters the details for Direct debit (deposit to powerwrap account) request and submits the sd request
	Then sd request for the above form type should get created
	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Reconciliations query request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Reconciliations query' SD ticket
	And enters the details for Reconciliations query request and submits the sd request
#	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Reporting errors request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Reporting errors' SD ticket
	And enters the details for Reporting errors request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Payment to a nominated account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Payment to a nominated account' SD ticket
	And enters the details for Payment to a nominated account request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Payment to a non - nominated account request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Payment to a non - nominated account' SD ticket
	And enters the details for Payment to a non - nominated account request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Other payment requests request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Other payment requests' SD ticket
	And enters the details for Other payment requests request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for BPAY payment request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'BPAY payment' SD ticket
	And enters the details for BPAY payment request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for International payment request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'International payment' SD ticket
	And enters the details for International payment request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Setup a regualr payment request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Setup a regualr payment' SD ticket
	And enters the details for Setup a regualr payment request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Retail superannuation and pension withdrawal request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Retail superannuation and pension withdrawal' SD ticket
	And enters the details for Retail superannuation and pension withdrawal request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Notice to receive custodian request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Notice to receive custodian' SD ticket
	And enters the details for Notice to receive custodian request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Transfer from BND to RBC request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'Transfer from BND to RBC' SD ticket
	And enters the details for Transfer from BND to RBC request and submits the sd request
#	Then sd request for the above form type should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for HIVE support request through global new activity side tray
	Given the user is on the global new activity side tray
	When the user selects the 'HIVE support request' SD ticket
	And enters the details for HIVE support request and submits the sd request
#	Then sd request for the above form type should get created

	# @RegressionTest @SmokeTest
 	Scenario: Close multiple tickets under global request list
	Given the user is on global request list dropdown
	When the user clicks on select all checkbox and clicks on "Change to closed" button
	Then sd tickets should changed to "closed" status expect Payments, Direct debit, Hive support, Reports and Reconciliations tickets
