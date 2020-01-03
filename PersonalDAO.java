package com.deloitte.designation.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.designation.model.PersonalDetails;

public class PersonalDAO {
	public static Connection connectToDB() {
		Connection connection = null;
		try {
			//RRegister the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	
	public static void addPerDetails(PersonalDetails pd) {
		System.out.println(pd);
		
		//step 3 create the stat
		Connection connection =connectToDB();
		try {
			PreparedStatement stmt=connection.prepareStatement("insert into PersonalDetails values(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1,pd.getUserid());
			stmt.setString(2,pd.getEmailid());
			stmt.setString(3,pd.getName());
			stmt.setString(4,pd.getFathername());
			stmt.setString(5,pd.getMothername());
			stmt.setString(6,pd.getAddress());
			stmt.setLong(7,pd.getContactno());
			stmt.setString(8,pd.getGender());
			stmt.setString(9,pd.getPassword());
			int affectedRows= stmt.executeUpdate();
			System.out.println("affected rows=" +affectedRows);
			
				connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<PersonalDetails> displayPerDet()   {
		Connection connection = connectToDB();
		ArrayList<PersonalDetails> perlist = new ArrayList<PersonalDetails>();
		try {
			PreparedStatement stmt=connection.prepareStatement("select * from PersonalDetails");
			ResultSet rs =stmt.executeQuery();
			while(rs.next()) {
				PersonalDetails pd =new PersonalDetails();
				pd.setUserid(rs.getInt(1));
				pd.setEmailid(rs.getString(2));
				pd.setName(rs.getString(3));
				pd.setFathername(rs.getString(4));
				pd.setMothername(rs.getString(5));
				pd.setAddress(rs.getString(5));
				pd.setContactno(rs.getLong(7));
				pd.setGender(rs.getString(8));
				pd.setPassword(rs.getString(9));
				perlist.add(pd);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return perlist;
	}
	public static void loginDet(String userId,String password1) {
		Connection connection = connectToDB();
		try {
			PreparedStatement stmt=connection.prepareStatement("select * from PersonalDetails where userid=? and password=?");
			stmt.setString(1, userId);
			stmt.setString(2, password1);
			ResultSet rs =stmt.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
			}
			if(count!=0) {
				System.out.println("valid user");
				connection.close();
			}
			else
			{
				System.out.println("invalid user");
				connection.close();
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
