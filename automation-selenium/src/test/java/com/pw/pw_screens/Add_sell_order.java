package com.pw.pw_screens;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.UIHandler_1;
import com.pw.publicLib.UIHandler_2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_sell_order extends DataProvider{
	public static WebDriver driver;
	public static String p_name;
	
	@Given("^user is on Hive DashBoard screen$")
	public void user_is_on_Hive_DashBoard_screen() throws Throwable {
	    // Write code here to login and navigate to DashBoard screen
		PW_login launch_browser = new PW_login();
		driver = launch_browser.getdata(url);
		System.out.println("chrome browser launched");
		UIHandler_1 login = PageFactory.initElements(driver, UIHandler_1.class);
		driver = login.Adviser_login(driver, username, password);
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-logo")));
		String title= driver.getTitle();
		Assert.assertEquals("Hive",title);
		driver = login.check_investor_tab(driver);
		Thread.sleep(2000);
	}

	@When("^user selects any portfolio from portfolio dropdown which is up-to-date$")
	public void user_selects_any_portfolio_from_portfolio_dropdown_which_is_up_to_date() throws Throwable {
	    // Write code here to select any portfolio from global portfolio dropdown
		UIHandler_1 get_portfolio = PageFactory.initElements(driver, UIHandler_1.class);
		driver = get_portfolio.get_investor_portfolio_value(driver);
		driver = get_portfolio.portfolio_tab(driver);
	}

	@Then("^page should be navigated to selected Portfolio summary screen and ‘Place an Order’ button should be enabled on PV screen$")
	public void page_should_be_navigated_to_selected_Portfolio_summary_screen_and_Place_an_Order_button_should_be_enabled_on_PV_screen() throws Throwable {
	    // Write code here to validate the Place an order button
		UIHandler_2 place_an_order_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = place_an_order_button.place_an_order_button_mode(driver);
	}

	@Given("^user is on Portfolio screen$")
	public void user_is_on_Portfolio_screen() throws Throwable {
	    // Write code here to validate the portfolio screen
		System.out.println("print_valid_order_amount=>>>>"+valid_order_amount);
		driver.navigate().refresh();
	}

	@When("^the user clicks the ‘Place an order’ button$")
	public void the_user_clicks_the_Place_an_order_button() throws Throwable {
	    // Write code here to navigates the place an order side tray
		UIHandler_2 navigate_place_an_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = navigate_place_an_order.navigate_to_place_an_order_side_tray(driver);
	}

	@Then("^place order side tray should open$")
	public void place_order_side_tray_should_open() throws Throwable {
	    // Write code here to validate place an order side tray is open or not
		UIHandler_2 place_order_side_tray = PageFactory.initElements(driver, UIHandler_2.class);
		driver = place_order_side_tray.place_order_side_Tray(driver);
		
	}

	@And("^place order, portfolio dropdown should be pre-populated the selected portfolio tab$")
	public void place_order_portfolio_dropdown_should_be_pre_populated_the_selected_portfolio_tab() throws Throwable {
	    // Write code here to validate portfolio name is pre populated or not
		p_name = UIHandler_1.in_name;
		UIHandler_2 pv_name = PageFactory.initElements(driver, UIHandler_2.class);
		driver = pv_name.portfolio_name_validate(driver, p_name);
	}

	@Given("^user is on place an order side tray$")
	public void user_is_on_place_an_order_side_tray() throws Throwable {
	    // Write code here to navigates to place an order side tray
		this.place_order_side_tray_should_open();
	}

	@When("^user clicks the portfolio dropdown in `place an order` side tray$")
	public void user_clicks_the_portfolio_dropdown_in_place_an_order_side_tray() throws Throwable {
	    // Write code here to check the all the portfolio list on portfolio dropdown on side tray
		UIHandler_2 Validate_portfolioDrop = PageFactory.initElements(driver, UIHandler_2.class);
		driver = Validate_portfolioDrop.portfolio_dropdwon(driver);
		driver = Validate_portfolioDrop.PV_searchBox(driver);
	}

	@Then("^user should be able to search different portfolios from the portfolio dropdown$")
	public void user_should_be_able_to_search_different_portfolios_from_the_portfolio_dropdown() throws Throwable {
	    // Write code here to check the all the portfolio list on portfolio dropdown on side tray
		UIHandler_2 Validate_portfolioresult = PageFactory.initElements(driver, UIHandler_2.class);
		driver = Validate_portfolioresult.checkportfolio_result(driver);
	}

	@When("^the user clicks the sell order button$")
	public void the_user_clicks_the_sell_order_button() throws Throwable {
	    // Write code here that to click sell order button from place an order side tray
		UIHandler_2 sell_order_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = sell_order_button.click_sell_order_button(driver);
	}

	@Then("^‘Add a sell order’ extended side tray should be display$")
	public void add_a_sell_order_extended_side_tray_should_be_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UIHandler_2 sell_order_extended_sidetray = PageFactory.initElements(driver, UIHandler_2.class);
		driver = sell_order_extended_sidetray.add_sell_order_extended_side_tray(driver);
	}
	
	@Given("^user is on ‘Add a sell order’ extended side tray$")
	public void user_is_on_Add_a_sell_order_extended_side_tray() throws Throwable {
	    // Write code here to validatet the extended side tray portfolio holdings dropdown
		UIHandler_2 portfolio_holding_dropdown = PageFactory.initElements(driver, UIHandler_2.class);
		driver = portfolio_holding_dropdown.portfolio_holding_drop(driver);
	}
	
	@When("^the user clicks the cancel button from the extended side tray$")
	public void the_user_clicks_the_cancel_button_from_the_extended_side_tray() throws Throwable {
	    // Write code here that to click the cancel button from add sell order extended side tray
		UIHandler_2 Extended_side_tray_cancel = PageFactory.initElements(driver, UIHandler_2.class);
		driver = Extended_side_tray_cancel.click_cancel_button(driver);
	}

	@Then("^extended side tray should be closed and the user should navigate back to place order side tray$")
	public void extended_side_tray_should_be_closed_and_the_user_should_navigate_back_to_place_order_side_tray() throws Throwable {
	    // Write code here to validate the extended side tray has closed and user should be navigates to the place an order screen 
		UIHandler_2 navigate_back_to_place_order_screen = PageFactory.initElements(driver, UIHandler_2.class);
		driver = navigate_back_to_place_order_screen.place_order_side_Tray(driver);
		driver = navigate_back_to_place_order_screen.click_sell_order_button(driver);
	}

	@When("^user search for any portfolio holding using the searchbox$")
	public void user_search_for_any_portfolio_holding_using_the_searchbox() throws Throwable {
	    // Write code here that to search portfolio holding using dropdown search
		UIHandler_2 portfolio_holding_search = PageFactory.initElements(driver, UIHandler_2.class);
		driver = portfolio_holding_search.portfolio_holdings_search(driver);
	}

	@Then("^user should get the result based on the search keyword and select the portfolio_holding$")
	public void user_should_get_the_result_based_on_the_search_keyword_and_select_the_portfolio_holding() throws Throwable {
	    // Write code here that to validate the portfolio holding search result
		UIHandler_2 validate_portfolio_holding_search = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_portfolio_holding_search.validate_portfolio_holdings_search(driver);
	}
	
	@And("^available units for that portfolio holding should be displayed on the screen with (\\d+) decimal places$")
	public void available_units_for_that_portfolio_holding_should_be_displayed_on_the_screen_with_decimal_places(int arg1) throws Throwable {
	    // Write code here that to validate the decimal places for the available units
		UIHandler_2 validate_decimal_places_available_units = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_decimal_places_available_units.validate_available_unit_decimal_palces(driver);
	}

	@When("^user finds the availble exit price of that portfolio holding on extended side tray$")
	public void user_finds_the_availble_exit_price_of_that_portfolio_holding_on_extended_side_tray() throws Throwable {
	    // Write code here that to get the  exit price of that portfolio holding
		UIHandler_2 get_exit_price_portfolio_holding = PageFactory.initElements(driver, UIHandler_2.class);
		driver = get_exit_price_portfolio_holding.get_exit_price(driver);
	}

	@Then("^available exit price for that unit should be displayed with est\\.label$")
	public void available_exit_price_for_that_unit_should_be_displayed_with_est_label() throws Throwable {
	    // Write code here that to validate the decimal places for exit price
		UIHandler_2 validate_estlabel = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_estlabel.estlabel_validation(driver);
	}

	@When("^the user clicks anywhere in the screen without entering anything on the order amount field$")
	public void the_user_clicks_anywhere_in_the_screen_without_entering_anything_on_the_order_amount_filed() throws Throwable {
	    // Write code here that to click somewhere in the extended side tray
		UIHandler_2 click_submit_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_submit_button.click_add_button(driver);
	}

	@Then("^error message should be displayed under the order amount screen$")
	public void error_message_should_be_displayed_under_the_order_amount_screen() throws Throwable {
	    // Write code here that to validate the error message
		UIHandler_2 check_error_message = PageFactory.initElements(driver, UIHandler_2.class);
		driver = check_error_message.validate_error_message(driver);
	}

	@When("^the user enters the Special character and text values in the order amount text box$")
	public void the_user_enters_the_Special_character_and_text_values_in_the_order_amount_text_box() throws Throwable {
	    // Write code here that to enter special character into the order amount textbox
		UIHandler_2 enter_special_character = PageFactory.initElements(driver, UIHandler_2.class);
		driver = enter_special_character.order_amount(driver, o_v_special_char);
	}

	@Then("^user should not be allowed to enter the special character and text values into the order amount field$")
	public void user_should_not_be_allowed_to_enter_the_special_character_and_text_values_into_the_order_amount_field() throws Throwable {
	    // Write code here that user should not allow to enter the special characters
		UIHandler_2 validate_special_character = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_special_character.check_special_char(driver);
	}

	@When("^the user didn’t enter/select anything on the screen$")
	public void the_user_didn_t_enter_select_anything_on_the_screen() throws Throwable {
	    // Write code here that to clear order amount text box
		UIHandler_2 clear_order_amount_textbox = PageFactory.initElements(driver, UIHandler_2.class);
		driver = clear_order_amount_textbox.clear_order_amount(driver);
	}

	@Then("^‘Add’ button should be in disable mode$")
	public void add_button_should_be_in_disable_mode() throws Throwable {
	    // Write code here that to validate add button should be disabled if user should not enter anything
		UIHandler_2 add_button_status = PageFactory.initElements(driver, UIHandler_2.class);
		driver = add_button_status.add_button(driver);
	}

	@When("^the user enters more than available units$")
	public void the_user_enters_more_than_available_units() throws Throwable {
		// Write code here that to enter more then availble units in order amount field
		UIHandler_2 enter_maximum_order_amount = PageFactory.initElements(driver, UIHandler_2.class);
		driver = enter_maximum_order_amount.enter_maximum_order_value(driver, max_order_value);
	}

	@Then("^error message should be displayed under the order amount text box$")
	public void error_message_should_be_displayed_under_the_order_amount_text_box() throws Throwable {
		// Write code here that to validate the alert message for maximum order values
		UIHandler_2 enter_maximum_order_amount_alert = PageFactory.initElements(driver, UIHandler_2.class);
		driver = enter_maximum_order_amount_alert.validate_error_message(driver);
	}

	@When("^the user enter the enters the order amount which is equal to available units$")
	public void the_user_enter_the_enters_the_order_amount_which_is_equal_to_available_units() throws Throwable {
		// Write code here that to enter equal available units
		UIHandler_2 enter_same_order_units = PageFactory.initElements(driver, UIHandler_2.class);
		driver = enter_same_order_units.redeem_order(driver);
	}

	@Then("^user should get the 'Full redemption' message under the order value text box$")
	public void user_should_get_the_Full_redemption_message_under_the_order_value_text_box() throws Throwable {
		// Write code here that to validate redeem error message
		UIHandler_2 redeem_error_message = PageFactory.initElements(driver, UIHandler_2.class);
		driver = redeem_error_message.validate_error_message(driver);
	}

