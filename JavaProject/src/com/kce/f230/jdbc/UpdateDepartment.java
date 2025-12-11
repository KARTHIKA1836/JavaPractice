package com.kce.f230.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDepartment {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE departments SET department_name = ?, manager_id = ? WHERE department_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "FINANCE");
            ps.setInt(2, 205);
            ps.setInt(3, 10);

            int result = ps.executeUpdate();

            System.out.println(result > 0 ? "Updated Successfully!" : "Update Failed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
