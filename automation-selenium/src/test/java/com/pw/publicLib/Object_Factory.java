package com.pw.publicLib;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Object_Factory {
	public static String test_image = "src/test/resources/Test_image.png";
	File image_file = new File("./src/test/resources/Test_image.png");
	static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	static Date date = new Date(); //get current date time with Date()
	public static String system_date= dateFormat.format(date);// Now format the date
		
	//	@FindBy(xpath= "") //element
	//	public static WebElement element_name;

	//Login page-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//*[@id=\"user_email\"]") // Username field
	public static WebElement username_field;

	@FindBy(id = "user_password") // Password field
	public static WebElement password_field;

	@FindBy(id = "m_login_signin_submit") // Sign in field
	public static WebElement sign_in;

	//Portfolio screen-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'Portfolios')]") // global portfolio list button
	public WebElement global_portfolio_list_button;
	
	@FindBy(xpath = "//span[contains(text(),'Name')]") // Name under portfolio list
	public static WebElement Name_under_portfolio_list;
	
	@FindBy(xpath = "//*[@id=\"m_tabs_1_1\"]/div/input") // Search_by_portfolio_name_or_ID_search_box
	public static WebElement Search_by_portfolio_name_or_ID_search_box;
	
	@FindBy(xpath = "//*[@id=\"investor-list-data\"]/table/tbody/tr/td[1]/span") // slayd_super_fund_investor
	public static WebElement investor_name;
	
	@FindBy(xpath = "//*[@id=\"investor-list-data\"]/table/tbody/tr/td[1]/span") // slayd_super_fund_investor
	public static WebElement slayd_super_fund_investor;
	
	@FindBy(id = "pv_raise_a_request") // new activity portfolio
	public static WebElement new_activity_for_this_portfolio_button;

	@FindBy(xpath = "//*[@id=\"horizontal-menu\"]/ul/li[3]/a") // global request list button
	public static WebElement global_request_list_button;

	@FindBy(id = "raise_a_request") // global raise a request button
	public static WebElement global_raise_a_request_button;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/img") // product logo
	public static WebElement product_logo_advisor;

	//Request list dropdown-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(xpath = "//div[contains(text(),'Reporter')]") // reporter filter
	public static WebElement reporter_filter;

	@FindBy(xpath = "//div[@class='fs-wrap multiple fs-default fs-open']//div[1]//span[1]//i[1]") // me
	public static WebElement me;
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']") // reporter filter
	public static WebElement reporter_filter_contains_me;

	@FindBy(xpath = "//div[@class='dataTables_scrollHeadInner']//span//span") // select all check box
	public static WebElement select_all_checkbox;

	@FindBy(id = "status_change_tickets_button") // change to closed button
	public static WebElement change_to_closed;

	@FindBy(xpath = "//div[@class='toast-message']") // toaster message
	public static WebElement toast_message;


	//Request side tray-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "select2-request_type_dropdown-container") // Tell us what you need search field
	public static WebElement Tell_us_what_you_need_search;

	@FindBy(xpath = "//h3[@class='m-portlet__head-text request-group-head']") // browse by topic label
	public static WebElement browse_by_topic_label;

	@FindBy(xpath = "//*[@id=\"raise_request_close\"]/em") // close mark
	public static WebElement raise_a_request_x_mark;

	@FindBy(xpath = "//button[contains(text(),'Submit')]") // submit button
	public static WebElement submit_button;

	@FindBy(xpath = "//button[@class='text-color-black md-close ma-cancel']") // cancel button
	public static WebElement cancel_button;

	@FindBy(xpath = "//span[@class='ma-confirm-title']") // Thank you message after ticket creation
	public static WebElement Thank_you_message;

	@FindBy(xpath = "//button[@id='ma-new-request']") // start a new request button
	public static WebElement start_new_request_button;

	@FindBy(xpath = "//button[@id='modify-close']") // close button when showing thank you message after ticket creation
	public static WebElement close_button_after_request_creation;

	@FindBy(xpath = "//*[@id=\"m_wizard_form_step_1\"]") // side tray scroll body
	public static WebElement sd_side_tray_scroll;

	//Request group accordions-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "m_accordion_sd_item_0_head") // new account creation accordion
	public static WebElement new_account_creation_accordion;

	@FindBy(id = "m_accordion_sd_item_1_head") // payments accordion
	public static WebElement payments_accordion;

	@FindBy(id = "m_accordion_sd_item_2_head") // corporate actions accordion
	public static WebElement corporate_actions_accordian;

	@FindBy(id = "m_accordion_sd_item_3_head") // Queries accordion
	public static WebElement queries_accordian;

	@FindBy(id = "m_accordion_sd_item_4_head") // Retail Superannuation & Pension accordion
	public static WebElement Retail_Superannuation_Pension_accordian;

	@FindBy(id = "m_accordion_sd_item_5_head") // Account_maintenance_accordian
	public static WebElement Account_maintenance_accordian;

	@FindBy(id = "m_accordion_sd_item_6_head") // Trade_accordian
	public static WebElement Trade_accordian;

	@FindBy(id = "m_accordion_sd_item_7_head") // service_desk_management_accordian
	public static WebElement service_desk_management_accordian;	

	@FindBy(id = "m_accordion_sd_item_8_head") // direct_debit_accordian
	public static WebElement direct_debit_accordian;	

	@FindBy(id = "m_accordion_sd_item_9_head") // report_and_reconciliations_accordian
	public static WebElement report_and_reconciliations_accordian;
	
	@FindBy(xpath = "//button[contains(text(),'Support Request')]") // HIVE support request button.
	public static WebElement HIVE_support_request;
	
	//New account creation group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[@class='ticket-comment-name'][contains(text(),'Open a new account')]") // open new account form
	public static WebElement open_new_account_form;

	//corporate actions group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[@class='ticket-comment-name'][contains(text(),'Corporate actions')]") // corporate actions form
	public static WebElement corporate_actions_form;

	//Queries group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[@class='ticket-comment-name'][contains(text(),'General query')]") // general queries form
	public static WebElement general_query_form;

	@FindBy(xpath = "//span[contains(text(),'Add product to the Approved Product List')]") //approved product list form form
	public static WebElement approved_product_list_form;

	//Retail Superannuation group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Retail Superannuation & Pension rollover')]") //Retail Superannuation & Pension rollover form
	public static WebElement Retail_Superannuation_and_Pension_rollover_form;

	@FindBy(xpath = "//span[contains(text(),'Retail Superannuation Insurance')]") //Retail Superannuation insurance form
	public static WebElement Retail_Superannuation_insurance_form;

	@FindBy(xpath = "//span[contains(text(),'Provide or update a binding nomination')]") // provide or update a binding nomination form
	public static WebElement provide_or_update_a_binding_nomination_form;

	@FindBy(xpath = "//span[contains(text(),'Direct debit request for super contributions')]") //direct debit request for super contributions form
	public static WebElement direct_debit_request_for_super_contributions_form;

	@FindBy(xpath = "//span[contains(text(),'Death nomination cancellation & replacement')]") //death nomination cancellation and replacement form
	public static WebElement death_nomination_cancellation_and_replacement_form;

	@FindBy(xpath = "//span[contains(text(),'Provide Certificate of Incapacity')]") //provide certificate of incapacity form
	public static WebElement provide_certificate_of_incapacity_form;

	@FindBy(xpath = "//span[contains(text(),'Retail Superannuation & Pension query')]") //retail superannuation and pension query form
	public static WebElement retail_superannuation_and_pension_query_form;

	//Account maintanance group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Billing updates')]") //billing_updates_form
	public static WebElement billing_updates_form;

	@FindBy(xpath = "//span[contains(text(),'Change account details')]") //change_account_details_form
	public static WebElement change_account_details_form;

	@FindBy(xpath = "//span[contains(text(),'Asset transfers')]") //asset_transfer_form
	public static WebElement asset_transfer_form;

	@FindBy(xpath = "//span[contains(text(),'Close accounts')]") //close_accounts_form
	public static WebElement close_accounts_form;

	@FindBy(xpath = "//span[contains(text(),'Cost bases')]") //cost_bases_form
	public static WebElement cost_bases_form;

	@FindBy(xpath = "//span[contains(text(),'Set up a nominated bank account')]") //set_up_a_nominated_debit_account_form
	public static WebElement set_up_a_nominated_bank_account_form;

	@FindBy(xpath = "//span[contains(text(),'Set up a direct debit account')]") //set_up_a_direct_debit_account_form
	public static WebElement set_up_a_direct_debit_account_form;

	@FindBy(xpath = "//span[contains(text(),'W-8BEN lodgement')]") //W8BEN_lodgement_form
	public static WebElement W8BEN_lodgement_form;
	
	@FindBy(xpath = "//span[contains(text(),'Modify Adviser Details')]") //Modify Adviser Details_form
	public static WebElement Modify_Adviser_Details_form;
	
	//Trade group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Trade off-platform managed funds directly with the')]") //trade off plate managed funds directly with the fund manager form
	public static WebElement trade_off_plate_managed_funds_directly_with_the_fund_manager_form;

	@FindBy(xpath = "//span[contains(text(),'Invest term deposit directly with the bank provide')]") //Invest term deposit directly with the bank provider form
	public static WebElement Invest_term_deposit_directly_with_the_bank_provider_form;

	@FindBy(xpath = "//span[contains(text(),'Auto-invest instructions')]") //Auto invest instructions form
	public static WebElement Auto_invest_instructions_form;

	@FindBy(xpath = "//span[contains(text(),'Break an existing term deposit directly with the b')]") //Break an existing term deposit directly with the bank provider form
	public static WebElement Break_an_existing_term_deposit_directly_with_the_bank_provider_form;

	@FindBy(xpath = "//span[contains(text(),'Rollover an existing term deposit directly with th')]") //Rollover an_existing_term_deposit_directly_with_the_bank_provider_form
	public static WebElement Rollover_an_existing_term_deposit_directly_with_the_bank_provider_form;

	@FindBy(xpath = "//span[contains(text(),'Adviser directed off-platform assets')]") //Adviser directly off platform assets form
	public static WebElement Adviser_directly_off_platform_assets_form;

	@FindBy(xpath = "//span[contains(text(),'MWH transaction - managed funds')]") //MWH transaction managed funds form
	public static WebElement MWH_transaction_managed_funds_form;

	//service desk management group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Create service desk account')]") //create service desk account form
	public static WebElement create_service_desk_account_form;

	@FindBy(xpath = "//span[contains(text(),'Deactivate service desk account')]") //deactivate service desk account form
	public static WebElement deactivate_service_desk_account_form;

	//direct debit group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Direct Debit (deposit to Powerwrap account)')]") //direct debit deposit to powerwrap account form
	public static WebElement direct_debit_deposit_to_powerwrap_account_form;
	
	//report and reconciliations group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(xpath = "//span[contains(text(),'Reconciliations query')]") //reconciliation query form
	public static WebElement reconciliation_query_form;
	
	@FindBy(xpath = "//span[contains(text(),'Reporting errors')]") //reporting errors form
	public static WebElement reporting_errors_form;
	
	//payments group-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Payment to a nominated account')]")
	public static WebElement payments_to_nominated_account_form;
	
	@FindBy(xpath = "//span[contains(text(),'Payment to a non-nominated account (Third Party pa')]") 
	public static WebElement payments_to_non_nominated_account_form;
	
	@FindBy(xpath = "//span[contains(text(),'Other payment requests')]") 
	public static WebElement other_payement_request_form;
	
	@FindBy(xpath = "//span[contains(text(),'BPAY payment')]") 
	public static WebElement BPAY_payments_form;
	
	@FindBy(xpath = "//span[contains(text(),'International payment')]") 
	public static WebElement international_payment_form;
	
	@FindBy(xpath = "//span[contains(text(),'Set up a regular payment')]") 
	public static WebElement setup_a_regular_payment_form;
	
	@FindBy(xpath = "//span[contains(text(),'Retail Superannuation & Pension withdrawal')]") 
	public static WebElement retail_superannuation_and_pension_withdrawal_form;
	
	@FindBy(xpath = "//span[contains(text(),'Notice to receive (Custodian)')]") 
	public static WebElement notice_to_receive_custodian_form;
	
	@FindBy(xpath = "//span[contains(text(),'Transfer from BND to RBC')]") 
	public static WebElement Transfer_from_BND_to_RBC_form;
	
	//Open a new account form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//input[@id='customfield_10106']") // Praemium Portfolio ID
	public static WebElement praemium_portfolio_id_field;
	
	@FindBy(id = "customfield_10107") // portfolio name
	public static WebElement Portfolio_name;
	
	@FindBy(id = "customfield_10600_hash_10501") // without assets radio button
	public static WebElement acc_category_without_assets;

	@FindBy(id = "customfield_10600_hash_10500") // with assets radio button
	public static WebElement acc_category_with_assets;

	//Corporate actions form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "/html/body/span/span/span[1]/input") // Please select a portfolio
	public static WebElement please_select_a_portfolio_dropdown_search;

	//general queries form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_10423_hash_13221") // Account opening radio button
	public static WebElement account_opening_radio_button;

	@FindBy(xpath = "//textarea[@id='description']") // query field
	public static WebElement query_description_field;

	//Add product to the Approved Product List form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//input[@id='customfield_15805_hash_15419']") // for investment accounts radio button
	public static WebElement for_investment_accounts_radio_button;

	@FindBy(xpath = "//input[@id='customfield_15806_hash_15422']") // for superannuation and pension accounts
	public static WebElement for_superannuation_and_pension_accounts;

	//Retail Superannuation & Pension rollover form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(xpath = "//input[@id='customfield_15102_hash_13800']") // Type of rollover radio button
	public static WebElement Type_of_rollover_radio_button;

	//Billing updates form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "checkBox0") // brokerage checkbox
	public static WebElement brokerage_checkbox;

	@FindBy(name = "checkBox1") // SMA Fee checkbox
	public static WebElement SMA_Fee_checkbox;

	@FindBy(name = "checkBox2") // ongoing advisor fee checkbox
	public static WebElement ongoing_advisor_fee_checkbox;

	@FindBy(name = "checkBox3")// INT SMA Fee checkbox
	public static WebElement INT_SMA_Fee_checkbox;

	@FindBy(name = "checkBox4")// other checkbox
	public static WebElement other_checkbox;

	//Change account details form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "checkBox0")// phone number checkbox
	public static WebElement phone_number_checkbox;

	@FindBy(name = "checkBox1") // Email checkbox
	public static WebElement Email_checkbox;

	@FindBy(name = "checkBox2")// Name checkbox
	public static WebElement Name_checkbox;

	@FindBy(name = "checkBox3")// Address checkbox
	public static WebElement Address_checkbox;

	@FindBy(name = "checkBox4") // Adviser checkbox
	public static WebElement Adviser_checkbox;

	@FindBy(name = "checkBox5")// others checkbox
	public static WebElement others_checkbox;

	//Asset transfer form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15895")// Name as recorded with counter party field
	public static WebElement Name_as_recorded_with_counter_party_field;

	@FindBy(name = "customfield_15940")// transfer of SMA assets dropdown
	public static WebElement transfer_of_SMA_assets_dropdown;

	@FindBy(name = "checkBox0")// ASX HIN checkbox
	public static WebElement ASX_HIN_checkbox;

	@FindBy(name = "checkBox1") // ASX issuer checkbox
	public static WebElement ASX_issuer_checkbox;

	@FindBy(name = "customfield_11101") // PV value field
	public static WebElement PV_value_field;	

	//Close accounts form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_16008") // Adviser name
	public static WebElement Adviser_name;
	
	@FindBy(id = "customfield_16007") // Adviser details to modify dropdown
	public static WebElement Adviser_details_to_modify_dropdown;
	
	//Modify Adviser details form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15804") // Reason for closure dropdown
	public static WebElement Reason_for_closure_dropdown;

	//trade off plate managed funds directly with the fund manager form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_14901")// off platform managed funds list dropdown
	public static WebElement off_platform_managed_funds_list_dropdown;

	@FindBy(id = "customfield_10404_hash_10408") // type invest radio button
	public static WebElement type_invest_radio_button;

	@FindBy(name = "customfield_15829")// units to redeem
	public static WebElement units_to_redeem;

	//Invest term deposit directly with the bank provider form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_13805")// Rate
	public static WebElement Rate;

	//Auto invest instructions form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_14603")// start date
	public static WebElement start_date;

	@FindBy(name = "customfield_14605")// APIR_code_no1
	public static WebElement APIR_code_no1;

	@FindBy(name = "customfield_14601")// APIR_code_no1 %
	public static WebElement APIR_code_no1_percent;

	@FindBy(name = "customfield_14606")// APIR_code_no2
	public static WebElement APIR_code_no2;

	@FindBy(name = "customfield_14602")// APIR_code_no2 %
	public static WebElement APIR_code_no2_percent;	

	@FindBy(name = "customfield_14607")// APIR_code_no2
	public static WebElement APIR_code_no3;

	@FindBy(name = "customfield_14608")// APIR_code_no3 %
	public static WebElement APIR_code_no3_percent;

	//Rollover an_existing_term_deposit_directly_with_the_bank_provider_form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_14100_hash_12800") // type of rollover principal only radio button
	public static WebElement principal_only_radio_button;

	//Adviser directly off platform assets form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_14902") //trade date 
	public static WebElement trade_date;

	//MWH transaction managed funds form----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_10419") //settlement date
	public static WebElement APIR_code;

	@FindBy(id = "customfield_15000_hash_13600") // type of investment buy radio button
	public static WebElement type_of_investment_buy_radio_button;

	@FindBy(id = "customfield_15001_hash_13604") // pay from MWH Account radio button
	public static WebElement MWH_Account_radio_button;

	//create service desk request form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_12700") //full name field
	public static WebElement full_name_field;

	//direct debit request from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15833") //debit account name field
	public static WebElement debit_account_name_field;

	@FindBy(name = "customfield_15834") //debit account name field
	public static WebElement debit_bank_name_field;

	@FindBy(name = "customfield_15836") //debit bank account number field
	public static WebElement debit_bank_account_number_field;

	@FindBy(name = "customfield_15835") //debit account name field
	public static WebElement debit_bank_account_BSB_field;
	
	//reconciliation query form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_14701_hash_13209") // type managed funds radio button
	public static WebElement type_managed_funds_radio_button;

	//reporting errors form-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_14702_hash_13218") // reporting query type Reporting issues radio button
	public static WebElement reporting_query_type_Reporting_issues_radio_button;

	//BPAY paymnet from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15882") //BPAY biller code field
	public static WebElement BPAY_biller_code_field;
	
	@FindBy(name = "customfield_15883") //BPAY customer reference number field
	public static WebElement BPAY_customer_reference_number_field;
	
	//international paymnet from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15870") //from cashbook dropdown
	public static WebElement from_cashbook_dropdown;
	
	@FindBy(name = "customfield_16024") //Currency_dropdown
	public static WebElement currency_to_pay_out_dropdown;
	
	@FindBy(name = "customfield_16025") //Amount_international_payment
	public static WebElement Amount_international_payment;
	
	@FindBy(name = "customfield_16026") //beneficiary_name
	public static WebElement beneficiary_name;
	
	@FindBy(name = "customfield_16027") //beneficiary_address
	public static WebElement beneficiary_address;
	
	@FindBy(name = "customfield_16028") //beneficiary_acc_no
	public static WebElement beneficiary_acc_no;
	
	@FindBy(name = "customfield_16029") //Beneficiary_Bank_SWIFT_BIC
	public static WebElement Beneficiary_Bank_SWIFT_BIC;
	
	@FindBy(name = "customfield_16030") //swift Intermediary_Bank_SWIFT_BIC field
	public static WebElement Intermediary_Bank_SWIFT_BIC;
	
	@FindBy(name = "customfield_16031") //Message_to_Beneficiary
	public static WebElement Message_to_Beneficiary;
	
	@FindBy(name = "customfield_13400") //Narration for portfolio
	public static WebElement Narration_for_portfolio;
	
	//setup a regular paymnet from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15869") // Payment frequency
	public static WebElement Payment_frequency;
	
	@FindBy(name = "customfield_13903") // payment_start_date
	public static WebElement payment_start_date;
	
	@FindBy(xpath = "//td[@class='active day']") // active date
	public static WebElement active_date;
	
	@FindBy(name = "customfield_15881") // payee account number
	public static WebElement payee_account_number;
	
	//Transfer from BND to RBC request from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_16010") // Payment frequency
	public static WebElement portfolio_ID_BND;
	
	//Notice to receive (Custodian)from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(name = "customfield_15952") // investor type dropdown
	public static WebElement investor_type_dropdown;
	
	@FindBy(name = "customfield_15953") // investor type dropdown
	public static WebElement custodian_currency_dropdown;
	
	@FindBy(name = "customfield_15941") // amount custodian
	public static WebElement amount_custodian;
	
	@FindBy(name = "customfield_15943") // ordering institution type dropdown
	public static WebElement ordering_institution_type_dropdown;
	
	@FindBy(name = "customfield_15945") // ordering institution identifier field
	public static WebElement ordering_institution_identifier_field;
	
	@FindBy(name = "customfield_15949") // ordering institution name field
	public static WebElement ordering_institution_name_field;
	
	@FindBy(name = "customfield_15951") // ordering institution address field
	public static WebElement ordering_institution_address_field;
	
	@FindBy(name = "customfield_15948") //Intermediary Institution Type (optional)
	public static WebElement intermediary_institution_type_dropdown;
	
	@FindBy(name = "customfield_15946") //Intermediary Institution Identifier (optional)
	public static WebElement intermediary_institution_identifier_field;
	
	@FindBy(name = "customfield_15944") //Intermediary bank address
	public static WebElement intermediary_bank_address_field;
	
	//HIVE support request from-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "customfield_15920") // Issue type dropdown
	public static WebElement issue_type_dropdown;
	
	@FindBy(id = "customfield_15939") // no of users impacted
	public static WebElement no_of_users_impacted;
	
	//Common fields in SD forms-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(id = "summary") // subject
	public static WebElement subject_summary_field;

	@FindBy(id = "description") // description or comments
	public static WebElement Description_field;

	@FindBy(id = "select2-sd_form_participants-container") // Please select a portfolio
	public static WebElement please_select_a_portfolio_dropdown;

	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]") // portfolio_first_value
	public static WebElement portfolio_first_value;

	@FindBy(id = "sd_ticket_attachment") // Account opening radio button
	public static WebElement SD_creation_Upload_documents_field;

	@FindBy(name = "customfield_15830") //amount field, value field
	public static WebElement amount_field; 

	@FindBy(name = "customfield_13506")
	public static WebElement institution_dropdown; //institution dropdown

	@FindBy(name = "customfield_10703")
	public static WebElement term_field; //term field

	@FindBy(name = "customfield_14900") //end date
	public static WebElement end_date;

	@FindBy(xpath = "//td[contains(@class,'today day')]") // today date
	public static WebElement today_date;

	@FindBy(name = "customfield_10206")// amount to invest, cost base
	public static WebElement amount_to_invest;

	@FindBy(name = "customfield_15808") //email address field
	public static WebElement email_address_field;
	
	@FindBy(name = "customfield_13400") //narration for portfolio field
	public static WebElement narration_for_portfolio_field;

	@FindBy(xpath = "//*[@id=\"customfield_15853_hash_15619\"]") // next day overnight radio button
	public static WebElement next_day_overnight_radio_button;
	
	@FindBy(name = "customfield_10700") //payee name field or  Recipient full name
	public static WebElement payee_name_field;
	
	@FindBy(name = "customfield_10702") //payee bank account number field
	public static WebElement payee_bank_account_number_field;
	
	@FindBy(name = "customfield_15880") //payee BSB
	public static WebElement payee_BSB_field;
	
	@FindBy(name = "customfield_15872") //message to recipient field
	public static WebElement message_to_recipient_field;
	
	@FindBy(name = "customfield_14903") //settlement date
	public static WebElement settlement_date;
	
	@FindBy(name = "customfield_15877") //intermediary bank name
	public static WebElement intermediary_bank_name;
	
	@FindBy(xpath = "//*[@id=\"sd_ticket_attachment\"]") // attachment inside SD form
	public static WebElement SD_attachment;
	
}