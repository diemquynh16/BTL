/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class HangHoaModel {
    int MaHH, SoLuong, MaLH, MaNV;
    Float GiaHH;
    String TenHH;

    public HangHoaModel() {
    }

    public HangHoaModel(int MaHH, int SoLuong, int MaLH, int MaNV, Float GiaHH, String TenHH) {
        this.MaHH = MaHH;
        this.SoLuong = SoLuong;
        this.MaLH = MaLH;
        this.MaNV = MaNV;
        this.GiaHH = GiaHH;
        this.TenHH = TenHH;
    }

    public int getMaHH() {
        return MaHH;
    }

    public void setMaHH(int MaHH) {
        this.MaHH = MaHH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaLH() {
        return MaLH;
    }

    public void setMaLH(int MaLH) {
        this.MaLH = MaLH;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public Float getGiaHH() {
        return GiaHH;
    }

    public void setGiaHH(Float GiaHH) {
        this.GiaHH = GiaHH;
    }

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }
    
}
