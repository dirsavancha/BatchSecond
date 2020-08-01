package com.training.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	       //1.Load Driver
		
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.Get Connection
			
			Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
			
			//3.Create Statment
			Statement st=ct.createStatement();
			//4 Exec query
			int i=st.executeUpdate("Delete from empinfo where id=102");
			if(i>0) {
				System.out.println("Rows Affected");
				
			}else {
				System.out.println("Rows Not affecteed");
			}
			//5. close connection
			ct.close();
}
}
