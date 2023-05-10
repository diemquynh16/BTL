/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class DatMonModel {
    int STT,SoLuong,MaBan,MaMon;
    Float Thanhtien;

    public DatMonModel() {
    }

    public DatMonModel(int STT, int SoLuong, int MaBan, int MaMon, Float Thanhtien) {
        this.STT = STT;
        this.SoLuong = SoLuong;
        this.MaBan = MaBan;
        this.MaMon = MaMon;
        this.Thanhtien = Thanhtien;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public int getMaMon() {
        return MaMon;
    }

    public void setMaMon(int MaMon) {
        this.MaMon = MaMon;
    }

    public Float getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(Float Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
}
