package maven;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static void main(String []args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shoppingdb";
			
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection Established");
			con.close();
			System.out.println("Connection closed");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
