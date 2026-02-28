package Bsic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Thired_3 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/king", "root", "1234");
		PreparedStatement prtm = con.prepareStatement("insert into jdbc_table values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter Id");
		int id = sc.nextInt();
		System.out.println("plese enter name");
		String name = sc.next();
		System.out.println("pleses enter salary");
		double salary = sc.nextDouble();

		prtm.setInt(1, id);
		prtm.setString(2, name);
		prtm.setDouble(3, salary);
          
		System.out.println("update row"+prtm.executeUpdate());
		sc.close();
		con.close();
		
		prtm.close();
		
	}

}
