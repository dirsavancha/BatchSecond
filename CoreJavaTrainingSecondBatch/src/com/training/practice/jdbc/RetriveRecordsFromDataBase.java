package com.training.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveRecordsFromDataBase {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load Driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.Get Connection
		
		Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
		
		//3.Create Statment
		Statement st=ct.createStatement();
		ResultSet rs=st.executeQuery("select * from empinfo");
		
		while (rs.next()) {
			System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+" "+rs.getString("Adress"));
		}
		  
	} 
	

}
