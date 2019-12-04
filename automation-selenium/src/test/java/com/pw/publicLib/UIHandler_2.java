package com.pw.publicLib;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIHandler_2 extends Page_factory{
	public static String request;
	public static String portfolio;
	public static String request_type;
	public static String requestno;
	public static String status;
	public static String s_request_id;
	public static String another_PV;
	public static String values;
	public static String portfolio_holding;
	public static String after_portfolio_impacts;
	public static int decimalPlaces;
	public static int exitPrice_decimalPlaces;
	public static String exitpricevalue;
	public static List<Integer> payment_forms = new ArrayList<Integer>();
	public static List<Integer> Queries_forms = new ArrayList<Integer>();
	public static List<Integer> SD_Form_Count = new ArrayList<Integer>();
	public static List<WebElement> count_of_comments = new ArrayList<WebElement>();
	public static List<String> status_check = new ArrayList<String>();
	public static List<String> comments_sort = new ArrayList<String>();
	public static List<String> comments_sorted = new ArrayList<String>();
	public static List<WebElement> activity = new ArrayList<WebElement>();
	
	private Logger LOGGER = Logger.getLogger(SD_UIHandler.class.getName());	

	public WebDriver global_request_list(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_drop, 120);
		request_drop.click();
		wait_by_visibility(driver, Request_ID_filter, 120);
		Assert.assertTrue(Request_ID_filter.isDisplayed());
		LOGGER.log(Level.INFO, "Global Request list is now open"); 
		return driver;
	}
	
	public WebDriver navigate_to_SD_request_group_side_tray(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		activity_global.click();
		wait_by_visibility(driver, Queries_group, 120);
		String Label = most_used_lable.getText();
		Assert.assertEquals(Label, "Most used");
		LOGGER.log(Level.INFO, "Most used section is available"); 
		return driver;
	}

	public WebDriver browse_by_topic(WebDriver driver) throws InterruptedException {
		String Label = browse_by_topic_lable.getText();
		LOGGER.log(Level.INFO, Label); 
		Assert.assertEquals(Label, "Browse by topics");
		LOGGER.log(Level.INFO, "Browse by topics is available"); 
		return driver;
	}
	
	public WebDriver most_used_payments(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Payments_button, 120);
		Payments_button.click();
		return driver;
	}
	
	public WebDriver payments_group(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, payment_to_a_nominated_account_form, 120);
		String payment_group_1st_form_name = payment_to_a_nominated_account_form.getText();
		Assert.assertEquals(payment_group_1st_form_name, "Payment to a nominated account");
		LOGGER.log(Level.INFO, "Payment group is now Open"); 
		payment_to_a_nominated_account_form.click();
		return driver;
	}
	
	public WebDriver most_used_Report_an_issue(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Report_an_issue_button, 120);
		Report_an_issue_button.click();
		return driver;
	}
	
	public WebDriver query_group(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, General_query_request, 120);
		String query_group_1st_form_name = General_query_request.getText();
		Assert.assertEquals(query_group_1st_form_name, "General query");
		LOGGER.log(Level.INFO, "Query group is now Open"); 
		General_query_request.click();
		return driver;
	}
	
	public WebDriver most_used_Hive_support_request(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Support_request_button, 120);
		Support_request_button.click();
		return driver;
	}
	
	public WebDriver Hive_support_request(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, HIVE_Support_Request_label, 120);
		String Form_name = HIVE_Support_Request_label.getText();
		Assert.assertEquals(Form_name, "HIVE Support Request");
		LOGGER.log(Level.INFO, "Support Request is now Open"); 
		return driver;
	}
	
	public WebDriver navigate_to_dashboard(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
		check_investor_tab(driver);	
		return driver;
	}
	
	public WebDriver navigate_to_global_request_dropdown(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		request_drop.click();
		wait_by_visibility(driver, Request_ID_filter, 120);
		return driver;
	}
	
	public WebDriver Search_by_Request_ID_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Request_ID_filter.isDisplayed());
		Request_ID_filter.click();
		LOGGER.log(Level.INFO, "Request ID filter is enable"); 
		Request_ID_filter.sendKeys("66322");
		Request_ID_filter.sendKeys(Keys.ENTER);
		return driver;
	}
	
	public WebDriver Result_for_Search_by_Request_ID_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		String Request_ID = request_list_first_record_Request_ID_value.getText();
		Assert.assertEquals(Request_ID, "66322");
		LOGGER.log(Level.INFO, "66322 Request is available"); 
		return driver;
	}
	
	public WebDriver Search_by_Portfolio_name_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_name_filter.isDisplayed());
		Portfolio_name_filter.click();
		LOGGER.log(Level.INFO, "Portfolio name filter is enable"); 
		Portfolio_name_filter.sendKeys("PWL1 Test");
		Portfolio_name_filter.sendKeys(Keys.ENTER);
		return driver;
	}
	
	public WebDriver Result_for_Search_by_portfolio_name_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		String portfolio_name = request_list_first_record_portfolio_name_value.getText();
		Assert.assertEquals(portfolio_name, "PWL1 Test");
		LOGGER.log(Level.INFO, "PWL1 Test is available"); 
		return driver;
	}
	
	public WebDriver Search_by_Reporter_name_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Reporter_dropdown_filter.isDisplayed());
		Reporter_dropdown_filter.click();
		LOGGER.log(Level.INFO, "Reporter name filter is active"); 
		Me_option.click();
		Thread.sleep(4000);
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		Reporter_dropdown_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Reporter_name_check(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		request_list_first_record.click();
		wait_by_visibility(driver, request_details_sidetray_x_button, 120);
		String Current_user = Me_label_in_sidetray.getText();
		Assert.assertEquals(Current_user, "by me");
		LOGGER.log(Level.INFO, "Reporter name is same"); 
		return driver;
	}
	
	public WebDriver Search_by_type_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Type_filter.isDisplayed());
		Type_filter.click();
		LOGGER.log(Level.INFO, "Type filter is active"); 
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("General query");
		general_query_option.click();
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		type_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_type_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		String Type = request_list_first_record_type_value.getText();
		Assert.assertEquals(Type, "General query");
		LOGGER.log(Level.INFO, "General query is available"); 
		return driver;
	}
	
	public WebDriver Search_by_status_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Status_filter.isDisplayed());
		Status_filter.click();
		LOGGER.log(Level.INFO, "Status filter is active"); 
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("closed");
		Closed_option.click();
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		Status_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_status_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		String status = request_list_first_record_status_value.getText();
		Assert.assertEquals(status, "Closed");
		LOGGER.log(Level.INFO, "Closed status is available"); 
		return driver;
	}
	
	public WebDriver Search_by_date_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Date_filter.isDisplayed());
		Date_filter.click();
		LOGGER.log(Level.INFO, "Date filter is active"); 
		Today_option.click();
		Date_Apply_button.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_date_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		String Request_date = request_list_first_record_date_value.getText();
		Assert.assertEquals(Request_date, system_date);
		LOGGER.log(Level.INFO, "Date is available"); 
		return driver;
	}
	
	public WebDriver Search_by_Custom_range_date_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Date_filter.isDisplayed());
		Date_filter.click();
		LOGGER.log(Level.INFO, "Date filter is Applied"); 
		custom_range_option.click();
		from_date.clear();
		from_date.sendKeys("01/01/2019");
		Date_Apply_button.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_custom_range_date_filter(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		LOGGER.log(Level.INFO, "Custom Date is Applied"); 
		return driver;
	}
	
	public WebDriver first_50_request(WebDriver driver) throws InterruptedException {
		Boolean status = pagination_next_button.isEnabled();
		if(status) {
			select_all_checkbox.click();
			String ticket_count = selected_tickets_count.getText();
			Assert.assertEquals(ticket_count, "50 Selected");
			LOGGER.log(Level.INFO, ticket_count); 
			cancel_button.click();
		}
		else {
			LOGGER.log(Level.INFO, "There is no next page avilable"); 
		}
		return driver;
	}
	
	public WebDriver applying_multiple_filters_in_request(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_name_filter.isDisplayed());
		Portfolio_name_filter.click();
		Portfolio_name_filter.sendKeys("PWL1 Test");
		Portfolio_name_filter.sendKeys(Keys.ENTER);
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		Reporter_dropdown_filter.click();
		Me_option.click();
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		applying_multiple_filters_in_request2(driver);
		return driver;
	}
	
	public WebDriver applying_multiple_filters_in_request2(WebDriver driver) throws InterruptedException {
		Reporter_dropdown_filter_after_value_selection.click();
		Type_filter.click();
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("General query");
		general_query_option.click();
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		type_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver second_page_in_the_pagination(WebDriver driver) throws InterruptedException {
		Boolean status = pagination_next_button.isEnabled();
		if(status) {
			page_no_2.click();
			LOGGER.log(Level.INFO, "Navigated to next page"); 
			wait_by_visibility(driver, request_list_Request_ID_column, 120);
		}
		Result_for_Search_by_portfolio_name_filter(driver);
		Reporter_name_check(driver);
		Result_for_Search_by_type_filter(driver);
		return driver;
	}
	
	public WebDriver next_50_request(WebDriver driver) throws InterruptedException {
		first_50_request(driver);
		return driver;
	}
	
	public WebDriver Click_global_new_Activity(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_until_clickable(driver, request_drop, 120);
		request_drop.click();
		wait_until_clickable(driver, activity_global, 120);
		try {
			activity_global.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			LOGGER.log(Level.INFO, "StaleElementReferenceException"); 
			activity_global.click();
			LOGGER.log(Level.INFO, "Element clicked successfully"); 
		}
		return driver;	
	}
	
	public WebDriver General_query(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Queries_group, 120);
		Thread.sleep(1000);
		Queries_group.click();
		LOGGER.log(Level.INFO, "Queries accordian found");
		Thread.sleep(1000);
		General_query_request.click();
		Thread.sleep(3000);
		return driver;
	}
	
	public WebDriver portfolio_selection_under_portfolio_dropdown(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		Portfolio_selection_dropdown.click();
		search_inside_portfolio_dropdown.click();
		search_inside_portfolio_dropdown.sendKeys("Slayd Super Fund");
		Thread.sleep(13000);
		search_inside_portfolio_dropdown.sendKeys(Keys.ENTER);
		return driver;
	}
	
	public WebDriver enter_values_general_query(WebDriver driver, String summary, String description) throws InterruptedException {
		sd_form_scroll(driver, general_query_radio_button);
		general_query_radio_button.click();
		sd_form_scroll(driver, general_query_radio_button);
		query_text_field.click();
		query_text_field.sendKeys(description);
		return driver;	
	}
	
	public WebDriver general_query_creation(WebDriver driver) throws InterruptedException {
		Request_creation_submit_button.click();
		return driver;	
	}
	
	public WebDriver check_ticket_creation_status(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, start_new_request_button, 120);
		String success_message = Thank_you_message.getText();
		if(Thank_you_message.isDisplayed()) {
			Assert.assertEquals(success_message, "Thank you");
	        LOGGER.log(Level.INFO, "Ticket created succesfully"); 
		}
		else{	
	        LOGGER.log(Level.INFO, "Ticket created failed"); 
		}
		Thread.sleep(2000);
		close_button_after_request_creation.click();
		return driver;
	}
	
	public WebDriver check_banner_status(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Request_updated_banner, 120);
		String banner = Request_updated_banner.getText();
		if(Request_updated_banner.isDisplayed()) {
			Assert.assertEquals(banner, "Your updates were successfully saved.");
	        LOGGER.log(Level.INFO, "Your updates were successfully saved."); 
		}
		else{	
	        LOGGER.log(Level.INFO, "Banner not appeared"); 
		}
		return driver;
	}

	public WebDriver check_banner_status_view(WebDriver driver) throws InterruptedException {
		check_banner_status(driver);
		return driver;
	}
	public WebDriver select_all_open_request(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Status_filter.isDisplayed());
		Status_filter.click();
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("open");
		Closed_option.click();
		wait_by_visibility(driver, request_list_Request_ID_column, 120);
		Status_filter_after_value_selection.click();
		select_all_checkbox.click();
		return driver;
	}
	
	public WebDriver change_to_closed(WebDriver driver) throws InterruptedException {
		changed_to_closed_button.click();
		wait_until_clickable(driver, toast_message, 120);
		String message = toast_message.getText();
		LOGGER.log(Level.INFO, message);
		return driver;
	}
	
	public WebDriver select_one_sd_request(WebDriver driver) throws InterruptedException {
		navigate_to_global_request_dropdown(driver);
		request_list_first_record.click();
		return driver;
	}
	public WebDriver add_attachment(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, write_a_message_textbox, 120);
		add_attachements_button.sendKeys(text_file.getAbsolutePath());
		return driver;
	}
	
	public WebDriver post_attachment(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, post_button, 120);
		post_button.click();
		Thread.sleep(5000);
		return driver;
	}	
	public WebDriver attachment_tab_download(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, attachment_tab, 120);
		attachment_tab.click();
		String attachment_name = First_attachment.getText();
		Assert.assertEquals(attachment_name, "This_is_Created_By_Automation_Testing.txt");
        LOGGER.log(Level.INFO, "Attachment added"); 
		return driver;
	}

	public WebDriver write_a_message(WebDriver driver, String summary) throws InterruptedException {
		wait_by_visibility(driver, write_a_message_textbox, 120);
		write_a_message_textbox.sendKeys(summary);
		return driver;
	}
	public WebDriver validate_added_message(WebDriver driver, String summary) throws InterruptedException {
		wait_until_clickable(driver, comments_tab, 120);
		sort_by_date_icon.click();
		Thread.sleep(3000);
		more_details_less_details.click();
		String comment = latest_comment.getText();
		Assert.assertEquals(comment, "This is created by testing team. Please ignore this.\n" + "—\n" + "gunaseeelan P");
        LOGGER.log(Level.INFO, "Comment added"); 
		return driver;
	}
	
	public WebDriver Request_creation_with_share_with_organization(WebDriver driver) throws InterruptedException {
		dropdown(driver, share_with_dropdown, "Test organiz...");
		Request_creation_submit_button.click();
		return driver;	
	}
	
	public WebDriver Request_creation_with_specific_people(WebDriver driver) throws InterruptedException {
		dropdown(driver, share_with_dropdown, "Specific people");
		specific_people_dropdown.click();
		specific_people_dropdown.sendKeys("Gunaseelan");
		specific_people_dropdown.sendKeys(Keys.ENTER);
		participant_add_button.click();
		Request_creation_submit_button.click();
		return driver;	
	}
	
	public WebDriver investor_selection(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, global_portfolio_list_button, 120);
		Thread.sleep(8000);
		global_portfolio_list_button.click();
		wait_by_visibility(driver, Name_under_portfolio_list, 120);
		Search_by_portfolio_name_or_ID_search_box.click();
		Search_by_portfolio_name_or_ID_search_box.sendKeys("PWL1 Test");
		Thread.sleep(12000);
		investor_name.click();
		Thread.sleep(3000);
		return driver;
	}
	
	public WebDriver investor_selection_by_ID(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, global_portfolio_list_button, 120);
		Thread.sleep(8000);
		global_portfolio_list_button.click();
		wait_by_visibility(driver, Name_under_portfolio_list, 120);
		Search_by_portfolio_name_or_ID_search_box.click();
		Search_by_portfolio_name_or_ID_search_box.sendKeys("17187815");
		Thread.sleep(12000);
		investor_name.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver portfolio_name_check(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, investor_tab_name, 120);
		String name = investor_tab_name.getText();
		Assert.assertEquals(name, "PWL1 Test");
        LOGGER.log(Level.INFO, "User is in 'PWL1 Test' Valuation page"); 		
		return driver;
	}
	
	public WebDriver portfolio_valuation_screen(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, valuation_tab, 120);
		String summary = valuation_tab.getText();
		Assert.assertEquals(summary, "Summary");
        LOGGER.log(Level.INFO, "User is in Valuation page"); 		
        return driver;
	}
	
	public WebDriver clicks_new_activity_button(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_until_clickable(driver, New_request_for_this_portfolio_button, 120);
		request_tab(driver);
		New_request_for_this_portfolio_button.click();
		return driver;	
	}
	
	public WebDriver request_groups(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, SD_request_groups, 120);
		Thread.sleep(4000);
        LOGGER.log(Level.INFO, "Request group found"); 
		return driver;
	}
	
	public WebDriver request_tab(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, requests_tab, 120);
		requests_tab.click();
		wait_by_visibility(driver, Portfolio_level_Request_ID_filter, 120);
		return driver;
	}
	
	public WebDriver Search_by_Request_ID_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_level_Request_ID_filter.isDisplayed());
		Portfolio_level_Request_ID_filter.click();
		LOGGER.log(Level.INFO, "Request ID filter is active"); 
		Portfolio_level_Request_ID_filter.sendKeys("66322");
		Portfolio_level_Request_ID_filter.sendKeys(Keys.ENTER);
		return driver;
	}
	
	public WebDriver Result_for_Search_by_Request_ID_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		String Request_ID = Portfolio_level_request_list_first_record_Request_ID_value.getText();
		Assert.assertEquals(Request_ID, "66322");
		LOGGER.log(Level.INFO, "66322 Request is available"); 
		return driver;
	}
	
	public WebDriver Navigate_request_tab(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		request_tab(driver);
		return driver;
	}
	
	public WebDriver Search_by_Reporter_name_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_level_Reporter_filter.isDisplayed());
		Portfolio_level_Reporter_filter.click();
		LOGGER.log(Level.INFO, "Reporter name filter is active"); 
		Portfolio_level_Me_option.click();
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_Reporter_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Reporter_name_check_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_request_list_first_record.click();
		wait_by_visibility(driver, request_details_sidetray_x_button, 120);
		String Current_user = Me_label_in_sidetray.getText();
		Assert.assertEquals(Current_user, "by me");
		LOGGER.log(Level.INFO, "Reporter name is same"); 
		return driver;
	}
	
	public WebDriver Search_by_status_filter_portfolio_filter(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_level_Status_filter.isDisplayed());
		Portfolio_level_Status_filter.click();
		LOGGER.log(Level.INFO, "Status filter is active"); 
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("closed");
		Closed_option.click();
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_Status_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_status_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		String status = Portfolio_level_request_list_first_record_status_value.getText();
		Assert.assertEquals(status, "Closed");
		LOGGER.log(Level.INFO, "Closed status is available"); 
		return driver;
	}
	
	public WebDriver Search_by_type_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_level_Type_filter.isDisplayed());
		Portfolio_level_Type_filter.click();
		LOGGER.log(Level.INFO, "Type filter is active"); 
		Search_inside_filters.click();
		Search_inside_filters.sendKeys("General query");
		general_query_option.click();
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_type_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver Result_for_Search_by_type_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		String Type = Portfolio_level_request_list_first_record_type_value.getText();
		Assert.assertEquals(Type, "General query");
		LOGGER.log(Level.INFO, "General query is available"); 
		return driver;
	}
	
	public WebDriver Result_for_Search_by_date_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		String Request_date = Portfolio_level_request_list_first_record_date_value.getText();
		Assert.assertEquals(Request_date, system_date);
		LOGGER.log(Level.INFO, "Date " + Request_date + " is available"); 
		return driver;
	}
	
	public WebDriver check_banner_status_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_Request_updated_banner, 120);
		String banner = Portfolio_level_Request_updated_banner.getText();
		if(Portfolio_level_Request_updated_banner.isDisplayed()) {
			Assert.assertEquals(banner, "Your updates were successfully saved.");
	        LOGGER.log(Level.INFO, "Your updates were successfully saved."); 
		}
		else{	
	        LOGGER.log(Level.INFO, "Banner not appeared"); 
		}
		return driver;
	}
	
	public WebDriver Result_for_Search_by_custom_range_date_filter_portfolio_level(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		LOGGER.log(Level.INFO, "Custom Date is Applied"); 
		return driver;
	}
	
	public WebDriver select_open_request_portfolio_level(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(Portfolio_level_Status_filter.isDisplayed());
		Portfolio_level_Status_filter.click();
		Portfolio_level_Search_inside_filters.click();
		Portfolio_level_Search_inside_filters.sendKeys("open");
		Portfolio_level_Closed_option.click();
		Thread.sleep(5000);
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_Status_filter_after_value_selection.click();
		Portfolio_level_request_list_first_record.click();
		return driver;
	}
	
	public WebDriver change_the_status(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, Status_change_dropdown, 120);
		Status_change_dropdown.click();
		Thread.sleep(2000);
		Status_change_dropdown_closed.click();
		wait_by_visibility(driver, toast_message_request, 120);
		String message = toast_message_request.getText();
		Assert.assertEquals(message, "Status successfully changed");
		LOGGER.log(Level.INFO, message);
		toast_message_request_close.click();
		return driver;
	}
	
	public WebDriver check_the_ticket_status(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		request_tab(driver);
		String status = Portfolio_level_request_list_first_record_status_value.getText();
		Assert.assertEquals(status, "Closed");
		LOGGER.log(Level.INFO, "Request status change successfull");
		return driver;
	}
	
	public WebDriver first_50_records(WebDriver driver) throws InterruptedException {
		sd_form_scroll(driver, pagination_section);
		Boolean status = pagination_next_button.isEnabled();
		if(status) {
			int max_count = 50;
			List<WebElement> rows = portfolio_request_table.findElements(By.tagName("tr"));
			int request_count = rows.size();
			System.out.println(request_count);
			Assert.assertEquals(request_count, max_count);
			LOGGER.log(Level.INFO, "Request count in the first page is 50");
		}
		else {
			LOGGER.log(Level.INFO, "There is no next page avilable"); 
		}
		return driver;
	}
	
	public WebDriver applying_multiple_filters_in_request_portfolio_level(WebDriver driver) throws InterruptedException {
		sd_form_scroll(driver, Portfolio_level_Reporter_filter);
		wait_until_clickable(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_Reporter_filter.click();
		Portfolio_level_Me_option.click();
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		applying_multiple_filters_in_request_portfolio_level2(driver);
		return driver;
	}
	
	public WebDriver applying_multiple_filters_in_request_portfolio_level2(WebDriver driver) throws InterruptedException {
		Portfolio_level_Reporter_filter_after_value_selection.click();
		Portfolio_level_Type_filter.click();
		Portfolio_level_Search_inside_filters.click();
		Portfolio_level_Search_inside_filters.sendKeys("General query");
		Portfolio_level_general_query_option.click();
		wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		Portfolio_level_type_filter_after_value_selection.click();
		return driver;
	}
	
	public WebDriver second_page_in_the_pagination_portfolio_level(WebDriver driver) throws InterruptedException {
		sd_form_scroll(driver, pagination_section);
		Boolean status = pagination_next_button.isEnabled();
		if(status) {
			page_no_2.click();
			LOGGER.log(Level.INFO, "Navigated to next page"); 
			wait_by_visibility(driver, Portfolio_level_request_list_Request_ID_column, 120);
		}
		Reporter_name_check_portfolio_level(driver);
		Result_for_Search_by_type_filter_portfolio_level(driver);
		return driver;
	}
	
	public WebDriver next_50_records(WebDriver driver) throws InterruptedException {
		first_50_records(driver);
		return driver;
	}
//	public WebDriver most_used_form_count(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		payment_button_side_tray.click();
//		// Get the form count for payment
//		WebElement table = driver.findElement(By.id("m_accordion_sd_item_1_body"));
//		List<WebElement> rows = table.findElements(By.className("comment_card"));
//		int count = rows.size();
//		payment_forms.add(count);
//		Thread.sleep(1000);
//		driver.findElement(By.id("m_accordion_sd_item_1_head")).click();
//		Thread.sleep(2000);
//		// Get the form count for Report an Issue(Queries)
//		report_an_issue_button.click();
//		Thread.sleep(2000);
//		WebElement table_Queries = driver.findElement(By.id("m_accordion_sd_item_3_body"));
//		List<WebElement> row_Queries = table_Queries.findElements(By.className("comment_card"));
//		int counts = row_Queries.size();
//		Queries_forms.add(counts);
//		Thread.sleep(1000);
//		driver.findElement(By.id("m_accordion_sd_item_3_head")).click();
//		Thread.sleep(2000);
//		// validate the 'Update Portfolio' button
//		update_portfolio_button.click();
//		wait.until(ExpectedConditions
//				.elementToBeClickable(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div")));
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div"))
//				.getText().contains("Change account details"));
//		return driver;
//	}

//	public WebDriver sd_from_count(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(activity_global));
//		activity_global.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-request_type_dropdown-container")));
//		Thread.sleep(2000);
//		// Assert.assertTrue(driver.findElement(By.id("request-group")).isDisplayed());
//		WebElement table = driver.findElement(By.id("request-group"));
//		List<WebElement> rows = table.findElements(By.tagName("div"));
//		int count = rows.size();
//		SD_Form_Count.add(count);
//		return driver;
//	}
//
//	public WebDriver request(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(activity_global));
//		request_drop.click();
//		Thread.sleep(2000);
//		WebElement request_status = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]/td[5]"));
//		String new_status = request_status.getText();
//		Thread.sleep(1000);
//		if (!new_status.equals("Closed")) {
//			status = "Open";
//		} else if (new_status.equals("Closed")) {
//			status = "Closed";
//		}
//		return driver;
//	}
//
//	public WebDriver request_side_bar(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		WebElement request_id = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]/td[2]"));
//		requestno = request_id.getText();
//		Thread.sleep(2000);
//		request_id.click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ticket_header\"]/div[1]/h5[2]")));
//		String sidetray_requestid = driver.findElement(By.xpath("//*[@id=\"ticket_header\"]/div[1]/h5[2]")).getText();
//		int index = sidetray_requestid.length();
//		String searchorg = sidetray_requestid.substring(1, index);
//		Assert.assertEquals(requestno, searchorg);
//		return driver;
//	}

//	public WebDriver selected_request_status_on_sideTray(WebDriver driver) {
//		Select select = new Select(driver.findElement(By.id("change_ticket_status")));
//		WebElement sidetray_dropdwon = select.getFirstSelectedOption();
//		String sidetray_status = sidetray_dropdwon.getText();
//		Assert.assertEquals(sidetray_status, status);
//		return driver;
//	}
//
//	public WebDriver comments_sorting(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//
//		WebElement table = driver.findElement(By.id("ticket_comments"));
//		List<WebElement> columns = table
//				.findElements(By.cssSelector(".ticket-comment-time.time-ago-comment.pull-right"));
//		for (int i = 0; i < 2; i++) {
//				comments_sort.add(columns.get(i).getText());
//			}
//			driver.findElement(By.id("sort_comment_id")).click();
//			Thread.sleep(5000);
//			wait.until(ExpectedConditions.elementToBeClickable(By.id("sort_comment_id")));
//			List<WebElement> sorted_columns = table
//					.findElements(By.cssSelector(".ticket-comment-time.time-ago-comment.pull-right"));
//			for (int i = 0; i < 2; i++) {
//				comments_sorted.add(sorted_columns.get(i).getText());
//			}
//			Thread.sleep(2000);
//			Assert.assertNotEquals(comments_sorted, comments_sort);
//		return driver;
//	}
//
//	public WebDriver shareoption(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(activity_global));
//		request_drop.click();
//		request_side_bar(driver);
//		return driver;
//	}
//
//	public WebDriver add_attachment(WebDriver driver) throws InterruptedException {
//		Thread.sleep(2000);
//		WebElement upload = driver.findElement(By.cssSelector(".upload.attachment_icon.display-none"));
//		File file = new File("src/test/resources/This_is_Created_By_Automation_Testing.txt");
//		upload.sendKeys(file.getAbsolutePath());
//		Thread.sleep(10000);
//		submit_button.click();
//		TimeUnit.MINUTES.sleep(1);
//		WebElement table = driver.findElement(By.id("ticket_comments"));
//		count_of_comments = table.findElements(By.tagName("div"));
//		return driver;
//	}
//
//	public WebDriver validate_uploaded_attachment(WebDriver driver) {
//		// String filename = "This is Created By Automation Testing.docx";
//		WebElement table = driver.findElement(By.id("ticket_comments"));
//		List<WebElement> comments_count = table.findElements(By.tagName("div"));
//		Assert.assertEquals(comments_count.size(), count_of_comments.size());
//		return driver;
//	}
//
//	public WebDriver write_message(WebDriver driver) throws InterruptedException {
//		shareoption(driver);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_quick_sidebar_tabs\"]/ul/li[3]")).click();
//		Thread.sleep(1000);
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"ticket_activities\"]/div/div/div"));
//		activity = table.findElements(By.cssSelector(".ticket-comment-time.time-ago-comment.pull-right"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_quick_sidebar_tabs\"]/ul/li[1]")).click();
//		Thread.sleep(1000);
//		message.click();
//		message.sendKeys("This message is created by Testing Team. Please Ignore this message");
//		submit_button.click();
//		TimeUnit.MINUTES.sleep(1);
//		return driver;
//	}

