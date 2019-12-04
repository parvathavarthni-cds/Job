package com.pw.publicLib;

import java.io.File;
import java.sql.SQLException;
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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.pw.pw_screens.Risk_Based_Test_Set_for_HIVE_OP_BUY;

public class UIHandler_3 extends Page_factory{
	
	private Logger LOGGER = Logger.getLogger(SD_UIHandler.class.getName());	
	public static String Ref_id = null;
	public String remove_created_order = "DELETE FROM `orderpaddb`.`orders` WHERE `order_reference` = ";
	
	public WebDriver investor_selection(WebDriver driver, String portfolio) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, global_portfolio_list_button, 120);
		Thread.sleep(8000);
		global_portfolio_list_button.click();
		wait_by_visibility(driver, Name_under_portfolio_list, 120);
		Search_by_portfolio_name_or_ID_search_box.click();
		Search_by_portfolio_name_or_ID_search_box.sendKeys(portfolio);
		Thread.sleep(12000);
		investor_name.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver get_CMA_cash(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		API_Handler.get_CMA_cash(driver);
	    LOGGER.log(Level.INFO, "CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA); 
		return driver;
	}
	public WebDriver get_all_CMA_cash(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		API_Handler.get_all_CMA_cash(driver);
	    LOGGER.log(Level.INFO, "ANZ CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA);
	    LOGGER.log(Level.INFO, "MAQ CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.Macquarie_Bank_CMA_CASH_DATA); 
		return driver;
	}
	public WebDriver place_orders_side_tray(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
		wait_until_clickable(driver, place_an_order_button, 120);
		place_an_order_button.click();
		return driver;
	}
	public WebDriver Add_a_BUY_order_side_tray(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, BUY_Button, 120);
		BUY_Button.click();
		wait_until_clickable(driver, Approved_product_list_dropdown, 120);
		return driver;
	}
	public WebDriver APL_asset_selection(WebDriver driver, String Asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(Asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		return driver;
	}
	public WebDriver enter_value_in_investment_amount_field(WebDriver driver, Float value) throws InterruptedException {
		wait_by_visibility(driver, investment_amount_field, 120);
		investment_amount_field.sendKeys(String.valueOf(value));
		return driver;
	}
	public WebDriver fill_neccessary_fields_to_enable_add_button(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, adviser_given_no, 120);
		adviser_given_no.click();
		BUY_PDS_Checkbox.click();
		return driver;
	}
	public WebDriver check_if_add_button_is_in_disabled_state(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(add_button.getAttribute("class").contains("add-disabled"), true);
	    LOGGER.log(Level.INFO, "+Add button is disabled"); 
		return driver;
	}
	public WebDriver validate_exceeding_your_available_funds(WebDriver driver) throws InterruptedException {
		assertEquals(driver, order_amount_validation_error_message, "You are exceeding your available funds", "You are not allowed to place an order");
		return driver;
	}
	public WebDriver check_if_add_button_is_in_enabled_state(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(add_button.getAttribute("class").contains("add-enabled"), true);
	    LOGGER.log(Level.INFO, "+Add button is enabled");
	    Thread.sleep(2000);
	    add_button.click();
		return driver;
	}
	public WebDriver click_on_add_button(WebDriver driver) throws InterruptedException {
	    add_button.click();
		return driver;
	}
	public WebDriver remove_draft_orders(WebDriver driver) throws InterruptedException {
		extended_sidetray_add_sell_cancel.click();
		wait_until_clickable(driver, draft_cancel, 120);
		draft_cancel.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(4000);
		return driver;
	}
	public WebDriver check_open_order_value(WebDriver driver) throws InterruptedException {
		String open_orders = open_orders_buy.getText();
		investment_amount_field.sendKeys(open_orders);
		float open_order = Float.parseFloat(investment_amount_field.getText())-1000;
		if ((open_order<Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA) & (open_order>0)) {
		    LOGGER.log(Level.INFO, String.valueOf(open_order)); 
		}
		return driver;
	}
	public WebDriver remove_the_created_order_from_orders_DB(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		DataBase remove = PageFactory.initElements(driver, DataBase.class);
		remove.delete_open_orders(driver, "DELETE FROM `orderpaddb`.`orders` WHERE `advisor_id` = 100 AND `order_reference` = "+Ref_id+"");
		return driver;
	}
	public WebDriver APL_asset_search(WebDriver driver, String asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		return driver;
	}
	public WebDriver Available_funds_equals_to_CMA_Cash_minus_Other(WebDriver driver) throws InterruptedException {
		String available_fund = available_funds.getText();
		String AF = available_fund.replaceAll(",", "");
		Float cash = Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA - 100;
		Assert.assertEquals(AF, "$"+cash);
	    LOGGER.log(Level.INFO, "Available funds = CMA Cash - Other"); 
		return driver;
	}
	public WebDriver ANZ_CMA_cash_as_the_Available_funds(WebDriver driver) throws InterruptedException {
		String available_fund = available_funds.getText();
		String AF = available_fund.replaceAll(",", "");
		Float cash = Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA - 100;
		Assert.assertEquals(AF, "$"+cash);
	    LOGGER.log(Level.INFO, "Available funds = ANZ CMA Cash - Other"); 
		return driver;
	}
	public WebDriver close_current_portfolio_tab(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, place_an_order_button, 120);
		portfolio_tab_close.click();
		return driver;
	}
	public WebDriver Minimum_cash_value_in_the_others_section(WebDriver driver) throws InterruptedException {
		assertEquals(driver,other_min_cash , "-$100.00", "Same minimum cash");
		return driver;
	}
	public WebDriver No_Assets_check(WebDriver driver) throws InterruptedException {
		assertEquals(driver,no_holdings_message , "No Assets", "Asset is not present in the APL");
		return driver;
	}
	public WebDriver check_asset_is_in_the_APL_list(WebDriver driver, String Asset_code) throws InterruptedException {
		assertEquals(driver,asset_code_in_the_search_result , Asset_code, "Asset is present in the APL");
		return driver;
	}
	public WebDriver validate_portfolio_tab_name(WebDriver driver, String name) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, place_an_order_button, 120);
		assertEquals(driver,portfolio_name_inside_portfolio_tab , name, "User is in PWL1 Test portfolio");
		return driver;
	}
	public WebDriver check_asset_is_closed_for_investment_in_APL_list(WebDriver driver) throws InterruptedException {
		assertEquals(driver,closed_for_investment , "CLOSED FOR INVESTMENT", "Asset is closed for investment in the HIVE APL");
		return driver;
	}
	public WebDriver select_closed_for_investment_asset_form_the_APL(WebDriver driver) throws InterruptedException {
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, view_fund_details, 120);
		assertEquals(driver,This_product_closed_for_investment , "This product is closed for investment", "This product is closed for investment");
		return driver;
	}
	public WebDriver check_investor_name_orderpad_sidetray(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, portfolio_selection_dropdown_orders, 120);
		Thread.sleep(2500);
		assertEquals(driver, portfolio_selection_dropdown_orders, "PWL1 Test (17187815)", "PWL1 Test (17187815) is selected in portfolio selection dropdown");
		return driver;
	}
	public WebDriver Check_minimum_order_size(WebDriver driver) throws InterruptedException {
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		Float amount = (float) 5;
		investment_amount_field.sendKeys(String.valueOf(amount));
		add_button.click();
		return driver;
	}
	public WebDriver assert_minimum_order_size(WebDriver driver) throws InterruptedException {
		assertEquals(driver, order_amount_validation_error_message, "Order should be at least $10", "Your order value is less than 10$");
		return driver;
	}
	public WebDriver select_asset_form_the_APL(WebDriver driver, String asset_code, Float amount) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		investment_amount_field.sendKeys(String.valueOf(amount));
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver add_order_to_draft(WebDriver driver, String asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		Float amount = Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA/2;
		investment_amount_field.sendKeys(String.valueOf(amount));
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver navigate_to_preview_screen(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		wait_by_visibility(driver, preview_order_button, 120);
		preview_order_button.click();
		return driver;
	}
	public WebDriver check_the_Wholesale_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_wholesale_acknowledge_checkbox, 120);
		assertEquals(driver, wholesale_acknowledge_disclaimer, "I confirm that this investor is a wholesale client for the purposes of Chapter 7 of the Corporations Act 2001.", "This is a wholesale fund");
		close_sidetray_when_there_is_draft_order(driver);
		return driver;
	}
	public WebDriver check_there_is_no_Wholesale_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, preview_checkbox_footer, 120);
		if(driver.findElements(By.xpath("//div[@class='disc_docs']//span")).size() != 0)
		{
			assertEquals(driver, wholesale_acknowledge_disclaimer, "This element should not be here", "This should be a retail fund");
		}
		else
		{
			wait_until_clickable(driver, preview_disclaimer_checkbox, 120);
			preview_disclaimer_checkbox.click();
			Assert.assertEquals(confirm_order.getAttribute("class").contains("confirm-order-enable-btn"), true);
		    LOGGER.log(Level.INFO, "This asset is a Retail fund"); 
		}
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(6000);
		return driver;
	}
	public WebDriver check_the_Wholesale_acknowledgement_and_Disclaimer_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_wholesale_acknowledge_checkbox, 120);
		if(Wholesale_checkbox.isDisplayed()) {
			Wholesale_checkbox.click();
		}
		if(Disclaimer_checkbox.isDisplayed()) {
			Disclaimer_checkbox.click();
			Disclaimer_checkbox.click();
		}
		return driver;
	}
	public WebDriver check_if_confirm_this_order_button_is_enabled(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(confirm_order.getAttribute("class").contains("btn m-btn m-btn--icon footer-btn-style confirm-order-btn"), true);
	    LOGGER.log(Level.INFO, "Confirm this order button is disabled"); 
		close_sidetray_when_there_is_draft_order(driver);
		return driver;
	}
	public WebDriver close_sidetray_when_there_is_draft_order(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(5000);
		return driver;
	}
	public WebDriver check_the_Disclaimer_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_wholesale_acknowledge_checkbox, 120);
		if(Disclaimer_checkbox.isDisplayed()) {
			Disclaimer_checkbox.click();
			Disclaimer_checkbox.click();
		}
		return driver;
	}
	
	
	
	
	
	
	
	
	
//	*************************************common_methods*************************************
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
	public WebDriver assertEquals(WebDriver driver, WebElement element, String Expected_Text, String message) throws InterruptedException {
		String Actual_Text = element.getText();
		Assert.assertEquals(Actual_Text, Expected_Text);
	    LOGGER.log(Level.INFO, message); 
		return driver;
	}
}
