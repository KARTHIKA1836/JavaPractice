package com.kce.f230.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",   
                    "system",                                
                    "karthika"                           
            );
            System.out.println("Oracle Connceted Successfully");

        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
        return con;
    }
}