package com.pw.publicLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class DataBase {
	public String dbUrl = "jdbc:mysql://ooerl0bnyqlsr7.cmdpvgtcehhh.ap-southeast-2.rds.amazonaws.com:3306/orderpaddb";
	public String username = "orderpad-qa";
	public String password = "2E6533f5435Qc4C";
	public int resultSet;
	public static String value;
	
	
	public WebDriver getdata(WebDriver driver, String query) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl,username, password);
  		//Create Statement Object		
		Statement stmt = con.createStatement();					
		// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);	
 		while(rs.next()) {
 			value = rs.getString(1);
 			System.out.println(rs.getString(1));
 		}
		return driver;
	}
	public static String database_value() {
		return value;
	}
	public WebDriver update(WebDriver driver, String query) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//Load mysql jdbc driver
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				//Create Connection to DB
				Connection con = DriverManager.getConnection(dbUrl,username, password);
		  		//Create Statement Object		
				Statement stmt = con.createStatement();					
				// Execute the SQL Query. Store results in ResultSet		
				resultSet = stmt.executeUpdate(query);
				System.out.println("query Executed");
		return driver;
		
	}
	public WebDriver delete_open_orders(WebDriver driver, String query) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//Load mysql jdbc driver
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				//Create Connection to DB
				Connection con = DriverManager.getConnection(dbUrl,username, password);
		  		//Create Statement Object		
				Statement stmt = con.createStatement();					
				// Execute the SQL Query. Store results in ResultSet		
				resultSet = stmt.executeUpdate(query);
				System.out.println("query Executed");
		return driver;
		
	}
}
