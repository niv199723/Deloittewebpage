package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ProjectDetails;
import com.example.demo.model.Qualification;

@Repository
public class QualificationDAO {
	public static Connection connectToDB() {
		Connection connection=null;
		try {
			//step1 register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2 create connection
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public String adddata(Qualification qua,ProjectDetails pd) {
		System.out.println(qua);
		//step3 create a statement
	try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("insert into Details (userid,emailid,name,fathername,mothername,address,contactno,gender,password,qualification,finalper,interviewscore,technicalskills,commscore) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1,pd.getUserid());
		stmt.setString(2,pd.getEmailid());
		stmt.setString(3,pd.getName());
		stmt.setString(4,pd.getFathername());
		stmt.setString(5,pd.getMothername());
		stmt.setString(6,pd.getAddress());
		stmt.setLong(7,pd.getContactno());
		stmt.setString(8,pd.getGender());
		stmt.setString(9,pd.getPassword());
		stmt.setString(10, qua.getQualification());
		stmt.setInt(11,qua.getFinalPercentage());
		stmt.setInt(12, qua.getInterviewScore());
		stmt.setInt(13,qua.getTechnicalScore());
		stmt.setInt(14, qua.getCommunicationScore());
		
		//step4 execute sql query
		int affectedRows=stmt.executeUpdate();
		System.out.println("affectedRows="+affectedRows);
		con.close();
		}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "data inserted successfully";
	}
	public ArrayList<Qualification> display() {
		// TODO Auto-generated method stub
		ArrayList<Qualification> list=new ArrayList<Qualification>();
		try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("select * from qualification1");
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
			Qualification qua1=new Qualification(); 
			qua1.setQualification(rs.getString(1));
			qua1.setFinalPercentage(rs.getInt(2));
			qua1.setInterviewScore(rs.getInt(3));
			qua1.setCommunicationScore(rs.getInt(4));
			qua1.setTechnicalScore(rs.getInt(5));
				list.add(qua1);
		}
		con.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return list;

	}
	





}
