package com.pw.publicLib;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public class DataProvider {

	private static String CSV_PATH = "src/test/resources/pw_testdata.csv";
	private static String SD_CSV_PATH = "src/test/resources/SD_TEST_DATA.csv";
	
	static DataProvider TestData = new DataProvider();
	static String [] SDcsvCell = TestData.SD_ReadData();
	static String [] csvCell = TestData.ReadData();
	
//	Read Data
	public static String portfolio_valuation_API;
	 public static String portfolio_valuation_API_with_date;
	 public static String url;
	 public static String username;
	 public static String password;
	 public static String shareuser;
	 public static String summary;
	 public static String description;
	 public static String portfolio_id;
	 public static String valid_new_password;
	 public static String invalid_new_password;
	 public static String invalid_username;
	 public static String dg_admin_username;
	 public static String o_v_special_char;
	 public static String o_v_invalid_decimal;
	 public static String valid_order_amount;
	 public static String final_order_value;
	 public static String max_order_value;
	 public static String valid_order_amount_udpated;
	 public static String final_order_value_updated;
	 public static String portfolio_impact_units;

//	SD Read Data
	public static String sd_url;
	public static String sd_userName;
	public static String sd_password;
	public static String sd_summary;
	public static String sd_description;
	public static String sd_portfolio_id;
	public static String sd_value;
	public static String sd_amount;
	public static String sd_units;
	public static String sd_account_number;
	public static String sd_BSB_number;
	
	public String[] ReadData() {
		// Retrieving data from CSV file
		try {
			CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
			//String[] csvCell;
			// Retrieving data from a CSV file.
			csvCell = reader.readNext();
			csvCell = reader.readNext();
			url = csvCell[0];
			username = csvCell[1];
			password = csvCell[2];
			shareuser = csvCell[3];
			summary = csvCell[4];
			description = csvCell[5];
			portfolio_id = csvCell[6];
			valid_new_password = csvCell[7];
			invalid_new_password = csvCell[8];
			invalid_username = csvCell[9];
			dg_admin_username = csvCell[10];
			o_v_special_char = csvCell[11];
			o_v_invalid_decimal = csvCell[12];
			valid_order_amount =csvCell[13];
			final_order_value = csvCell[14];
			max_order_value = csvCell[15];
			valid_order_amount_udpated = csvCell[16];
			final_order_value_updated = csvCell[17];
			portfolio_impact_units = csvCell[18];

			csvCell = reader.readNext();
			csvCell = reader.readNext();
			portfolio_valuation_API = csvCell[0];

			csvCell = reader.readNext();
			csvCell = reader.readNext();
			portfolio_valuation_API_with_date = csvCell[0];

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] RetrivedData = { portfolio_valuation_API, portfolio_valuation_API_with_date, url, username, password, shareuser, 
				summary, description, portfolio_id, valid_new_password, invalid_new_password, invalid_username, dg_admin_username, 
				o_v_special_char, o_v_invalid_decimal, valid_order_amount, final_order_value, max_order_value, 
				valid_order_amount_udpated, final_order_value_updated, portfolio_impact_units };

		return RetrivedData;
	}
	
	public String[] SD_ReadData() {
		// Retrieving data from CSV file
				try {
					CSVReader reader = new CSVReader(new FileReader(SD_CSV_PATH));
					// Retrieving data from a CSV file.
					SDcsvCell = reader.readNext();
					SDcsvCell = reader.readNext();
					sd_url = SDcsvCell[0];
					sd_userName = SDcsvCell[1];
					sd_password = SDcsvCell[2];
					sd_summary = SDcsvCell[3];
					sd_description = SDcsvCell[4];
					sd_portfolio_id = SDcsvCell[5];
					sd_value = SDcsvCell[6];
					sd_amount = SDcsvCell[7];
					sd_units = SDcsvCell[8];
					sd_account_number = SDcsvCell[9];
					sd_BSB_number = SDcsvCell[10];
					reader.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

				String[] SD_RetrivedData = { sd_url, sd_userName, sd_password, sd_summary, sd_description, sd_portfolio_id, sd_value,
						sd_amount, sd_units, sd_account_number, sd_BSB_number };

				return SD_RetrivedData;
		
	}
	
}