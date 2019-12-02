package com.pw.publicLib;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIHandler_1 extends Page_factory{
	public String req_count;
	public static String searchResult;
	public static String getinvestorvalue;
	public static String in_name;
	public static String default_dropdown_value;
	public static String net_date;
	public static int table_count;
	public static Float sum_value = (float) 0;
	public static String current_investor_name;
	public static int count_tabs;
	
	public String OTP;
	public static List<String> investor_name = new ArrayList<String>();
	public static List<String> investor_id = new ArrayList<String>();
	public static List<String> request_id_search = new ArrayList<String>();
	public static List<String> investorname = new ArrayList<String>();
	public static List<String> requestID = new ArrayList<String>();
	public static List<String> status_check = new ArrayList<String>();
	public static List<Float> portfolio_asset_value = new ArrayList<Float>();
	public static Logger Log = Logger.getLogger(UIHandler_1.class.getName());
	
	public WebDriver Adviser_login(WebDriver driver, String username, String password) throws InterruptedException {
		// Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(username_field));
		username_field.clear();
		username_field.sendKeys(username);
		password_field.clear();
		password_field.sendKeys(password);
		sign_in.click();
		Thread.sleep(5000);
		return driver;
	}
	
	public WebDriver validate_five_unsuccessful_login(WebDriver driver) throws InterruptedException {
		for(int i=0; i<7; i++) {
			WebElement submit_button = driver.findElement(By.id("m_login_signin_submit"));
			submit_button.click();
			Thread.sleep(2000);
			}
		return driver;
		
	}
	
	public WebDriver hive_login(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(username_field));
		Assert.assertTrue(hive_icon.isDisplayed());
		return driver;
		
	}
	
	public WebDriver navigate_to_forgot_password_screen(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(forgotpassword_button));
		forgotpassword_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(email_instructions_forgot_password));
		return driver;
		
	}
	
	public WebDriver validate_otp_screen(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(otp_email));
		Assert.assertTrue(driver.getCurrentUrl().contains("two_factor_authentication"));
		Assert.assertTrue(otp_email.isDisplayed());
		Assert.assertTrue(otp_mobile.isDisplayed());
		return driver;
	}

	public WebDriver otp_device(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(otp_mobile));
		Assert.assertTrue(driver.getCurrentUrl().contains("two_factor_authentication"));
		otp_mobile.click();
		wait.until(ExpectedConditions.elementToBeClickable(otp_box_1));
		return driver;
	}
	
	public WebDriver validate_otp_email(WebDriver driver) {
		otp_email.click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(otp_box_1));
		return driver;
	}
	
	public WebDriver validate_otp_mobile(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		change_otp_type.click();
		wait.until(ExpectedConditions.elementToBeClickable(otp_mobile));
		otp_mobile.click();
		wait.until(ExpectedConditions.elementToBeClickable(otp_box_1));
		return driver;
	}

	public WebDriver database(WebDriver driver, String OTP_query) throws InterruptedException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, SQLException {
		List<Integer> otp_values = new ArrayList<Integer>();
		DataBase update_otp_details = PageFactory.initElements(driver, DataBase.class);
		driver = update_otp_details.getdata(driver, OTP_query);
		OTP = DataBase.database_value();
		int[] otp_data = new int[OTP.length()];
		for (int i = 0; i < OTP.length(); i++) {
			otp_data[i] = OTP.charAt(i) - '0';
			otp_values.add(otp_data[i]);
		}
		otp_box_1.sendKeys(otp_values.get(0).toString());
		otp_box_2.sendKeys(otp_values.get(1).toString());
		otp_box_3.sendKeys(otp_values.get(2).toString());
		otp_box_4.sendKeys(otp_values.get(3).toString());
		otp_box_5.sendKeys(otp_values.get(4).toString());
		otp_box_6.sendKeys(otp_values.get(5).toString());
		Thread.sleep(5000);
		return driver;
	}
	
	public WebDriver validate_wrong_OTP(WebDriver driver) throws InterruptedException {
		List<Integer> otp_values = new ArrayList<Integer>();
		OTP = "123456";
		int[] otp_data = new int[OTP.length()];
		for(int i = 0; i<OTP.length(); i++) {
			otp_data[i] = OTP.charAt(i) - '0';
			otp_values.add(otp_data[i]);
		}
		otp_box_1.sendKeys(otp_values.get(0).toString());
		otp_box_2.sendKeys(otp_values.get(1).toString());
		otp_box_3.sendKeys(otp_values.get(2).toString());
		otp_box_4.sendKeys(otp_values.get(3).toString());
		otp_box_5.sendKeys(otp_values.get(4).toString());
		otp_box_6.sendKeys(otp_values.get(5).toString());
		Thread.sleep(5000);
		return driver;
	}

	public WebDriver forgot_password(WebDriver driver, String username) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(email_instructions_forgot_password));
		username_field.clear();
		username_field.sendKeys(username);
		email_instructions_forgot_password.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(username_field));
		return driver;
	}

	public WebDriver change_2FA_settings(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(By.id("m_header_topbar")));
		// driver.findElement(By.id("m_header_topbar")).click();
		menu_icon.click();
		Thread.sleep(2000);
		menu_settings.click();
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView();", each_and_every_time_otp_settings);
		each_and_every_time_otp_settings.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", update_button);
		update_button.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".m-alert-head")));
		return driver;
	}
	
	public WebDriver logout_dg_admin(WebDriver driver) {
		profile_icon.click();
		logout.click();
		return driver;
	}
	
	

	public WebDriver change_OTP_Setting(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(menu_icon));
		menu_icon.click();
		Thread.sleep(2000);
		menu_settings.click();
		js.executeScript("arguments[0].scrollIntoView();", only_account_updated);
		wait.until(ExpectedConditions.elementToBeClickable(only_account_updated));
		only_account_updated.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", update_button);
		update_button.click();
		System.out.println("otp Seetings changed");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".m-alert-head")));
		profile_icon.click();
		logout.click();
		return driver;
	}
	
	public WebDriver title_validation(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(product_logo));
		String title = driver.getTitle();
		Assert.assertEquals("The Hive", title);
		return driver;
	}

	public WebDriver check_investor_tab(WebDriver driver) throws InterruptedException {
		Boolean investor_tab = driver.findElements(By.id("tab_id")).size() > 0;
		if (investor_tab) {
			portfolio_tab_x_button.click();
			Thread.sleep(5000);
		}
		return driver;
	}

	public WebDriver dashboard_content(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(elev_io_tag));
		Assert.assertTrue(elev_io_tag.isDisplayed());
		return driver;
	}

	public WebDriver portfolios_dropdown(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(product_logo));
		portfo_drop.click();
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]")));
		WebElement table = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			investor_name.add(cells.get(0).getText());
			investor_id.add(cells.get(1).getText());
		}
		return driver;
	}

	public WebDriver portfolionamesearch(WebDriver driver) {
		portfolio_search_box.sendKeys(investor_name.get(0));
		return driver;
	}
	
	public WebDriver portfolioidsearch(WebDriver driver) {
		portfolio_search_box.sendKeys(investor_id.get(0));
		return driver;
	}
	
	public WebDriver portfolionamefilter(WebDriver driver) {
		String name = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]/td[1]")).getText();
		Assert.assertEquals(name, investor_name.get(0));
		portfolio_search_box.clear();
		return driver;
	}

	public WebDriver portfolioidfilter(WebDriver driver) {
		String id = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(id, investor_id.get(0));
		portfolio_search_box.clear();
		driver.navigate().refresh();
		portfo_drop.click();
		return driver;
	}

	public WebDriver portfolioname_sorting(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		portfo_drop.click();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			if (cells.get(0).getText().isEmpty()) {
				continue;
			}
			investorname.add(cells.get(0).getText());
		}
		return driver;
	}

	public WebDriver portfolioname_sortingn(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/thead/tr/th[1]")).click();
		Thread.sleep(3000);
		List<String> sortedtable = new ArrayList<String>();
		WebElement table = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			if (cells.get(0).getText().isEmpty()) {
				continue;
			}
			sortedtable.add(cells.get(0).getText());
		}
		Assert.assertNotEquals(investorname, sortedtable);
		return driver;
	}

	public WebDriver open_request_drop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(product_logo));
		request_drop.click();
		return driver;
	}
	public WebDriver requestvalidations(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sd_search_content")));
		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			if (cells.get(1).getText().isEmpty()) {
				continue;
			}
			request_id_search.add(cells.get(1).getText());
		}
		request_search_box.clear();
		request_search_box.sendKeys(request_id_search.get(0));
		searchResult = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr/td[2]")).getText();
		return driver;
	}
	public WebDriver request_search_result(WebDriver driver) {
		Assert.assertEquals(searchResult, request_id_search.get(0));
		request_search_box.clear();
		return driver;
	}

	public WebDriver sorting(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(activity_global));
		request_drop.click();
		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			if (cells.get(1).getText().isEmpty()) {
				continue;
			}
			requestID.add(cells.get(1).getText());
		}
		return driver;
	}

