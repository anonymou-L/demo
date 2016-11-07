package com.spring.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDataSource implements Serializable{
	private static final long serialVersionUID = 1L;
	private String driver;
	private String url;
	private String username;
	private String password;
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		try{
			Class.forName(driver);
			this.driver = driver;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Connection getConnection() throws SQLException{
		Connection cn = DriverManager.getConnection(url,username,password);
		return cn;
	}
	public void close(Connection cn){
		if(cn!=null){
			try{
				cn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
