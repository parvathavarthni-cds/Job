package com.pw.pw_screens;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pw.publicLib.API_Handler;
import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.UIHandler_2;
import com.pw.publicLib.UIHandler_3;
import com.pw.publicLib.UIHandler_1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Risk_Based_Test_Set_for_HIVE_OP_BUY extends DataProvider{
	public static WebDriver driver;
	public static Float CMA_CASH_DATA;
	public static Float ANZ_Bank_CMA_CASH_DATA;
	public static Float Macquarie_Bank_CMA_CASH_DATA;
	private UIHandler_3 Pagefactory = PageFactory.initElements(driver, UIHandler_3.class);
	private Logger LOGGER = Logger.getLogger(SD_Forms_Through_GlobalActivity.class.getName());	
	
	@Given("^the user is on hive login screen$")
	public void the_user_is_on_hive_login_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
	}

	@When("^the user enters the username and password and clicks on submit$")
	public void the_user_enters_the_username_and_password_and_clicks_on_submit() throws Throwable {
		LOGGER.log(Level.INFO, "Chrome Browser Launched"); 
		UIHandler_1 Advisor_login = PageFactory.initElements(driver, UIHandler_1.class);
		Advisor_login.Adviser_login(driver, username, password);
		String title= driver.getTitle();
		Assert.assertEquals("Hive", title);
	    LOGGER.log(Level.INFO, "The HIVE"); 
	}

	@Then("^user should land on the portfolio valuation screen$")
	public void user_should_land_on_the_portfolio_valuation_screen() throws Throwable {
//		Pagefactory.investor_selection(driver, "PWL1 Test");
		Pagefactory.get_CMA_cash(driver);
	}

	@Given("^the user is on 'Add a BUY order' side tray$")
	public void the_user_is_on_Add_a_BUY_order_side_tray() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_BUY_order_side_tray(driver);
	}
	
	@When("^the user tries to place a BUY order with 'Order value' greater than 'Available CMA cash balance'$")
	public void the_user_tries_to_place_a_BUY_order_with_Order_value_greater_than_Available_CMA_cash_balance() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, CMA_CASH_DATA);
	}

	@Then("^the user should not be allowed to place the BUY order$")
	public void the_user_should_not_be_allowed_to_place_the_BUY_order() throws Throwable {
		Pagefactory.fill_neccessary_fields_to_enable_add_button(driver);
		Pagefactory.check_if_add_button_is_in_disabled_state(driver);
	}

	@And("^the user should see the error message 'You are exceeding your available funds'$")
	public void the_user_should_see_the_error_message_You_are_exceeding_your_available_funds() throws Throwable {
		Pagefactory.validate_exceeding_your_available_funds(driver);
	}

	@And("^the user creates a BUY order for value less than 'Available CMA cash balance'$")
	public void the_user_creates_a_BUY_order_for_value_less_than_Available_CMA_cash_balance() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, (float) 100);
		Pagefactory.fill_neccessary_fields_to_enable_add_button(driver);
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
		Pagefactory.click_on_add_button(driver);
	}

	@When("^the user tries to create a second BUY order for a value greater than the remaining 'Available CMA cash balance'$")
	public void the_user_tries_to_create_a_second_BUY_order_for_a_value_greater_than_the_remaining_Available_CMA_cash_balance() throws Throwable {
		Pagefactory.Add_a_BUY_order_side_tray(driver);
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, CMA_CASH_DATA);
	}

	@Then("^the user should not able to create a second BUY order$")
	public void the_user_should_not_able_to_create_a_second_BUY_order() throws Throwable {
		Pagefactory.fill_neccessary_fields_to_enable_add_button(driver);
		Pagefactory.check_if_add_button_is_in_disabled_state(driver);
	}
	
	@Then("^the user should see the error message \"([^\"]*)\"$")
	public void the_user_should_see_the_error_message(String arg1) throws Throwable {
		Pagefactory.validate_exceeding_your_available_funds(driver);
		Pagefactory.remove_draft_orders(driver);
	}

	@And("^the user should have values in 'open orders' for the selected portfolio and asset$")
	public void the_user_should_have_values_in_open_orders_for_the_selected_portfolio_and_asset() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.check_open_order_value(driver);
	}

	@When("^the user tries to create a new BUY order with a value greater than the remaining 'Available CMA cash balance' for the same portfolio$")
	public void the_user_tries_to_create_a_new_BUY_order_with_a_value_greater_than_the_remaining_Available_CMA_cash_balance_for_the_same_portfolio() throws Throwable {
		Pagefactory.enter_value_in_investment_amount_field(driver, CMA_CASH_DATA);
	}
	
	@Then("^the user should see the error message \"([^\"]*)\" in the side tray$")
	public void the_user_should_see_the_error_message_in_the_side_tray(String arg1) throws Throwable {
		Pagefactory.validate_exceeding_your_available_funds(driver);
//		Pagefactory.remove_the_created_order_from_orders_DB(driver);
	}

	@When("^the user selects one asset from the 'APL' dropdown$")
	public void the_user_selects_one_asset_from_the_APL_dropdown() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "BFL0001AU");
	}

	@Then("^the user should see the 'Available funds = CMA Cash - Other'$")
	public void the_user_should_see_the_Available_funds_CMA_Cash_Other() throws Throwable {
		Pagefactory.Available_funds_equals_to_CMA_Cash_minus_Other(driver);
	}

	@Given("^the user is on 'PWL HIVE MF Test' summary screen$")
	public void the_user_is_on_PWL_HIVE_MF_Test_summary_screen() throws Throwable {
		Pagefactory.investor_selection(driver, "PWL HIVE MF Test");
	}

	@And("^the portfolio holds multiple cash accounts$")
	public void the_portfolio_holds_multiple_cash_accounts() throws Throwable {
		Pagefactory.get_all_CMA_cash(driver);
	}

	@When("^the user tries to create a BUY order$")
	public void the_user_tries_to_create_a_BUY_order() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_BUY_order_side_tray(driver);
		Pagefactory.APL_asset_selection(driver, "BFL0001AU");
	}

	@Then("^the user should see only CMA cash as the 'Available funds'$")
	public void the_user_should_see_only_CMA_cash_as_the_Available_funds() throws Throwable {
		Pagefactory.ANZ_CMA_cash_as_the_Available_funds(driver);
		Pagefactory.close_current_portfolio_tab(driver);
		Pagefactory.investor_selection(driver, "PWL1 Test");
	}

	@When("^the user adds one BUY order with all the cash validations$")
	public void the_user_adds_one_BUY_order_with_all_the_cash_validations() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, (float) 100);
		Pagefactory.fill_neccessary_fields_to_enable_add_button(driver);
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
		Pagefactory.click_on_add_button(driver);
	}

	@And("^the user tries to create a second BUY order$")
	public void the_user_tries_to_create_a_second_BUY_order() throws Throwable {
		Pagefactory.Add_a_BUY_order_side_tray(driver);
		Pagefactory.APL_asset_selection(driver, "AAP0001AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, (float) 100);
	}

	@Then("^the user should see the same 'Minimum cash' value in the others section$")
	public void the_user_should_see_the_same_Minimum_cash_value_in_the_others_section() throws Throwable {
		Pagefactory.Minimum_cash_value_in_the_others_section(driver);
	}
	
	@Given("^the user is on 'Place orders' side tray$")
	public void the_user_is_on_Place_orders_side_tray() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
	}

	@And("^the user clicks on 'BUY' button And navigates to 'APL' dropdown$")
	public void the_user_clicks_on_BUY_button_And_navigates_to_APL_dropdown() throws Throwable {
		Pagefactory.Add_a_BUY_order_side_tray(driver);
	}

	@When("^the user searches any 'Managed funds' which is not present in the APL$")
	public void the_user_searches_any_Managed_funds_which_is_not_present_in_the_APL() throws Throwable {
		Pagefactory.APL_asset_search(driver, "HOW0165AU");
	}

	@Then("^the user should see 'No Assets' message inside the dropdown$")
	public void the_user_should_see_No_Holdings_message_inside_the_dropdown() throws Throwable {
		Pagefactory.No_Assets_check(driver);
	}

	@When("^the user searches the asset 'ADV(\\d+)AU' , which is not approved for the 'Smartwrap' badge$")
	public void the_user_searches_the_asset_ADV_AU_which_is_not_approved_for_the_Smartwrap_badge(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "ADV0050AU");
	}

	@When("^the user searches the asset 'Asset_code', which is under 'investment' product and 'smartwrap' badge but not under the dealer group 'Test organisation B\\((\\d+)\\)'$")
	public void the_user_searches_the_asset_Asset_code_which_is_under_investment_product_and_smartwrap_badge_but_not_under_the_dealer_group_Test_organisation_B(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "WHT0023AU");
	}

	@When("^the user searches the asset 'CRE(\\d+)AU' , which contains 'Operationally Ready = Yes' and 'IssueOK = Yes'$")
	public void the_user_searches_the_asset_CRE_AU_which_contains_Operationally_Ready_Yes_and_IssueOK_Yes(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "CRE0005AU");
	}

	@Then("^the user should see the fund in the asset dropdown$")
	public void the_user_should_see_the_fund_in_the_asset_dropdown() throws Throwable {
		Pagefactory.check_asset_is_in_the_APL_list(driver, "CRE0005AU");
	}

	@Given("^the user has removed the asset 'ASX(\\d+)AU' from the 'Smartwrap' badge$")
	public void the_user_has_removed_the_asset_ASX_AU_from_the_Smartwrap_badge(int arg1) throws Throwable {
	}

	@When("^the user searches the asset 'ASX(\\d+)AU' , which contains 'Operationally Ready = Yes' and 'IssueOK = Yes'$")
	public void the_user_searches_the_asset_ASX_AU_which_contains_Operationally_Ready_Yes_and_IssueOK_Yes(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "ASX8411AU");
	}

	@Given("^the user is on 'PWL(\\d+) Test' portfolio$")
	public void the_user_is_on_PWL_Test_portfolio(int arg1) throws Throwable {
		Pagefactory.validate_portfolio_tab_name(driver, "PWL1 Test");
	}

	@Given("^the user clicks on 'place an order' button and clicks on 'BUY' button to navigate to 'APL' dropdown$")
	public void the_user_clicks_on_place_an_order_button_and_clicks_on_BUY_button_to_navigate_to_APL_dropdown() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_BUY_order_side_tray(driver);
	}

	@When("^the user searches the asset 'MAQ(\\d+)AU' , which contains 'Operationally Ready = NO'$")
	public void the_user_searches_the_asset_MAQ_AU_which_contains_Operationally_Ready_NO(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "MAQ0058AU");
	}

	@When("^the user selects the asset 'ASC(\\d+)AU' , which contains 'Operationally Ready = YES' and 'IssueOK=N' in securities master$")
	public void the_user_selects_the_asset_ASC_AU_which_contains_Operationally_Ready_YES_and_IssueOK_N_in_securities_master(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "ASC0003AU");
		Pagefactory.check_asset_is_closed_for_investment_in_APL_list(driver);
	}

	@Then("^the user should see 'This product is closed for investment' message along with the option to 'view fund details'$")
	public void the_user_should_see_This_product_is_closed_for_investment_message_along_with_the_option_to_view_fund_details() throws Throwable {
		Pagefactory.select_closed_for_investment_asset_form_the_APL(driver);
	}

	@Given("^the user is on 'Add a BUY order' side tray under 'PWL(\\d+) Test' portfolio$")
	public void the_user_is_on_Add_a_BUY_order_side_tray_under_PWL_Test_portfolio(int arg1) throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.check_investor_name_orderpad_sidetray(driver);
		Pagefactory.Add_a_BUY_order_side_tray(driver);
	}

	@When("^the user selects the asset 'ETL(\\d+)AU'$")
	public void the_user_selects_the_asset_ETL_AU(int arg1) throws Throwable {
		Pagefactory.APL_asset_search(driver, "ETL0201AU");
	}

	@When("^user enters the amount '(\\d+)' in the 'investment amount' field And clicks on '\\+Add' button$")
	public void user_enters_the_amount_in_the_investment_amount_field_And_clicks_on_Add_button(int arg1) throws Throwable {
		Pagefactory.Check_minimum_order_size(driver);
	}

	@Then("^the user should see the error message 'Order should be at least \\$(\\d+)'$")
	public void the_user_should_see_the_error_message_Order_should_be_at_least_$(int arg1) throws Throwable {
		Pagefactory.assert_minimum_order_size(driver);
	}

	@And("^select one asset from the APL dropdown, which should have 'Disc-docs = WP' in the security master$")
	public void select_one_asset_from_the_APL_dropdown_which_should_have_Disc_docs_WP_in_the_security_master() throws Throwable {
		Pagefactory.APL_asset_selection(driver, "AUS0035AU");
		Pagefactory.enter_value_in_investment_amount_field(driver, (float) 100);
		Pagefactory.fill_neccessary_fields_to_enable_add_button(driver);
	}

	@When("^the user adds the BUY order and clicks on the 'Preview' button$")
	public void the_user_adds_the_BUY_order_and_clicks_on_the_Preview_button() throws Throwable {
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
		Pagefactory.click_on_add_button(driver);
		Pagefactory.navigate_to_preview_screen(driver);
	}

	@Then("^the user should see the 'Wholesale acknowledgement' checkbox in the preview screen$")
	public void the_user_should_see_the_Wholesale_acknowledgement_checkbox_in_the_preview_screen() throws Throwable {
		Pagefactory.check_the_Wholesale_acknowledgement_checkbox(driver);
	}

	@Given("^select one asset from the APL dropdown, which should have 'Disc-docs = RP' in the security master$")
	public void select_one_asset_from_the_APL_dropdown_which_should_have_Disc_docs_RP_in_the_security_master() throws Throwable {
		Pagefactory.select_asset_form_the_APL(driver, "ECL0339AU", (float) 100.00);
	}

	@Then("^the user should not see the 'Wholesale acknowledgement' checkbox in the preview screen$")
	public void the_user_should_not_see_the_Wholesale_acknowledgement_checkbox_in_the_preview_screen() throws Throwable {
		Pagefactory.check_there_is_no_Wholesale_acknowledgement_checkbox(driver);
	}
