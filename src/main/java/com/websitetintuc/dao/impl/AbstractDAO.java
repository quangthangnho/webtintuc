package com.websitetintuc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.websitetintuc.dao.IGenericDAO;

public class AbstractDAO implements IGenericDAO{

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/servlet_data";
            String user = "root";
            String pass = "thanhquang";
            return DriverManager.getConnection(dbURL, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
		
	}
	
}
