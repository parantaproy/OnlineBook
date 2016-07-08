package com.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.bean.Mobile;
import com.app.exceptions.ModelNotFoundException;

public class MobileImpl implements Imobile {
	
	static Connection connection;
	String insertQuery="Insert into mobile values)?,?,?)";




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
	
	return null;

}
@Override
public List<Mobile> getMobilesByModel(String model) throws ModelNotFoundException {
	// TODO Auto-generated method stub
	return null;
}
}