//
//	@Given("^the user has added two BUY orders one with wholesale fund '\\(Disc-docs=WP\\)' and another with retail fund '\\(Disc-docs=RP\\)'$")
//	public void the_user_has_added_two_BUY_orders_one_with_wholesale_fund_Disc_docs_WP_and_another_with_retail_fund_Disc_docs_RP() throws Throwable {
//
//	}
//
//	@Given("^also added two SELL orders one with wholesale fund '\\(Disc-docs=WP\\)' and another with retail fund '\\(Disc-docs=RP\\)'$")
//	public void also_added_two_SELL_orders_one_with_wholesale_fund_Disc_docs_WP_and_another_with_retail_fund_Disc_docs_RP() throws Throwable {
//
//	}
//
//	@When("^the user clicks on the 'Preview' button$")
//	public void the_user_clicks_on_the_Preview_button() throws Throwable {
//
//	}

	@Then("^the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen$")
	public void the_user_should_see_the_Disclaimer_acknowledgement_checkbox_in_the_preview_screen() throws Throwable {
		Pagefactory.check_the_Wholesale_acknowledgement_and_Disclaimer_acknowledgement_checkbox(driver);
	}

	@Then("^without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order$")
	public void without_selecting_the_Disclaimer_acknowledgement_checkbox_user_should_not_be_allowed_to_confirm_the_order() throws Throwable {
		Pagefactory.check_if_confirm_this_order_button_is_enabled(driver);
	}
	
	@Then("^the user should see 'Disclaimer acknowledgement' checkbox in the preview screen$")
	public void the_user_should_see_Disclaimer_acknowledgement_checkbox_in_the_preview_screen() throws Throwable {
		Pagefactory.check_the_Disclaimer_acknowledgement_checkbox(driver);
	}

