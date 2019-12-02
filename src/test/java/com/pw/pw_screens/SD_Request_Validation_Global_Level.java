package com.pw.pw_screens;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.UIHandler_2;
import com.pw.publicLib.UIHandler_1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SD_Request_Validation_Global_Level extends DataProvider{
	public static WebDriver driver;
	private UIHandler_2 Pagefactory_2 = PageFactory.initElements(driver, UIHandler_2.class);
	private Logger LOGGER = Logger.getLogger(SD_Forms_Through_GlobalActivity.class.getName());	public String R_Number;
	
	public String P_name;
	public String R_type;
	public static Map<String, String> reuqest_data = new HashMap<>();
	public String get_OTP_query = "select direct_otp from users where email = 'gunaseeelan.p100@gmail.com'";
	
	@Given("^adviser user is on hive login screen$")
	public void adviser_user_is_on_hive_login_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
	}
	
	@When("^the user enters the username and password$")
	public void the_user_enters_the_username_and_password() throws Throwable {
        LOGGER.log(Level.INFO, "Chrome Browser Launched"); 
		UIHandler_1 Advisor_login = PageFactory.initElements(driver, UIHandler_1.class);
		Advisor_login.Adviser_login(driver, username, password);
		String title= driver.getTitle();
		Assert.assertEquals("Hive", title);
        LOGGER.log(Level.INFO, "The HIVE"); 
	}

	@Then("^application should be navigates to the Adviser Dashboard$")
	public void application_should_be_navigates_to_the_Adviser_Dashboard() throws Throwable {
		//check for the portfolio tab
		Pagefactory_2.check_investor_tab(driver);
        LOGGER.log(Level.INFO, "User in Dashboard"); 
	}
	
	@Given("^adviser user is on Dashboard request view$")
	public void adviser_user_is_on_Dashboard_request_view() throws Throwable {
		Pagefactory_2.global_request_list(driver);
	}

	@When("^user clicks the New request button from the global header$")
	public void user_clicks_the_New_request_button_from_the_global_header() throws Throwable {
		Pagefactory_2.navigate_to_SD_request_group_side_tray(driver);

	}

	@Then("^side tray should open and user should see the SD form groups$")
	public void side_tray_should_open_and_user_should_see_the_SD_form_groups() throws Throwable {
		Pagefactory_2.browse_by_topic(driver);
	}

	@Given("^user is on request side tray by clicking the global 'New Request' button$")
	public void user_is_on_request_side_tray_by_clicking_the_global_New_Request_button() throws Throwable {
		Pagefactory_2.navigate_to_SD_request_group_side_tray(driver);

	}

	@When("^user clicks on the 'payments' button in the most used section$")
	public void user_clicks_on_the_payments_button_in_the_most_used_section() throws Throwable {
		Pagefactory_2.most_used_payments(driver);
	}

	@Then("^Payment related SD tickets should be visible on the screen$")
	public void payment_related_SD_tickets_should_be_visible_on_the_screen() throws Throwable {
		Pagefactory_2.payments_group(driver);
	}

	@When("^user clicks on the 'Report an issue' button in the most used section$")
	public void user_clicks_on_the_Report_an_issue_button_in_the_most_used_section() throws Throwable {
		Pagefactory_2.most_used_Report_an_issue(driver);
	}

	@Then("^Queries related SD tickets should be visible on the screen$")
	public void queries_related_SD_tickets_should_be_visible_on_the_screen() throws Throwable {
		Pagefactory_2.query_group(driver);
	}

	@When("^user clicks on the 'Support Request' button in the most used section$")
	public void user_clicks_on_the_Support_Request_button_in_the_most_used_section() throws Throwable {
		Pagefactory_2.most_used_Hive_support_request(driver);
	}

	@Then("^Hive support request form should open on the side tray$")
	public void hive_support_request_form_should_open_on_the_side_tray() throws Throwable {
		Pagefactory_2.Hive_support_request(driver);
	}

	@Given("^user is on Hive Dashboard screen$")
	public void user_is_on_Hive_Dashboard_screen() throws Throwable {
		Pagefactory_2.navigate_to_dashboard(driver);
	}

	@When("^user clicks the global request dropdown$")
	public void user_clicks_the_global_request_dropdown() throws Throwable {
		Pagefactory_2.navigate_to_global_request_dropdown(driver);
	}

	@And("^Enter SD request id on Request search box$")
	public void enter_SD_request_id_on_Request_search_box() throws Throwable {
		Pagefactory_2.Search_by_Request_ID_filter(driver);
	}

	@Then("^result should be displayed based on the given request id$")
	public void result_should_be_displayed_based_on_the_given_request_id() throws Throwable {
		Pagefactory_2.Result_for_Search_by_Request_ID_filter(driver);
	}

	@Given("^user is on global SD request list view$")
	public void user_is_on_global_SD_request_list_view() throws Throwable {
		Pagefactory_2.navigate_to_global_request_dropdown(driver);
	}

	@When("^user enters portfolio name as ‘PWL(\\d+) Test’ into the portfolio search box$")
	public void user_enters_portfolio_name_as_PWL_Test_into_the_portfolio_search_box(int arg1) throws Throwable {
		Pagefactory_2.Search_by_Portfolio_name_filter(driver);
	}

	@Then("^result should be displayed based on the given portfolio name$")
	public void result_should_be_displayed_based_on_the_given_portfolio_name() throws Throwable {
		Pagefactory_2.Result_for_Search_by_portfolio_name_filter(driver);
	}

	@When("^user selects reporter name as “Gunaseelan Palanisamy” from the reporter filter dropdown$")
	public void user_selects_reporter_name_as_Gunaseelan_Palanisamy_from_the_reporter_filter_dropdown() throws Throwable {
		Pagefactory_2.Search_by_Reporter_name_filter(driver);
	}

	@Then("^result should be displayed based on the selected reporter name$")
	public void result_should_be_displayed_based_on_the_selected_reporter_name() throws Throwable {
		Pagefactory_2.Reporter_name_check(driver);
	}

	@When("^user selects request type as “General query” from the type filter dropdown$")
	public void user_selects_request_type_as_General_query_from_the_type_filter_dropdown() throws Throwable {
		Pagefactory_2.Search_by_type_filter(driver);
	}

	@Then("^result should be displayed based on the selected request type$")
	public void result_should_be_displayed_based_on_the_selected_request_type() throws Throwable {
		Pagefactory_2.Result_for_Search_by_type_filter(driver);
	}

	@When("^user choose the status as “Open” from the status filter dropdown$")
	public void user_choose_the_status_as_Open_from_the_status_filter_dropdown() throws Throwable {
		Pagefactory_2.Search_by_status_filter(driver);

	}

	@Then("^result should be displayed based on the selected status type$")
	public void result_should_be_displayed_based_on_the_selected_status_type() throws Throwable {
		Pagefactory_2.Result_for_Search_by_status_filter(driver);
	}

	@When("^user selects the today option from the date picker$")
	public void user_selects_the_today_option_from_the_date_picker() throws Throwable {
		Pagefactory_2.Search_by_date_filter(driver);

	}

	@Then("^all the requests which are created at current day should be displayed on the request table$")
	public void all_the_requests_which_are_created_at_current_day_should_be_displayed_on_the_request_table() throws Throwable {
		Pagefactory_2.Result_for_Search_by_date_filter(driver);
	}

	@When("^user enters the custom range on ‘From’ and ‘To’ text fields$")
	public void user_enters_the_custom_range_on_From_and_To_text_fields() throws Throwable {
		Pagefactory_2.Search_by_Custom_range_date_filter(driver);
	}

	@Then("^requests which are created between those From and To dates should be displayed on the request table$")
	public void requests_which_are_created_between_those_From_and_To_dates_should_be_displayed_on_the_request_table() throws Throwable {
		Pagefactory_2.Result_for_Search_by_custom_range_date_filter(driver);
	}

	
	@Given("^first (\\d+) request details are displaying on first page$")
	public void first_request_details_are_displaying_on_first_page(int arg1) throws Throwable {
		Pagefactory_2.first_50_request(driver);
	}

	@When("^user searching for portfolio as “PWl(\\d+) Test”, reporter as “me” and SD type as “General Query”$")
	public void user_searching_for_portfolio_as_PWl_Test_reporter_as_me_and_SD_type_as_General_Query(int arg1) throws Throwable {
		Pagefactory_2.applying_multiple_filters_in_request(driver);
	}

	@And("^user clicks the second page from pagination$")
	public void user_clicks_the_second_page_from_pagination() throws Throwable {
		Pagefactory_2.second_page_in_the_pagination(driver);
	}

	@Then("^next (\\d+) result related to the selected filters should be displayed on the request list$")
	public void next_result_related_to_the_selected_filters_should_be_displayed_on_the_request_list(int arg1) throws Throwable {
		Pagefactory_2.next_50_request(driver);
	}

	@Given("^user selected the general Query ticket through global 'New Request' button by keeping the global request list open$")
	public void user_selected_the_general_Query_ticket_through_global_New_Request_button_by_keeping_the_global_request_list_open() throws Throwable {
		Pagefactory_2.Click_global_new_Activity(driver);
		Pagefactory_2.General_query(driver);
	}

	@When("^user enters details in the sd form fields$")
	public void user_enters_details_in_the_sd_form_fields() throws Throwable {
		Pagefactory_2.portfolio_selection_under_portfolio_dropdown(driver);
		Pagefactory_2.enter_values_general_query(driver, sd_summary, sd_description);
	}

	@And("^submit the sd request$")
	public void submit_the_sd_request() throws Throwable {
		Pagefactory_2.general_query_creation(driver);
	}

	@Then("^success message should be displayed on the side tray$")
	public void success_message_should_be_displayed_on_the_side_tray() throws Throwable {
		Pagefactory_2.check_ticket_creation_status(driver);
	}

	@And("^Banner should be displayed on the global request list$")
	public void banner_should_be_displayed_on_the_global_request_list() throws Throwable {
		Pagefactory_2.check_banner_status(driver);
	}

	@When("^user selects the checkbox for one open request$")
	public void user_selects_the_checkbox_for_one_open_request() throws Throwable {
		Pagefactory_2.select_all_open_request(driver);
	}

	@When("^selects the 'change to close' button$")
	public void selects_the_change_to_close_button() throws Throwable {
		Pagefactory_2.change_to_closed(driver);
	}

	@Given("^user selected one SD form from the global request list$")
	public void user_selected_one_SD_form_from_the_global_request_list() throws Throwable {
		Pagefactory_2.select_one_sd_request(driver);
	}

	@When("^the user adds the attachment for the opened SD request$")
	public void the_user_adds_the_attachment_for_the_opened_SD_request() throws Throwable {
		Pagefactory_2.add_attachment(driver);
	}

	@When("^clicks on the 'post' button$")
	public void clicks_on_the_post_button() throws Throwable {
		Pagefactory_2.post_attachment(driver);
	}

	@Then("^attachment link should be dispalyed on the attachment section$")
	public void attachment_link_should_be_dispalyed_on_the_attachment_section() throws Throwable {
		Pagefactory_2.attachment_tab_download(driver);
	}

	@When("^the user types some message in 'write a message' textbox$")
	public void the_user_types_some_message_in_write_a_message_textbox() throws Throwable {
		Pagefactory_2.write_a_message(driver, sd_summary);
	}

	@Then("^the added message should be shown under the comments section$")
	public void the_added_message_should_be_shown_under_the_comments_section() throws Throwable {
		Pagefactory_2.validate_added_message(driver, sd_summary);
	}

	@When("^selects the 'share with organization' option and submits the request$")
	public void selects_the_share_with_organization_option_and_submits_the_request() throws Throwable {
		Pagefactory_2.Request_creation_with_share_with_organization(driver);
	}


	@When("^selects the 'share with specific people' option and submits the request$")
	public void selects_the_share_with_specific_people_option_and_submits_the_request() throws Throwable {
		Pagefactory_2.Request_creation_with_specific_people(driver);
	}
	
	@And("^Banner should be displayed on the global request list view$")
	public void banner_should_be_displayed_on_the_global_request_list_view() throws Throwable {
		Pagefactory_2.check_banner_status_view(driver);
		driver.quit();
	}
}
