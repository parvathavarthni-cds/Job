package com.pw.publicLib;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Page_factory {
	File text_file = new File("src/test/resources/This_is_Created_By_Automation_Testing.txt");
	public static String test_data = "src/test/resources/This_is_Created_By_Automation_Testing.txt";
	static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	static Date date = new Date(); //get current date time with Date()
	public static String system_date= dateFormat.format(date);// Now format the date
	
//	Login page elements
	
	@FindBy(css = ".m-login__head.padding-bottom-2rem")
	public static WebElement hive_icon;
	
	@FindBy(id = "user_email") // username field
	public static WebElement username_field;

	@FindBy(id = "user_password") // Password field
	public static WebElement password_field;

	@FindBy(id = "m_login_signin_submit") // click Sign in
	public static WebElement sign_in;
	
	@FindBy(id = "m_login_forget_password") //forgot password button
	public static WebElement forgotpassword_button;
	
	@FindBy(css = ".btn.btn-brand.m-btn") //forgot password email instruction button
	public static WebElement email_instructions_forgot_password;
	
	@FindBy(id = "device_sms")  //OTP via Mobile
	public static WebElement otp_mobile;
	
	@FindBy(id = "device_email")  //OTP via Email
	public static WebElement otp_email;
	
	@FindBy(xpath = "//*[@id=\"change_device\"]/div[1]/a")   //change OTP device
	public static WebElement change_otp_type;
	
	@FindBy(id = "otp_1")  //OTP first text box
	public static WebElement otp_box_1;
	
	@FindBy(id = "otp_2")  //OTP second text box
	public static WebElement otp_box_2;
	
	@FindBy(id = "otp_3")  //OTP third text box
	public static WebElement otp_box_3;
	
	@FindBy(id = "otp_4")  //OTP fourth text box
	public static WebElement otp_box_4;
	
	@FindBy(id = "otp_5")  //OTP fifth text box
	public static WebElement otp_box_5;
	
	@FindBy(id = "otp_6")  //OTP sixth text box
	public static WebElement otp_box_6;
	
//	Admin Page elements
	@FindBy(css = ".fa.fa-bars")   //menu icon
	public static WebElement menu_icon;
	
	@FindBy(xpath = "//*[@id=\"m_header_topbar\"]/div/ul/li/div/div/div/div/ul/li[2]")   //settgins from menu
	public static WebElement menu_settings;
	
	@FindBy(xpath = "//*[@id=\"edit_service_2\"]/div/div[5]/div/div/span[1]/label/span")
	public static WebElement each_and_every_time_otp_settings;
	
	@FindBy(xpath = "//*[@id=\"edit_service_2\"]/div/div[5]/div/div/span[3]/label/span")
	public static WebElement only_account_updated;
	
	@FindBy(css = ".btn.btn-brand")
	public static WebElement update_button;
	
	@FindBy(xpath = "//*[@id=\"m_header\"]/div/div/div[4]/div/ul/li")
	public static WebElement profile_icon;
	
	@FindBy(xpath = "//*[@id=\"m_header\"]/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]")
	public static WebElement logout;
	
//	Portfolio page elements
	
	
	
	@FindBy(css = ".animsition-link.la.la-close.inv-link")
	public static WebElement portfolio_tab_x_button;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/a[1]/input[1]")
	public static WebElement investor_tab;
	
	@FindBy(xpath = "//h4[contains(text(),'PWL1 Test')]")
	public static WebElement investor_tab_name;
	
	@FindBy(id = "requests-tab")	
	public static WebElement request_tab_under_portfolio_section;
	
	@FindBy(id = "pv_raise_a_request")	
	public static WebElement New_request_for_this_portfolio_button;

	@FindBy(xpath = "//*[@id=\"horizontal-menu\"]/ul/li[1]/a") // global portfolio list button
	public static WebElement global_portfolio_list_button;
	
	@FindBy(xpath = "//span[contains(text(),'Name')]") // Name under portfolio list
	public static WebElement Name_under_portfolio_list;

	@FindBy(xpath = "//*[@id=\"m_tabs_1_1\"]/div/input") // Search_by_portfolio_name_or_ID_search_box
	public static WebElement Search_by_portfolio_name_or_ID_search_box;

	@FindBy(xpath = "//*[@id=\"investor-list-data\"]/table/tbody/tr/td[1]/span") // slayd_super_fund_investor
	public static WebElement investor_name;
	
	@FindBy(id = "valuation-tab")	
	public static WebElement valuation_tab;
	
	@FindBy(id = "requests-tab")	
	public static WebElement requests_tab;
	
//	SD Request groups sidetray elements
	
	@FindBy(id = "payments-id")	
	public static WebElement Payments_button;
	
	@FindBy(id = "report-issue-id")	
	public static WebElement Report_an_issue_button;
	
	@FindBy(xpath = "//span[contains(text(),'Payment to a nominated account')]")	
	public static WebElement payment_to_a_nominated_account_form;
	
	@FindBy(xpath = "//button[contains(text(),'Support Request')]")	
	public static WebElement Support_request_button;
	
	@FindBy(xpath = "//div[@class='ma-header m-portlet__head-text modification-title']")	
	public static WebElement HIVE_Support_Request_label;
	
	@FindBy(xpath = "//div[@class='sd-groups']")	
	public static WebElement SD_request_groups;
	
	@FindBy(xpath = "//span[@class='mu-title']")	
	public static WebElement most_used_lable;
	
	@FindBy(xpath = "//h3[@class='m-portlet__head-text request-group-head']")	
	public static WebElement browse_by_topic_lable;
	
	@FindBy(xpath = "//span[contains(text(),'Queries')]")	
	public static WebElement Queries_group;
	
	@FindBy(xpath = "//span[@class='ticket-comment-name'][contains(text(),'General query')]")	
	public static WebElement General_query_request;

//	General query from elements
	
	@FindBy(id = "m_accordion_sd_item_3_head") // Queries accordion
	public static WebElement queries_accordian;
	
	@FindBy(id = "select2-sd_form_participants-container")	
	public static WebElement Portfolio_selection_dropdown;
	
	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")	
	public static WebElement search_inside_portfolio_dropdown;
	
	@FindBy(id = "customfield_10423_hash_11000")	
	public static WebElement general_query_radio_button;

	@FindBy(id = "description")	
	public static WebElement query_text_field;
	
	@FindBy(id = "sd_ticket_attachment")	
	public static WebElement upload_attachment;
	
	@FindBy(id = "participantOption")	
	public static WebElement share_with_dropdown;
	
	@FindBy(id = "select2-participantOption-result-dzsf-Test organization B")	
	public static WebElement Test_organiszation_B;
	
	@FindBy(id = "select2-participantOption-result-40n9-Specific people")	
	public static WebElement Specific_people;
	
	@FindBy(xpath = "//*[@id=\"sd-form\"]/div[2]/div[1]/div[2]/div/span/span[1]/span/ul/li/input")	
	public static WebElement specific_people_dropdown;
	
	@FindBy(xpath = "//div[@class='ma-form-share-section']//p[@class='participant-caption'][contains(text(),'These people will receive a notification')]")	
	public static WebElement msg;
	
	@FindBy(id = "select2-ma_request_participant-result-oaie-qm:8c0cf8cb-fa1e-47f0-98ba-3bea05b7bc8f:67bc49bd-97d1-489a-8a13-c9e849cac276|praveen@test.com")	
	public static WebElement praveen;
	
	@FindBy(xpath = "//button[contains(text(),'+ Add')]")	
	public static WebElement participant_add_button;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")	
	public static WebElement Request_creation_submit_button;
	
	@FindBy(xpath = "//button[@class='text-color-black md-close ma-cancel']")	
	public static WebElement Request_creation_cancel_button;
	
	@FindBy(id = "m_quick_sd_sidebar_close")	
	public static WebElement Request_creation_x_button;
	
	@FindBy(xpath = "//button[@id='ma-new-request']") // start a new request button
	public static WebElement start_new_request_button;
	
	@FindBy(xpath = "//span[@class='ma-confirm-title']") // Thank you message after ticket creation
	public static WebElement Thank_you_message;
	
	@FindBy(id = "modify-close") // close button when showing thank you message after ticket creation
	public static WebElement close_button_after_request_creation;
	
//	SD Request details sidetray elements

	@FindBy(id = "select2-change_ticket_status-container")	
	public static WebElement Status_change_dropdown;
	
	@FindBy(id = "select2-change_ticket_status-result-8bia-Open")	
	public static WebElement Status_change_dropdown_open;
	
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]")	
	public static WebElement Status_change_dropdown_closed;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	public static WebElement toast_message_request;
	
	@FindBy(xpath = "//button[@class='toast-close-button']")
	public static WebElement toast_message_request_close;
	
	@FindBy(id = "comment")	
	public static WebElement write_a_message_textbox;
	
	@FindBy(css = ".upload.attachment_icon.display-none")	
	public static WebElement add_attachements_button;
	
	@FindBy(id = "submit_comment")	
	public static WebElement post_button;
	
	@FindBy(id = "sort_comment_id")	
	public static WebElement sort_by_date_icon;
	
	@FindBy(id = "sd_ticket_details_close")	
	public static WebElement request_details_sidetray_x_button;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[6]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")	
	public static WebElement attachment_tab;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[6]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")	
	public static WebElement comments_tab;
	
	@FindBy(id = "attachment_0")	
	public static WebElement First_attachment;
	
	@FindBy(id = "content_0")	
	public static WebElement latest_comment;
	
	@FindBy(id = "show-less-link_0")	
	public static WebElement more_details_less_details;
	
