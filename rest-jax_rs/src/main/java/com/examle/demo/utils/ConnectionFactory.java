package com.examle.demo.utils;
import java.sql.*;
import java.util.ResourceBundle;
public class ConnectionFactory {
	public static  Connection getMySqlConnection() {
		Connection con=null;
		
		ResourceBundle bundle=ResourceBundle.getBundle("application");
		
		String url=bundle.getString("dataSource.url");
		String userName=bundle.getString("dataSource.username");
		
		String password=bundle.getString("dataSource.password");
		try {
			con=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
