package com.training.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load Driver
		
				Class.forName("com.mysql.jdbc.Driver");
				
				//2.Get Connection
				
				Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3308/logindb","root","admin");
				
				//3.Create Statment
				Statement st=ct.createStatement();
				//4.
				int i=st.executeUpdate("INSERT INTO empinfo(ID,NAME,ADRESS)VALUES(101,'Peter','Hyderabad')");
				st.executeUpdate("INSERT INTO empinfo(ID,NAME,ADRESS)VALUES(102,'Tom','Hyderabad')");
				st.executeUpdate("INSERT INTO empinfo(ID,NAME,ADRESS)VALUES(103,'Sheetal','Chennai')");
				st.executeUpdate("INSERT INTO empinfo(ID,NAME,ADRESS)VALUES(104,'Naveen','Andhra')");
				
				if(i>0) {
					System.out.println("Rows are inserted");
				}else {
					System.out.println("Rows are not inserted");
				}
				ct.close();
				
				
	}

}