//	SD Request list elements

	@FindBy(xpath = "//div[@id='requests-update-banner']//span[@class='r-success-message'][contains(text(),'Your updates were successfully saved.')]")	
	public static WebElement Request_updated_banner;
	
	@FindBy(id = "issue_key")	
	public static WebElement Request_ID_filter;
	
	@FindBy(id = "portfolio_name")	
	public static WebElement Portfolio_name_filter;
	
	@FindBy(xpath = "//tr[1]//td[3]//span[1]")
	public static WebElement request_list_first_record_portfolio_name_value;
	
	@FindBy(xpath = "//div[contains(text(),'Reporter')]")
	public static WebElement Reporter_dropdown_filter;
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']")
	public static WebElement Reporter_dropdown_filter_after_value_selection;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//input[@placeholder='Search']")
	public static WebElement Search_inside_filters;

	@FindBy(xpath = "//div[@class='fs-wrap multiple fs-default fs-open']//div[1]//span[1]//i[1]")
	public static WebElement Me_option;
	
	@FindBy(xpath = "//span[@class='reporter_by_email']")
	public static WebElement Me_label_in_sidetray;
	
	@FindBy(xpath = "//tr[1]//td[3]//span[1]")
	public static WebElement request_list_first_record;
	
	@FindBy(xpath = "//div[contains(text(),'Type')]")
	public static WebElement Type_filter;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//div[@class='fs-option g0']//i")
	public static WebElement general_query_option; 
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']")
	public static WebElement type_filter_after_value_selection;
	
	@FindBy(xpath = "//tr[1]//td[4]//span[1]")
	public static WebElement request_list_first_record_type_value;
	
	@FindBy(xpath = "//div[contains(text(),'Status')]")
	public static WebElement Status_filter;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//div[@class='fs-option g0']//i")
	public static WebElement Closed_option; 
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']")
	public static WebElement Status_filter_after_value_selection;
	
	@FindBy(xpath = "//tr[1]//td[5]//span[1]")
	public static WebElement request_list_first_record_status_value;
	
	@FindBy(xpath = "//tr[1]//td[6]//span[1]")
	public static WebElement request_list_first_record_date_value;
	
	@FindBy(id = "date_range")	
	public static WebElement Date_filter;
	
	@FindBy(xpath = "//li[contains(text(),'Custom range')]")
	public static WebElement custom_range_option; 

	@FindBy(name = "daterangepicker_start")	
	public static WebElement from_date;
	
	@FindBy(name = "date_range")	
	public static WebElement to_date;
	
	@FindBy(xpath = "//li[contains(text(),'Today')]")
	public static WebElement Today_option; 
	
	@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-primary']")
	public static WebElement Date_Apply_button;
	
	@FindBy(xpath = "//button[@class='cancelBtn btn btn-sm btn-default']")
	public static WebElement Date_cancel_button;
	
	@FindBy(xpath = "//tr[1]//td[1]//span[1]//label[1]//span[1]")
	public WebElement request_list_Request_ID_column;
	
	@FindBy(xpath = "//span[contains(text(),'66322')]")
	public static WebElement request_list_first_record_Request_ID_value;
	
	@FindBy(id = "status_change_tickets_button")
	public static WebElement changed_to_closed_button;
	
	@FindBy(xpath = "//div[@class='toast-message']") // toaster message
	public static WebElement toast_message; 
	
	@FindBy(id = "share_tickets_button")
	public static WebElement share_participant_button;
	
	@FindBy(xpath = "//ul[@class='select2-selection__rendered ps-container ps-theme-default']")
	public static WebElement participant_list_dropdwon;

	@FindBy(id = "multi_share")
	public static WebElement send_button;
	
	@FindBy(xpath = "//div[@class='dataTables_scrollHeadInner']//span//span")
	public static WebElement select_all_checkbox;
	
	@FindBy(id = "selected_tickets_count")
	public static WebElement selected_tickets_count;
	
	@FindBy(id = "delete-all-requests")
	public static WebElement cancel_button;
	
	@FindBy(xpath = "//a[@class='page-link next']")
	public static WebElement pagination_next_button;
	
	@FindBy(xpath = "//a[@class='page-link prev']")
	public static WebElement pagination_previous_button;
	
	@FindBy(linkText = "2")
	public static WebElement page_no_2;
	
