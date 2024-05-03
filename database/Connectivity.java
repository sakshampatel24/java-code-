package database;
 
 import java.sql.*;


public class Connectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","1234");
			
				Statement stm = con.createStatement();
				
				System.out.println(con);
				
		}catch(Exception e) {
			
		System.out.println(e);
	}

	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	//public static Connection getConnection() {
		// TODO Auto-generated method stub
		//return null;
	}


