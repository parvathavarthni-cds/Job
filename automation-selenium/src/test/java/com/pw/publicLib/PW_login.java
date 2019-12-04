package com.pw.publicLib;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PW_login {
	public WebDriver getdata(String HomePageURL) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//		String chromeDriverPath = "/var/lib/jenkins/tools/chromedriver/chromedriver";
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		driver = new ChromeDriver(chromeOptions);
		
	driver = new ChromeDriver();
		driver.get(HomePageURL);
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().window().maximize();
		return driver;
		
	}
		

}