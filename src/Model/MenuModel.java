/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author DIEM QUYNH
 */
public class MenuModel {
    private int MaMon;
    private String TenMon, Loai;
    private Float DonGia;
    private byte[] AnhMon;

    
//  
//    public MenuModel(int MaMon, String TenMon, String Loai, Float DonGia, byte[] AnhMon) {
//        this.MaMon = MaMon;
//        this.TenMon = TenMon;
//        this.Loai = Loai;
//        this.DonGia = DonGia;
//        this.AnhMon = AnhMon;
//    }

    public int getMaMon() {
        return MaMon;
    }

    public void setMaMon(int MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public Float getDonGia() {
        return DonGia;
    }

    public void setDonGia(Float DonGia) {
        this.DonGia = DonGia;
    }

    public byte[] getAnhMon() {
        return AnhMon;
    }

    public void setAnhMon(byte[] AnhMon) {
        this.AnhMon = AnhMon;
    }
    
    
}