//	Dashboard page elements
	
	@FindBy(xpath = "//span[contains(text(),'new features')]") // app logo
	public static WebElement new_features_link;
	
	@FindBy(xpath = "//img[@class='product-logo']") // app logo
	public static WebElement product_logo;
	
	@FindBy(id = "_elev_io")  //elev_io tag
	public static WebElement elev_io_tag;

	@FindBy(xpath = "//*[@id=\"horizontal-menu\"]/ul/li[1]/a") // portfolio dropdown
	public static WebElement portfo_drop;

	@FindBy(xpath = "//*[@id=\"m_tabs_1_1\"]/div/input") // portfolio searh box
	public static WebElement portfolio_search_box;

	@FindBy(xpath = "//*[@id=\"horizontal-menu\"]/ul/li[4]/a") // request dropdown
	public static WebElement request_drop;

	@FindBy(xpath = "//*[@id=\"m_tabs_1_2\"]/input") // request search box
	public static WebElement request_search_box;

	@FindBy(id = "raise_a_request") // side tray
	public static WebElement activity_global;

	@FindBy(id = "select2-request_type_dropdown-container") // Side box dropdown
	public static WebElement side_searchbox;

	@FindBy(id = "payments-id")
	public static WebElement payment_button_side_tray;

	@FindBy(xpath = "//*[@id=\"raise_request_sidebar_content\"]/div[2]/div/div[2]/button")
	public static WebElement update_portfolio_button;

	@FindBy(id = "report-issue-id")
	public static WebElement report_an_issue_button;

	@FindBy(id = "st_pt_search")
	public static WebElement share;

	@FindBy(id = "list_participants")
	public static WebElement share_label;

	@FindBy(id = "showing_participants")
	public static WebElement label_name;

	@FindBy(id = "comment")
	public static WebElement message;

	@FindBy(id = "notifications")  //Global bell icon
	public static WebElement bell;

	@FindBy(id = "paperclip-icon-upload")
	public static WebElement attachment;

	@FindBy(id = "submit_comment")
	public static WebElement submit_button;

	@FindBy(id = "m_datepicker_2")
	public static WebElement datepicker_valuation;

	@FindBy(id = "toast-container")  //Yellow toaster
	public static WebElement toaster;
	
	@FindBy(id = "pv_raise_a_request")
	public static WebElement Portfolio_raise_an_request;
	
	@FindBy(id = "summary")    //Summary field in SD form
	public static WebElement SD_summary_field; 
	
	@FindBy(id = "description")  //Description field in SD form
	public static WebElement SD_description_field;
	
	@FindBy(id = "SimpleSearcher")    //PV screen Search box
	public static WebElement Portfolio_summary_search;
	
