package com.pw.pw_screens;

import java.sql.SQLException;

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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User_Profile extends DataProvider{
	public static WebDriver driver;
	public String get_OTP_query = "select direct_otp from users where email = 'gunaseeelan.p100@gmail.com'";
	
	@Given("^adviser is on user profile details screen$")
	public void adviser_is_on_user_profile_details_screen() throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
	    // Write code here to navigate to the User profile screen
		PW_login login = new PW_login();
		driver = login.getdata(url);
		UIHandler_1 login_data = PageFactory.initElements(driver, UIHandler_1.class);
		driver = login_data.Adviser_login(driver, username, password);
	}

	@When("^the user clicks the details button on the profile details screen$")
	public void the_user_clicks_the_details_button_on_the_profile_details_screen() throws InterruptedException {
	    // Write code here to navigate to the user profile and click the activity link
		UIHandler_2 user_profile = PageFactory.initElements(driver, UIHandler_2.class);
		driver = user_profile.Adviser_login(driver);
	}

	@Then("^the user activity details should be shown on the profile details screen$")
	public void the_user_activity_details_should_be_shown_on_the_profile_details_screen() throws InterruptedException {
	    // Write code here that validating the activity model window
		UIHandler_2 user_profile_activity = PageFactory.initElements(driver, UIHandler_2.class);
		driver = user_profile_activity.activityLog(driver);
	}

	@Given("^adviser is on the change password screen$")
	public void adviser_is_on_the_change_password_screen() throws InterruptedException {
	    // Write code here to navigate to the password screen on user profile
		UIHandler_2 user_profile_password = PageFactory.initElements(driver, UIHandler_2.class);
		driver = user_profile_password.password_tab(driver);
	}

	@When("^the user enters the invalid current password and clicks the update button$")
	public void the_user_enters_the_invalid_current_password_and_clicks_the_update_button() throws InterruptedException {
	    // Write code here to enter the invalid current password
		System.out.println("invalid password data==>"+invalid_new_password);
		UIHandler_2 invalid_password_validation = PageFactory.initElements(driver, UIHandler_2.class);
		driver = invalid_password_validation.Wrong_current_password(driver, invalid_new_password, valid_new_password);
	}

	@Then("^error message should be shown on the same page$")
	public void error_message_should_be_shown_on_the_same_page() {
	    // Write code here to validate the toaster for wrong password
		Assert.assertTrue(driver.findElement(By.id("toast-container")).isDisplayed());
	}

	@When("^the user enters the three digit password on the new password field$")
	public void the_user_enters_the_three_digit_password_on_the_new_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(invalid_new_password);
	    UIHandler_2 new_password = PageFactory.initElements(driver, UIHandler_2.class);
		driver = new_password.invalid_new_password(driver, password, invalid_new_password);
	    
	}

	@Then("^invalid new password error message should be shown on the same page$")
	public void invalid_new_password_error_message_should_be_shown_on_the_same_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).isDisplayed());
		driver.quit();
	}

	@When("^the user changes the password$")
	public void the_user_changes_the_password() {
	    // Write code here to change the password
	    System.out.println(invalid_new_password);
	    UIHandler_2 new_password = PageFactory.initElements(driver, UIHandler_2.class);
		driver = new_password.invalid_new_password(driver, password, valid_new_password);
		
	}

	@Then("^success message should be shown on the same page$")
	public void success_message_should_be_shown_on_the_same_page() {
	    // Write code here to validate the conform message for the change password request
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		Assert.assertTrue(driver.findElement(By.id("toast-container")).isDisplayed());
	}
	
	@Given("^adviser is on login pasge$")
	public void adviser_is_on_login_pasge() throws InterruptedException {
		// write code here to validate application is on login screen
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		Assert.assertTrue(driver.findElement(By.id("user_email")).isDisplayed());
	}

	@When("^user log-out from the application and log in again with the new password$")
	public void user_log_out_from_the_application_and_log_in_again_with_the_new_password() throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
	    // Write code here to re-login with new password
		UIHandler_1 login_with_new_pass = PageFactory.initElements(driver, UIHandler_1.class);
		driver = login_with_new_pass.Adviser_login(driver, username, valid_new_password);
		driver = login_with_new_pass.otp_device(driver);
		driver = login_with_new_pass.database(driver, get_OTP_query);
	}

	@Then("^the user should get successfully prompted to sign in again$")
	public void the_user_should_get_successfully_prompted_to_sign_in_again() throws InterruptedException {
	    // Write code here to validate login with new password
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".primary-logo")));
		UIHandler_2 profile = PageFactory.initElements(driver, UIHandler_2.class);
		
		driver = profile.Adviser_login(driver);
		driver = profile.password_tab(driver);
		
//	    UIHandler change_to_old_password = PageFactory.initElements(driver, UIHandler.class);
//		driver = change_to_old_password.invalid_new_password(driver, valid_new_password, Password);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//		Assert.assertTrue(driver.findElement(By.id("toast-container")).isDisplayed());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		driver.close();
	}
}
