$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Side_tray_add_sell_order.feature");
formatter.feature({
  "line": 1,
  "name": "ADD Sell order side tray validation",
  "description": "",
  "id": "add-sell-order-side-tray-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#This feature will validate the Add sell order side tray functionalities"
    },
    {
      "line": 4,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 5,
  "name": "Validate the Place an order button on PV Screen for the portfolios which is up-to-date",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-place-an-order-button-on-pv-screen-for-the-portfolios-which-is-up-to-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on Hive DashBoard screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects any portfolio from portfolio dropdown which is up-to-date",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "page should be navigated to selected Portfolio summary screen and ‘Place an Order’ button should be enabled on PV screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Hive_DashBoard_screen()"
});
formatter.result({
  "duration": 26920698742,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_selects_any_portfolio_from_portfolio_dropdown_which_is_up_to_date()"
});
formatter.result({
  "duration": 10480439621,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.page_should_be_navigated_to_selected_Portfolio_summary_screen_and_Place_an_Order_button_should_be_enabled_on_PV_screen()"
});
formatter.result({
  "duration": 5101519368,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 11,
  "name": "Validate the Place order side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-place-order-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on Portfolio screen",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user clicks the ‘Place an order’ button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "place order side tray should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "place order, portfolio dropdown should be pre-populated the selected portfolio tab",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Portfolio_screen()"
});
formatter.result({
  "duration": 6937447,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_Place_an_order_button()"
});
formatter.result({
  "duration": 8120794259,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.place_order_side_tray_should_open()"
});
formatter.result({
  "duration": 1158229810,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.place_order_portfolio_dropdown_should_be_pre_populated_the_selected_portfolio_tab()"
});
formatter.result({
  "duration": 77182271,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 18,
  "name": "Validate the search portfolio from side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-search-portfolio-from-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user is on place an order side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user clicks the portfolio dropdown in `place an order` side tray",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user should be able to search different portfolios from the portfolio dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_place_an_order_side_tray()"
});
formatter.result({
  "duration": 62167310,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_portfolio_dropdown_in_place_an_order_side_tray()"
});
formatter.result({
  "duration": 15338176015,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_be_able_to_search_different_portfolios_from_the_portfolio_dropdown()"
});
formatter.result({
  "duration": 3189376268,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 24,
  "name": "Validate the sell order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-sell-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user is on place an order side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user clicks the sell order button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "‘Add a sell order’ extended side tray should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_place_an_order_side_tray()"
});
formatter.result({
  "duration": 90003440,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_sell_order_button()"
});
formatter.result({
  "duration": 5126141255,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_a_sell_order_extended_side_tray_should_be_display()"
});
formatter.result({
  "duration": 89580204,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "# Validate sell Extended Side tray"
    },
    {
      "line": 30,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 31,
  "name": "Validate the cancel button in extended side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-cancel-button-in-extended-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "the user clicks the cancel button from the extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "extended side tray should be closed and the user should navigate back to place order side tray",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 80858516,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_cancel_button_from_the_extended_side_tray()"
});
formatter.result({
  "duration": 2108128225,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.extended_side_tray_should_be_closed_and_the_user_should_navigate_back_to_place_order_side_tray()"
});
formatter.result({
  "duration": 5165834660,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 36,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 37,
  "name": "Validate the portfolio holding searchbox",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-portfolio-holding-searchbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user search for any portfolio holding using the searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user should get the result based on the search keyword and select the portfolio_holding",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 88632300,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_search_for_any_portfolio_holding_using_the_searchbox()"
});
formatter.result({
  "duration": 7436197487,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_get_the_result_based_on_the_search_keyword_and_select_the_portfolio_holding()"
});
formatter.result({
  "duration": 1861584063,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 42,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 43,
  "name": "Validate the exit price",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-exit-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user finds the availble exit price of that portfolio holding on extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "available exit price for that unit should be displayed with est.label",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 53425587,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_finds_the_availble_exit_price_of_that_portfolio_holding_on_extended_side_tray()"
});
formatter.result({
  "duration": 34322175,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.available_exit_price_for_that_unit_should_be_displayed_with_est_label()"
});
formatter.result({
  "duration": 1269584,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 48,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 49,
  "name": "Validate the Order amount field on add sell order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-amount-field-on-add-sell-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "the user clicks anywhere in the screen without entering anything on the order amount field",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "error message should be displayed under the order amount screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 46437916,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_anywhere_in_the_screen_without_entering_anything_on_the_order_amount_filed()"
});
formatter.result({
  "duration": 83810475,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.error_message_should_be_displayed_under_the_order_amount_screen()"
});
formatter.result({
  "duration": 2057219204,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 54,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 55,
  "name": "Validate the order amount field validation",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-amount-field-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "the user enters the Special character and text values in the order amount text box",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "user should not be allowed to enter the special character and text values into the order amount field",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 64421279,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_the_Special_character_and_text_values_in_the_order_amount_text_box()"
});
formatter.result({
  "duration": 110686696,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_not_be_allowed_to_enter_the_special_character_and_text_values_into_the_order_amount_field()"
});
formatter.result({
  "duration": 2042260745,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 60,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 61,
  "name": "Validate the add button on the ‘add a sell order button’",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-add-button-on-the-‘add-a-sell-order-button’",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "the user didn’t enter/select anything on the screen",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "‘Add’ button should be in disable mode",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 51672753,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_didn_t_enter_select_anything_on_the_screen()"
});
formatter.result({
  "duration": 25499896,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_button_should_be_in_disable_mode()"
});
formatter.result({
  "duration": 2029186658,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 66,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 67,
  "name": "validate the maximum order amount",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-maximum-order-amount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 68,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "the user enters more than available units",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "error message should be displayed under the order amount text box",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 60509751,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_more_than_available_units()"
});
formatter.result({
  "duration": 168228054,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.error_message_should_be_displayed_under_the_order_amount_text_box()"
});
formatter.result({
  "duration": 2061025358,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 72,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 73,
  "name": "validate order amount and available units are the same",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-order-amount-and-available-units-are-the-same",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 74,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "the user enter the enters the order amount which is equal to available units",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "user should get the \u0027Full redemption\u0027 message under the order value text box",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 154269133,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enter_the_enters_the_order_amount_which_is_equal_to_available_units()"
});
formatter.result({
  "duration": 271146312,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_get_the_Full_redemption_message_under_the_order_value_text_box()"
});
formatter.result({
  "duration": 2060510726,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 78,
      "value": "#\tScenario: validate the Minimum order amount"
    },
    {
      "line": 79,
      "value": "#\tGiven user is on ‘Add a sell order’ extended side tray"
    },
    {
      "line": 80,
      "value": "#\tWhen the order value is less than the transaction fee"
    },
    {
      "line": 81,
      "value": "#\tThen user should not allow placing the order and error message should be displayed on the screen and +add or update button should be disabled"
    },
    {
      "line": 82,
      "value": "#"
    },
    {
      "line": 83,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 84,
  "name": "Validate the order value calculation",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-value-calculation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "the user enters the order units",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "order units should be multiplied with the exit price and the result should be subtracted with a transaction fee",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Final calculated value should be displayed as order value est with 2 decimal places",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 66585084,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_the_order_units()"
});
formatter.result({
  "duration": 80580629,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_units_should_be_multiplied_with_the_exit_price_and_the_result_should_be_subtracted_with_a_transaction_fee()"
});
formatter.result({
  "duration": 65517121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 67
    }
  ],
  "location": "Add_sell_order.final_calculated_value_should_be_display_as_order_value_est_with_decimal_places(int)"
});
formatter.result({
  "duration": 36145754,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 90,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 91,
  "name": "Validate the Advice given ’No’ radio button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-advice-given-’no’-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 92,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 93,
  "name": "user select the ’No’ option",
  "keyword": "When "
});
formatter.step({
  "line": 94,
  "name": "\u0027Advice given\u0027 details should not be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 75757560,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_select_the_No_option()"
});
formatter.result({
  "duration": 218598973,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.advice_given_details_should_not_be_displayed()"
});
formatter.result({
  "duration": 2057522391,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 96,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 97,
  "name": "validate the Advice given ‘Yes’ radio button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-advice-given-‘yes’-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 98,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "user select the ’Yes’ option",
  "keyword": "When "
});
formatter.step({
  "line": 100,
  "name": "advice reason, date, summary and advice method fields should be display under the advice given label",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "Date field should have todays\u0027s field as default",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "add button should be enabled",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 132050336,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_select_the_Yes_option()"
});
formatter.result({
  "duration": 2197762870,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.advice_reason_date_summary_and_advice_method_fields_should_be_display_under_the_advice_given_label()"
});
formatter.result({
  "duration": 4617234350,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.date_field_should_have_todays_s_field_as_default()"
});
formatter.result({
  "duration": 32450732,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_button_should_be_enabled()"
});
formatter.result({
  "duration": 23147684,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 105,
      "value": "#\t# @RegressionTest @SmokeTest"
    },
    {
      "line": 106,
      "value": "#\tScenario: Validate the disclaimer footer message"
    },
    {
      "line": 107,
      "value": "#\tGiven user is on ‘Add a sell order’ extended side tray"
    },
    {
      "line": 108,
      "value": "#\tWhen the user selects the disclaimer footer message checkbox along with complete all the mandatory fields"
    },
    {
      "line": 109,
      "value": "#\tThen add button should be enabled"
    },
    {
      "line": 110,
      "value": "#"
    },
    {
      "line": 111,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 112,
  "name": "Validate the draft order page",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-draft-order-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 113,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 114,
  "name": "the user clicks the add button from Add a sell order extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 115,
  "name": "order should be saved as draft order and should be displayed on the place order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 77824585,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_add_button_from_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 158749689,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_should_be_saved_as_draft_order_and_should_be_displayed_on_the_place_order_screen()"
});
formatter.result({
  "duration": 5036579626,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 117,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 118,
  "name": "Validate the draft order",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-draft-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 119,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 120,
  "name": "user click the available draft order",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "add sell order extended side tray should open and user should be able to edit the order",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 27513662,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_click_the_available_draft_order()"
});
formatter.result({
  "duration": 83349501,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_sell_order_extended_side_tray_should_open_and_user_should_be_able_to_edit_the_order()"
});
formatter.result({
  "duration": 5040159180,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 123,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 124,
  "name": "validate the edit order",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-edit-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 125,
  "name": "user is on the edit order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 126,
  "name": "user changes the different asset or order value",
  "keyword": "When "
});
formatter.step({
  "line": 127,
  "name": "click the update button",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "updated new changes should be displayed in the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_edit_order_screen()"
});
formatter.result({
  "duration": 5046567922,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_changes_the_different_asset_or_order_value()"
});
formatter.result({
  "duration": 2100879828,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.click_the_update_button()"
});
formatter.result({
  "duration": 188797581,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.updated_new_changes_should_be_displayed_in_the_draft_order_screen()"
});
formatter.result({
  "duration": 5058255724,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 130,
      "value": "#\t# @RegressionTest @SmokeTest"
    },
    {
      "line": 131,
      "value": "#\tScenario: Validate the multiple orders"
    },
    {
      "line": 132,
      "value": "#\tGiven user is on the draft order screen"
    },
    {
      "line": 133,
      "value": "#\tWhen the user clicks the sell button and places the another order"
    },
    {
      "line": 134,
      "value": "#\tThen newly placed order should be displayed under the previous order on the draft order screen"
    },
    {
      "line": 136,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 137,
  "name": "validate the close order button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-close-order-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 138,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 139,
  "name": "user clicks the close button for any draft order card",
  "keyword": "When "
});
formatter.step({
  "line": 140,
  "name": "confirmation pop-up message should be displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 21577471,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_close_button_for_any_draft_order_card()"
});
formatter.result({
  "duration": 85734404,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.confirmation_pop_up_message_should_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 2071423063,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 142,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 143,
  "name": "Validate the Go back button on the confirmation popup",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-go-back-button-on-the-confirmation-popup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 144,
  "name": "user is can able to view the confirmation pop-up for close order",
  "keyword": "Given "
});
formatter.step({
  "line": 145,
  "name": "the user clicks the Go back button",
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "that order should not be closed and order should be displayed on the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_can_able_to_view_the_confirmation_pop_up_for_close_order()"
});
formatter.result({
  "duration": 2053885505,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_Go_back_button()"
});
formatter.result({
  "duration": 117396316,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.that_order_should_not_be_closed_and_order_should_be_displayed_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 3052682736,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 148,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 149,
  "name": "Validate the cancel order button on the confirmation popup",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-cancel-order-button-on-the-confirmation-popup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 150,
  "name": "user is can able to view the confirmation popup for close order",
  "keyword": "Given "
});
formatter.step({
  "line": 151,
  "name": "the user clicks the cancel order button",
  "keyword": "When "
});
formatter.step({
  "line": 152,
  "name": "that particular order should be get disappear from the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_can_able_to_view_the_confirmation_popup_for_close_order()"
});
formatter.result({
  "duration": 4135365437,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_cancel_order_button()"
});
formatter.result({
  "duration": 3086170938,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.that_particular_order_should_be_get_disappear_from_the_draft_order_screen()"
});
formatter.result({
  "duration": 5043837231,
  "status": "passed"
});
});