package Bsic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;

public class five {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/colleg","root","root");

        PreparedStatement prtm = con.prepareStatement( "INSERT INTO student VALUES (?, ?, ?)" );

        // Set values for parameters
        prtm.setInt(1, 7);
        prtm.setString(2, "Rohit ");
        prtm.setString(3, "Latur");

        int rows = prtm.executeUpdate();

        System.out.println("Rows affected: " + rows);
       prtm.close();
        con.close();
    }
}