//	Portfolio level request list screen elements
	
	@FindBy(xpath = "//div[@id='inv-requests-update-banner']//span[@class='r-success-message'][contains(text(),'Your updates were successfully saved.')]")	
	public static WebElement Portfolio_level_Request_updated_banner;
	
	@FindBy(xpath = "//th[contains(text(),'Request #')]")
	public WebElement Portfolio_level_request_list_Request_ID_column;

	@FindBy(id = "portfolio_sd_issue_key")	
	public static WebElement Portfolio_level_Request_ID_filter;
	
	@FindBy(xpath = "//td[contains(text(),'66322')]")
	public static WebElement Portfolio_level_request_list_first_record_Request_ID_value;
	
	@FindBy(xpath = "//div[@class='custom-column portfolio-reporter-filter']//div[@class='fs-label'][contains(text(),'Reporter')]")
	public static WebElement Portfolio_level_Reporter_filter;
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']")
	public static WebElement Portfolio_level_Reporter_filter_after_value_selection;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//input[@placeholder='Search']")
	public static WebElement Portfolio_level_Search_inside_filters;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[5]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/span[1]/i[1]")
	public static WebElement Portfolio_level_Me_option;
	
	@FindBy(xpath = "//div[@class='m-grid__item m-grid__item--fluid m-grid m-grid--hor-desktop m-grid--desktop m-body bg-color-pale-grey-two']//tbody//tr[1]")
	public static WebElement Portfolio_level_request_list_first_record;
	
	@FindBy(xpath = "//div[@class='custom-column portfolio-type-filter']")
	public static WebElement Portfolio_level_Type_filter;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//div[@class='fs-option g0']//i")
	public static WebElement Portfolio_level_general_query_option; 
	
	@FindBy(xpath = "//div[@class='fs-label selected-status'][contains(text(),'General query')]")
	public static WebElement Portfolio_level_type_filter_after_value_selection;
	
	@FindBy(xpath = "//tr[1]//td[2]")
	public static WebElement Portfolio_level_request_list_first_record_type_value;
	
	@FindBy(xpath = "//div[@class='custom-column portfolio-status-filter']//div[@class='fs-label'][contains(text(),'Status')]")
	public static WebElement Portfolio_level_Status_filter;
	
	@FindBy(xpath = "//div[@class='fs-dropdown ps-container ps-theme-default ps-active-y']//div[@class='fs-option g0']//i")
	public static WebElement Portfolio_level_Closed_option; 
	
	@FindBy(xpath = "//div[@class='fs-label selected-status']")
	public static WebElement Portfolio_level_Status_filter_after_value_selection;
	
	@FindBy(xpath = "//div[@class='m-grid__item m-grid__item--fluid m-grid m-grid--hor-desktop m-grid--desktop m-body bg-color-pale-grey-two']//tr[1]//td[3]")
	public static WebElement Portfolio_level_request_list_first_record_status_value;
	
	@FindBy(xpath = "//tr[1]//td[4]")
	public static WebElement Portfolio_level_request_list_first_record_date_value;
	
	@FindBy(xpath = "//div[@class='portfolio-request-bottom light-theme simple-pagination']//ul")
	public static WebElement pagination_section;
	
	@FindBy(xpath = "//table[@id='portfolio-request-table']//tbody")
	public static WebElement portfolio_request_table;
	
