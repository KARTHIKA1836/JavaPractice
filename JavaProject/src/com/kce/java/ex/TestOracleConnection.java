package com.kce.java.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestOracleConnection {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String username = "system";      
        String password = "karthika";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("🎉 Connection Successful!");
            }

            String sql = "select * from victim";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("victim details");
            System.out.println("---------------------------------------");

            while (rs.next()) {
                long victimId = rs.getLong("VICTIM_ID");
                long caseId = rs.getLong("CASE_ID");
                String name = rs.getString("NAME");
                String contact = rs.getString("CONTACT_INFO");
                String address = rs.getString("ADDRESS");
                String statement = rs.getString("STATEMENT");  

                System.out.println("Victim ID: " + victimId +
                                   ", Case ID: " + caseId +
                                   ", Name: " + name +
                                   ", Contact: " + contact +
                                   ", Address: " + address +
                                   ", Statement: " + statement);
            }
            rs.close();
            ps.close();
            con.close();
            
            

        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
    }
}
