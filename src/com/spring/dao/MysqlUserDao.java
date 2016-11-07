package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.spring.entity.User;

public class MysqlUserDao implements UserDao{
	private JDBCDataSource dataSource;
	public MysqlUserDao(JDBCDataSource dataSource){
		this.dataSource = dataSource;
	}
	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("-----------查询用户信息-------------");
		String sql = "select * from user where name = ?";
		Connection con = null;
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			User user = null;
			while(rs.next()){
				user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setGender(rs.getString("gender"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
			}
			rs.close();
			ps.close();
			return user;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			dataSource.close(con);
		}
	}

}