//**********************************************************************ORDER_PAD**********************************************************************************

//  PV screen
	@FindBy(xpath = "//span[@class='asset-name pv-cash-asset-width'][contains(text(),'Cash')]")
	public static WebElement cash_accordion;
	
	@FindBy(xpath = "//table[@id='pv_cash_table']//div[contains(text(),'Code')]")
	public static WebElement code_column;
	
	@FindBy(xpath = "//tr[@class='odd']//div[contains(text(),'$103,089.29')]")
	public static WebElement ANZ_CMA_cash;
	
	@FindBy(id = "SimpleSearcher")    //Place an order button on PV
	public static WebElement PV_searchbox; 
	
//	Place orders side tray
	
	@FindBy(id = "place_an_order")    //Place an order button on PV
	public static WebElement place_an_order_button; 
	
	@FindBy(id = "sell_list")  //Sell button on Place an order side tray
	public static WebElement SELL_Button;
	
	@FindBy(id = "buy_list")  //Buy button on place an order side tray
	public static WebElement BUY_Button;
	
	@FindBy(id = "draft_cancel")  //Draft order screen cancel button
	public static WebElement draft_cancel;
	
	@FindBy(id = "select2-order_form_participants-container")    //portfolio dropdown label
	public static WebElement portfolio_selection_dropdown_orders;
	
	@FindBy(id = "order-form-participant") //portfolio dropdown
	public static WebElement portfolio_drop_place_order;
	
	@FindBy(id = "select2-order_form_participants-results")
	public static WebElement portfolio_list_place_order_drop;
	
	@FindBy(xpath = "//*[@id=\"select2-order_form_participants-results\"]/li[15]")
	public static WebElement select_different_portfolio;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement side_tray_dropdown_searchbox;
	
	@FindBy(xpath = "//*[@id=\"select2-order_form_participants-results\"]/li")
	public static WebElement search_result;
	
