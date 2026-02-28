package Bsic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class four {

	public static void main(String[] args) throws SQLException {
        
		 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/venky", "root", "1234");
			PreparedStatement prtm = con.prepareStatement("insert into emp values(?,?,?)");
			Scanner sc =new Scanner(System.in);
			System.out.println("plese Entert id");
			int id = sc.nextInt();
			System.out.println("plese Enter name");
			String name =sc.next();
			System.out.println("plese Eneter mark");
			double mark = sc.nextDouble();
			
			prtm.setInt(1, id);
			prtm.setString(2, name);
			prtm.setDouble(3, mark);
			
			System.out.println("row "+prtm.executeUpdate());
			
			sc.close();
			con.close();

	}

}
