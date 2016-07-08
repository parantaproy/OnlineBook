/**
 * 
 */
package com.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author proy3
 *
 */
public class MobileDAO {

	static Connection con;
	static Connection openConnection() {
		
		String drivername="oracle.jdbd.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="parantaproy";
		String password="Shanmugan@1";
		
		try {
			Class.forName(drivername);
			con=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection() {
		try {
			if(con!=null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
