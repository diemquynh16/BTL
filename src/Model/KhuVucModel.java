/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class KhuVucModel {
    int MaKV;
    String TenKV;
    int Trangthai;

    public KhuVucModel() {
    }

    public KhuVucModel(int MaKV, String TenKV, int Trangthai) {
        this.MaKV = MaKV;
        this.TenKV = TenKV;
        this.Trangthai = Trangthai;
    }

    public int getMaKV() {
        return MaKV;
    }

    public void setMaKV(int MaKV) {
        this.MaKV = MaKV;
    }

    public String getTenKV() {
        return TenKV;
    }

    public void setTenKV(String TenKV) {
        this.TenKV = TenKV;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }
    
}
