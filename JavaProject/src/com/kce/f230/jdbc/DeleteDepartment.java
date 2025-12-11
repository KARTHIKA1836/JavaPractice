package com.kce.f230.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDepartment {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM departments WHERE department_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 10);

            int result = ps.executeUpdate();

            System.out.println(result > 0 ? "Deleted Successfully!" : "Delete Failed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
