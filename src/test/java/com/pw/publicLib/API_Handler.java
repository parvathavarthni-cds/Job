package com.pw.publicLib;

import java.sql.SQLException;
import java.text.DecimalFormat;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.pw.pw_screens.Risk_Based_Test_Set_for_HIVE_OP_BUY;

public class API_Handler {
	public static String token = "f940625eb8139da7c50bfe39e85e0e73664b25fc871edbacfc5aeb104c9b97115029233933e19f02541f57db78b6356183b7d04116b937af3fae81f1cfddb606";
	public static String netvalue;
	public static String api_netvalue;
	public static double get_result;
	public static DecimalFormat format;
	public String username = "nanthakumar@crystaldelta.com";
	public String password = "Nantha@2120";
	
	public static String CMA_CASH;
	public static String API_url = "http://dummy.restapiexample.com/api/v1/employees";
	public static String praemium_api_url = "https://qa-hive-api.powerwrap.com.au/api/investors?type=portfolio&dg_id=2&investor_id=331777&praemium_id=272020&advisor_id=2&date=&service_code=P&service_id=2&session_id=1&praemium_user_id=saransangeetham";
	public static String key="auth_token";

	public WebDriver get_netvalue(WebDriver driver) {
		String value = driver.findElement(By.xpath("//*[@id=\"family_groupings_content\"]/div/div[2]/h4")).getText()
				.replace(",", "");
		int index = value.length();
		netvalue = value.substring(1, index);
		return driver;
	}

	public WebDriver get_investor_net_value_from_API(WebDriver driver, String praemin_api) throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.get(praemin_api).header("auth-token", token).asJson();
		int status = jsonResponse.getStatus();
		Assert.assertEquals(status, 200);
		Object response = jsonResponse.getBody();
		String valuvation = response.toString();
		JSONObject obj = new JSONObject(valuvation);
		Object API_netvalue = obj.getJSONObject("valuation").get("NetValue");
		api_netvalue = API_netvalue.toString();
		return driver;
	}

	public WebDriver comparision(WebDriver driver) {
		get_netvalue(driver);
		int integerPlaces = api_netvalue.indexOf('.');
		int decimalPlaces = api_netvalue.length() - integerPlaces - 1;
		if (decimalPlaces != 2) {
			get_result = Double.parseDouble(api_netvalue);
			format = new DecimalFormat("0.00"); // Set your desired format here.
			Assert.assertEquals(format.format(get_result), netvalue);
		} else {
			Assert.assertEquals(api_netvalue, netvalue);
		}
		return driver;
	}
	
	@Test
	public static WebDriver get_CMA_cash(WebDriver driver) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		HttpResponse<JsonNode> jsonResponseP = Unirest.get(praemium_api_url).header(key, token).asJson();
		int statusP = jsonResponseP.getStatus();
		Assert.assertEquals(statusP, 200);
		Object api_response  = jsonResponseP.getBody();
		String string_data = api_response.toString();
//		System.out.println("Portfolio valuation data ====>"+string_data);
		JSONObject objP = new JSONObject(string_data);
		Object cash_at_call = objP.getJSONArray("cash_at_call");
//		System.out.println("Main portfolio value ====>"+cash_at_call);
		String cash_at_call_data = cash_at_call.toString();
		JSONArray objj = new JSONArray(cash_at_call_data);
		Object first_data = objj.getJSONObject(0).get("Value");
//		System.out.println("Value ====>"+first_data);
		CMA_CASH = first_data.toString();
//		System.out.println("Value ====>"+CMA_CASH);
		Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA = Float.parseFloat(CMA_CASH);
		return driver;	
	}
	@Test
	public static WebDriver get_all_CMA_cash(WebDriver driver) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		String API_URL = "https://qa-hive-api.powerwrap.com.au/api/investors?type=portfolio&dg_id=2&investor_id=331777&praemium_id=320756&advisor_id=2&date=&service_code=P&service_id=2&session_id=1&praemium_user_id=saransangeetham";
		HttpResponse<JsonNode> jsonResponseP = Unirest.get(API_URL).header(key, token).asJson();
		int statusP = jsonResponseP.getStatus();
		Assert.assertEquals(statusP, 200);
		Object api_response  = jsonResponseP.getBody();
		String string_data = api_response.toString();
//		System.out.println("Portfolio valuation data ====>"+string_data);
		JSONObject objP = new JSONObject(string_data);
		Object cash_at_call = objP.getJSONArray("cash_at_call");
//		System.out.println("Main portfolio value ====>"+cash_at_call);
		String cash_at_call_data = cash_at_call.toString();
		JSONArray objj = new JSONArray(cash_at_call_data);
		Object ANZ = objj.getJSONObject(0).get("Value");
		Object Macquarie = objj.getJSONObject(1).get("Value");
		String ANZ_CMA_CASH = ANZ.toString();
		String Macquarie_CMA_CASH = Macquarie.toString();
		Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA = Float.parseFloat(ANZ_CMA_CASH);
		Risk_Based_Test_Set_for_HIVE_OP_BUY.Macquarie_Bank_CMA_CASH_DATA = Float.parseFloat(Macquarie_CMA_CASH);
		return driver;	
	}
}