//	Add BUY order extended Side tray

	@FindBy(id = "select2-sell_dropdown-container")
	public static WebElement Approved_product_list_dropdown;
	
	@FindBy(id = "select2-sell_dropdown-results")
	public static WebElement Approved_product_list_dropdown_result;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public static WebElement APL_searchbox;
	
	@FindBy(xpath = "//span[@class='select2-container select2-container--default select2-container--open']//li[1]//div[1]")
	public static WebElement Approved_product_list_1st_value;
	
	@FindBy(id = "orderAmountValue")  //investment amount field	
	public static WebElement investment_amount_field;
	
	@FindBy(id = "max-units")  //available funds	
	public static WebElement available_funds;
	
	@FindBy(id = "cashAccount")  //cash account	
	public static WebElement cash_account;
	
	@FindBy(id = "openOrders")	
	public static WebElement open_orders_buy;
	
	@FindBy(id = "othersValue")
	public static WebElement other_min_cash;
	
	@FindBy(id = "order-value")
	public static WebElement Buy_order_value;
	
	@FindBy(xpath = "//span[@class='padding-0 transaction-fee transaction-price pull-right']")
	public static WebElement buy_transaction_fee;
	
	@FindBy(id = "total-order-value")
	public static WebElement total_buy_order_value;
	
	@FindBy(xpath = "//label[@id='accept_disclaimer']//span")
	public static WebElement BUY_PDS_Checkbox;
	
	@FindBy(xpath = "//span[@class='disclaimer_link pds_download_link']")
	public static WebElement BUY_PDS_link;
	
	@FindBy(id = "orderAmtError")
	public static WebElement order_amount_validation_error_message;
	
	@FindBy(xpath = "//li[@class='select2-results__option select2-results__message']")
	public static WebElement no_holdings_message;
	
	@FindBy(xpath = "//span[@class='provider_color_y asset_code_style']")
	public static WebElement asset_code_in_the_search_result;
	
	@FindBy(xpath = "//span[@class='view-fund-details']")
	public static WebElement view_fund_details;
	
	@FindBy(xpath = "//span[@class='order-info-message m--margin-top-40']")
	public static WebElement This_product_closed_for_investment;
	
