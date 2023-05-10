/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class BanModel {
    int MaBan, TrangThai, MaKV;

    public BanModel() {
    }

    public BanModel(int MaBan, int TrangThai, int MaKV) {
        this.MaBan = MaBan;
        this.TrangThai = TrangThai;
        this.MaKV = MaKV;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getMaKV() {
        return MaKV;
    }

    public void setMaKV(int MaKV) {
        this.MaKV = MaKV;
    }
    
}