//	public WebDriver requestsorting(WebDriver driver) throws InterruptedException {
//		sorting(driver);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/thead/tr/th[2]")).click();
//		Thread.sleep(2000);
//		List<String> sortedtable = new ArrayList<String>();
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for (WebElement rows : row) {
//			List<WebElement> cells = rows.findElements(By.tagName("td"));
//			if (cells.get(1).getText().isEmpty()) {
//				continue;
//			}
//			sortedtable.add(cells.get(1).getText());
//		}
//		// validate the sorting
//
//		Collections.sort(requestID);
//		Assert.assertEquals(requestID, sortedtable);
//		return driver;
//	}

	public WebDriver Request_filter_options(WebDriver driver) throws InterruptedException {
		Select status_drop = new Select(driver.findElement(By.id("m_form_status")));
		status_drop.selectByVisibleText("Closed");
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (WebElement rows : row) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
			if (cells.get(1).getText().isEmpty()) {
				continue;
			}
			status_check.add(cells.get(4).getText());
		}
		for (int i = 0; i < status_check.size(); i++) {
			Assert.assertEquals("Closed", status_check.get(i));
		}
		return driver;
	}

	public WebDriver type_filter(WebDriver driver) throws InterruptedException {
		String type_value = "Billing updates";
		Select dropdown = new Select(driver.findElement(By.id("m_form_type")));
		dropdown.selectByVisibleText(type_value);
		Thread.sleep(2000);
		String get_type_value = driver.findElement(By.xpath("//*[@id=\"sd-requests\"]/table/tbody/tr/td[4]")).getText();
		Assert.assertEquals(type_value, get_type_value);
		return driver;
	}

	public WebDriver get_investor_portfolio_value(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(product_logo));
		portfo_drop.click();
		// Need to add wait//
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]")));
		WebElement row = driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]"));
		List<WebElement> cell = row.findElements(By.tagName("td"));
		String getvalue = cell.get(2).getText();
		int index = getvalue.length();
		getinvestorvalue = getvalue.substring(1, index);
		in_name = cell.get(0).getText();
		return driver;
	}
	
	public WebDriver portfolio_tab(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[1]/h4")));
		String investor_name = driver.findElement(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[1]/h4"))
				.getText();
		Assert.assertEquals(in_name, investor_name);
		return driver;
	}
	
	public WebDriver select_investor_and_getvalue(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/h4")));
		Thread.sleep(5000);
		String get_portfolio = driver.findElement(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/h4"))
				.getText();
		int index = get_portfolio.length();
		String get_value_portfolio = get_portfolio.substring(1, index);
		Assert.assertFalse(get_value_portfolio.isEmpty());
		// Assert.assertNotEquals(get_value_portfolio, getinvestorvalue);
		return driver;
	}

	public WebDriver valuationbutton(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("m_accordion_item_3_head")));
		driver.findElement(By.id("m_accordion_item_3_head")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pv_cash_table\"]/tbody")));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pv_cash_table\"]/tbody")).isDisplayed());
		Thread.sleep(1000);
		// close cash dropdown
		driver.findElement(By.id("m_accordion_item_3_head")).click();
		Thread.sleep(1000);
		// open next assert
		driver.findElement(By.id("m_accordion_1_item_3_head")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pv_table_1\"]/tbody")));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pv_table_1\"]/tbody")).isDisplayed());
		Thread.sleep(1000);
		driver.findElement(By.id("m_accordion_1_item_3_head")).click();
		Thread.sleep(1000);
		return driver;
	}

	public WebDriver validate_date(WebDriver driver) throws InterruptedException {
		net_date = driver.findElement(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/p/span")).getText();
		default_dropdown_value = datepicker_valuation.getAttribute("value");
		return driver;
	}

	public WebDriver getdate(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(net_date, default_dropdown_value);
		return driver;
	}

	public WebDriver datepicker(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/table/tbody/tr/td/span[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/table/tbody/tr/td/span[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[3]")).click();
		return driver;
	}

	public WebDriver cleardatepicker(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		get_investor_portfolio_value(driver);
		portfolio_tab(driver);
		return driver;
	}
	
	public WebDriver selectfromdate(WebDriver driver) throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver, 200);
		String netvalue = driver.findElement(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/p/span"))
				.getText();
		Assert.assertEquals(driver.findElement(By.id("from")).getText(), netvalue);
		return driver;
	}

	public WebDriver movements_table(WebDriver driver) {
		WebElement table = driver.findElement(By.xpath("//*[@id=\"investor_movements\"]/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		Boolean pagination = driver.findElements(By.id("investor_movements_paginate")).size() > 0;
		if (pagination) {
			Assert.assertEquals(row.size(), 10);
		}
		return driver;
	}

	public WebDriver request_tab(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("requests-tab")));
		driver.findElement(By.id("requests-tab")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody")));
		WebElement table = driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		table_count = row.size();
		return driver;
	}

	public WebDriver create_request(WebDriver driver, String sum, String desc) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Thread.sleep(3000);
		Portfolio_raise_an_request.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("m_accordion_sd5")));
		driver.findElement(By.id("m_accordion_sd5")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"m_accordion_sd_item_5_body\"]/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"m_accordion_sd_item_5_body\"]/div[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(SD_description_field));
		Thread.sleep(2000);
		String display_investor_name = driver
				.findElement(By.xpath("//*[@id=\"raise_request_sidebar_content\"]/div/div/div")).getText();
		Assert.assertTrue(display_investor_name.contains(in_name));
//		SD_summary_field.sendKeys(sum);
		SD_description_field.sendKeys(desc);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'item_to_change_fields' and @name = 'checkBox4']")).click();
		Thread.sleep(2000);
		// Do not share SD Form
		Select status_drop = new Select(driver.findElement(By.id("participantOption")));
		status_drop.selectByVisibleText("Do not share");
		Thread.sleep(2000);
		// driver.findElement(By.id("sd-form-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"sd-form\"]/div[2]/div[2]/button[2]")).click();
		TimeUnit.MINUTES.sleep(1);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sd-form-status")));
		Assert.assertTrue(driver.findElement(By.id("sd-form-status")).isDisplayed());
		Thread.sleep(4000);
		driver.findElement(By.id("modify-close")).click();
		Thread.sleep(4000);
		return driver;
	}

	public WebDriver updated_list(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.findElement(By.id("requests-tab")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inv-search-requests")));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]/td[3]")).getText()
				.equals("Open"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("change_ticket_status")));
		Select status_drop = new Select(driver.findElement(By.id("change_ticket_status")));
		status_drop.selectByVisibleText("Closed");
		wait.until(ExpectedConditions.elementToBeClickable(toaster));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd_ticket_details_close")));
		driver.findElement(By.id("sd_ticket_details_close")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inv-search-requests")));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"inv-sd-requests\"]/table/tbody/tr[1]/td[3]")).getText()
				.equals("Closed"));
		return driver;
	}

	public WebDriver select_date(WebDriver driver, String date) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker_valuation));
		datepicker_valuation.clear();
		datepicker_valuation.sendKeys(date);
		datepicker_valuation.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker_valuation));
		return driver;
	}

	public WebDriver edit_datePicker_value(WebDriver driver, String movement_date) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement from_date_picker = driver.findElement(By.id("from"));
		from_date_picker.clear();
		from_date_picker.sendKeys(movement_date);
		from_date_picker.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("from")));
		return driver;
	}

	public WebDriver compare_date(WebDriver driver, String fromdate, String todate) throws ParseException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("from")));
		String changed_fromdate = driver.findElement(By.id("from")).getAttribute("value");
		Assert.assertEquals(fromdate, changed_fromdate);
		String changed_todate = driver.findElement(By.id("to")).getAttribute("value");
		Assert.assertEquals(todate, changed_todate);
		return driver;
	}

	public WebDriver getTabdetails(WebDriver driver) {
		WebElement tabs = driver.findElement(By.id("sortable_inv_list"));
		List<WebElement> tab_count = tabs.findElements(By.tagName("div"));
		System.out.println(tab_count.size());
		count_tabs = tab_count.size();
		current_investor_name = driver.findElement(By.cssSelector(".title-style.margin-bottom-0")).getText();
		System.out.println(current_investor_name);
		return driver;
	}

	public static int get_tab_count() {
		return count_tabs;
	}

	public static String get_current_investor_name() {
		return current_investor_name;
	}

	public WebDriver logout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("m_dropdown_api_1")));
		driver.findElement(By.id("m_dropdown_api_1")).click();
		driver.findElement(By.xpath("//*[@id=\"m_dropdown_api_1\"]/div/div/div/div/ul/li[2]/a")).click();
		return driver;
	}

	public WebDriver previous_investor_tabs(WebDriver driver, int tabs, String investor_name) {
		getTabdetails(driver);
		Assert.assertEquals(count_tabs, tabs);
		Assert.assertEquals(current_investor_name, investor_name);
		return driver;
	}
}
