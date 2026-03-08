package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class First_1 {

	public static void main(String[] args) throws SQLException {
        
Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/colleg","root","1234");

PreparedStatement prtm = con.prepareStatement("insert into student values(?,?,?)");
prtm.setInt(1, 3);
prtm.setString(2, "Rohit ");
prtm.setString(3, "Latur");
 
 System.out.println("row"+prtm.executeUpdate());
 
 con.close();
 prtm.close();

	}

}
