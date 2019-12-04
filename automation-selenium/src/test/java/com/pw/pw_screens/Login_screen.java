package com.pw.pw_screens;

import org.openqa.selenium.By;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pw.publicLib.DataBase;
import com.pw.publicLib.DataProvider;
import com.pw. publicLib.PW_login;
import com.pw.publicLib.UIHandler_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_screen extends DataProvider{
	public static WebDriver driver;
	public String databasevalue;
	public String OTP;
	public String get_OTP_query = "select direct_otp from users where email = 'gunaseeelan.p100@gmail.com'";
	public String get_otp_query_admin = "select direct_otp from users where email = 'gunaseeelan.p101@gmail.com'";
	public String update_account = "UPDATE users SET failed_attempts = 0 , locked_at = null, otp_failed_attempts = 0 where email = 'gunaseeelan.p100@gmail.com'";
	public String verify_forgotpassword = "UPDATE users SET reset_password_token = null, reset_password_sent_at = null where email = 'gunaseeelan.p100@gmail.com'";
	public String password_details = "select reset_password_sent_at from users where email = 'gunaseeelan.p100@gmail.com'";
	public String get_otp_generated_time = "select direct_otp_sent_at from users where email = 'gunaseeelan.p100@gmail.com'";
	public static Logger Log = Logger.getLogger(Login_screen.class.getName());
	
	@Given("^DG admin user is on admin settings page$")
	public void dg_admin_user_is_on_admin_settings_page() throws Throwable {
	    // Write code here to login as DG admin
				   PW_login login = new PW_login();
		driver = login.getdata(url);
		UIHandler_1 admin_login = PageFactory.initElements(driver, UIHandler_1.class);
		driver = admin_login.Adviser_login(driver, dg_admin_username, password);
		Thread.sleep(10000);
		Log.info("logged in as an DG admin");
	}
	
	@When("^user changes the otp settings to 'each and every login'$")
	public void user_changes_the_otp_settings_to_each_and_every_login() throws Throwable {
	    // Write code here to change the OTP settings
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-control.m-input.general-search")));
		UIHandler_1 admin_login = PageFactory.initElements(driver, UIHandler_1.class);
		driver = admin_login.change_2FA_settings(driver);
		Log.info("changed the 2FA setting from DG admin screen");
	}
	@Then("^OTP screen should be display for every login$")
	public void otp_screen_should_be_display_for_every_login() throws Throwable {
	    // Write code here to logout from admin screen
		UIHandler_1 logout_admin = PageFactory.initElements(driver, UIHandler_1.class);
		driver = logout_admin.logout_dg_admin(driver);
		Log.info("logout from the DG admin screen and navigates back to login screen");
		Log.info("current page url is => "+driver.getCurrentUrl());
	}
	
	@Given("^adviser is on the hive login page$")
	public void adviser_is_on_the_hive_login_page() throws Throwable {
		UIHandler_1 login = PageFactory.initElements(driver, UIHandler_1.class);
		driver = login.hive_login(driver);
		Log.info("adviser is on hive login page");
	}
	
	@When("^the user enters the wrong username and valid password$")
	public void the_user_enters_the_wrong_username_and_valid_password() throws Throwable {
	    // Write code here to enter the wrong username and password onto the login screen
		UIHandler_1 invalidusername = PageFactory.initElements(driver, UIHandler_1.class);
		driver = invalidusername.Adviser_login(driver, invalid_username, password);
		Log.info("user enters the wrong username and valid password");
	}

	@Then("^user should get the error message for the wrong username and password$")
	public void user_should_get_the_error_message_for_the_wrong_username_and_password() throws Throwable {
	    // Write code here to validate the error message for wrong credentials
		Assert.assertTrue(driver.findElement(By.id("alert-message")).isDisplayed());
		Log.info("user got the error message for wrong username and password===> "+driver.findElement(By.id("alert-message")).getText());
	}
	

	@When("^the user enters the valid username and invalid password$")
	public void the_user_enters_the_valid_username_and_invalid_password() throws Throwable {
	    // Write code here to enter the wrong username and password onto the login screen
		UIHandler_1 invalidpassword = PageFactory.initElements(driver, UIHandler_1.class);
		driver = invalidpassword.Adviser_login(driver, username, valid_new_password);
		Log.info("user enters the valid username and wrong password");
	}

	@When("^the user enters wrong login credentials for the fifth time$")
	public void the_user_enters_wrong_login_credentials_for_the_fifth_time() throws Throwable {
	    // Write code here to enter the invalid credentials
		UIHandler_1 invalidcredentials = PageFactory.initElements(driver, UIHandler_1.class);
		driver = invalidcredentials.Adviser_login(driver, username, valid_new_password);
		driver = invalidcredentials.validate_five_unsuccessful_login(driver);
		Log.info("account has locked after 5 unsuccessful login");
	}

	@Then("^Error message should on the login page and user account should get blocked$")
	public void error_message_should_on_the_login_page_and_user_account_should_get_blocked() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
//		Log.info("block message====>"+driver.findElement(By.xpath("//*[@id=\"alert-message\"]/div/div[2]/strong")).getText());
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"alert-message\"]/div/div[2]/strong")).getText().contains("locked"));
//		Log.info("Account locked message is displaying in");
		DataBase update_user_account = PageFactory.initElements(driver, DataBase.class);
		driver = update_user_account.update(driver, update_account);
		Log.info("unlocked the user from Database");
		Thread.sleep(10000);
	}
	
	@Given("^adviser is on forgot password screen$")
	public void adviser_is_on_forgot_password_screen() throws Throwable {
	    // Write code here to navigate to the forgot password page
		UIHandler_1 forgot_password_page = PageFactory.initElements(driver, UIHandler_1.class);
		driver = forgot_password_page.navigate_to_forgot_password_screen(driver);
		Log.info("user is on forgot password screen");
	}

	@When("^the user enters the email id and clicks the send instructions to my email button$")
	public void the_user_enters_the_email_id_and_clicks_the_send_instructions_to_my_email_button() throws Throwable {
	    // Write code here enter the username and get the forgot password link
		UIHandler_1 resent_link = PageFactory.initElements(driver, UIHandler_1.class);
		driver = resent_link.forgot_password(driver, username);
		Log.info("user successfully entered the username into forgot password screen");
	}

	@Then("^email request triggered and status updated on user table in the database$")
	public void email_request_triggered_and_status_updated_on_user_table_in_the_database() throws Throwable {
	    // Write code here to validate the database for forgot password link sent or not
		DataBase update_user_account = PageFactory.initElements(driver, DataBase.class);
		driver = update_user_account.getdata(driver, password_details);
		databasevalue = DataBase.database_value();
		Assert.assertTrue(databasevalue!=null);
		driver = update_user_account.update(driver, verify_forgotpassword);
		Log.info("successfully verified in DB for forgot password validation");
	}
	
	@When("^the user logs in with the valid username and password$")
	public void the_user_logs_in_with_the_valid_username_and_password() throws Throwable {
	    // Write code here to login as a same dealer group user
		UIHandler_1 login_adviser = PageFactory.initElements(driver, UIHandler_1.class);
		driver.navigate().refresh();
		driver = login_adviser.Adviser_login(driver, username, password);
		Thread.sleep(10000);
		Log.info("successfully entered the valid username and password");
//		Boolean email = driver.findElements(By.id("user_email")).size() > 0;
//		if(email) {
//			driver = login_adviser.Adviser_login(driver, username, password);
//		}
//		else {
//			System.out.println("page is on 2fa screen====>"+driver.getCurrentUrl());
//		}
	}

	@Then("^TFA device selection screen should ask the user to select the Email or SMS shown on the screen$")
	public void tfa_device_selection_screen_should_ask_the_user_to_select_the_Email_or_SMS_shown_on_the_screen() throws Throwable {
	    // Write code here to validate the 2fa screen
		UIHandler_1 validate_2FA = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_2FA.validate_otp_screen(driver);
		Log.info("user successfully navigated to the 2FA screen");
	}

	@Given("^adviser is on TFA screen$")
	public void adviser_is_on_TFA_screen() throws Throwable {
	    // Write code here to make sure user is on 2FA screen
		System.out.println("print current URL=====>"+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("two_factor_authentication"));
		Log.info("user is on 2FA screen");
	}

	@When("^the user selects the Email option$")
	public void the_user_selects_the_Email_option() throws Throwable {
	    // Write code here to choose the email option from 2FA screen
		UIHandler_1 validate_2FA_Email = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_2FA_Email.validate_otp_email(driver);
		Log.info("user successfully navigated to the OTP enters screen");
	}

	@Then("^TFA code should be sent to that user email account$")
	public void tfa_code_should_be_sent_to_that_user_email_account() throws Throwable {
	    // Write code here to validate the OTP from Database
		DataBase update_otp_details = PageFactory.initElements(driver, DataBase.class);
		driver = update_otp_details.getdata(driver, get_otp_generated_time);
		databasevalue = DataBase.database_value();
		Assert.assertTrue(databasevalue!=null);
		Log.info("successfully updted values in database");
	}

	@When("^the user selects the change device button and chooses mobile option$")
	public void the_user_selects_the_change_device_button_and_chooses_mobile_option() throws Throwable {
	    // Write code here to choose the mobile option from 2FA screen
		UIHandler_1 validate_otp_mobile = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_otp_mobile.validate_otp_mobile(driver);
		Log.info("user successfully choose the different OTP type");
	}

	@Then("^TFA code should be sent to that user mobile number$")
	public void tfa_code_should_be_sent_to_that_user_mobile_number() throws Throwable {
	    // Write code here to validate the OTP from Database
		DataBase update_otp_details = PageFactory.initElements(driver, DataBase.class);
		driver = update_otp_details.getdata(driver, get_otp_generated_time);
		databasevalue = DataBase.database_value();
		Assert.assertTrue(databasevalue!=null);
		Log.info("OTP message successfully sent to users mobile");
	}
	
	@When("^the user enters the invalid code$")
	public void the_user_enters_the_invalid_code() throws Throwable {
	    // Write code here to enter the wrong OTP on authentication screen
		UIHandler_1 validate_database_with_invalid_otp = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_database_with_invalid_otp.validate_wrong_OTP(driver);
		Log.info("successfully validated OTP function with invalid OTP message");
	}

	@Then("^error message shown on the same page$")
	public void error_message_shown_on_the_same_page() throws Throwable {
	    // Write code here to validate the error message for incorrect OTP
		Assert.assertTrue(driver.findElement(By.cssSelector(".color-orange-yellow")).isDisplayed());
		Log.info("error message displayed for invalid OTP");
	}

	@When("^the user enters the valid code$")
	public void the_user_enters_the_valid_code() throws Throwable {
	    // Write code here to get the valid OTP
		UIHandler_1 validate_database = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_database.database(driver, get_OTP_query);
		Thread.sleep(5000);
		Log.info("user successfully enters the valid OTP");
	}

	@Then("^user successfully login and navigates to the hive application$")
	public void user_successfully_login_and_navigates_to_the_hive_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".primary-logo")));
		Assert.assertTrue(driver.findElement(By.cssSelector(".primary-logo")).isDisplayed());
		UIHandler_1 change_back_OTP_settings = PageFactory.initElements(driver, UIHandler_1.class);
		driver = change_back_OTP_settings.check_investor_tab(driver);
		driver = change_back_OTP_settings.dashboard_content(driver);
		driver = change_back_OTP_settings.logout(driver);
		driver = change_back_OTP_settings.Adviser_login(driver, dg_admin_username, password);
		driver = change_back_OTP_settings.otp_device(driver);
		driver = change_back_OTP_settings.database(driver, get_otp_query_admin);
		driver = change_back_OTP_settings.change_OTP_Setting(driver);
		Log.info("OTP settings successfully disabled");
		driver.quit();
	}
}
