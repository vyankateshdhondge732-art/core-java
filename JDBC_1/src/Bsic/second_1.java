package Bsic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class second_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
          //Class<?>name=Class.forName("jdbc:mysql://localhost:3306/king");
		
		try {
          Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/king","root","1234");
          Statement stmt=con.createStatement();
          int num =stmt.executeUpdate("insert into jdbc_table values(1,'athrv',2.8)");
            System.out.println("No. of rows affected "+num);
          con.close();
		}
		finally {
			
		}
	}

}