//	@When("^the user selects 'Yes' radio button under 'Was Advice Given\\?' section$")
//	public void the_user_selects_Yes_radio_button_under_Was_Advice_Given_section() throws Throwable {
//
//	}
//
//	@Then("^the user should see Advice reason, Advice date, Advice summary and Advice method fields$")
//	public void the_user_should_see_Advice_reason_Advice_date_Advice_summary_and_Advice_method_fields() throws Throwable {
//
//	}
//
//	@Then("^Advice reason, Advice date, Advice method fields should be mandatory$")
//	public void advice_reason_Advice_date_Advice_method_fields_should_be_mandatory() throws Throwable {
//
//	}
//
//	@Then("^Advice summary field should be mAndatory only When the 'Other' option is selected in the 'Advice option' field$")
//	public void advice_summary_field_should_be_mAndatory_only_When_the_Other_option_is_selected_in_the_Advice_option_field() throws Throwable {
//
//	}
//
//	@When("^the user selects 'NO' radio button under 'Was Advice Given\\?' section$")
//	public void the_user_selects_NO_radio_button_under_Was_Advice_Given_section() throws Throwable {
//
//	}
//
//	@Then("^the other advice questions should be hidden$")
//	public void the_other_advice_questions_should_be_hidden() throws Throwable {
//
//	}
//
//	@When("^the user selects one asset from the APL dropdown$")
//	public void the_user_selects_one_asset_from_the_APL_dropdown() throws Throwable {
//
//	}
//
//	@Then("^the user should see the 'PDS acknowledgement' checkbox$")
//	public void the_user_should_see_the_PDS_acknowledgement_checkbox() throws Throwable {
//
//	}
//
//	@Then("^without selecting the 'PDS acknowledgement' checkbox user should not be allowed to add the order in the draft section$")
//	public void without_selecting_the_PDS_acknowledgement_checkbox_user_should_not_be_allowed_to_add_the_order_in_the_draft_section() throws Throwable {
//
//	}
}
