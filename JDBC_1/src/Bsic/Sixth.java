package Bsic;

import java.net.MulticastSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Sixth {

	public static void main(String[] args) throws SQLException {
try (	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colleg","root","root");){
			PreparedStatement prtm = con.prepareStatement("insert into student values(?,?,?)");
                  
			prtm.setInt(1, 4);
			prtm.setString(2, "nathuram ");
			prtm.setString(3,"abc@");
		System.out.println("row"+prtm.executeUpdate());
			System.out.println(con);
					
		}
			
	}

}
