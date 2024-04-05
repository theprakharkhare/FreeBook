//package com.DB;
//
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DBConnect {
//
//	private static Connection conn;
//
//	public static Connection getConn() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freebook","root","123456");
//		} catch (Exception e) {
//		    e.printStackTrace();
//		    System.out.println(e.getMessage());
//		}
//		return conn;
//	}
//}
package com.DB;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static Connection conn;

    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/freebook", "root", "123456");
            System.out.println("Connection established successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error connecting to MySQL database: " + e.getMessage());
        } finally {
            // If you're using Java 7 or later, you can use try-with-resources to close the connection
            // This ensures the connection is closed, even if an exception occurs.
            /*
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            */
        }
        return conn;
    }
}
