package com.kce.f230.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDepartment {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO departments (department_id, department_name, manager_id, location_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 10);
            ps.setString(2, "ACCOUNTING");
            ps.setInt(3, 200);   // or ps.setNull(3, java.sql.Types.INTEGER);
            ps.setInt(4, 1700);

            int result = ps.executeUpdate();

            System.out.println(result > 0 ? "Inserted Successfully!" : "Insert Failed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
