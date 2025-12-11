package com.kce.f230.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDepartment {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM departments";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("DEPT_ID | NAME | MANAGER | LOCATION");
            System.out.println("---------------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("department_id") + " | " +
                        rs.getString("department_name") + " | " +
                        rs.getInt("manager_id") + " | " +
                        rs.getInt("location_id")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

