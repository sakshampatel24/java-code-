package database;

import java.sql.*;

public class Crud {
static Connection con;
static Statement st;
  public static void addData(String email,String name, String address,int contact) {
	con = Connectivity.getConnection();
			int n;
	try {
		st = con.createStatement();
		String squery = "insert into personal values ('"+email+"','"+name+"','"+contact+"',"+ address +")";
		System.out.println(squery);
		n = st.executeUpdate(squery);
		if (n ==1 ) {
			System.out.println("Record SAVED");
		}
		else {
			System.out.println("try AGAin ??");
		}
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}

