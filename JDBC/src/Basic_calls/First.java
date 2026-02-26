package Basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class First {

	public static void main(String[] args) throws SQLException {
       
//		System.out.println(con);
//		
//		con.close();
		
		Properties prop=new Properties();
		prop.put("king", "root");
		prop.put("password", "1234");
		
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/king",prop);

       
	}

}

