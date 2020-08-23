package com.websitetintuc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.websitetintuc.dao.INewDAO;
import com.websitetintuc.model.NewModel;

public class NewDAO implements INewDAO{

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
	public List<NewModel> findByCategoryId(long categoryId) {
		List<NewModel> result = new ArrayList<>();
		Connection connection = getConnection();
		String sql = "select * from news where id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		if(connection != null) {
			try {
				ps = connection.prepareStatement(sql);
				ps.setLong(1, categoryId);
				rs = ps.executeQuery();
				while(rs.next()){
					NewModel newModel = new NewModel();
					newModel.setId(rs.getLong("id"));
					newModel.setTitle(rs.getString("title"));
	                result.add(newModel);
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
