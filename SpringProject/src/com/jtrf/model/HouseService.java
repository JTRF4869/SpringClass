package com.jtrf.model;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("houseService")
public class HouseService {
	
	@Autowired
	private HouseDao houseDao;
	
	public House findById(int houseid) throws SQLException {
		return houseDao.findById(houseid);
	}
}
