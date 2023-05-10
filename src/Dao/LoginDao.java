/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.KetNoiSQL;
import Model.LoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author DIEM QUYNH
 */
public class LoginDao {
    public LoginModel checkLogin(String tenTk, String matKhau) throws Exception {
        String sql = "Select * from TaiKhoan where TenTk = ? and MatKhau = ? ";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, tenTk);
            pstmt.setString(2, matKhau);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    LoginModel tk = new LoginModel();
                    tk.setTenTk(tenTk);
                    tk.setVaiTro(rs.getString("VaiTro"));
                    return tk;
                }
            }
            return null;
        }
    }

    public LoginModel findByKiemtra(String tenTk, String vaitro) throws Exception {
        String sql = "Select * from TaiKhoan where TenTk = ? and VaiTro = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, tenTk);
            pstmt.setString(2, vaitro);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    LoginModel tk = new LoginModel();
                    tk.setTenTk(rs.getString("TenTk"));
                    tk.setMatKhau(rs.getString("MatKhau"));
                    tk.setVaiTro(rs.getString("VaiTro"));
                    return tk;
                }
            }
            return null;
        }
    }

//    public boolean update(TaiKhoan tk, TaiKhoan mk) throws Exception {
//        String sql = "UPDATE [dbo].[TaiKhoan] SET [MatKhau] = ? WHERE [TenTk] = ? and [MatKhau] = ?";
//        try (
//                Connection connection = KetNoiSQL.getConnection();
//                PreparedStatement pstmt = connection.prepareStatement(sql);) {
//            pstmt.setString(1, mk.getMatKhau());
//            pstmt.setString(2, tk.getTenTk());
//            pstmt.setString(3, tk.getMatKhau());
//            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
//        }
//    }
}
