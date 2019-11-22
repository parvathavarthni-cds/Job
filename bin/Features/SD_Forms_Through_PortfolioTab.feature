Feature: SD Forms validation through Portfolio Tab
	This Feature Details with the SD Forms function for the DG Adviser

	# @RegressionTest @SmokeTest
 	Scenario: Navigate to New Activity side tray
 	Given the user is on Investor portfolio tab
 	When the user clicks the new activity button inside the portfolio tab
 	Then the user should see Request group list under portfolio new activity side tray
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD Request for new account creation request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
 	When the user selects 'new account creation' sd from
 	And enters the details for new account creation sd form and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for corporate actions request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
 	When the user selects 'corporate actions' sd from
 	And enters the details for corporate actions sd form and submits it through portfolio new activity side tray
	Then sd request for the above form should get created

	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for general query request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
 	When the user selects 'general query' sd from
 	And enters the details for general query request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for add product to apporoved product list request through New Activity side tray from Portfolio Taby
 	Given the user is on New activity side tray
 	When the user selects 'add product to approved product list' sd from
 	And enters the details for add product to approved product list request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Retails superannuation & pension rollover request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Retails superannuation & pension rollover' SD ticket
	And enters the details for Retails superannuation & pension rollover request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Retail Superannuation Insurance request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Retail Superannuation Insurance' SD ticket
	And enters the details for Retail Superannuation Insurance request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
  	Scenario: Create SD request for provide or update a binding nomination request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'provide or update a binding nomination' SD ticket
	And enters the details for provide or update a binding nomination request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Direct debit request for super contributors request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Direct debit request for super contributors' SD ticket
	And enters the details for Direct debit request for super contributors request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Death nomination cancellation & replacement request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Death nomination cancellation & replacement' SD ticket
	And enters the details for Death nomination cancellation & replacement request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Provide Certificate of Incapacity request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Provide Certificate of Incapacity' SD ticket
	And enters the details for Provide Certificate of Incapacity request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Retail Superannuation & Pension query request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Retail Superannuation & Pension query' SD ticket
	And enters the details for Retail Superannuation & Pension query request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Create service desk account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Create service desk account' SD ticket
	And enters the details for Create service desk account request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Deactivate service desk account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Deactivate service desk account' SD ticket
	And enters the details for Deactivate service desk account request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for Billing updates request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Billing updates' SD ticket
	And enters the details for Billing updates request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for change account details request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'change account details' SD ticket
	And enters the details for change account details request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for asset transfers request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'asset transfers' SD ticket
	And enters the details for asset transfers request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for close accounts request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'close accounts' SD ticket
	And enters the details for close accounts request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created	
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Cost bases request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Cost bases' SD ticket
	And enters the details for Cost bases request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for set up a nominated bank account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'set up a nominated bank account' SD ticket
	And enters the details for set up a nominated bank account request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for set up a direct debit account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'set up a direct debit account' SD ticket
	And enters the details for set up a direct debit account request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for W_8BEN lodgement request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'W_8BEN lodgement' SD ticket
	And enters the details for W_8BEN lodgement request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Modify Adviser Details request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Modify Adviser Details' SD ticket
	And enters the details for Modify Adviser Details request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
 	Scenario: Create SD request for trade off-plate managed funds directly with the fund manager request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'trade off-plate managed funds directly with the fund manager' SD ticket
	And enters the details for trade off-plate managed funds directly with the fund manager request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created	
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for Invest term deposit directly with the bank provider request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Invest term deposit directly with the bank provider' SD ticket
	And enters the details for Invest term deposit directly with the bank provider request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Auto-invest instructions request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Auto-invest instructions' SD ticket
	And enters the details for Auto-invest instructions request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Break an existing term deposit directly with the bank provider request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Break an existing term deposit directly with the bank provider' SD ticket
	And enters the details for Break an existing term deposit directly with the bank provider request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Rollover an existing term deposit directly with the bank provider request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Rollover an existing term deposit directly with the bank provider' SD ticket
	And enters the details for Rollover an existing term deposit directly with the bank provider request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest	
 	Scenario: Create SD request for Adviser directly off-platform assets request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Adviser directly off-platform assets' SD ticket
	And enters the details for Adviser directly off-platform assets request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for MWH transaction - managed funds request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'MWH transaction - managed funds' SD ticket
	And enters the details for MWH transaction - managed funds request and submits it through portfolio new activity side tray
	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Direct debit (deposit to powerwrap account) request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Direct debit (deposit to powerwrap account)' SD ticket
	And enters the details for Direct debit (deposit to powerwrap account) request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
 	
 	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for Reconciliations query request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Reconciliations query' SD ticket
	And enters the details for Reconciliations query request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	Scenario: Create SD request for Reporting errors request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Reporting errors' SD ticket
	And enters the details for Reporting errors request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Payment to a nominated account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Payment to a nominated account' SD ticket
	And enters the details for Payment to a nominated account request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Payment to a non - nominated account request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Payment to a non - nominated account' SD ticket
	And enters the details for Payment to a non - nominated account request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Other payment requests request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Other payment requests' SD ticket
	And enters the details for Other payment requests request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created

	# @RegressionTest @SmokeTest
 	Scenario: Create SD request for BPAY payment request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'BPAY payment' SD ticket
	And enters the details for BPAY payment request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for International payment request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'International payment' SD ticket
	And enters the details for International payment request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Setup a regualr payment request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Setup a regualr payment' SD ticket
	And enters the details for Setup a regualr payment request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Retail superannuation and pension withdrawal request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Retail superannuation and pension withdrawal' SD ticket
	And enters the details for Retail superannuation and pension withdrawal request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Notice to receive custodian request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Notice to receive custodian' SD ticket
	And enters the details for Notice to receive custodian request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for Transfer from BND to RBC request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'Transfer from BND to RBC' SD ticket
	And enters the details for Transfer from BND to RBC request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created
	
	# @RegressionTest @SmokeTest
	Scenario: Create SD request for HIVE support request through New Activity side tray from Portfolio Tab
 	Given the user is on New activity side tray
	When the user selects 'HIVE support request' SD ticket
	And enters the details for HIVE support request and submits it through portfolio new activity side tray
#	Then sd request for the above form should get created

	# @RegressionTest @SmokeTest
 	Scenario: Close all tickets under global request list
	Given user is on global request list dropdown
	When user clicks on select all checkbox and clicks on "Change to closed" button
	Then sd tickets should changed to "closed" status expect Payments, Direct debit, Hive support, Reports and Reconciliations sd tickets
