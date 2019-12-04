package com.pw.cucumberrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import com.mashape.unirest.http.exceptions.UnirestException;

//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

//import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
//import com.cucumber.listener.ExtentProperties;
//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//uncomment @runwith if you are using JUnit to run test
//@RunWith(Cucumber.class)
//@CucumberOptions(features= {"Features"})
@CucumberOptions(
		//features = "Features",
		features = {"Features/Side_tray_add_sell_order.feature"}, 
		glue = { "com.pw.pw_screens" },
		//tags = {"@RegressionTest"},
		// tags = {"@SmokeTest"},
		monochrome = true, // display control output in proper readable format
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
				"junit:target/cucumber-result.xml",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report.html",
//				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
//				"com.sitture.ExtentFormatter:target/extent-report/index.html", "html:target/html-report" 
				}
//		tags = {"@loginFlow, @adviser_dashboard, @portfolio_screen, @sd_validations, @user_profile"}
		)
 public class Cucumber_Main extends AbstractTestNGCucumberTests {
//public class Cucumber_Main {

	@BeforeClass()
	public static void setup() throws Exception {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/myreport.html");
		extentProperties.setProjectName("The Hive Automation");
	}
	@AfterClass()
	public static void teardown() throws UnirestException {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setSystemInfo("Browser", "Google Chrome");
		Reporter.setTestRunnerOutput("Sample test runner output message");

	}
}

