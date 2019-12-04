package com.pw.pw_screens;
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

public class SD_Request_Validation_Portfolio_Level extends DataProvider{
	public static WebDriver driver;
	private UIHandler_1 Pagefactory_1 = PageFactory.initElements(driver, UIHandler_1.class);
	private UIHandler_2 Pagefactory_2 = PageFactory.initElements(driver, UIHandler_2.class);
	private Logger LOGGER = Logger.getLogger(SD_Forms_Through_GlobalActivity.class.getName());
	
	@Given("^the adviser user is on hive login screen$")
	public void the_adviser_user_is_on_hive_login_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
	}

	@When("^user enters the credientials and logs in to the application$")
	public void user_enters_the_credientials_and_logs_in_to_the_application() throws Throwable {
		LOGGER.log(Level.INFO, "Chrome Browser Launched"); 
		UIHandler_1 Advisor_login = PageFactory.initElements(driver, UIHandler_1.class);
		Advisor_login.Adviser_login(driver, username, password);
		String title= driver.getTitle();
		Assert.assertEquals("Hive", title);
	    LOGGER.log(Level.INFO, "The HIVE"); 
	}

	@And("^user selects any Portfolio in the portfolio dropdown$")
	public void user_selects_any_Portfolio_in_the_portfolio_dropdown() throws Throwable {
		Pagefactory_2.investor_selection(driver);
	}

	@Then("^user should get navigate to the Portfolio summary screen$")
	public void user_should_get_navigate_to_the_Portfolio_summary_screen() throws Throwable {
		Pagefactory_2.portfolio_valuation_screen(driver);
	}

	@Given("^adviser user is on portfolio summary screen$")
	public void adviser_user_is_on_portfolio_summary_screen() throws Throwable {
		Pagefactory_2.portfolio_valuation_screen(driver);
	}

	@When("^user clicks the 'New request' button in the portfolio level$")
	public void user_clicks_the_New_request_button_in_the_portfolio_level() throws Throwable {
		Pagefactory_2.clicks_new_activity_button(driver);
	}

	@Then("^user should see the request groups in the side tray$")
	public void user_should_see_the_request_groups_in_the_side_tray() throws Throwable {
		Pagefactory_2.request_groups(driver);
	}

	@When("^user clicks the request tab on the portfolio screen$")
	public void user_clicks_the_request_tab_on_the_portfolio_screen() throws Throwable {
		Pagefactory_2.request_tab(driver);
	}

	@And("^user enters any 'Request id' in the Request_ID filter$")
	public void user_enters_any_Request_id_in_the_Request_ID_filter() throws Throwable {
		Pagefactory_2.Search_by_Request_ID_filter_portfolio_level(driver);
	}

	@Then("^user should see the result based on the entered 'Request id'$")
	public void user_should_see_the_result_based_on_the_entered_Request_id() throws Throwable {
		Pagefactory_2.Result_for_Search_by_Request_ID_filter_portfolio_level(driver);
	}

	@Given("^the user is on portfolio level request list$")
	public void the_user_is_on_portfolio_level_request_list() throws Throwable {
		Pagefactory_2.Navigate_request_tab(driver);
	}

	@When("^the user selects reporter name as 'Me' from the reporter filter dropdown$")
	public void the_user_selects_reporter_name_as_Me_from_the_reporter_filter_dropdown() throws Throwable {
		Pagefactory_2.Search_by_Reporter_name_filter_portfolio_level(driver);
	}

	@Then("^the user should see the result based on 'Me'$")
	public void the_user_should_see_the_result_based_on_Me() throws Throwable {
		Pagefactory_2.Reporter_name_check_portfolio_level(driver);
	}

	@When("^the user selects request type as “General query” from the type filter$")
	public void the_user_selects_request_type_as_General_query_from_the_type_filter() throws Throwable {
		Pagefactory_2.Search_by_type_filter_portfolio_level(driver);
	}

	@Then("^the user should see the result based on the selected type$")
	public void the_user_should_see_the_result_based_on_the_selected_type() throws Throwable {
		Pagefactory_2.Result_for_Search_by_type_filter_portfolio_level(driver);
	}

	@When("^user choose the status as 'Closed' in the status filter$")
	public void user_choose_the_status_as_Closed_in_the_status_filter() throws Throwable {
		Pagefactory_2.Search_by_status_filter_portfolio_filter(driver);
	}

	@Then("^the user should see the result based on the 'Closed' status$")
	public void the_user_should_see_the_result_based_on_the_Closed_status() throws Throwable {
		Pagefactory_2.Result_for_Search_by_status_filter_portfolio_level(driver);
	}

	@When("^the user selects 'today' option in the date picker$")
	public void the_user_selects_today_option_in_the_date_picker() throws Throwable {
		Pagefactory_2.Search_by_date_filter(driver);
	}

	@Then("^the user should see all the requests which are created on the current day$")
	public void the_user_should_see_all_the_requests_which_are_created_on_the_current_day() throws Throwable {
		Pagefactory_2.Result_for_Search_by_date_filter_portfolio_level(driver);
	}

	@When("^the user enters the custom range on 'From' and 'To' text fields$")
	public void the_user_enters_the_custom_range_on_From_and_To_text_fields() throws Throwable {
		Pagefactory_2.Search_by_Custom_range_date_filter(driver);
	}

	@Then("^the user should see all the requests which are created on the selected range$")
	public void the_user_should_see_all_the_requests_which_are_created_on_the_selected_range() throws Throwable {
		Pagefactory_2.Result_for_Search_by_custom_range_date_filter_portfolio_level(driver);
	}

	@Given("^the first (\\d+) request details are displaying on first page$")
	public void the_first_request_details_are_displaying_on_first_page(int arg1) throws Throwable {
		Pagefactory_2.first_50_records(driver);
	}

	@When("^the user searching for reporter as 'Gunaseelan Palanisamy' and request type as 'General query'$")
	public void the_user_searching_for_reporter_as_Gunaseelan_Palanisamy_and_request_type_as_General_query() throws Throwable {
		Pagefactory_2.applying_multiple_filters_in_request_portfolio_level(driver);
	}

	@When("^the user clicks the second page from the pagination$")
	public void the_user_clicks_the_second_page_from_the_pagination() throws Throwable {
		Pagefactory_2.second_page_in_the_pagination_portfolio_level(driver);
	}

	@Then("^the next (\\d+) result related to the selected filters should be displayed on the request list$")
	public void the_next_result_related_to_the_selected_filters_should_be_displayed_on_the_request_list(int arg1) throws Throwable {
		Pagefactory_2.next_50_records(driver);
	}

	@Given("^user selected the general Query ticket through portfolio level 'New Request' button by keeping the portfolio level request list open$")
	public void user_selected_the_general_Query_ticket_through_portfolio_level_New_Request_button_by_keeping_the_portfolio_level_request_list_open() throws Throwable {
		Pagefactory_2.clicks_new_activity_button(driver);
		Pagefactory_2.General_query(driver);
	}

	@When("^the user enters details in the sd form fields$")
	public void the_user_enters_details_in_the_sd_form_fields() throws Throwable {
		Pagefactory_2.enter_values_general_query(driver, sd_summary, sd_description);
	}

	@When("^the users submit the sd request$")
	public void the_users_submit_the_sd_request() throws Throwable {
		Pagefactory_2.general_query_creation(driver);
	}

	@Then("^the user should see the success message on the side tray$")
	public void the_user_should_see_the_success_message_on_the_side_tray() throws Throwable {
		Pagefactory_2.check_ticket_creation_status(driver);
	}

	@Then("^the user should see the banner on the portfolio request list under portfolio tab$")
	public void the_user_should_see_the_banner_on_the_portfolio_request_list_under_portfolio_tab() throws Throwable {
		Pagefactory_2.check_banner_status_portfolio_level(driver);
	}

	@When("^the user selects the open request from request list$")
	public void the_user_selects_the_open_request_from_request_list() throws Throwable {
		Pagefactory_2.select_open_request_portfolio_level(driver);
	}

	@When("^changes the status as ‘closed’$")
	public void changes_the_status_as_closed() throws Throwable {
		Pagefactory_2.change_the_status(driver);
	}

	@Then("^banner message should be displayed on the portfolio request list under request tab$")
	public void banner_message_should_be_displayed_on_the_portfolio_request_list_under_request_tab() throws Throwable {
		Pagefactory_2.check_banner_status_portfolio_level(driver);
	}

	@Then("^after the page refresh banner should disappear and ticket details should be updated$")
	public void after_the_page_refresh_banner_should_disappear_and_ticket_details_should_be_updated() throws Throwable {
		Pagefactory_2.check_the_ticket_status(driver);
		driver.quit();
	}
	
	@Given("^user is on portfolio summary screen 'PWL1 test'$")
	public void user_is_on_portfolio_summary_screen_PWL1_test() throws Throwable {
		Pagefactory_2.portfolio_valuation_screen(driver);
	}
	
	@When("^user enters portfolio ID into the search bar$")
	public void user_enters_portfolio_ID_into_the_search_bar() throws Throwable {
		Pagefactory_2.investor_selection_by_ID(driver);
	}
	
	@Then("^portfolio related to the given ID should be shown on the result page$")
	public void portfolio_related_to_the_given_ID_should_be_shown_on_the_result_page() throws Throwable {
		Pagefactory_2.portfolio_name_check(driver);
	}

	@When("^user clicks the name column from the portfolio dropdown list$")
	public void user_clicks_the_name_column_from_the_portfolio_dropdown_list() throws Throwable {
		Pagefactory_1.portfolioname_sorting(driver);
	}

	@Then("^portfolio list should be sorted by portfolio names$")
	public void portfolio_list_should_be_sorted_by_portfolio_names() throws Throwable {
		Pagefactory_1.portfolioname_sortingn(driver);
	}
}