//	Add SELL order extended Side tray
	
	@FindBy(id = "addBuySellModal")
	public static WebElement Extended_side_tray_modal;
	
	@FindBy(id = "funds-dropdown")
	public static WebElement portfolio_holdings_drop;
	
	@FindBy(css = ".foot-btns.cancel")  //add sell order cancel button
	public static WebElement extended_sidetray_add_sell_cancel;
	
	@FindBy(xpath = "/html/body/span/span") //portfolio holdings dropdown result
	public static WebElement portofolio_holding_details;
	
	@FindBy(xpath = "//*[@id=\"select2-sell_dropdown-results\"]/li") //portfolio holdings dropdown values
	public static WebElement portfolio_holding_search_result;
	
	@FindBy(xpath = "//*[@id=\"select2-sell_dropdown-results\"]/li/div/h5") //portfolio holdings dropdown value text
	public static WebElement portfolio_holding_search_result_text;
	
	@FindBy(id = "exitPriceValue") //exit price of the asset
	public static WebElement exit_price;
	
	@FindBy(id = "max-units")   //available units
	public static WebElement available_units_sell_order_screen;
	
	@FindBy(id = "holdingsValue") // current portfolio holdings units
	public static WebElement holdings_value_sell_order_screen;
	
	@FindBy(id  = "select2-sell_dropdown-container")    //selected portfolio holding from dropdown
	public static WebElement selected_portfolio_holding;
	
	@FindBy(id = "sell-Value") // final order value
	public static WebElement total_order_value_sell_order_screen;
	
	
	@FindBy(id = "add-btn")  //add button on add sell order
	public static WebElement add_button;
	
	@FindBy(id = "select2-sell_dropdown-container") //get the selected portfolio holdings details in add sell order screen
	public static WebElement current_portfolio_holding;
	
	@FindBy(id = "orderAmtError")  //Order amount error message
	public static WebElement order_amount_error;  
	
	@FindBy(id = "orderAmountValue")  //order amount text box
	public static WebElement order_amount_textbox;
	
	@FindBy(id = "advise_no_option") //advice given checkbox no
	public static WebElement adviser_given_no;
	
	@FindBy(id = "advise_yes_option")   //advice given checkbox Yes
	public static WebElement adviser_given_yes;
	
	@FindBy(id = "select_reason_dropdown")  //advice given reason dropdown
	public static WebElement advice_reason_drop;
	
	@FindBy(id = "advice_given_reason")  //advice given reason dropdown select
	public static WebElement advice_reason_drop_value;
	
	@FindBy(id = "advice_other_method")  //advice given method checkbox
	public static WebElement adviser_other_method;
	
	@FindBy(id = "advice_given_summary")  //advice given summary text box
	public static WebElement advice_summary;
	
	@FindBy(id = "advice_date_picker")  //advice given date
	public static WebElement advice_date_cal;
	
	@FindBy(id = "preview_disclaimer_footer")  //disclaimer message in footer
	public static WebElement disclaimer_footer_message;
	
	@FindBy(xpath = "//*[@id=\"accept_disclaimer\"]/span")   //disclaimer checkbox in footer
	public static WebElement disclaimer_check_box;
	
	@FindBy(xpath = "//p[@class='comment-title']")  //draft orders title
	public static WebElement draft_order_title;
	
	@FindBy(xpath = "//*[@id=\"draft_order_1\"]/p")  //draft second orders title
	public static WebElement draft_new_order;
	
	@FindBy(xpath = "//div[@id='close_draft']//img[@class='w-100']")   //close second draft order
	public static WebElement close_draft_order;
	
