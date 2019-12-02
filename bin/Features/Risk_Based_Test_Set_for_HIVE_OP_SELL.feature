Feature: Risk Based Test Set for HIVE OP SELL
This Feature Details with the SELL order features for the DG Adviser

#SIM-1127
Scenario: Adviser user with access to a portfolio, but without Order Pad permission Create.
Given the user is on portfolio valuation screen
When the user does not have the permissions to order-pad create
Then the 'Place an order' button should be in disabled state

#SIM-1128
Scenario: Adviser user with access to a portfolio, but does not have access to cancel orders
Given the user is on portfolio valuation screen
When the user clicks on orders in the global level
Then the user should able to see 'Open orders' in the 'Order screen'

Scenario: Adviser user with access to a portfolio, but does not have access to cancel orders
Given the user is on 'Orders screen'
And the user does not have the permissions to cancel orders
When the user selects any one order with order status 'New' or 'Actions Required'
Then the user should see a disabled 'Cancel order' button in the 'Order details' side tray

Scenario: Validate - Provide the Cancel order permission to the Adviser user
Given the user is on PWL Admin login and provides permissions to cancel order feature
When the adviser user logs back in and selects any one order with order status 'New' or 'Actions Required'
Then the adviser user should have the permissions to 'Cancel order' in the 'Order details' side tray
And check whether the order is successfully cancelled or not

#SIM-1114
Scenario: Validate SELL order- When Asset is not held in portfolio	
Given the user is on 'Place orders' side tray
And the user clicks on 'SELL' button & navigates to 'Portfolio holdings' dropdown
When the user searches any 'Asset name/Asset code' which is not held under the current portfolio
Then the user should see 'No Holdings' message inside the dropdown

Scenario: Validate SELL order- with insufficient units	
Given the user is on 'Place orders' side tray
And the user selects one asset from 'Portfolio holdings' dropdown
When the user enters units to sell in 'Order amount' field, which should be greater than available unit
Then the user should see the error message 'You're exceeding your holdings'

Scenario: Validate SELL order- with insufficient units - units already allocated to another draft SELL order	
Given the user is on 'Place orders' side tray
And the user creates a SELL order based on the units (not full redemption)
When the user tries to create a second SELL order for the same asset
Then the user should not be allowed to create a second SELL order
And the user should see the message 'You already have a draft order for this asset' along with the 'Edit draft order' button 

Scenario: Validate SELL order- with insufficient units - units already allocated to open sell order	
Given the user is on 'Add a SELL order' side tray
And the user should have values in 'open orders' for the selected portfolio and asset
When the user tries to create a new SELL order with units greater than the remaining 'Available units' for the same asset
Then the user should not be allowed to create a SELL order
And the user should see the error message 'You're exceeding your holdings'

Scenario: Validate SELL order- Asset is not PWL Operationally Ready - cannot sell
Given the user is on 'KitKat family Trust' portfolio
And the user clicks on 'place an order' button and clicks on 'SELL' button to navigate to 'portfolio holdings' dropdown
When the user selects the asset 'AAP3656AU', which contains 'Operationally Ready = NO' in securities master
Then the user should see 'No Holdings' message in the dropdown
#Test data: Can use 171810594 Kitkat Family Trust, Fund AAP3656AU  - Jackie

#SIM-1123
Scenario: Validate SELL order- Asset is 'Operationally Ready' but 'RedeemOK=NO' - cannot sell
Given the user is on 'portfolio name' portfolio
And the user clicks on 'place an order' button and clicks on 'SELL' button to navigate to 'portfolio holdings' dropdown
When the user selects the asset 'Asset code', which contains 'Operationally Ready = YES' and 'RedeemOK=N' in securities master
Then the user should see 'This product is closed for sell' message along with option to view fund details

#SIM-1159
Scenario: Validate SELL order- by creating order less than minimum order size
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'units' radio button
And user enters '0.9' in the 'Order amount' field and clicks outside
Then the user should see the error message 'Order should be at least 1 unit'

Scenario: Validate SELL order- by creating order less than minimum order size
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'value' radio button
And user enters '0.9' in the 'Order amount' field And clicks outside
Then the user should see the error message 'Order should be at least $1'

Scenario: Validate SELL order- by creating order greater than minimum order size
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'units' radio button
And user enters '1.1' in the 'Order amount' field and clicks outside
Then the user should not see the error message 'Order should be at least 1 unit'

Scenario: Validate SELL order- by creating order greater than minimum order size
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'value' radio button
And user enters '1.1' in the 'Order amount' field and clicks outside
Then the user should not see the error message 'Order should be at least $1'
#NOTE: Even though we enter value greater than minimum order size '+Add' button will be enabled only When your order total is in positive. Because we have transaction fee calculation in place.

#SIM-1124 
Scenario: Validate SELL order- When 'Dollar redemption=NO' in the security master
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown
And that asset should have 'Dollar Redemption=NO' in the security master 
Then the user should not be allowed to select 'Sell by value' radio button
#NOTE: Need test data to automate this test case
#Test data: 171810594 Kitkat Family Trust; fund AUG0001AU  (holding is being created today) - Jackie

Scenario: Validate SELL order- When 'Dollar redemption=NO' in the security master
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown
And that asset should have 'Dollar Redemption=NO' in the security master 
Then the user should be able to select 'Sell by units' radio button
#NOTE: Need test data to automate this test case
#Test data: 171810594 Kitkat Family Trust; fund AUG0001AU  (holding is being created today) - Jackie

Scenario: Validate SELL order- When 'Dollar redemption=NO' in the security master
Given the user is on 'Add a SELL order' side tray under 'Slayd Super Fund' portfolio
When the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown
And that asset should have 'Dollar Redemption=NO' in the security master 
Then the user should not be able to select Full Redemption' radio button
#NOTE: Need test data to automate this test case
#Test data: 171810594 Kitkat Family Trust; fund AUG0001AU  (holding is being created today) - Jackie

Scenario: Validate SELL order- Wholesale fund 
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order And clicks on 'Preview' button
Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen

Scenario: Validate SELL order- retail fund 
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order And clicks on 'Preview' button
Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order based on 'units' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order based on 'values' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order with 'full redemption' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order based on 'value' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order based on 'Full Redemption' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order with 'units' and clicks on 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

Scenario: Validate SELL order- 'Was Advice Given?' section
Given the user is on 'Add a SELL order' side tray
When the user selects 'Yes' radio button under 'Was Advice Given?' section
Then the user should see Advice reason, Advice date, Advice summary and Advice method fields 
And Advice reason, Advice date, Advice method fields should be mandatory

Scenario: Validate SELL order- 'Was Advice Given?' section
Given the user is on 'Add a SELL order' side tray
When the user selects 'Yes' radio button under 'Was Advice Given?' section
Then the user should see Advice reason, Advice date, Advice summary and Advice method fields 
And Advice summary field should be mAndatory only When 'Other' option is selected in the 'Advice option' field

Scenario: Validate SELL order- 'Was Advice Given?' section
Given the user is on 'Add a SELL order' side tray
When the user selects 'NO' radio button under 'Was Advice Given?' section
Then the other advice questions should be hidden

Scenario: Validate SELL order- PDS acknowledgement
Given the user is on 'Add a SELL order' screen
When the user selects one asset from the 'Portfolio holdings' dropdown
Then the user should not see the 'PDS acknowledgement' checkbox
