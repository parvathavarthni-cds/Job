package com.pw.pw_screens;

import java.text.ParseException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.pw.publicLib.API_Handler;
import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.UIHandler_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Portfolios extends DataProvider{
	public static WebDriver driver;
	public String date_picker_date= "10/04/2018";
	public String date_picker_from_date = "05/01/2018";
	public String todate;
	public String get_investor_name; 
	public int gettab_count;
	
	@Given("^user enters the username and password into login screen$")
	public void user_enters_the_username_and_password_into_login_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
		System.out.println("chrome browser launched");
		UIHandler_1 login_data = PageFactory.initElements(driver, UIHandler_1.class);
		driver = login_data.Adviser_login(driver, username, password);
		Thread.sleep(10000);
	}
	
	@When("^the user clicks the portfolio dropdown from DashBoard$")
	public void the_user_clicks_the_portfolio_dropdown_from_DashBoard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-logo")));
		String title= driver.getTitle();
		Assert.assertEquals("Hive",title);
	}

	@Then("^portfolio details are shown on the DashBoard page$")
	public void portfolio_details_are_shown_on_the_DashBoard_page() throws Throwable {
		UIHandler_1 request_count = PageFactory.initElements(driver, UIHandler_1.class);
		driver = request_count.check_investor_tab(driver);
		
	}
	@Given("^user is on adviser dashboard screen$")
	public void user_is_on_adviser_dashboard_screen() throws Throwable {
		UIHandler_1 portfolio_value = PageFactory.initElements(driver, UIHandler_1.class);
		driver = portfolio_value.get_investor_portfolio_value(driver);
	}

	@When("^user selects any portfolio from portfolio dropdown$")
	public void user_selects_any_portfolio_from_portfolio_dropdown() throws Throwable {
		UIHandler_1 portfolio_name = PageFactory.initElements(driver, UIHandler_1.class);
		driver = portfolio_name.portfolio_tab(driver);
		
	}

	@Then("^selected portfolio name and asset details should be display on portfolio summary screen$")
	public void selected_portfolio_name_and_asset_details_should_be_display_on_portfolio_summary_screen() throws Throwable {
		UIHandler_1 portfolio_tab_value = PageFactory.initElements(driver, UIHandler_1.class);
		driver = portfolio_tab_value.select_investor_and_getvalue(driver);
	}
	
	@Given("^user is on portfolio summary screen$")
	public void user_is_on_portfolio_summary_screen() {
		//validate the Portfolio Valuvation screen Netvalue
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("SimpleSearcher")));
		Assert.assertTrue(driver.findElement(By.id("valuation-tab")).getText().contains("Summary"));
	}

	@When("^user get the netvalue date from valuvation screen$")
	public void user_get_the_netvalue_date_from_valuvation_screen() throws Throwable {
		UIHandler_1 portfolio_netdate = PageFactory.initElements(driver, UIHandler_1.class);
		driver = portfolio_netdate.validate_date(driver);
	}

	@Then("^date should be matched with datepicker current selected date$")
	public void date_should_be_matched_with_datepicker_current_selected_date() throws Throwable {
		UIHandler_1 compare_date = PageFactory.initElements(driver, UIHandler_1.class);
		driver = compare_date.getdate(driver);
	}
	

	@When("^user gets the portfolio net value from Preamium API$")
	public void user_gets_the_portfolio_net_value_from_Preamium_API() throws UnirestException {
	    // get the Investor net value from Investor valuvation screen
		API_Handler portfolio_netvalue_API = PageFactory.initElements(driver, API_Handler.class);
		driver = portfolio_netvalue_API.get_investor_net_value_from_API(driver, portfolio_valuation_API);
	}

	@Then("^compare the API value with portfolio net value$")
	public void compare_the_API_value_with_portfolio_net_value() {
	    // Write code here for comparing the API net value with display value
		API_Handler portfolio_netvalue_UI_Comparison = PageFactory.initElements(driver, API_Handler.class);
		driver = portfolio_netvalue_UI_Comparison.comparision(driver);
	}
	
	@When("^user selects the any previous business date from date picker from investor valuation screen$")
	public void user_selects_the_any_previous_business_date_from_date_picker_from_investor_valuation_screen() throws UnirestException, InterruptedException  {
	    // Write code here for enter date in date picker filed on valuation screen
		 UIHandler_1 select_date_valuation = PageFactory.initElements(driver, UIHandler_1.class);
		 driver = select_date_valuation.select_date(driver, date_picker_date);
	}

	@Then("^the data related to the selected date should be displayed on the same screen and message on toaster should shown$")
	public void the_data_related_to_the_selected_date_should_be_displayed_on_the_same_screen_and_message_on_toaster_should_shown() throws UnirestException, InterruptedException  {
	    // Write code for get the value from the API and compare it with screen value
		API_Handler portfolio_netvalue_API = PageFactory.initElements(driver, API_Handler.class);
		driver = portfolio_netvalue_API.get_investor_net_value_from_API(driver, portfolio_valuation_API_with_date);
		driver = portfolio_netvalue_API.get_netvalue(driver);
		driver = portfolio_netvalue_API.comparision(driver);
		Assert.assertTrue(driver.findElement(By.id("past_portfolio_date")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"past_portfolio_date\"]/div/p/span")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_datepicker_2")));
		Thread.sleep(5000);
	}
	
	@Given("^user is on portfolio transactions screen$")
	public void user_is_on_portfolio_transactions_screen()  {
	    // Write code here to navigate to the Movements screen 
		
//		//need to remove refresh*********
//		driver.navigate().refresh();
//		//need to remove refresh*********
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_datepicker_2")));
		driver.findElement(By.id("transactions-tab")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("from")));
		todate = driver.findElement(By.id("to")).getAttribute("value");
	}

	@When("^user selects 'From Date' and 'To Date' in portfolio transactions screen$")
	public void user_selects_From_Date_and_To_Date_in_portfolio_transactions_screen() throws InterruptedException  {
	    // Write code here for selecting date from movements screen date picker
		UIHandler_1 select_date_movements = PageFactory.initElements(driver, UIHandler_1.class);
		driver = select_date_movements.edit_datePicker_value(driver, date_picker_from_date);
	}

	@Then("^selected date should be display on the datepicker fields$")
	public void selected_date_should_be_display_on_the_datepicker_fields() throws InterruptedException, ParseException {
		UIHandler_1 select_date_movements = PageFactory.initElements(driver, UIHandler_1.class);
		driver = select_date_movements.compare_date(driver, date_picker_from_date, todate);
	}
	
	@Given("^user is on portfolio cash screen$")
	public void user_is_on_portfolio_cash_screen() throws InterruptedException  {
		// Write code here to navigate to the Movements screen 
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Thread.sleep(5000);
		driver.findElement(By.id("cash-tab")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("from")));
		todate = driver.findElement(By.id("to")).getAttribute("value");
	}

	@When("^user selects 'From Date' and 'To Date' in portfolio cash screen$")
	public void user_selects_From_Date_and_To_Date_in_portfolio_cash_screen() throws InterruptedException {
		 // Write code here for selecting date from movements screen date picker
		UIHandler_1 select_date_casebook = PageFactory.initElements(driver, UIHandler_1.class);
		driver = select_date_casebook.edit_datePicker_value(driver, date_picker_from_date);
	}

	@Given("^user is on portfolio request screen$")
	public void user_is_on_portfolio_request_screen() throws Throwable {
		// write code here for navigate to the update profile SD form
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/h4")));
		UIHandler_1 get_the_request_tab = PageFactory.initElements(driver, UIHandler_1.class);
		driver = get_the_request_tab.request_tab(driver);
	}

	@When("^user creates the new SD request by clicking update button$")
	public void user_creates_the_new_SD_request_by_clicking_update_button() throws Throwable {
		// Write code here for entering values in to the Side tray view
		UIHandler_1 Create_the_request = PageFactory.initElements(driver, UIHandler_1.class);
		driver = Create_the_request.create_request(driver, summary, description);
	}

	@Then("^Created request details are shown on the portfolio request tab$")
	public void Created_request_details_are_shown_on_the_portfolio_request_tab() throws Throwable {
		// Write code here for submit the SD form and update SD form
		UIHandler_1 Validate_created_request = PageFactory.initElements(driver, UIHandler_1.class);
		driver = Validate_created_request.updated_list(driver);
		
	}
	
	@Given("^adviser left portfolio tab open in the previous session$")
	public void adviser_left_portfolio_tab_open_in_the_previous_session() {
	    // Write code here to get the previous selected tab details
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_datepicker_2")));
		UIHandler_1 investor_tab_counts = PageFactory.initElements(driver, UIHandler_1.class);
		driver = investor_tab_counts.getTabdetails(driver);
	}

	@When("^the user logs in to hive application again$")
	public void the_user_logs_in_to_hive_application_again() throws Throwable {
	    // Write code here for signing out from hive and re-login
		UIHandler_1 session_logout = PageFactory.initElements(driver, UIHandler_1.class);
		driver = session_logout.logout(driver);
		driver.close();
		this.user_enters_the_username_and_password_into_login_screen();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_datepicker_2")));
	}

	@Then("^previously opened portfolio should be shown on the user$")
	public void previously_opened_portfolio_should_be_shown_on_the_user() {
	    // Write code here for comparing the previous session tab count and current session tab counts
		gettab_count = UIHandler_1.get_tab_count();
		get_investor_name = UIHandler_1.get_current_investor_name();
		UIHandler_1 previous_session_details = PageFactory.initElements(driver, UIHandler_1.class);
		driver = previous_session_details.previous_investor_tabs(driver, gettab_count, get_investor_name);
		driver.quit();
	}
}