//	@FindBy(xpath = "//*[@id=\"draft_order_0\"]/div[2]/div/p[1]")   //draft order value
//	public static WebElement draft_order_value;
	
	@FindBy(css= ".comment-price")
	public static WebElement draft_order_value;
	
	@FindBy(xpath = "//p[@class='draft-label']") //draft page label
	public static WebElement draft_order_label;
	
	@FindBy(id = "order_remove_confirmation_pop_up")  //order_remove_confirmation popup
	public static WebElement order_remove_confirmation;
	
	@FindBy(xpath = "//*[@id=\"order_remove_confirmation_pop_up\"]/div[3]/button[1]")  //cancel order popup go back button
	public static WebElement confirm_popUp_go_back_button;
	
	@FindBy(id = "confirm_remove_order")   //cancel order popup confirm button
	public static WebElement confirm_popUp_cancel_order;
	
//	Preview order screen elements
	
	@FindBy(xpath = "//*[@id=\"place_an_order_footer\"]/div/div/button[2]")  //Preview order button
	public static WebElement preview_order_button;
	
	@FindBy(xpath = "//*[@id=\"preview-order-id\"]/div[2]/div[1]/p")  //transaction summary label
	public static WebElement transaction_summary_value;
	
	@FindBy(xpath = "//*[@id=\"preview-order-id\"]/div[4]/div[2]/div/p[1]")  //after impact asset units
	public static WebElement after_impact_units;
	
	@FindBy(id = "preview_disclaimer")  //Preview order disclaimer link
	public static WebElement preview_disclaimer;
	
	@FindBy(id = "acknowledge_disclaimer")  //preview order acknowledge pop-up button
	public static WebElement preview_acknowledge_disclaimer;

	@FindBy(xpath = "//div[@class='disc_docs']//span")
	public static WebElement preview_wholesale_acknowledge_checkbox;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[8]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public static WebElement Wholesale_checkbox;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[8]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]/span[1]")
	public static WebElement Disclaimer_checkbox;
	
	@FindBy(xpath = "//label[@id='preview_accept_disclaimer_02']//span")
	public static WebElement preview_disclaimer_checkbox;

	@FindBy(xpath = "//*[@id=\"place_an_order_footer\"]/div[2]/button")  //preview order back button
	public static WebElement Preview_back_button;
	
	@FindBy(id = "confirm-order")  //preview order confirm button
	public static WebElement confirm_order; 
	
	@FindBy(id = "confirm-order-container")
	public static WebElement confirm_order_content;
	
	@FindBy(id = "place_another_order")
	public static WebElement place_another_order_button;
	
	@FindBy(xpath = "//*[@id=\"preview_disclaimer_footer\"]/div[1]/p")
	public static WebElement wholesale_acknowledge_disclaimer;
	
	@FindBy(id = "preview_disclaimer_footer")
	public static WebElement preview_checkbox_footer;
	
	@FindBy(id = "m_quick_sd_sidebar_close")
	public static WebElement preview_X_button;
	
//	APL
	@FindBy(xpath = "//span[@class='closed-style-sell']")
	public static WebElement closed_for_investment;
	
	
//	******************************************************************************
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/a[2]")
	public static WebElement portfolio_tab_close;
	
	@FindBy(xpath = "//h4[contains(text(),'PWL1 Test')]")
	public static WebElement portfolio_name_inside_portfolio_tab;
	
}