//	@When("^the order value is less than the transaction fee$")
//	public void the_order_value_is_less_than_the_transaction_fee() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//	}
//
//	@Then("^user should not allow placing the order and error message should be displayed on the screen and \\+add or update button should be disabled$")
//	public void user_should_not_allow_placing_the_order_and_error_message_should_be_displayed_on_the_screen_and_add_or_update_button_should_be_disabled() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//	}

	@When("^the user enters the order units$")
	public void the_user_enters_the_order_units() throws Throwable {
		// Write code here that to enter the valid order amount in order amount text box
		UIHandler_2 enter_o_amount = PageFactory.initElements(driver, UIHandler_2.class);
		driver = enter_o_amount.order_amount(driver, valid_order_amount);
	}

	@Then("^order units should be multiplied with the exit price and the result should be subtracted with a transaction fee$")
	public void order_units_should_be_multiplied_with_the_exit_price_and_the_result_should_be_subtracted_with_a_transaction_fee() throws Throwable {
		// Write code here to validate the calculations of final price
		UIHandler_2 order_value_est = PageFactory.initElements(driver, UIHandler_2.class);
		driver = order_value_est.order_value_et(driver, final_order_value);
		
	}
	@And("^Final calculated value should be displayed as order value est with (\\d+) decimal places$")
	public void final_calculated_value_should_be_display_as_order_value_est_with_decimal_places(int arg1) throws Throwable {
		// Write code here that to validate the decimal places of order value
		UIHandler_2 order_value_est_decimal = PageFactory.initElements(driver, UIHandler_2.class);
		driver = order_value_est_decimal.order_value_decimal(driver);
	}
	
	@When("^user select the ’No’ option$")
	public void user_select_the_No_option() throws Throwable {
	    // Write code here to click the 'No' check-box from advice given option
		UIHandler_2 adviser_given_no = PageFactory.initElements(driver, UIHandler_2.class);
		driver = adviser_given_no.NO_adviser_given(driver);
	}

	@Then("^'Advice given' details should not be displayed$")
	public void advice_given_details_should_not_be_displayed() throws Throwable {
		UIHandler_2 validate_adviser_given_no = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_adviser_given_no.validate_NO_adviser_given(driver);
	}

	@When("^user select the ’Yes’ option$")
	public void user_select_the_Yes_option() throws Throwable {
	    // Write code here to validate clicking the yes checkbox for adviser given option
		UIHandler_2 adviser_given_yes = PageFactory.initElements(driver, UIHandler_2.class);
		driver = adviser_given_yes.Yes_adviser_given(driver);
	}

	@Then("^advice reason, date, summary and advice method fields should be display under the advice given label$")
	public void advice_reason_date_summary_and_advice_method_fields_should_be_display_under_the_advice_given_label() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		UIHandler_2 validate_adviser_given_yes = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_adviser_given_yes.validate_Yes_adviser_given(driver);
	}

	@And("^Date field should have todays's field as default$")
	public void date_field_should_have_todays_s_field_as_default() throws Throwable {
	    // Write code here to validate the advice date with current date
		UIHandler_2 validate_advice_date = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_advice_date.advice_date(driver);
	}
	@Then("^add button should be enabled$")
	public void add_button_should_be_enabled() throws Throwable {
	    // Write code here to validate add button enable or not
		UIHandler_2 add_button_enabled = PageFactory.initElements(driver, UIHandler_2.class);
		driver = add_button_enabled.add_button_enable(driver);
	}


	@When("^the user selects the disclaimer footer message checkbox along with complete all the mandatory fields$")
	public void the_user_selects_the_disclaimer_footer_message_checkbox_along_with_complete_all_the_mandatory_fields() throws Throwable {
	    // Write code here to select the disclaimer check-box
		UIHandler_2 disclaimer_checkbox = PageFactory.initElements(driver, UIHandler_2.class);
		driver = disclaimer_checkbox.disclaimer_content(driver);
	}