//	public WebDriver Comments_section(WebDriver driver) throws InterruptedException {
//		WebElement table = driver.findElement(By.id("ticket_comments"));
//		List<WebElement> columns = table
//				.findElements(By.cssSelector(".ticket-comment-time.time-ago-comment.pull-right"));
//		Assert.assertNotEquals(comments_sort.size(), columns.size());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_quick_sidebar_tabs\"]/ul/li[3]")).click();
//		Thread.sleep(1000);
//		WebElement table2 = driver.findElement(By.id("ticket_comments"));
//		List<WebElement> updated_activity = table2
//				.findElements(By.cssSelector(".ticket-comment-time.time-ago-comment.pull-right"));
//		Assert.assertNotEquals(updated_activity.size(), activity.size());
//		driver.findElement(By.id("sd_ticket_details_close")).click();
//		return driver;
//	}
//
//	public WebDriver bell_icon(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("notifications")));
//		Thread.sleep(5000);
//		bell.click();
//		TimeUnit.MINUTES.sleep(1);
//		String get_code = driver.findElement(By.xpath("//*[@id=\"recent-activity\"]/div[1]/div/div[1]/p")).getText();
//		Assert.assertTrue(get_code.contains(requestno));
//		return driver;
//	}
//
//	public WebDriver get_portfolio(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		request_drop.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sd-requests\"]/table")));
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		for (int i = 1; i <= rows.size(); i++) {
//			portfolio = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[" + i + "]/td[3]/span"))
//					.getText();
//			if (!portfolio.contains("-")) {
//				request = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[" + i + "]/td[2]/span"))
//						.getText();
//				request_type = driver
//						.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[" + i + "]/td[4]/span"))
//						.getText();
//				break;
//			}
//		}
//		return driver;
//	}
//
//	public static Map<String, String> get_value() {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("requstnumber", request);
//		map.put("portfolio_name", portfolio);
//		map.put("requesttype", request_type);
//		return map;
//	}
//
//	public WebDriver portfolio_request(WebDriver driver, String requ_id, String portfo_name, String type)
//			throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		portfo_drop.click();
//		wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody")));
//		driver.findElement(By.xpath("//*[@id=\"m_tabs_1_1\"]/div/input")).sendKeys(portfo_name);
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr")));
//		driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("m_datepicker_2")));
//		driver.findElement(By.id("requests-tab")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody")));
//		Get_request_table(driver, requ_id, type);
//		close_sd_card(driver);
//		return driver;
//	}
//	
//	public WebDriver close_sd_card(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(request_drop));
//		Thread.sleep(5000);
//		request_drop.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr/td[1]/span/label")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("status_change_tickets_button")));
//		driver.findElement(By.id("status_change_tickets_button")).click();
//		TimeUnit.MINUTES.sleep(1);
//		return driver;
//		
//	}
//	
//	public WebDriver Get_request_table(WebDriver driver, String requ_id, String type) {
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		for (int i = 1; i <= rows.size(); i++) {
//			String porfolio_request = driver
//					.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[" + i + "]/td[1]/span"))
//					.getText();
//			if (porfolio_request.equals(requ_id)) {
//				Assert.assertEquals(driver
//						.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[" + i + "]/td[2]/span"))
//						.getText(), type);
//
//				// *******Need to get the request status from request dropdown and compare it
//				// here*************
//				Assert.assertEquals(driver
//						.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[" + i + "]/td[3]/span"))
//						.getText(), "Open");
//				break;
//			}
//		}
//		return driver;
//	}

//
//	// O_A_N_A ==> Open a New Account
//	public WebDriver O_A_N_A(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_accordion_sd0")));
//		Thread.sleep(2000);
//		driver.findElement(By.id("m_accordion_sd0")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_accordion_sd_item_0_body\"]/div")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
//		return driver;
//	}
//
//	public WebDriver enter_values(WebDriver driver, String portfolio_id, String desc, String usr)throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.findElement(By.xpath("//*[contains(@id, 'customfield')]")).sendKeys(portfolio_id);
//		SD_description_field.sendKeys(desc);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='form-group']//div[1]//div[1]")).click();
//		Thread.sleep(1000);
//		Select status_drop = new Select(driver.findElement(By.id("participantOption")));
//		status_drop.selectByVisibleText("Specific people");
//		WebElement dd = driver.findElement(By.id("select2-participantOption-container"));
//		dd.click();
//		// Actions action = new Actions(driver);
//		// action.click(dd);
//		// action.doubleClick(dd).perform();
//		// Thread.sleep(1000);
//		// action.doubleClick(dd).perform();
//
//		// driver.findElement(By.xpath("//*[@id=\"sd-form\"]/div[2]/div[1]/div[1]/p")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//*[@id=\"sd-form\"]/div[2]/div[1]/div[2]/div/span/span[1]/span")));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"sd-form\"]/div[2]/div[1]/div[2]/div/span/span[1]/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"sd-form\"]/div[2]/div[1]/div[2]/div/span/span[1]/span/ul/li/input"))
//				.sendKeys(usr);
//		driver.findElement(By.xpath("//*[@id=\"sd-form\"]/div[2]/div[1]/div[2]/div/span/span[1]/span/ul/li/input"))
//				.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions
//				.elementToBeClickable(By.cssSelector(".btn.add-participants-button.add-participants")));
//		driver.findElement(By.cssSelector(".btn.add-participants-button.add-participants")).click();
//		// **** write code for select share option***//
//		driver.findElement(By.cssSelector(".btn.modify-next.ma-submit")).click();
//		TimeUnit.MINUTES.sleep(1);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd-form-status")));
//		Assert.assertTrue(driver.findElement(By.id("sd-form-status")).isDisplayed());
//		return driver;
//	}
//
//	public WebDriver validate_submitted_sd_form(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		String request_name = driver.findElement(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div"))
//				.getText();
//		driver.findElement(By.id("modify-close")).click();
//		// open request dropdown
//		wait.until(ExpectedConditions.elementToBeClickable(request_drop));
//		request_drop.click();
//		Thread.sleep(1000);
//		String latest_request = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]/td[4]/span"))
//				.getText();
//		Assert.assertEquals(request_name, latest_request);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]/td[4]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("change_ticket_status")));
//		Select status_drop = new Select(driver.findElement(By.id("change_ticket_status")));
//		status_drop.selectByVisibleText("Closed");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div")));
//		driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/button")).click();
//		String get_request_id = driver.findElement(By.xpath("//*[@id=\"ticket_header\"]/div[1]/h5[2]")).getText();
//		int index = get_request_id.length();
//		s_request_id = get_request_id.substring(1, index);
//		Thread.sleep(2000);
//		driver.findElement(By.id("sd_ticket_details_close")).click();
//		getReuqest_table_value(driver);
//		return driver;
//	}
//
//	public WebDriver getReuqest_table_value(WebDriver driver) {
//		List<String> request = new ArrayList<String>();
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for (WebElement rows : row) {
//			List<WebElement> cells = rows.findElements(By.tagName("td"));
//			request.add(cells.get(1).getText());
//		}
//		Assert.assertFalse(request.contains(s_request_id));
//		return driver;
//	}
//
//	public WebDriver acc_maintenance_sd_form(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("SimpleSearcher")));
//		Portfolio_raise_an_request.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-request_type_dropdown-container")));
//		Thread.sleep(2000);
//		driver.findElement(By.id("m_accordion_sd_item_5_head")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_accordion_sd_item_5_body\"]/div[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
//		return driver;
//	}
//
//	public WebDriver submit_sd_from(WebDriver driver, String desc) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
////		SD_summary_field.sendKeys(summary);
//		SD_description_field.sendKeys(desc);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='form-group']//div[6]//input[@id='item_to_change_fields']")).click();
//		Thread.sleep(1000);
//		// driver.findElement(By.id("sd-form-submit")).click();
//		Select status_drop = new Select(driver.findElement(By.id("participantOption")));
//		status_drop.selectByVisibleText("Do not share");
//		driver.findElement(By.cssSelector(".btn.modify-next.ma-submit")).click();
//		TimeUnit.MINUTES.sleep(1);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd-form-status")));
//		return driver;
//	}
//
//	public WebDriver validate_created_request(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		String get_form_title = driver.findElement(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div"))
//				.getText();
//		driver.findElement(By.id("modify-close")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("requests-tab")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inv-search-requests")));
//		Thread.sleep(10000);
//		String investor_request = driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]/td[2]"))
//				.getText();
//		Assert.assertTrue(get_form_title.contains(investor_request));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]")).click();
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ticket_header")));
//		return driver;
//	}
//
//	public WebDriver submit_form(WebDriver driver, String descrip) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
////		SD_summary_field.sendKeys(subject);
//		SD_description_field.sendKeys(descrip);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='form-group']//div[6]//input[1]")).click();
//		Thread.sleep(1000);
//		Select status_drop = new Select(driver.findElement(By.id("participantOption")));
//		status_drop.selectByVisibleText("Test organiz...");
//		driver.findElement(By.cssSelector(".btn.modify-next.ma-submit")).click();
//		TimeUnit.MINUTES.sleep(1);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd-form-status")));
//		return driver;
//	}
//
//	public WebDriver validate_submited_form(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		String get_form_title = driver.findElement(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div"))
//				.getText();
//		driver.findElement(By.id("modify-close")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("requests-tab")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inv-search-requests")));
//		String investor_request = driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]/td[2]"))
//				.getText();
//		Assert.assertTrue(get_form_title.contains(investor_request));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]")).click();
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ticket_header")));
//		String selected_share_type = driver.findElement(By.id("select2-sd_participantOption-container")).getText();
//		Assert.assertEquals(selected_share_type, "Test organization B");
//		Select status_drop = new Select(driver.findElement(By.id("change_ticket_status")));
//		status_drop.selectByVisibleText("Closed");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div")));
//		driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/button")).click();
//		Thread.sleep(4000);
//		return driver;
//	}
//
//	public WebDriver create_sd_queries(WebDriver driver, String desc) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(Portfolio_summary_search));
//		Portfolio_raise_an_request.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-request_type_dropdown-container")));
//		Thread.sleep(2000);
//		driver.findElement(By.id("m_accordion_sd_item_3_head")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"m_accordion_sd_item_3_body\"]/div[1]")).click();
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div")));
//		WebElement other_asset = driver.findElement(By.id("sd_ticket_attachment"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", other_asset);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='form-group']//div[18]//div//input[1]")).click();
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
//		SD_description_field.sendKeys(desc);
//		Select status_drop = new Select(driver.findElement(By.id("participantOption")));
//		status_drop.selectByVisibleText("Do not share");
//		driver.findElement(By.cssSelector(".btn.modify-next.ma-submit")).click();
//		TimeUnit.MINUTES.sleep(1);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd-form-status")));
//		Assert.assertTrue(driver.findElement(By.id("sd-form-status")).isDisplayed());
//		driver.findElement(By.id("modify-close")).click();
//		Thread.sleep(2000);
//		return driver;
//	}
//
//	public WebDriver request_dropdown_share(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.elementToBeClickable(product_logo));
//		request_drop.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".m-datatable__table")));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]/td[1]/span/label/span")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("share_tickets_button")));
//		driver.findElement(By.id("share_tickets_button")).click();
//		return driver;
//	}
//
//	public WebDriver participant(WebDriver driver, String user) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		driver.findElement(By.xpath("//*[@id=\"multi-participant-select\"]/span/span[1]/span/ul/li/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"multi-participant-select\"]/span/span[1]/span/ul/li/input"))
//				.sendKeys(user);
//		driver.findElement(By.xpath("//*[@id=\"multi-participant-select\"]/span/span[1]/span/ul/li/input"))
//				.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.id("multi_share")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//		return driver;
//	}
//
//	public WebDriver valdiate_participant(WebDriver driver, String user) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd_participantOption")));
//		Thread.sleep(2000);
//		Assert.assertEquals(driver.findElement(By.id("select2-sd_participantOption-container")).getAttribute("title"),user);
//		return driver;
//	}
//
//	public WebDriver remove_participant(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		Select share_drop = new Select(driver.findElement(By.id("sd_participantOption")));
//		share_drop.selectByVisibleText("Not shared");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd_confirmation_pop_up")));
//		Assert.assertTrue(driver.findElement(By.id("sd_confirmation_pop_up")).isDisplayed());
//		driver.findElement(By.id("confirm_remove_participant")).click();
//		Thread.sleep(30000);
//		Assert.assertEquals(driver.findElement(By.id("select2-sd_participantOption-container")).getAttribute("title"),
//				"Not shared");
//		Select status_drop = new Select(driver.findElement(By.id("change_ticket_status")));
//		status_drop.selectByVisibleText("Closed");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div")));
//		driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/button")).click();
//		return driver;
//	}

	
	//////////////////////Login///////////////////////////////

	public WebDriver Adviser_login(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".primary-logo")));
		driver.findElement(By.id("m_dropdown_api_1")).click();
		driver.findElement(By.xpath("//*[@id=\"m_dropdown_api_1\"]/div/div/div/div/ul/li[1]")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"profile_content\"]/div/div[2]/div[2]/p/a")));
		Thread.sleep(5000);
		return driver;
	}

	public WebDriver activityLog(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"profile_content\"]/div/div[2]/div[2]/p/a")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.cssSelector(".modal-content")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"show-profile-details\"]/div/div/div[1]/div/button")).click();
		Thread.sleep(5000);
		return driver;
	}

	public WebDriver password_tab(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		driver.findElement(By.id("profile-password-tab")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_current_password")));
		return driver;
	}

	public WebDriver Wrong_current_password(WebDriver driver, String invalid_password, String old_password)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_current_password")));
		Thread.sleep(5000);
		driver.findElement(By.id("user_current_password")).sendKeys(invalid_password);
		driver.findElement(By.id("user_password")).sendKeys(old_password);
		driver.findElement(By.id("user_password_confirmation")).sendKeys(old_password);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.m-btn.m-btn--custom.profile-password-submition")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		return driver;
	}

	public WebDriver invalid_new_password(WebDriver driver, String old_valid_pass, String new_pass) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_current_password")));
		driver.findElement(By.id("user_current_password")).sendKeys(old_valid_pass);
		driver.findElement(By.id("user_password")).sendKeys(new_pass);
		driver.findElement(By.id("user_password_confirmation")).sendKeys(new_pass);
		driver.findElement(By.cssSelector(".btn.m-btn.m-btn--custom.profile-password-submition")).click();
		return driver;
	}
	
	//////////////////////////////////////////////////////////Place an order///////////////////////////////////////////////////////////////////////////
	
	public WebDriver place_an_order_button_mode(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(place_an_order_button.isEnabled());
		return driver;
	}

	public WebDriver navigate_to_place_an_order_side_tray(WebDriver driver) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 120);
