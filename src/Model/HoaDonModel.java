/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class HoaDonModel {
    int MaHD;
    String NgayInHD;
    Float TongTien;

    public HoaDonModel() {
    }

    public HoaDonModel(int MaHD, String NgayInHD, Float TongTien) {
        this.MaHD = MaHD;
        this.NgayInHD = NgayInHD;
        this.TongTien = TongTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayInHD() {
        return NgayInHD;
    }

    public void setNgayInHD(String NgayInHD) {
        this.NgayInHD = NgayInHD;
    }

    public Float getTongTien() {
        return TongTien;
    }

    public void setTongTien(Float TongTien) {
        this.TongTien = TongTien;
    }
    
}
