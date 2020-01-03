package com.deloitte.library.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.library.model.Library;

public class BooksDAO {
    	public static Connection connectToDB() {
    		Connection connection = null;
    		try {
    			//RRegister the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				return connection;
			} catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} 
    	}
    	public static void addBook(Library lb) {
    		System.out.println(lb);
    		
    		//step 3 create the stat
    		Connection connection =connectToDB();
    		try {
				PreparedStatement stmt=connection.prepareStatement("insert into book values(?,?,?,?)");
				stmt.setInt(1,lb.getBookid());
				stmt.setString(2, lb.getBookname());
				stmt.setString(3, lb.getBookauthor());
				stmt.setInt(4, lb.getPrice());
				//step 4 execute sql query
				int affectedRows= stmt.executeUpdate();
				System.out.println("affected rows=" +affectedRows);
				
					connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    
    	
    	public static ArrayList<Library> displayAllBooks()   {
    		Connection connection = connectToDB();
    		ArrayList<Library> bookslist = new ArrayList<Library>();
    		try {
				PreparedStatement stmt=connection.prepareStatement("select * from book");
				ResultSet rs =stmt.executeQuery();
				while(rs.next()) {
					Library lb =new Library();
					lb.setBookid(rs.getInt(1));
					lb.setBookname(rs.getString(2));
					lb.setBookauthor(rs.getString(3));
					lb.setPrice(rs.getInt(4));
					bookslist.add(lb);
				}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return bookslist;
    		}
    	
    	 public static ArrayList<Library> searchBook(String bookName){
    		 Connection connection = connectToDB();
    		 ArrayList<Library> bookslist = new ArrayList<Library>();
    		 try {
				PreparedStatement stmt=connection.prepareStatement("select * from book where bookname=?");
				stmt.setString(1, bookName);
				ResultSet rs =stmt.executeQuery();
				while(rs.next()) {
					Library lb =new Library();
					lb.setBookid(rs.getInt(1));
					lb.setBookname(rs.getString(2));
					lb.setBookauthor(rs.getString(3));
					lb.setPrice(rs.getInt(4));
					bookslist.add(lb);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return bookslist;
    	 }
    	 
    	 public static void deleteBook(String bookId) {
    		 Connection connection =connectToDB();
    		 try {
				PreparedStatement stmt=connection.prepareStatement("delete from book where bookid=?");
				stmt.setString(1, bookId);
				int affectedRows= stmt.executeUpdate();
				System.out.println("affected rows=" +affectedRows);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
    	}

