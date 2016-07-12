package com.app.service;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.bean.Mobile;
import com.app.exceptions.ModelNotFoundException;
import java.sql.*;
public class MobileImpl implements Imobile {
	
	static Connection connection;
	String insertQuery = "insert into Mobile" + "(name,price,model,mobileId)" + " values(?,?,?,?,"
			+ "mysequence.nextval)";




@Override
public void addMobile(Mobile mobile) {
	// TODO Auto-generated method stub
	PreparedStatement statement=null;
	try {
		connection = MobileDAO.openConnection();
		statement = connection.prepareStatement(insertQuery);
		statement.setString(1, mobile.getName());
		statement.setDouble(2, mobile.getPrice());
		statement.setString(3, mobile.getModel());
		statement.setLong(4, mobile.getmobileId());
		statement.execute();
		System.out.println("in insert");
		
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		
		try {
			if (statement!=null)
				statement.close();
			MobileDAO.closeConnection();
		} catch (SQLException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
}

@Override
public List<Mobile> getAllMobiles() {
	// TODO Auto-generated method stub
	connection = MobileDAO.openConnection();
	List<Mobile> list = new ArrayList<Mobile>();
	PreparedStatement p1 = null;
	try {
		p1 = connection.prepareStatement("select * from Mobile");
		ResultSet rs = p1.executeQuery();

		while (rs.next()) {
			String name = rs.getString("name");
			double price = rs.getDouble("price");
			String model = rs.getString("model");
			long mobileId = rs.getLong("mobileId");
			Mobile mobile = new Mobile();
			mobile.setName(name);
			mobile.setPrice(price);
			mobile.setModel(model);
			mobile.setmobileId(mobileId);
			list.add(mobile);
		}
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
			if (p1 != null)
				p1.close();
			MobileDAO.closeConnection();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	return list;

}
@Override
public List<Mobile> getMobilesByModel(String model) throws ModelNotFoundException {
	// TODO Auto-generated method stub
	return null;
}
}