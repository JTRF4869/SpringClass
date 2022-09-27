package com.jtrf.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("houseDao")
public class HouseDao {
	
	@Autowired
	private DataSource dataSource;
	
	public House findById(int houseid) throws SQLException {
		Connection conn = dataSource.getConnection();
		String sql = "select * from House where houseId =?";
		PreparedStatement preState = conn.prepareStatement(sql);
		preState.setInt(1, houseid);
		ResultSet rs = preState.executeQuery();
		
		House house = null;
		if(rs.next()) {
			house = new House();
			house.setHouseId(rs.getInt("houseid"));
			house.setHousename(rs.getString("housename"));
		}
		rs.close();
		preState.close();
		return house;
	}
}
