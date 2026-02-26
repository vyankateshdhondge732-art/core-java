package Bsic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class first {

	public static void main(String[] args) throws SQLException {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/king","root","1234");
        System.out.println(con);
		 con.close();
	}

}
