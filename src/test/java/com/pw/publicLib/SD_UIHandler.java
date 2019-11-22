package com.pw.publicLib;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.pw.publicLib.Object_Factory;

public class SD_UIHandler extends Object_Factory {
	private Logger LOGGER = Logger.getLogger(SD_UIHandler.class.getName());	
	public WebDriver Advisor_login(WebDriver driver, String username, String password) throws InterruptedException {
        LOGGER.log(Level.INFO, driver.getTitle()); 
		username_field.click();
		username_field.clear();
		username_field.sendKeys(username);
		password_field.click();
		password_field.clear();
		password_field.sendKeys(password);
		sign_in.click();
		return driver;
	}
	public WebDriver portfolio_selection_under_portfolio_dropdown(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		please_select_a_portfolio_dropdown.click();
		please_select_a_portfolio_dropdown_search.click();
		please_select_a_portfolio_dropdown_search.sendKeys("Slayd Super Fund");
		Thread.sleep(13000);
		please_select_a_portfolio_dropdown_search.sendKeys(Keys.ENTER);
		return driver;
	}
	public WebDriver summary_and_description(WebDriver driver, String summary, String description) throws InterruptedException {
		sd_form_scroll(driver, subject_summary_field);
		subject_summary_field.click();
		subject_summary_field.sendKeys(summary);
		sd_form_scroll(driver, Description_field);
		Description_field.click();
		Description_field.sendKeys(description);
		return driver;
	}
	public WebDriver sd_form_scroll(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver; //form scroll
		js.executeScript("arguments[0].scrollIntoView();", element);
		return driver;
	}
	public WebDriver wait_by_visibility(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return driver;
	}
	public WebDriver wait_until_clickable(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return driver;
	}
	public WebDriver dropdown(WebDriver driver, WebElement element, String search_term) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(search_term);		
		return driver;
	}
	public WebDriver investor_selection(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, global_portfolio_list_button, 120);
		Thread.sleep(8000);
		global_portfolio_list_button.click();
		wait_by_visibility(driver, Name_under_portfolio_list, 120);
		Search_by_portfolio_name_or_ID_search_box.click();
		Search_by_portfolio_name_or_ID_search_box.sendKeys("Slayd Super Fund");
		Thread.sleep(12000);
		slayd_super_fund_investor.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver Click_global_NewActivity(WebDriver driver) {
		wait_until_clickable(driver, global_raise_a_request_button, 120);
		try {
			global_raise_a_request_button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			LOGGER.log(Level.INFO, "StaleElementReferenceException"); 
			global_raise_a_request_button.click();
			LOGGER.log(Level.INFO, "Element clicked successfully"); 
		}
		return driver;	
	}
	public WebDriver Click_global_new_Activity(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, global_portfolio_list_button, 120);
		driver.navigate().refresh();
		wait_until_clickable(driver, global_raise_a_request_button, 120);
		try {
			global_raise_a_request_button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
	        LOGGER.log(Level.INFO, "StaleElementReferenceException"); 
	        global_raise_a_request_button.click();
	        LOGGER.log(Level.INFO, "Element clicked successfully"); 
		}
		return driver;
	}
	public WebDriver Browse_by_topic(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, browse_by_topic_label, 120);
		Thread.sleep(4000);
        LOGGER.log(Level.INFO, "Browse by topic found"); 
		wait_until_clickable(driver, raise_a_request_x_mark, 120);
		raise_a_request_x_mark.click();
		return driver;
	}
	public WebDriver clicks_new_activity_button(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		wait_until_clickable(driver, new_activity_for_this_portfolio_button, 120);
		try {
			new_activity_for_this_portfolio_button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
	        LOGGER.log(Level.INFO, "StaleElementReferenceException"); 
	        new_activity_for_this_portfolio_button.click();
	        LOGGER.log(Level.INFO, "Element clicked successfully"); 
		}
		return driver;	
	}
	public WebDriver Click_new_Activity(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_until_clickable(driver, new_activity_for_this_portfolio_button, 120);
		Thread.sleep(1000);
		try {
			new_activity_for_this_portfolio_button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
	        LOGGER.log(Level.INFO, "StaleElementReferenceException");
	        new_activity_for_this_portfolio_button.click();
	        LOGGER.log(Level.INFO, "Element clicked successfully"); 
		}
		Thread.sleep(4000);
		return driver;
	}
	public WebDriver Open_a_new_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, new_account_creation_accordion, 120);
		new_account_creation_accordion.click();
        LOGGER.log(Level.INFO, "New account creation accordion"); 
		Thread.sleep(1000);
		open_new_account_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_new_account_creation(WebDriver driver, String portfolio_id, String description) throws InterruptedException {
		praemium_portfolio_id_field.click();
		praemium_portfolio_id_field.sendKeys(portfolio_id);
		Portfolio_name.click();
		Portfolio_name.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		acc_category_without_assets.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver check_ticket_creation_status(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, start_new_request_button, 60);
		String success_message = Thank_you_message.getText();
		if(Thank_you_message.isDisplayed()) {
			Assert.assertEquals(success_message, "Thank you");
	        LOGGER.log(Level.INFO, "Ticket created succesfully"); 
		}
		else{	
	        LOGGER.log(Level.INFO, "Ticket created failed"); 
		}
//		wait_until_clickable(driver, close_button_after_request_creation, 60);
//		close_button_after_request_creation.click();
		Thread.sleep(1000);
		return driver;
	}
	public WebDriver Corporate_action(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, corporate_actions_accordian, 60);
		corporate_actions_accordian.click();
        LOGGER.log(Level.INFO, "Corporate actions accordian found"); 
		Thread.sleep(1000);
		corporate_actions_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_corporate_actions(WebDriver driver, String portfolio_id, String summary, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver General_query(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, queries_accordian, 60);
		queries_accordian.click();
		LOGGER.log(Level.INFO, "Queries accordian found");
		Thread.sleep(1000);
		general_query_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_general_query(WebDriver driver, String summary, String description) throws InterruptedException {
		account_opening_radio_button.click();
		sd_form_scroll(driver, query_description_field);
		query_description_field.click();
		query_description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver approved_product(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, queries_accordian, 60);
		queries_accordian.click();
		LOGGER.log(Level.INFO, "Queries accordian found");
		Thread.sleep(1000);
		approved_product_list_form.click();
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_add_product_to_approved_product_list(WebDriver driver, String summary, String description) throws InterruptedException {
		summary_and_description(driver, summary, description);
		for_investment_accounts_radio_button.click();
		for_superannuation_and_pension_accounts.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver superannuation_and_pension_rollover(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 60);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(1000);
		Retail_Superannuation_and_Pension_rollover_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Retails_superannuation_pension_rollover(WebDriver driver, String description) throws InterruptedException {
		Type_of_rollover_radio_button.click();
		sd_form_scroll(driver, Description_field);
		Thread.sleep(1000);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver superannuation_insurance(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 60);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(1000);
		Retail_Superannuation_insurance_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Retail_Superannuation_Insurance(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_values_provide_or_update_a_binding_nomination(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_values_Direct_debit(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_values_Death_nomination_cancellation(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_values_Provide_Certificate_of_Incapacity(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_values_Cost_bases(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver enter_valuesW__BEN_lodgement(WebDriver driver, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver binding_nomination(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 120);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, provide_or_update_a_binding_nomination_form);
		Thread.sleep(1000);
		provide_or_update_a_binding_nomination_form.click();
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver direct_debit_request_for_super_contributors_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 120);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, direct_debit_request_for_super_contributions_form);
		Thread.sleep(1000);
		direct_debit_request_for_super_contributions_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver Death_nomination_cancellation_and_replacement_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 120);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, death_nomination_cancellation_and_replacement_form);
		Thread.sleep(1000);
		death_nomination_cancellation_and_replacement_form.click();
		Thread.sleep(3000);
		return driver;			
	}
	public WebDriver Provide_Certificate_of_Incapacity_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 120);
		Retail_Superannuation_Pension_accordian.click();		
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, provide_certificate_of_incapacity_form);
		Thread.sleep(1000);
		provide_certificate_of_incapacity_form.click();
		Thread.sleep(3000);
		return driver;				
	}
	public WebDriver Retail_Superannuation_and_Pension_query_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Retail_Superannuation_Pension_accordian, 120);
		Retail_Superannuation_Pension_accordian.click();
		LOGGER.log(Level.INFO, "Retail Superannuation and Pension accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, retail_superannuation_and_pension_query_form);
		Thread.sleep(1000);
		retail_superannuation_and_pension_query_form.click();
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_Retail_Superannuation_Pension_query(WebDriver driver, String summary, String description) throws InterruptedException {
		summary_and_description(driver, summary, description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver cost_bases_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, cost_bases_form);
		Thread.sleep(1000);
		cost_bases_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver set_up_a_nominated_bank_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, set_up_a_nominated_bank_account_form);
		Thread.sleep(1000);
		set_up_a_nominated_bank_account_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_set_up_a_nominated_bank_account(WebDriver driver) throws InterruptedException {
		submit_button.click();
		return driver;
	}
	public WebDriver enter_values_set_up_a_direct_debit_account(WebDriver driver) throws InterruptedException {
		submit_button.click();
		return driver;
	}
	public WebDriver set_up_a_direct_debit_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, set_up_a_direct_debit_account_form);
		Thread.sleep(1000);
		set_up_a_direct_debit_account_form.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver W__BEN_lodgement(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, W8BEN_lodgement_form);
		Thread.sleep(1000);
		W8BEN_lodgement_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver Modify_Adviser_Details(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Modify_Adviser_Details_form);
		Thread.sleep(1000);
		Modify_Adviser_Details_form.click();	
		Thread.sleep(3000);
		return driver;		
	}
	public WebDriver enter_values_Modify_Adviser_Details(WebDriver driver, String sd_description) throws InterruptedException {
		summary_and_description(driver, sd_description, sd_description);
		Adviser_name.click();
		Adviser_name.sendKeys(sd_description);
		dropdown(driver, Adviser_details_to_modify_dropdown, "Adviser contact information");
		SD_attachment.sendKeys(image_file.getAbsolutePath());
		Thread.sleep(5000);	
//		submit_button.click();
		return driver;		
	}
	public WebDriver Billing_updates(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		billing_updates_form.click();	
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_Billing_updates(WebDriver driver, String summary, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		brokerage_checkbox.click();
		SMA_Fee_checkbox.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver change_account_details(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		change_account_details_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_change_account_details(WebDriver driver, String summary, String description) throws InterruptedException {
		phone_number_checkbox.click();
		Email_checkbox.click();
		sd_form_scroll(driver, Description_field);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;			
	}
	public WebDriver asset_transfers(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, asset_transfer_form);
		Thread.sleep(1000);
		asset_transfer_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_asset_transfers(WebDriver driver, String summary, String description) throws InterruptedException {
		Name_as_recorded_with_counter_party_field.click();
		Name_as_recorded_with_counter_party_field.sendKeys(summary);
		dropdown(driver, transfer_of_SMA_assets_dropdown, "No");
		ASX_HIN_checkbox.click();
		sd_form_scroll(driver, PV_value_field);
		PV_value_field.click();
		PV_value_field.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver close_accounts(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Account_maintenance_accordian.click();
		LOGGER.log(Level.INFO, "Account maintenance accordian found");
		sd_form_scroll(driver, close_accounts_form);
		close_accounts_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_close_accounts(WebDriver driver, String summary, String description) throws InterruptedException {
		Description_field.click();
		Description_field.sendKeys(description);
		dropdown(driver, Reason_for_closure_dropdown, "Moving to another platform");
		Thread.sleep(1000);
//		submit_button.click();
		return driver;
	}
	public WebDriver trade_off_plate_managed_funds_directly_with_the_fund_manager(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Account_maintenance_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		sd_form_scroll(driver, trade_off_plate_managed_funds_directly_with_the_fund_manager_form);
		Thread.sleep(1000);
		trade_off_plate_managed_funds_directly_with_the_fund_manager_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_trade_off_plate_managed_funds_directly_with_the_fund_manager(WebDriver driver, String summary, String description, String amount, String units) throws InterruptedException {
		dropdown(driver, off_platform_managed_funds_list_dropdown, "1V Venture Credit Fund");
		type_invest_radio_button.click();
		sd_form_scroll(driver, amount_field);
		amount_field.click();
		amount_field.sendKeys(amount);
		units_to_redeem.click();
		units_to_redeem.sendKeys(units);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver Invest_term_deposit_directly_with_the_bank_provider(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Invest_term_deposit_directly_with_the_bank_provider_form);
		Thread.sleep(1000);
		Invest_term_deposit_directly_with_the_bank_provider_form.click();	
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_Invest_term_deposit_directly_with_the_bank_provider(WebDriver driver, String summary, String description, 
			String final_order_value, String amount) throws InterruptedException {
		amount_to_invest.click();
		amount_to_invest.sendKeys(amount);
		dropdown(driver, institution_dropdown, "NAB (min. investment: $25,000)");
		sd_form_scroll(driver, term_field);
		term_field.click();
		term_field.sendKeys(summary);
		Rate.click();
		Rate.sendKeys(final_order_value);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;			
	}
	public WebDriver Auto_invest_instructions(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Auto_invest_instructions_form);
		Thread.sleep(1000);
		Auto_invest_instructions_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Auto_invest_instructions(WebDriver driver, String summary, String description, String amount) throws InterruptedException {
		amount_to_invest.click();
		amount_to_invest.sendKeys(amount);
		start_date.click();
		today_date.click();
		sd_form_scroll(driver, APIR_code_no1);
		APIR_code_no1.click();
		APIR_code_no1.sendKeys(summary);
		APIR_code_no1_percent.click();
		APIR_code_no1_percent.sendKeys(amount);
		APIR_code_no2.click();
		enter_values_Auto_invest_instructions_2(driver, summary, amount);
		return driver;
	}
	public void enter_values_Auto_invest_instructions_2(WebDriver driver, String summary, String amount) throws InterruptedException {
		APIR_code_no2.sendKeys(summary);
		APIR_code_no2_percent.click();
		APIR_code_no2_percent.sendKeys(amount);
		sd_form_scroll(driver, APIR_code_no3);
		APIR_code_no3.click();
		APIR_code_no3.sendKeys(summary);
		APIR_code_no3_percent.click();
		APIR_code_no3_percent.sendKeys(amount);
		Thread.sleep(1000);
		submit_button.click();
	}
	public WebDriver Break_an_existing_term_deposit_directly_with_the_bank_provider(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Break_an_existing_term_deposit_directly_with_the_bank_provider_form);
		Thread.sleep(1000);
		Break_an_existing_term_deposit_directly_with_the_bank_provider_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Break_an_existing_term_deposit_directly_with_the_bank_provider(WebDriver driver, String summary, String description, String amount) throws InterruptedException {
		dropdown(driver, institution_dropdown, "NAB (min. investment: $25,000)");
		amount_field.click();
		amount_field.sendKeys(amount);
		sd_form_scroll(driver, term_field);
		term_field.click();
		term_field.sendKeys(description);
		end_date.click();
		today_date.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver Rollover_an_existing_term_deposit_directly_with_the_bank_provider(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Rollover_an_existing_term_deposit_directly_with_the_bank_provider_form);
		Thread.sleep(1000);
		Rollover_an_existing_term_deposit_directly_with_the_bank_provider_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Rollover_an_existing_term_deposit_directly_with_the_bank_provider(WebDriver driver, String summary, String amount) throws InterruptedException {
		dropdown(driver, institution_dropdown, "NAB (min. investment: $25,000)");
		amount_field.click();
		amount_field.sendKeys(amount);
		sd_form_scroll(driver, term_field);
		term_field.click();
		term_field.sendKeys(summary);
		principal_only_radio_button.click();
		end_date.click();
		today_date.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;
	}
	public WebDriver Adviser_directly_off_platform_assets(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Adviser_directly_off_platform_assets_form);
		Thread.sleep(1000);
		Adviser_directly_off_platform_assets_form.click();	
		Thread.sleep(3000);
		return driver;			
	}
	public WebDriver enter_values_Adviser_directly_off_platform_assets(WebDriver driver, String summary, String description, String amount) throws InterruptedException {
		summary_and_description(driver, summary, description);
		sd_form_scroll(driver, trade_date);
		trade_date.click();
		today_date.click();
		settlement_date.click();
		today_date.click();
		amount_to_invest.click();
		amount_to_invest.sendKeys(amount);
		Thread.sleep(1000);
		submit_button.click();
		return driver;		
	}
	public WebDriver MWH_transaction_managed_funds(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Trade_accordian, 120);
		Trade_accordian.click();
		LOGGER.log(Level.INFO, "Trade accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, MWH_transaction_managed_funds_form);
		Thread.sleep(1000);
		MWH_transaction_managed_funds_form.click();	
		Thread.sleep(3000);
		return driver;			
	}
	public WebDriver enter_values_MWH_transaction_managed_funds(WebDriver driver, String summary, String description, String amount) throws InterruptedException {
		summary_and_description(driver, summary, description);
		sd_form_scroll(driver, APIR_code);
		APIR_code.click();
		APIR_code.sendKeys(summary);
		type_of_investment_buy_radio_button.click();
		sd_form_scroll(driver, amount_field);
		amount_field.click();
		amount_field.sendKeys(amount);
		MWH_Account_radio_button.click();
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver Create_service_desk_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, service_desk_management_accordian, 120);
		service_desk_management_accordian.click();
		LOGGER.log(Level.INFO, "service desk management accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, create_service_desk_account_form);
		Thread.sleep(1000);
		create_service_desk_account_form.click();	
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_Create_service_desk_account(WebDriver driver, String description) throws InterruptedException {
		wait_until_clickable(driver, full_name_field, 120);
		full_name_field.click();
		full_name_field.sendKeys(description);
		email_address_field.click();
		email_address_field.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver Deactivate_service_desk_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, service_desk_management_accordian, 120);
		service_desk_management_accordian.click();
		LOGGER.log(Level.INFO, "service desk management accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, deactivate_service_desk_account_form);
		Thread.sleep(1000);
		deactivate_service_desk_account_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Deactivate_service_desk_account(WebDriver driver, String description) throws InterruptedException {
		email_address_field.click();
		email_address_field.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
		return driver;	
	}
	public WebDriver Direct_debit_deposit_to_powerwrap_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, direct_debit_accordian, 120);
		direct_debit_accordian.click();
		LOGGER.log(Level.INFO, "direct debit accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, direct_debit_deposit_to_powerwrap_account_form);
		Thread.sleep(1000);
		direct_debit_deposit_to_powerwrap_account_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Direct_debit_deposit_to_powerwrap_account(WebDriver driver, String description, String amount, String account_number, String bSB_number) throws InterruptedException {
		amount_field.click();
		amount_field.sendKeys(amount);
		debit_account_name_field.click();
		debit_account_name_field.sendKeys(description);
		debit_bank_name_field.click();
		debit_bank_name_field.sendKeys(description);
		sd_form_scroll(driver, debit_bank_account_number_field);
		debit_bank_account_number_field.click();
		debit_bank_account_number_field.sendKeys(account_number);
		enter_values_Direct_debit_deposit_to_powerwrap_account_2(driver, bSB_number, description);
		return driver;
	}
	public void enter_values_Direct_debit_deposit_to_powerwrap_account_2(WebDriver driver, String description, String bSB_number) throws InterruptedException {
		debit_bank_account_BSB_field.click();
		debit_bank_account_BSB_field.sendKeys(bSB_number);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
		submit_button.click();
	}
	public WebDriver Reconciliations_query(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, report_and_reconciliations_accordian, 120);
		report_and_reconciliations_accordian.click();
		LOGGER.log(Level.INFO, "report and reconciliations accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, reconciliation_query_form);
		Thread.sleep(1000);
		reconciliation_query_form.click();	
		Thread.sleep(3000);
		return driver;		
	}
	public WebDriver enter_values_reconciliation_query(WebDriver driver, String description) throws InterruptedException {
		type_managed_funds_radio_button.click();
		sd_form_scroll(driver, Description_field);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;
	}
	public WebDriver Reporting_errors(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, report_and_reconciliations_accordian, 120);
		report_and_reconciliations_accordian.click();
		LOGGER.log(Level.INFO, "report and reconciliations accordian found");
		Thread.sleep(2000);
		sd_form_scroll(driver, reporting_errors_form);
		Thread.sleep(1000);
		reporting_errors_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_reporting_errors(WebDriver driver, String description) throws InterruptedException {
		reporting_query_type_Reporting_issues_radio_button.click();
		sd_form_scroll(driver, Description_field);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;
	}
	public WebDriver payment_to_a_nominated_account(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		payments_to_nominated_account_form.click();	
		Thread.sleep(3000);
		return driver;		
	}
	public WebDriver enter_values_payment_to_a_nominated_account(WebDriver driver, String description, String amount, 
			String account_number, String bSB_number) throws InterruptedException {
		next_day_overnight_radio_button.click();
		amount_field.click();
		amount_field.sendKeys(amount);
		sd_form_scroll(driver, narration_for_portfolio_field);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		payee_name_field.click();
		payee_name_field.sendKeys(description);
		enter_values_payment_to_a_nominated_account_2(driver, description, account_number, bSB_number);
		return driver;	
	}
	public void enter_values_payment_to_a_nominated_account_2(WebDriver driver, String description, 
			String account_number, String bSB_number) throws InterruptedException {
		payee_bank_account_number_field.click();
		payee_bank_account_number_field.sendKeys(account_number);
		payee_BSB_field.click();
		payee_BSB_field.sendKeys(bSB_number);
		message_to_recipient_field.click();
		message_to_recipient_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
	}
	public WebDriver payments_to_non_nominated_account_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		payments_to_non_nominated_account_form.click();	
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_payment_to_a_non_nominated_account(WebDriver driver, String description, String amount, 
			String account_number, String bSB_number) throws InterruptedException {
		next_day_overnight_radio_button.click();
		amount_field.click();
		amount_field.sendKeys(amount);
		sd_form_scroll(driver, narration_for_portfolio_field);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		payee_name_field.click();
		payee_name_field.sendKeys(description);
		payee_bank_account_number_field.click();
		enter_values_payment_to_a_non_nominated_account_2(driver, description, account_number, bSB_number);
		return driver;	
	}
	public WebDriver enter_values_payment_to_a_non_nominated_account_2(WebDriver driver, String description, 
			String account_number, String bSB_number) throws InterruptedException {
		payee_bank_account_number_field.sendKeys(account_number);
		payee_BSB_field.click();
		payee_BSB_field.sendKeys(bSB_number);
		message_to_recipient_field.click();
		message_to_recipient_field.sendKeys(description);
		SD_attachment.sendKeys(image_file.getAbsolutePath());
		Thread.sleep(5000);	
//		submit_button.click();
		return driver;	
	}
	public WebDriver other_payment_requests(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		other_payement_request_form.click();	
		Thread.sleep(3000);
		return driver;	
	}
	public WebDriver enter_values_other_payment_requests(WebDriver driver, String summary, String description, String amount, 
			String account_number, String bSB_number) throws InterruptedException {
		summary_and_description(driver, summary, description);
		sd_form_scroll(driver, next_day_overnight_radio_button);
		next_day_overnight_radio_button.click();
		payee_name_field.click();
		payee_name_field.sendKeys(description);
		payee_bank_account_number_field.click();
		payee_bank_account_number_field.sendKeys(account_number);
		payee_BSB_field.click();
		payee_BSB_field.sendKeys(bSB_number);
		enter_values_other_payment_requests_2(driver, description, amount);
		return driver;		
	}
	public WebDriver enter_values_other_payment_requests_2(WebDriver driver, String description, String amount) throws InterruptedException {
		sd_form_scroll(driver, amount_field);
		amount_field.click();
		amount_field.sendKeys(amount);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		message_to_recipient_field.click();
		message_to_recipient_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;		
	}
	public WebDriver BPAY_payment(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		BPAY_payments_form.click();	
		Thread.sleep(3000);
		return driver;			
	}
	public WebDriver enter_values_BPAY_payment_requests(WebDriver driver, String description, String amount,String account_number) throws InterruptedException {
		amount_field.click();
		amount_field.sendKeys(amount);
		BPAY_biller_code_field.click();
		BPAY_biller_code_field.sendKeys(account_number);
		BPAY_customer_reference_number_field.click();
		BPAY_customer_reference_number_field.sendKeys(account_number);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;		
	}
	public WebDriver International_payment(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		sd_form_scroll(driver, international_payment_form);
		Thread.sleep(1000);
		international_payment_form.click();	
		Thread.sleep(3000);
		return driver;		
	}
	public WebDriver enter_values_international_payment_request(WebDriver driver, String summary, String description, String amount, 
			String account_number, String bSB_number) throws InterruptedException {		
		dropdown(driver, from_cashbook_dropdown, "ANZ");
		dropdown(driver, currency_to_pay_out_dropdown, "AUD");
		Amount_international_payment.click();
		Amount_international_payment.sendKeys(amount);
		beneficiary_name.click();
		beneficiary_name.sendKeys(summary);
		sd_form_scroll(driver, beneficiary_address);
		beneficiary_address.click();
		beneficiary_address.sendKeys(summary);
		beneficiary_acc_no.click();
		enter_values_international_payment_request_2(driver, description, account_number);
		return driver;		
	}
	public void enter_values_international_payment_request_2(WebDriver driver, String description, String account_number ) throws InterruptedException {		
		beneficiary_acc_no.sendKeys(account_number);
		Beneficiary_Bank_SWIFT_BIC.click();
		Beneficiary_Bank_SWIFT_BIC.sendKeys(account_number);
		Intermediary_Bank_SWIFT_BIC.click();
		Intermediary_Bank_SWIFT_BIC.sendKeys(account_number);
		Message_to_Beneficiary.click();
		Message_to_Beneficiary.sendKeys(description);
		sd_form_scroll(driver, Narration_for_portfolio);
		Narration_for_portfolio.click();
		Narration_for_portfolio.sendKeys(description);Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
	}
	public WebDriver Setup_a_regualr_payment(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		sd_form_scroll(driver, setup_a_regular_payment_form);
		Thread.sleep(1000);
		setup_a_regular_payment_form.click();	
		Thread.sleep(3000);
		return driver;				
	}
	public WebDriver enter_values_Setup_a_regualr_payment_request(WebDriver driver, String summary, String description,String amount, 
			String account_number, String bSB_number) throws InterruptedException {
		amount_field.click();
		amount_field.sendKeys(amount);
		dropdown(driver, Payment_frequency, "Annually");
		payment_start_date.click();
		Thread.sleep(1000);
		payment_start_date.sendKeys(system_date);
		payment_start_date.sendKeys(Keys.ENTER);
		sd_form_scroll(driver, payee_name_field);
		payee_name_field.click();
		enter_values_Setup_a_regualr_payment_request_2(driver, summary, description, account_number, bSB_number);
		return driver;	
	}
	public void enter_values_Setup_a_regualr_payment_request_2(WebDriver driver, String summary, String description, String account_number, String bSB_number) throws InterruptedException {
		payee_name_field.sendKeys(summary);
		payee_account_number.click();
		payee_account_number.sendKeys(account_number);
		payee_BSB_field.click();
		payee_BSB_field.sendKeys(bSB_number);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		message_to_recipient_field.click();
		message_to_recipient_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
	}
	public WebDriver Retail_superannuation_and_pension_withdrawal(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		sd_form_scroll(driver, retail_superannuation_and_pension_withdrawal_form);
		Thread.sleep(1000);
		retail_superannuation_and_pension_withdrawal_form.click();	
		Thread.sleep(3000);
		return driver;						
	}
	public WebDriver enter_values_Retail_superannuation_and_pension_withdrawal_request(WebDriver driver, String summary, String description, String amount, 
			String account_number, String bSB_number) throws InterruptedException {
		amount_field.click();
		amount_field.sendKeys(amount);
		narration_for_portfolio_field.click();
		narration_for_portfolio_field.sendKeys(description);
		message_to_recipient_field.click();
		message_to_recipient_field.sendKeys(description);
		sd_form_scroll(driver, payee_name_field);
		payee_name_field.click();
		enter_values_Retail_superannuation_and_pension_withdrawal_request_2(driver, summary, description, account_number, bSB_number);
		return driver;		
	}
	public void enter_values_Retail_superannuation_and_pension_withdrawal_request_2(WebDriver driver, String summary, String description, String account_number, String bSB_number) throws InterruptedException {
		payee_name_field.sendKeys(summary);
		payee_bank_account_number_field.click();
		payee_bank_account_number_field.sendKeys(account_number);
		payee_BSB_field.click();
		payee_BSB_field.sendKeys(bSB_number);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
	}
	public WebDriver Notice_to_receive_custodian(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		sd_form_scroll(driver, notice_to_receive_custodian_form);
		Thread.sleep(1000);
		notice_to_receive_custodian_form.click();	
		Thread.sleep(3000);
		return driver;				
	}
	public WebDriver enter_values_Notice_to_receive_custodian_request(WebDriver driver, String summary, String description,
			String amount, String account_number, String bSB_number) throws InterruptedException {
		dropdown(driver, investor_type_dropdown, "171696 (W9 forms_US resident");
		dropdown(driver, custodian_currency_dropdown, "AUD");
		amount_custodian.click();
		amount_custodian.sendKeys(amount);
		settlement_date.click();
		today_date.click();
		sd_form_scroll(driver, ordering_institution_type_dropdown);
		dropdown(driver, ordering_institution_type_dropdown, "BIC/ Swift");
		enter_values_Notice_to_receive_custodian_request_2(driver, summary);
		enter_values_Notice_to_receive_custodian_request_3(driver, description);
		return driver;		
	}
	public void enter_values_Notice_to_receive_custodian_request_2(WebDriver driver, String summary) throws InterruptedException {
		ordering_institution_identifier_field.click();
		ordering_institution_identifier_field.sendKeys(summary);
		ordering_institution_name_field.click();
		ordering_institution_name_field.sendKeys(summary);
		ordering_institution_address_field.click();
		ordering_institution_address_field.sendKeys(summary);
		dropdown(driver, intermediary_institution_type_dropdown, "BIC");
		intermediary_institution_identifier_field.click();
		intermediary_institution_identifier_field.sendKeys(summary);
	}
	public void enter_values_Notice_to_receive_custodian_request_3(WebDriver driver, String description) throws InterruptedException {
		sd_form_scroll(driver, intermediary_bank_name);
		intermediary_bank_name.click();
		intermediary_bank_name.sendKeys(description);
		intermediary_bank_address_field.click();
		intermediary_bank_address_field.sendKeys(description);
		Description_field.click();
		Description_field.sendKeys(description);
		Thread.sleep(1000);
//		submit_button.click();
	}
	public WebDriver Transfer_from_BND_to_RBC_form(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, payments_accordion, 120);
		payments_accordion.click();
		LOGGER.log(Level.INFO, "payments accordion found");
		Thread.sleep(2000);
		sd_form_scroll(driver, Transfer_from_BND_to_RBC_form);
		Thread.sleep(1000);
		Transfer_from_BND_to_RBC_form.click();	
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_Transfer_from_BND_to_RBC_form_request(WebDriver driver, String sd_amount) throws InterruptedException {
		amount_field.click();
		amount_field.sendKeys(sd_amount);
		Thread.sleep(1000);
//		submit_button.click();
		return driver;
	}
	public WebDriver HIVE_support_request(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, HIVE_support_request, 120);
		HIVE_support_request.click();		
		LOGGER.log(Level.INFO, "HIVE support request");
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver enter_values_HIVE_support_request(WebDriver driver, String summary, String description, String account_number) throws InterruptedException {
		summary_and_description(driver, summary, description);
		dropdown(driver, issue_type_dropdown, "Problem raising a request");
		no_of_users_impacted.click();
		no_of_users_impacted.sendKeys(account_number);
		Thread.sleep(1000);
		submit_button.click();
		return driver;		
	}
	public WebDriver global_request_list(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_until_clickable(driver, global_request_list_button, 120);
		global_request_list_button.click();
		Thread.sleep(2000);
		return driver;
	}
	public WebDriver status_change(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, reporter_filter, 120);
		reporter_filter.click();
		me.click();
		wait_until_clickable(driver, select_all_checkbox, 120);
		select_all_checkbox.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
		change_to_closed.click();
		Thread.sleep(2000);
		return driver;
	}
	public WebDriver toast_message(WebDriver driver) {
		wait_until_clickable(driver, toast_message, 120);
		String message = toast_message.getText();
		LOGGER.log(Level.INFO, message);
		driver.close();
		return driver;
	}
}