//	@Then("^add button should be enabled$")
//	public void add_button_should_be_enabled() throws Throwable {
//	    // Write code here to validate add button enable or not
//		UIHandler_2 add_button_enabled = PageFactory.initElements(driver, UIHandler_2.class);
//		driver = add_button_enabled.add_button_enable(driver);
//	}

	@When("^the user clicks the add button from Add a sell order extended side tray$")
	public void the_user_clicks_the_add_button_from_Add_a_sell_order_extended_side_tray() throws Throwable {
	    // Write code here to click the add button after entered all the mandatory details
		UIHandler_2 click_add_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_add_button.add_button_click(driver);
	}

	@Then("^order should be saved as draft order and should be displayed on the place order screen$")
	public void order_should_be_saved_as_draft_order_and_should_be_displayed_on_the_place_order_screen() throws Throwable {
	    // Write code here to validate order details in draft order screen
		UIHandler_2 validate_order_on_draft_orders = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_order_on_draft_orders.added_orders_draft_orders(driver);
	}

	@Given("^user is on the draft order screen$")
	public void user_is_on_the_draft_order_screen() throws Throwable {
	    // Write code here to validate the user is on draft order screen or not
		UIHandler_2 validate_user_is_on_draft = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_user_is_on_draft.draft_order_lable(driver);
	}

	@When("^user click the available draft order$")
	public void user_click_the_available_draft_order() throws Throwable {
	    // Write code here to click the available draft order
		UIHandler_2 validate_user_clicks_draft_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_user_clicks_draft_order.click_draft_order(driver);
	}

	@Then("^add sell order extended side tray should open and user should be able to edit the order$")
	public void add_sell_order_extended_side_tray_should_open_and_user_should_be_able_to_edit_the_order() throws Throwable {
	    // Write code here to validate the edit order screen
		UIHandler_2 validate_edit_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_edit_order.edit_order_screen(driver);
	}

	@Given("^user is on the edit order screen$")
	public void user_is_on_the_edit_order_screen() throws Throwable {
	    // Write code here to validate user is on edit order screen
		UIHandler_2 validate_user_is_on_edit_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_user_is_on_edit_order.edit_order_screen(driver);
	}

	@When("^user changes the different asset or order value$")
	public void user_changes_the_different_asset_or_order_value() throws Throwable {
	    // Write code here to update the order value
		UIHandler_2 udpate_order_amount = PageFactory.initElements(driver, UIHandler_2.class);
		driver = udpate_order_amount.order_amount_update(driver, valid_order_amount_udpated);
	}

	@And("^click the update button$")
	public void click_the_update_button() throws Throwable {
	    // Write code here to click the update button
		UIHandler_2 udpate_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = udpate_button.add_button_click(driver);
	}

	@Then("^updated new changes should be displayed in the draft order screen$")
	public void updated_new_changes_should_be_displayed_in_the_draft_order_screen() throws Throwable {
	    // Write code here to validate updated changes is displaying in Draft order screen or not
		UIHandler_2 validate_udpated_value = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_udpated_value.added_orders_draft_orders(driver);
		driver = validate_udpated_value.updated_details(driver, final_order_value_updated);
	}

	@When("^the user clicks the sell button and places the another order$")
	public void the_user_clicks_the_sell_button_and_places_the_another_order() throws Throwable {
	    // Write code here to create the another order
		UIHandler_2 place_second_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = place_second_order.create_second_order(driver, valid_order_amount);
	}

	@Then("^newly placed order should be displayed under the previous order on the draft order screen$")
	public void newly_placed_order_should_be_displayed_under_the_previous_order_on_the_draft_order_screen() throws Throwable {
	    // Write code here to validate newly created order is displaying or not
		UIHandler_2 validate_second_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_second_order.validate_created_new_order(driver);
	}

	@When("^user clicks the close button for any draft order card$")
	public void user_clicks_the_close_button_for_any_draft_order_card() throws Throwable {
	    // Write code here to validate the close order icon on draft order
		UIHandler_2 click_close_draft_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_close_draft_order.close_order(driver);
	}

	@Then("^confirmation pop-up message should be displayed on the screen$")
	public void confirmation_pop_up_message_should_be_displayed_on_the_screen() throws Throwable {
	    // Write code here to validate pop-up is displaying or not
		UIHandler_2 validate_draft_order_remove_confirmationp_popup = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_draft_order_remove_confirmationp_popup.validate_order_remove_confirmation_popup(driver);
	}

	@Given("^user is can able to view the confirmation pop-up for close order$")
	public void user_is_can_able_to_view_the_confirmation_pop_up_for_close_order() throws Throwable {
	    // Write code here to make sure user can able to see the popup
		UIHandler_2 confirm_remove_order_popup = PageFactory.initElements(driver, UIHandler_2.class);
		driver = confirm_remove_order_popup.validate_order_remove_confirmation_popup(driver);
	}

	@When("^the user clicks the Go back button$")
	public void the_user_clicks_the_Go_back_button() throws Throwable {
	    // Write code here to click the cancel button from the confirm popup
		UIHandler_2 click_goback_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_goback_button.go_back_button_confirm_popup(driver);
	}

	@Then("^that order should not be closed and order should be displayed on the draft order screen$")
	public void that_order_should_not_be_closed_and_order_should_be_displayed_on_the_draft_order_screen() throws Throwable {
	    // Write code here to validate order is not cancelled
		UIHandler_2 draft_order_not_cancelled = PageFactory.initElements(driver, UIHandler_2.class);
		driver = draft_order_not_cancelled.validate_draft_order(driver);
	}

	@Given("^user is can able to view the confirmation popup for close order$")
	public void user_is_can_able_to_view_the_confirmation_popup_for_close_order() throws Throwable {
		UIHandler_2 user_finds_close_order_pop_up = PageFactory.initElements(driver, UIHandler_2.class);
		driver = user_finds_close_order_pop_up.close_order_popup(driver);
		
	}
	
	@When("^the user clicks the cancel order button$")
	public void the_user_clicks_the_cancel_order_button() throws Throwable {
	    // Write code here to validate the cancel order from confirm popup
		UIHandler_2 click_cancel_order_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_cancel_order_button.cancel_button_confirm_pop_up(driver);
	}

	@Then("^that particular order should be get disappear from the draft order screen$")
	public void that_particular_order_should_be_get_disappear_from_the_draft_order_screen() throws Throwable {
	    // Write code here to validate the cancelled draft order is still displaying or not
		UIHandler_2 validate_cancelled_draft_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_cancelled_draft_order.order_cancelled(driver);
	}
	
	@When("^the user clicks the preview button from the draft order screen$")
	public void the_user_clicks_the_preview_button_from_the_draft_order_screen() throws Throwable {
	    // Write code here to click the preview order button from draft order screen
		UIHandler_2 click_preview_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_preview_order.preview_order_button_click(driver);
	}

	@Then("^User should navigate to the preview order screen$")
	public void user_should_navigate_to_the_preview_order_screen() throws Throwable {
	    // Write code here to validate preview screen is displaying or not
		UIHandler_2 transaction_summary = PageFactory.initElements(driver, UIHandler_2.class);
		driver = transaction_summary.preview_order_screen(driver);
	}

	@And("^transaction summary value on preview order screen and addition of draft orders value should be same$")
	public void transaction_summary_value_on_preview_order_screen_and_addition_of_draft_orders_value_should_be_same() throws Throwable {
	    // Write code here to validate transaction summary on preview order screen
		UIHandler_2 validate_transaction_summary = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_transaction_summary.sumary_order_value(driver, final_order_value_updated);
	}

	@Given("^user is on the preview order screen$")
	public void user_is_on_the_preview_order_screen() throws Throwable {
	    // Write code here to make sure given user is on preview order screen
		UIHandler_2 preview_order = PageFactory.initElements(driver, UIHandler_2.class);
		driver = preview_order.preview_order_screen(driver);
	}

	@When("^the user finds before and after portfolio impact of the available units$")
	public void the_user_finds_before_and_after_portfolio_impact_of_the_available_units() throws Throwable {
	    // Write code here to validate the before and after portfolio impacts units
		UIHandler_2 get_portfolio_impact_units = PageFactory.initElements(driver, UIHandler_2.class);
		driver = get_portfolio_impact_units.after_portfolio_impacts(driver);
	}

	@Then("^available units should be reduced based on the order units for that Asset type$")
	public void available_units_should_be_reduced_based_on_the_order_units_for_that_Asset_type() throws Throwable {
	    // Write code here to validate units on before and after view
		UIHandler_2 validate_portfolio_impact_units = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_portfolio_impact_units.validate_impact_portfolio_units(driver, portfolio_impact_units);
	}

	@And("^Asset name and asset code should be displayed under the before and after impacts of Units$")
	public void asset_name_and_asset_code_should_be_displayed_under_the_before_and_after_impacts_of_Units() throws Throwable {
	    // Write code here to validate asset name and code in portfolio impacts screen
		UIHandler_2 validate_asset_name = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_asset_name.asset_name_preview_screen(driver);
	}

	@When("^user clicks the back button$")
	public void user_clicks_the_back_button() throws Throwable {
	    // Write code here to click the back button
		UIHandler_2 validate_click_preview_back_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_click_preview_back_button.preview_back(driver);
	}

	@Then("^User should be navigated to the order draft screen$")
	public void user_should_be_navigated_to_the_order_draft_screen() throws Throwable {
	    // Write code here to validate user navigated to draft order screen
		UIHandler_2 validate_draft_orders = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_draft_orders.draft_order_screen_validation(driver);
		
	}

	@And("^the user didn’t select the disclaimer checkbox$")
	public void the_user_didn_t_select_the_disclaimer_checkbox() throws Throwable {
	    // Write code here to user didn't select disclimer checkbox
		Thread.sleep(5000);
	}

	@Then("^Confirm order button should be in disable mode$")
	public void confirm_order_button_should_be_in_disable_mode() throws Throwable {
	    // Write code here to validate confirm order button should be disabled
		UIHandler_2 validate_confirm_order_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_confirm_order_button.confirm_order_button_mode(driver);
	}
	
	@When("^user clicks the disclaimer link from the preview order screen footer$")
	public void user_clicks_the_disclaimer_link_from_the_preview_order_screen_footer() throws Throwable {
	    // Write code here to click the disclaimer link text
		UIHandler_2 validate_disclaimer_link = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_disclaimer_link.disclaimer_link(driver);
	}

	@Then("^Disclaimer popup should be display$")
	public void Disclaimer_popup_should_be_display() throws Throwable {
	    // Write code here to validate disclaimer pop_up message
		UIHandler_2 validate_disclaimer_popup = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_disclaimer_popup.disclaimer_popup(driver);
	}

	@When("^User selects the disclaimer checkbox$")
	public void user_selects_the_disclaimer_checkbox() throws Throwable {
	    // Write code here to click disclaimer checkbox
		UIHandler_2 select_disclaimer_checkbox = PageFactory.initElements(driver, UIHandler_2.class);
		driver = select_disclaimer_checkbox.disclaimer_check_box(driver);
	}

	@Then("^Order Confirm button should be enabled$")
	public void order_Confirm_button_should_be_enabled() throws Throwable {
	    // Write code here to validate confirm button enabled or not
		UIHandler_2 validate_confirm_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = validate_confirm_button.confirm_order_button_enabled(driver);
	}

	@When("^User click the order confirm button after selecting all the mandatory fields$")
	public void user_click_the_order_confirm_button_after_selecting_all_the_mandatory_fields() throws Throwable {
	    // Write code here to click the confirm order button
		UIHandler_2 click_confirm_order_button = PageFactory.initElements(driver, UIHandler_2.class);
		driver = click_confirm_order_button.confirm_order_button_click(driver);
	}
	
	@Then("^Order should be submitted$")
	public void order_should_be_submitted() throws Throwable {
	    // Write code here to validate order is submitted or not
		UIHandler_2 valdiate_order_confirmation_message = PageFactory.initElements(driver, UIHandler_2.class);
		driver = valdiate_order_confirmation_message.valdiate_order_confirmation(driver);
	}

	@Then("^unique reference number should be generated for each order on order confirmation screen$")
	public void unique_reference_number_should_be_generated_for_each_order_on_order_confirmation_screen() throws Throwable {
	    // Write code here to validate reference number
		UIHandler_2 valdiate_order_reference_code = PageFactory.initElements(driver, UIHandler_2.class);
		driver = valdiate_order_reference_code.reference_number(driver);
		driver.quit();
	}
}
