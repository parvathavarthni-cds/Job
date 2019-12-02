package com.pw.pw_screens;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.SD_UIHandler;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SD_Forms_Through_GlobalActivity extends DataProvider {
	static WebDriver driver;
	private SD_UIHandler Pagefactory = PageFactory.initElements(driver, SD_UIHandler.class);
	private Logger LOGGER = Logger.getLogger(SD_Forms_Through_GlobalActivity.class.getName());

	@Given("^the user is on hive dashboard screen or portfolio screen$")
	public void the_user_is_on_hive_dashboard_screen_or_portfolio_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(sd_url);
        LOGGER.log(Level.INFO, "Chrome Browser Launched"); 
        SD_UIHandler Browser_launch = PageFactory.initElements(driver, SD_UIHandler.class);
    	Browser_launch.Advisor_login(driver, sd_userName, sd_password);    
	}

	@When("^the user clicks the global new activity button from the DashBoard or portfolio screen$")
	public void the_user_clicks_the_global_new_activity_button_from_the_DashBoard_or_portfolio_screen() throws Throwable {
		Pagefactory.Click_global_NewActivity(driver);
	}

	@Then("^the user should see Request group list$")
	public void the_user_should_should_see_Request_group_list() throws Throwable {
		Pagefactory.Browse_by_topic(driver);
	}

	@Given("^the user is on the global new activity side tray$")
	public void the_user_is_on_the_global_new_activity_side_tray() throws Throwable {
		Pagefactory.Click_global_new_Activity(driver);
	}

	@When("^the user selects the 'new account creation' sd from$")
	public void the_user_selects_the_new_account_creation_sd_from() throws Throwable {
		Pagefactory.Open_a_new_account(driver);
	}

	@And("^enters the details for new account creation sd form and submits the sd request$")
	public void enters_the_details_for_new_account_creation_sd_form_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_new_account_creation(driver, sd_portfolio_id, sd_description);
	}

	@Then("^sd request for the above form type should get created$")
	public void sd_request_for_the_above_form_should_get_created() throws Throwable {
		Pagefactory.check_ticket_creation_status(driver);
	}

	@When("^the user selects the 'corporate actions' sd from$")
	public void the_user_selects_the_corporate_actions_sd_from() throws Throwable {
		Pagefactory.Corporate_action(driver);
	}

	@And("^enters the details for corporate actions sd form and submits the sd request$")
	public void enters_the_details_for_corporate_actions_sd_form_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_corporate_actions(driver, sd_portfolio_id, sd_summary, sd_description);
	}

	@When("^the user selects the 'general query' sd from$")
	public void the_user_selects_the_general_query_sd_from() throws Throwable {
		Pagefactory.General_query(driver);
	}

	@And("^enters the details for general query request and submits the sd request$")
	public void enters_the_details_for_general_query_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_general_query(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'add product to approved product list' sd from$")
	public void the_user_selects_the_add_product_to_approved_product_list_sd_from() throws Throwable {
		Pagefactory.approved_product(driver);
	}

	@And("^enters the details for add product to approved product list request and submits the sd request$")
	public void enters_the_details_for_add_product_to_approved_product_list_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_add_product_to_approved_product_list(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'Retails superannuation & pension rollover' SD ticket$")
	public void the_user_selects_the_Retails_superannuation_pension_rollover_SD_ticket() throws Throwable {
		Pagefactory.superannuation_and_pension_rollover(driver);
	}

	@And("^enters the details for Retails superannuation & pension rollover request and submits the sd request$")
	public void enters_the_details_for_Retails_superannuation_pension_rollover_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Retails_superannuation_pension_rollover(driver, sd_description);
	}

	@When("^the user selects the 'Retail Superannuation Insurance' SD ticket$")
	public void the_user_selects_the_Retail_Superannuation_Insurance_SD_ticket() throws Throwable {
		Pagefactory.superannuation_insurance(driver);
	}

	@And("^enters the details for Retail Superannuation Insurance request and submits the sd request$")
	public void enters_the_details_for_Retail_Superannuation_Insurance_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Retail_Superannuation_Insurance(driver, sd_description);
	}


	@When("^the user selects the 'provide or update a binding nomination' SD ticket$")
	public void the_user_selects_the_provide_or_update_a_binding_nomination_SD_ticket() throws Throwable {
		Pagefactory.binding_nomination(driver);
	}

	@And("^enters the details for provide or update a binding nomination request and submits the sd request$")
	public void enters_the_details_for_provide_or_update_a_binding_nomination_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_provide_or_update_a_binding_nomination(driver, sd_description);
	}

	@When("^the user selects the 'Direct debit request for super contributors' SD ticket$")
	public void the_user_selects_the_Direct_debit_request_for_super_contributors_SD_ticket() throws Throwable {
		Pagefactory.direct_debit_request_for_super_contributors_form(driver);
	}

	@And("^enters the details for Direct debit request for super contributors request and submits the sd request$")
	public void enters_the_details_for_Direct_debit_request_for_super_contributors_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Direct_debit(driver, sd_description);
	}

	@When("^the user selects the 'Death nomination cancellation & replacement' SD ticket$")
	public void the_user_selects_the_Death_nomination_cancellation_replacement_SD_ticket() throws Throwable {
		Pagefactory.Death_nomination_cancellation_and_replacement_form(driver);
	}

	@And("^enters the details for Death nomination cancellation & replacement request and submits the sd request$")
	public void enters_the_details_for_Death_nomination_cancellation_replacement_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Death_nomination_cancellation(driver, sd_description);
	}
	@When("^the user selects the 'Provide Certificate of Incapacity' SD ticket$")
	public void the_user_selects_the_Provide_Certificate_of_Incapacity_SD_ticket() throws Throwable {
		Pagefactory.Provide_Certificate_of_Incapacity_form(driver);
	}

	@And("^enters the details for Provide Certificate of Incapacity request and submits the sd request$")
	public void enters_the_details_for_Provide_Certificate_of_Incapacity_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Provide_Certificate_of_Incapacity(driver, sd_description);
	}

	@When("^the user selects the 'Retail Superannuation & Pension query' SD ticket$")
	public void the_user_selects_the_Retail_Superannuation_Pension_query_SD_ticket() throws Throwable {
		Pagefactory.Retail_Superannuation_and_Pension_query_form(driver);
	}

	@And("^enters the details for Retail Superannuation & Pension query request and submits the sd request$")
	public void enters_the_details_for_Retail_Superannuation_Pension_query_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Retail_Superannuation_Pension_query(driver, sd_summary, sd_description);
	}
	
	@When("^the user selects the 'Billing updates' SD ticket$")
	public void the_user_selects_the_Billing_updates_SD_ticket() throws Throwable {
		Pagefactory.Billing_updates(driver);
	}

	@And("^enters the details for Billing updates request and submits the sd request$")
	public void enters_the_details_for_Billing_updates_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Billing_updates(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'change account details' SD ticket$")
	public void the_user_selects_the_change_account_details_SD_ticket() throws Throwable {
		Pagefactory.change_account_details(driver);
	}

	@And("^enters the details for change account details request and submits the sd request$")
	public void enters_the_details_for_change_account_details_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_change_account_details(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'asset transfers' SD ticket$")
	public void the_user_selects_the_asset_transfers_SD_ticket() throws Throwable {
		Pagefactory.asset_transfers(driver);
	}

	@And("^enters the details for asset transfers request and submits the sd request$")
	public void enters_the_details_for_asset_transfers_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_asset_transfers(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'close accounts' SD ticket$")
	public void the_user_selects_the_close_accounts_SD_ticket() throws Throwable {
	    Pagefactory.close_accounts(driver);
	}

	@And("^enters the details for close accounts request and submits the sd request$")
	public void enters_the_details_for_close_accounts_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_close_accounts(driver, sd_summary, sd_description);
	}

	@When("^the user selects the 'Cost bases' SD ticket$")
	public void the_user_selects_the_Cost_bases_SD_ticket() throws Throwable {
		Pagefactory.cost_bases_form(driver);
	}

	@And("^enters the details for Cost bases request and submits the sd request$")
	public void enters_the_details_for_Cost_bases_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Cost_bases(driver, sd_description);
	}

	@When("^the user selects the 'set up a nominated bank account' SD ticket$")
	public void the_user_selects_the_set_up_a_nominated_bank_account_SD_ticket() throws Throwable {
		Pagefactory.set_up_a_nominated_bank_account(driver);
	}

	@And("^enters the details for set up a nominated bank account request and submits the sd request$")
	public void enters_the_details_for_set_up_a_nominated_bank_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_set_up_a_nominated_bank_account(driver);
	}
	@When("^the user selects the 'set up a direct debit account' SD ticket$")
	public void the_user_selects_the_set_up_a_direct_debit_account_SD_ticket() throws Throwable {
		Pagefactory.set_up_a_direct_debit_account(driver);
	}

	@And("^enters the details for set up a direct debit account request and submits the sd request$")
	public void enters_the_details_for_set_up_a_direct_debit_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_set_up_a_direct_debit_account(driver);
	}

	@When("^the user selects the 'W_(\\d+)BEN lodgement' SD ticket$")
	public void the_user_selects_the_W__BEN_lodgement_SD_ticket(int arg1) throws Throwable {
		Pagefactory.W__BEN_lodgement(driver);
	}

	@And("^enters the details for W_(\\d+)BEN lodgement request and submits the sd request$")
	public void enters_the_details_for_W__BEN_lodgement_request_and_submits_the_sd_request(int arg1) throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_valuesW__BEN_lodgement(driver, sd_description);
	}
	
	@When("^the user selects the 'Modify Adviser Details' SD ticket$")
	public void the_user_selects_the_Modify_Adviser_Details_SD_ticket() throws Throwable {
		Pagefactory.Modify_Adviser_Details(driver);
	}

	@When("^enters the details for Modify Adviser Details request and submits the sd request$")
	public void enters_the_details_for_Modify_Adviser_Details_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_Modify_Adviser_Details(driver, sd_description);
	}
	
	@When("^the user selects the 'trade off-plate managed funds directly with the fund manager' SD ticket$")
	public void the_user_selects_the_trade_off_plate_managed_funds_directly_with_the_fund_manager_SD_ticket() throws Throwable {
		Pagefactory.trade_off_plate_managed_funds_directly_with_the_fund_manager(driver);
	}

	@And("^enters the details for trade off-plate managed funds directly with the fund manager request and submits the sd request$")
	public void enters_the_details_for_trade_off_plate_managed_funds_directly_with_the_fund_manager_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_trade_off_plate_managed_funds_directly_with_the_fund_manager(driver, sd_summary, sd_description, sd_amount, sd_units);
	}

	@When("^the user selects the 'Invest term deposit directly with the bank provider' SD ticket$")
	public void the_user_selects_the_Invest_term_deposit_directly_with_the_bank_provider_SD_ticket() throws Throwable {
		Pagefactory.Invest_term_deposit_directly_with_the_bank_provider(driver);
	}

	@And("^enters the details for Invest term deposit directly with the bank provider request and submits the sd request$")
	public void enters_the_details_for_Invest_term_deposit_directly_with_the_bank_provider_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Invest_term_deposit_directly_with_the_bank_provider(driver, sd_summary, sd_description, sd_value, sd_amount);
	}

	@When("^the user selects the 'Auto-invest instructions' SD ticket$")
	public void the_user_selects_the_Auto_invest_instructions_SD_ticket() throws Throwable {
		Pagefactory.Auto_invest_instructions(driver);
	}

	@And("^enters the details for Auto-invest instructions request and submits the sd request$")
	public void enters_the_details_for_Auto_invest_instructions_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Auto_invest_instructions(driver, sd_summary, sd_description, sd_amount);
	}

	@When("^the user selects the 'Break an existing term deposit directly with the bank provider' SD ticket$")
	public void the_user_selects_the_Break_an_existing_term_deposit_directly_with_the_bank_provider_SD_ticket() throws Throwable {
		Pagefactory.Break_an_existing_term_deposit_directly_with_the_bank_provider(driver);
	}

	@And("^enters the details for Break an existing term deposit directly with the bank provider request and submits the sd request$")
	public void enters_the_details_for_Break_an_existing_term_deposit_directly_with_the_bank_provider_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Break_an_existing_term_deposit_directly_with_the_bank_provider(driver, sd_summary, sd_description, sd_amount);
	}

	@When("^the user selects the 'Rollover an existing term deposit directly with the bank provider' SD ticket$")
	public void the_user_selects_the_Rollover_an_existing_term_deposit_directly_with_the_bank_provider_SD_ticket() throws Throwable {
		Pagefactory.Rollover_an_existing_term_deposit_directly_with_the_bank_provider(driver);
	}

	@And("^enters the details for Rollover an existing term deposit directly with the bank provider request and submits the sd request$")
	public void enters_the_details_for_Rollover_an_existing_term_deposit_directly_with_the_bank_provider_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Rollover_an_existing_term_deposit_directly_with_the_bank_provider(driver, sd_summary, sd_amount);
	}

	@When("^the user selects the 'Adviser directly off-platform assets' SD ticket$")
	public void the_user_selects_the_Adviser_directly_off_platform_assets_SD_ticket() throws Throwable {
		Pagefactory.Adviser_directly_off_platform_assets(driver);
	}

	@And("^enters the details for Adviser directly off-platform assets request and submits the sd request$")
	public void enters_the_details_for_Adviser_directly_off_platform_assets_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Adviser_directly_off_platform_assets(driver, sd_summary, sd_description, sd_amount);
	}

	@When("^the user selects the 'MWH transaction - managed funds' SD ticket$")
	public void the_user_selects_the_MWH_transaction_managed_funds_SD_ticket() throws Throwable {
		Pagefactory.MWH_transaction_managed_funds(driver);
	}

	@And("^enters the details for MWH transaction - managed funds request and submits the sd request$")
	public void enters_the_details_for_MWH_transaction_managed_funds_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_MWH_transaction_managed_funds(driver, sd_summary, sd_description, sd_amount);
	}

	@When("^the user selects the 'Create service desk account' SD ticket$")
	public void the_user_selects_the_Create_service_desk_account_SD_ticket() throws Throwable {
		Pagefactory.Create_service_desk_account(driver);
	}

	@And("^enters the details for Create service desk account request and submits the sd request$")
	public void enters_the_details_for_Create_service_desk_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_Create_service_desk_account(driver, sd_description);
	}

	@When("^the user selects the 'Deactivate service desk account' SD ticket$")
	public void the_user_selects_the_Deactivate_service_desk_account_SD_ticket() throws Throwable {
		Pagefactory.Deactivate_service_desk_account(driver);
	}

	@And("^enters the details for Deactivate service desk account request and submits the sd request$")
	public void enters_the_details_for_Deactivate_service_desk_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_Deactivate_service_desk_account(driver, sd_description);
	}

	@When("^the user selects the 'Direct debit \\(deposit to powerwrap account\\)' SD ticket$")
	public void the_user_selects_the_Direct_debit_deposit_to_powerwrap_account_SD_ticket() throws Throwable {
		Pagefactory.Direct_debit_deposit_to_powerwrap_account(driver);
	}

	@And("^enters the details for Direct debit \\(deposit to powerwrap account\\) request and submits the sd request$")
	public void enters_the_details_for_Direct_debit_deposit_to_powerwrap_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Direct_debit_deposit_to_powerwrap_account(driver, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Reconciliations query' SD ticket$")
	public void the_user_selects_the_Reconciliations_query_SD_ticket() throws Throwable {
		Pagefactory.Reconciliations_query(driver);
	}

	@And("^enters the details for Reconciliations query request and submits the sd request$")
	public void enters_the_details_for_Reconciliations_query_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_reconciliation_query(driver, sd_description);
	}

	@When("^the user selects the 'Reporting errors' SD ticket$")
	public void the_user_selects_the_Reporting_errors_SD_ticket() throws Throwable {
		Pagefactory.Reporting_errors(driver);
	}

	@And("^enters the details for Reporting errors request and submits the sd request$")
	public void enters_the_details_for_Reporting_errors_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_reporting_errors(driver, sd_description);
	}

	@When("^the user selects the 'Payment to a nominated account' SD ticket$")
	public void the_user_selects_the_Payment_to_a_nominated_account_SD_ticket() throws Throwable {
		Pagefactory.payment_to_a_nominated_account(driver);
	}

	@And("^enters the details for Payment to a nominated account request and submits the sd request$")
	public void enters_the_details_for_Payment_to_a_nominated_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_payment_to_a_nominated_account(driver, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Payment to a non - nominated account' SD ticket$")
	public void the_user_selects_the_Payment_to_a_non_nominated_account_SD_ticket() throws Throwable {
		Pagefactory.payments_to_non_nominated_account_form(driver);
	}

	@And("^enters the details for Payment to a non - nominated account request and submits the sd request$")
	public void enters_the_details_for_Payment_to_a_non_nominated_account_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_payment_to_a_non_nominated_account(driver, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Other payment requests' SD ticket$")
	public void the_user_selects_the_Other_payment_requests_SD_ticket() throws Throwable {
		Pagefactory.other_payment_requests(driver);
	}

	@And("^enters the details for Other payment requests request and submits the sd request$")
	public void enters_the_details_for_Other_payment_requests_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_other_payment_requests(driver, sd_summary, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}
	
	@When("^the user selects the 'BPAY payment' SD ticket$")
	public void the_user_selects_the_BPAY_payment_SD_ticket() throws Throwable {
		Pagefactory.BPAY_payment(driver);
	}

	@And("^enters the details for BPAY payment request and submits the sd request$")
	public void enters_the_details_for_BPAY_payment_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_BPAY_payment_requests(driver, sd_description, sd_amount, sd_account_number);
	}

	@When("^the user selects the 'International payment' SD ticket$")
	public void the_user_selects_the_International_payment_SD_ticket() throws Throwable {
		Pagefactory.International_payment(driver);
	}

	@And("^enters the details for International payment request and submits the sd request$")
	public void enters_the_details_for_International_payment_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_international_payment_request(driver, sd_summary, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Setup a regualr payment' SD ticket$")
	public void the_user_selects_the_Setup_a_regualr_payment_SD_ticket() throws Throwable {
		Pagefactory.Setup_a_regualr_payment(driver);
	}

	@And("^enters the details for Setup a regualr payment request and submits the sd request$")
	public void enters_the_details_for_Setup_a_regualr_payment_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Setup_a_regualr_payment_request(driver, sd_summary, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Retail superannuation and pension withdrawal' SD ticket$")
	public void the_user_selects_the_Retail_superannuation_and_pension_withdrawal_SD_ticket() throws Throwable {
		Pagefactory.Retail_superannuation_and_pension_withdrawal(driver);
	}

	@And("^enters the details for Retail superannuation and pension withdrawal request and submits the sd request$")
	public void enters_the_details_for_Retail_superannuation_and_pension_withdrawal_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Retail_superannuation_and_pension_withdrawal_request(driver, sd_summary, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}

	@When("^the user selects the 'Notice to receive custodian' SD ticket$")
	public void the_user_selects_the_Notice_to_receive_custodian_SD_ticket() throws Throwable {
		Pagefactory.Notice_to_receive_custodian(driver);
	}

	@And("^enters the details for Notice to receive custodian request and submits the sd request$")
	public void enters_the_details_for_Notice_to_receive_custodian_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory.enter_values_Notice_to_receive_custodian_request(driver, sd_summary, sd_description, sd_amount, sd_account_number, sd_BSB_number);
	}
	
	@When("^the user selects the 'Transfer from BND to RBC' SD ticket$")
	public void the_user_selects_the_Transfer_from_BND_to_RBC_SD_ticket() throws Throwable {
		Pagefactory.Transfer_from_BND_to_RBC_form(driver);			
	}

	@When("^enters the details for Transfer from BND to RBC request and submits the sd request$")
	public void enters_the_details_for_Transfer_from_BND_to_RBC_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_Transfer_from_BND_to_RBC_form_request(driver, sd_amount);
	}
	
	@When("^the user selects the 'HIVE support request' SD ticket$")
	public void the_user_selects_the_HIVE_support_request_SD_ticket() throws Throwable {
		Pagefactory.HIVE_support_request(driver);
	}

	@And("^enters the details for HIVE support request and submits the sd request$")
	public void enters_the_details_for_HIVE_support_request_and_submits_the_sd_request() throws Throwable {
		Pagefactory.enter_values_HIVE_support_request(driver, sd_summary, sd_description, sd_account_number);
	}
	
	@Given("^the user is on global request list dropdown$")
	public void the_user_is_on_global_request_list_dropdown() throws Throwable {
		Pagefactory.global_request_list(driver);
	}

	@When("^the user clicks on select all checkbox and clicks on \"([^\"]*)\" button$")
	public void the_user_clicks_on_select_all_checkbox_and_clicks_on_button(String arg1) throws Throwable {
		Pagefactory.status_change(driver);
	}

	@Then("^sd tickets should changed to \"([^\"]*)\" status expect Payments, Direct debit, Hive support, Reports and Reconciliations tickets$")
	public void sd_tickets_should_changed_to_status_expect_Payments_Direct_debit_Hive_support_Reports_and_Reconciliations_tickets(String arg1) throws Throwable {
		Pagefactory.toast_message(driver);
		driver.quit();
	}
}