//		wait.until(ExpectedConditions.elementToBeClickable(place_an_order_button));
		Thread.sleep(8000);
		place_an_order_button.click();
		return driver;
	}
	
	public WebDriver place_order_side_Tray(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(SELL_Button));
		Assert.assertTrue(SELL_Button.isDisplayed());
		return driver;
	}
	
	public WebDriver portfolio_name_validate(WebDriver driver , String PV_Name) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(SELL_Button));
		String pace_order_portfolio_name = portfolio_selection_dropdown_orders.getText();
		Assert.assertTrue(pace_order_portfolio_name.contains(PV_Name));
		return driver;
	}

	public WebDriver portfolio_dropdwon(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(portfolio_drop_place_order));
		portfolio_drop_place_order.click();
		Thread.sleep(5000);
		return driver;
	}
	
	public WebDriver select_portfolio(WebDriver driver) throws InterruptedException {
		portfolio_drop_place_order.click();
		Thread.sleep(5000);
		another_PV = select_different_portfolio.getText();
		select_different_portfolio.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver selected_portfolio_name_on_drop(WebDriver driver) {
		Assert.assertTrue(portfolio_selection_dropdown_orders.getText().equals(another_PV));
		return driver;
	}
	
	public WebDriver PV_searchBox(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(side_tray_dropdown_searchbox));
		side_tray_dropdown_searchbox.sendKeys("PWL1");
		Thread.sleep(10000);
		return driver;
	}
		
	public WebDriver checkportfolio_result(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(search_result));
		Assert.assertTrue(search_result.getText().contains("PWL1"));
		search_result.click();
		wait.until(ExpectedConditions.elementToBeClickable(SELL_Button));
		Thread.sleep(3000);
		return driver;
	}
		
	public WebDriver click_sell_order_button(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(SELL_Button));
		SELL_Button.click();
		Thread.sleep(5000);
		return driver;
	}
	
	public WebDriver add_sell_order_extended_side_tray(WebDriver driver) {
		Assert.assertTrue(Extended_side_tray_modal.isDisplayed());
		return driver;
	}
	
	public WebDriver portfolio_holding_drop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(portfolio_holdings_drop));
		Assert.assertTrue(portfolio_holdings_drop.isDisplayed());
		return driver;
	}
	
	public WebDriver click_cancel_button(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(extended_sidetray_add_sell_cancel));
		extended_sidetray_add_sell_cancel.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver portfolio_holdings_search(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(portfolio_holdings_drop));
		portfolio_holdings_drop.click();
		Thread.sleep(5000);
		Assert.assertTrue(portofolio_holding_details.isDisplayed());
		wait.until(ExpectedConditions.elementToBeClickable(side_tray_dropdown_searchbox));
		side_tray_dropdown_searchbox.sendKeys("smallco");
		Thread.sleep(2000);
		return driver;
	}

	public WebDriver validate_portfolio_holdings_search(WebDriver driver) {
		Assert.assertTrue(portfolio_holding_search_result.isDisplayed());
		Assert.assertTrue(portfolio_holding_search_result_text.getText().contains("SMALLCO"));
		portfolio_holding_search_result.click();
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(available_units_sell_order_screen));
		return driver;
	}
	
	public WebDriver validate_available_unit_decimal_palces(WebDriver driver) {
		Assert.assertTrue(available_units_sell_order_screen.isDisplayed());
		values = available_units_sell_order_screen.getText();
		int integerPlaces = values.indexOf('.');
		decimalPlaces = values.length() - integerPlaces - 1;
		Assert.assertTrue(decimalPlaces==4);
		return driver;
	}
	
	public WebDriver get_exit_price(WebDriver driver) {
		exitpricevalue= exit_price.getText();
//		int index = values.length();
//		String order_value = values.substring(7, index);
//		int integerPlaces = order_value.indexOf('.');
//		exitPrice_decimalPlaces = order_value.length() - integerPlaces - 1;
		return driver;
	}
	
	public WebDriver estlabel_validation(WebDriver driver) {
		//Assert.assertTrue(exitPrice_decimalPlaces == 4);
//		values = exit_price.getText();
//		System.out.println("Value is:"+values);
		Assert.assertTrue(exitpricevalue.contains("(est.)"));
		return driver;
	}
	
	public WebDriver click_add_button(WebDriver driver) {
		add_button.click();
		return driver;
	}
	
	public WebDriver validate_error_message(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(order_amount_error.isDisplayed());
		return driver;
	}
	
	public WebDriver check_special_char(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(order_amount_textbox.getText().isEmpty());
		return driver;
	}
	
	public WebDriver clear_order_amount(WebDriver driver) {
		order_amount_textbox.clear();
		return driver;
	}
	
	public WebDriver add_button(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(add_button.getAttribute("class").contains("add-disabled"), true);
		return driver;
	}
	
	public WebDriver enter_maximum_order_value(WebDriver driver, String max_value) {
		order_amount_textbox.sendKeys(max_value);
		return driver;
	}
	
	public WebDriver redeem_order(WebDriver driver) {
		values = available_units_sell_order_screen.getText();
		order_amount_textbox.clear();
		order_amount_textbox.sendKeys(values);
		return driver;
	}
	
	public WebDriver order_amount(WebDriver driver, String O_amount) {
		order_amount_textbox.clear();
		order_amount_textbox.sendKeys(O_amount);
		return driver;
	}
	
	public WebDriver order_amount_final_decimal(WebDriver driver) {
		values = order_amount_textbox.getText();
		int integerPlaces = values.indexOf('.');
		decimalPlaces = values.length() - integerPlaces - 1;
		Assert.assertTrue(decimalPlaces==4);
		return driver;
	}
	
	public WebDriver order_value_et(WebDriver driver, String order_final_value) {
		System.out.println("The value is:"+total_order_value_sell_order_screen.getText());

		Assert.assertTrue(total_order_value_sell_order_screen.getText().contains(order_final_value));
		return driver;
	}
	
	public WebDriver order_value_decimal(WebDriver driver) {
		values = total_order_value_sell_order_screen.getText();
		int integerPlaces = values.indexOf('.');
		decimalPlaces = values.length()-integerPlaces - 1;
		Assert.assertTrue(decimalPlaces==2);
		return driver;
	}
	
	public WebDriver NO_adviser_given(WebDriver driver) {
		Assert.assertTrue(adviser_given_no.isDisplayed());
		adviser_given_no.click();
		return driver;
	}
	public WebDriver validate_NO_adviser_given(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
//		Boolean advice_reason_textbox = driver.findElements(By.id("advice_div")).size() > 0;
//		System.out.println("print true or false===>>>"+advice_reason_textbox);
		Assert.assertTrue(driver.findElement(By.id("advice_div")).getAttribute("style").equals("display: none;"));
//		Assert.assertFalse(advice_reason_textbox);
		return driver;
	}
	
	public WebDriver Yes_adviser_given(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		adviser_given_yes.click();
		return driver;
	}
	
	public WebDriver validate_Yes_adviser_given(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(advice_reason_drop.isDisplayed());
		Assert.assertTrue(adviser_other_method.isDisplayed());
		Select advice_reason = new Select(advice_reason_drop_value);
		advice_reason.selectByVisibleText("Short Term Growth");
		Thread.sleep(2000);
		advice_summary.sendKeys("Testing Please ignore this");
		adviser_other_method.click();
		return driver;
	}
	
	public WebDriver advice_date(WebDriver driver) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		String advicedate = advice_date_cal.getAttribute("value");
		Assert.assertEquals(advicedate, dtf.format(now));
		return driver;
	}
	
	public WebDriver disclaimer_content(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(disclaimer_footer_message.isDisplayed());
		disclaimer_check_box.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver add_button_enable(WebDriver driver) {
		Assert.assertEquals(add_button.getAttribute("class").contains("add-enabled"), true);
		return driver;
	}
	
	public WebDriver add_button_click(WebDriver driver) {
		portfolio_holding = selected_portfolio_holding.getAttribute("title");
		System.out.println("Portfolio holding is"+portfolio_holding);
		add_button.click();
		return driver;
	}
	
	public WebDriver added_orders_draft_orders(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		String order_name = draft_order_title.getText();
		System.out.println("Ordername is:"+order_name);
		Assert.assertEquals(portfolio_holding, order_name);
		return driver;
	}
	
	public WebDriver draft_order_lable(WebDriver driver) {
		Assert.assertTrue(draft_order_label.getText().equals("Current draft orders:"));
		return driver;
	}
	
	public WebDriver click_draft_order(WebDriver driver) {
		draft_order_title.click();
		return driver;
	}
	
	public WebDriver edit_order_screen(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(add_button.getText().equals("Update"));
		return driver;
	}
	
	public WebDriver order_amount_update(WebDriver driver, String update_amount) throws InterruptedException {
		order_amount_textbox.clear();
		order_amount_textbox.sendKeys(update_amount);
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver updated_details(WebDriver driver, String updated_order_value) {
		String order_value_draft = draft_order_value.getText();
		System.out.println("order_value is:"+order_value_draft);
		int index = order_value_draft.length();
		String order_value = order_value_draft.substring(8, index);
		System.out.println("order value is"+order_value);
		Assert.assertEquals(order_value,updated_order_value);
		return driver;
	}
	
	public WebDriver create_second_order(WebDriver driver, String o_value) throws InterruptedException {
		Thread.sleep(2000);
		click_sell_order_button(driver);
		portfolio_holdings_search(driver);
		validate_portfolio_holdings_search(driver);
		order_amount(driver, o_value);
		NO_adviser_given(driver);
		disclaimer_content(driver);
		add_button_click(driver);
		return driver;
	}
	
	public WebDriver validate_created_new_order(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(draft_new_order.getText(), portfolio_holding);
		return driver;
	}
	
	public WebDriver close_order(WebDriver driver) {
		close_draft_order.click();
		return driver;
	}
	
	public WebDriver validate_order_remove_confirmation_popup(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(order_remove_confirmation.isDisplayed());
		return driver;
	}
	
	public WebDriver go_back_button_confirm_popup(WebDriver driver) {
		Assert.assertTrue(confirm_popUp_go_back_button.isDisplayed());
		confirm_popUp_go_back_button.click();
		return driver;
	}
	
	public WebDriver validate_draft_order(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(draft_order_label.isDisplayed());
		return driver;
	}
	
	public WebDriver cancel_button_confirm_pop_up(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		confirm_popUp_cancel_order.click();
		return driver;
	}
	
	public WebDriver order_cancelled(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Boolean cancelled_draft_order = driver.findElements(By.id("draft_order_1")).size() > 0;
		Assert.assertFalse(cancelled_draft_order);
		return driver;
	}
	public WebDriver close_order_popup(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		close_order(driver);
		Thread.sleep(2000);
		Assert.assertTrue(order_remove_confirmation.isDisplayed());
		return driver;
	}
	
	public WebDriver preview_order_button_click(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		preview_order_button.click();
		return driver;
	}
	
	public WebDriver preview_order_screen(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(transaction_summary_value.isDisplayed());
		return driver;
	}
	
	public WebDriver sumary_order_value(WebDriver driver, String order_value) {
		String transaction_summary_value_text= transaction_summary_value.getText();
		System.out.println("print the order deatails ==>"+transaction_summary_value_text);
		Assert.assertTrue(transaction_summary_value_text.contains(order_value));
		return driver;
	}
	
	public WebDriver after_portfolio_impacts(WebDriver driver) {
		String impacts_unis = after_impact_units.getText();
		System.out.println("print_after_units======>"+impacts_unis);
		after_portfolio_impacts = impacts_unis.replaceAll(",", "");
		return driver;
	}
	public WebDriver validate_impact_portfolio_units(WebDriver driver, String portfolio_units_after) {
		System.out.println("print_after_units======>"+portfolio_units_after);
		Assert.assertTrue(after_portfolio_impacts.contains(portfolio_units_after));
		return driver;
	}
	
	public WebDriver asset_name_preview_screen(WebDriver driver) {
		String Before_asset_name = driver.findElement(By.xpath("//*[@id=\"preview-order-id\"]/div[3]/div/div[2]/div/label")).getText();
		String After_asset_name = driver.findElement(By.xpath("//*[@id=\"preview-order-id\"]/div[4]/div[2]/div/label")).getText();
		Assert.assertTrue(portfolio_holding.contains(Before_asset_name));
		Assert.assertTrue(portfolio_holding.contains(After_asset_name));
		return driver;
	}
	
	public WebDriver preview_back(WebDriver driver) throws InterruptedException {
		Preview_back_button.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver draft_order_screen_validation(WebDriver driver) {
		Assert.assertTrue(draft_order_label.isDisplayed());
		return driver;
	}
	
	public WebDriver confirm_order_button_mode(WebDriver driver) {
		String confirm_button_mode = confirm_order.getAttribute("class");
		Assert.assertFalse(confirm_button_mode.contains("enable"));
		return driver;
	}
	
	public WebDriver disclaimer_link(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		preview_disclaimer.click();
		Thread.sleep(4000);
		return driver;
	}
	
	public WebDriver disclaimer_popup(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(preview_acknowledge_disclaimer.isDisplayed());
		preview_acknowledge_disclaimer.click();
		Thread.sleep(3000);
		return driver;
	}
	
	public WebDriver disclaimer_check_box(WebDriver driver) throws InterruptedException {
		preview_disclaimer_checkbox.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver confirm_order_button_enabled(WebDriver driver) {
		String confirm_button_mode = confirm_order.getAttribute("class");
		Assert.assertTrue(confirm_button_mode.contains("enable"));
		return driver;
	}
	
	public WebDriver confirm_order_button_click(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		confirm_order.click();
		Thread.sleep(5000);
		return driver;
	}
	
	public WebDriver valdiate_order_confirmation(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(confirm_order_content));
		Assert.assertTrue(confirm_order_content.isDisplayed());
		return driver;
	}
	
	public WebDriver reference_number(WebDriver driver) {
		WebElement order_reference_number = driver.findElement(By.xpath("//*[@id=\"confirm-order-container\"]/div/p[2]"));
		Assert.assertTrue(order_reference_number.getText().equals("Order reference number:"));
		return driver;
	}
	
	public WebDriver sd_form_scroll(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver; //form scroll
		js.executeScript("arguments[0].scrollIntoView();", element);
		return driver;
	}
	
	public WebDriver wait_by_visibility(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return driver;
	}
	
	public WebDriver wait_until_clickable(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return driver;
	}
	
	public WebDriver dropdown(WebDriver driver, WebElement element, String search_term) throws InterruptedException {
		Thread.sleep(3000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(search_term);		
		return driver;
	}
	
	public WebDriver check_investor_tab(WebDriver driver) throws InterruptedException {
		Boolean investor_tab = driver.findElements(By.id("tab_id")).size() > 0;
		if(investor_tab) {
			portfolio_tab_x_button.click();
			Thread.sleep(5000);
		}
		else {
			LOGGER.log(Level.INFO, "User is in Dashboard screen");
			}
		return driver;

	}
}
