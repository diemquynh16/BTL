/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.KetNoiSQL;
import Model.HoaDonModel;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author DIEM QUYNH
 */
public class HoadonDao {
    public boolean inserthd(HoaDonModel hd) throws Exception {

        String sql = "set dateformat DMY INSERT INTO dbo.HoaDon(NgayInHD,TongTien) VALUES(?,?)";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
                pstmt.setString(1, hd.getNgayInHD());
                pstmt.setFloat(2, hd.getTongTien());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }
    public boolean deletea(String NgayInHD) throws Exception {
        String sql = "delete from HoaDon where NgayInHD = ?";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, NgayInHD);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean delete(String MaHD) throws Exception {
        String sql = "delete from HoaDon where MaHD = ?";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, MaHD);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }
    public List<HoaDonModel> findAllhd() throws Exception {
        String sql = "select * from HoaDon";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<HoaDonModel> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDonModel hd = new HoaDonModel();
                    hd.setMaHD(rs.getInt("MaHoaDon"));
                    hd.setNgayInHD(rs.getString("NgayInHD"));
                    hd.setTongTien(rs.getFloat("TongTien"));
                    list.add(hd);
                }
                return list;
            }
        }
    }

    public List<HoaDonModel> findtableNgayHD(String ngayInHD) throws Exception {
        String sql = "set dateformat DMY SELECT * FROM HoaDon where NgayInHD like '%" + ngayInHD + "%'";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<HoaDonModel> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDonModel hd = new HoaDonModel();
                    hd.setMaHD(rs.getInt("MaHoaDon"));
                    hd.setNgayInHD(rs.getString("NgayInHD"));
                    hd.setTongTien(rs.getFloat("TongTien"));
                    list.add(hd);
                }
                return list;
            }
        }
    }
}
