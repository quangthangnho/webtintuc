package com.websitetintuc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.websitetintuc.dao.ICategoryDAO;
import com.websitetintuc.model.Category;

public class CategoryDAO implements ICategoryDAO{

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
	
	@Override
	public List<Category> findAll() {
		List<Category> result = new ArrayList<>();
		Connection connection = getConnection();
		String sql = "select * from category";
		PreparedStatement ps = null;
		ResultSet rs = null;
		if(connection != null) {
			try {
				ps = connection.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					Category category = new Category();
	                category.setId(rs.getLong("id"));
	                category.setCode(rs.getString("code"));
	                category.setName(rs.getString("name"));
	                result.add(category);
	            }
				return result;
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					if(connection != null) {
						connection.close();
					}
					if(ps != null) {
						ps.close();
					}
					if(rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
		}
		return result;
	}

}
