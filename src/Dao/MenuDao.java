/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.KetNoiSQL;
import Model.MenuModel;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIEM QUYNH
 */
public class MenuDao {
    public boolean insert(MenuModel menu) throws Exception {
        String sql = "INSERT INTO Menu(TenMon,Loai,DonGia,AnhMon) VALUES(?,?,?,?)";
        try (
            Connection connection = KetNoiSQL.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, menu.getTenMon());
            pstmt.setString(2, menu.getLoai());
            pstmt.setFloat(3, menu.getDonGia());
            pstmt.setBytes(4, menu.getAnhMon());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean update(MenuModel menu) throws Exception {
        String sql = "UPDATE Menu SET AnhMon = ?,TenMon = ?,Loai = ?,DonGia = ? WHERE MaMon = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setBytes(1, menu.getAnhMon());
            pstmt.setString(2, menu.getTenMon());
            pstmt.setString(3, menu.getLoai());
            pstmt.setFloat(4, menu.getDonGia());
            pstmt.setInt(5, menu.getMaMon());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean delete(String maMon) throws Exception {
        String sql = "delete from Menu where MaMon = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maMon);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public List<MenuModel> findtableMamon(String maMon) throws Exception {
        String sql = "SELECT * FROM Menu where MaMon like '%" + maMon + "%'";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<MenuModel> list = new ArrayList<>();
                while (rs.next()) {
                    MenuModel menu = new MenuModel();
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    list.add(menu);
                }
                return list;
            }
        }
    }


    public MenuModel findByMaMon(String maMon) throws Exception {
        String sql = "select * from Menu where MaMon = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maMon);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    MenuModel menu= new MenuModel();
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    return menu;
                }
            }
            return null;
        }
    }
public List<MenuModel> findtableTenmon(String tenMon) throws Exception {
        String sql = "SELECT * FROM Menu where TenMon like '%" + tenMon + "%'";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<MenuModel> list = new ArrayList<>();
                while (rs.next()) {
                    MenuModel menu = new MenuModel();
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    list.add(menu);
                }
                return list;
            }
        }
    }
public MenuModel findByTenMon(String tenMon) throws Exception {
        String sql = "select * from Menu where TenMon = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, tenMon);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    MenuModel menu= new MenuModel();
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    return menu;
                }
            }
            return null;
        }
    }
    public List<MenuModel> findByLoai(String loai) throws Exception {
        String sql = "select * from Menu where [Loai] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, loai);
            try (ResultSet rs = pstmt.executeQuery();) {
                List<MenuModel> list = new ArrayList<>();
                while (rs.next()) {
                    MenuModel menu = new MenuModel();  
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    list.add(menu);
                }
                return list;
            }
        }
    }

    public List<MenuModel> findAll() throws Exception {
        String sql = "select * from Menu";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<MenuModel> list = new ArrayList<>();
                while (rs.next()) {
                    MenuModel menu= new MenuModel();
                    menu.setMaMon(rs.getInt("MaMon"));
                    menu.setAnhMon(rs.getBytes("AnhMon"));
                    menu.setTenMon(rs.getString("TenMon"));
                    menu.setLoai(rs.getString("Loai"));
                    menu.setDonGia(rs.getFloat("DonGia"));
                    list.add(menu);
                }
                return list;
            }
        }
    }
}
