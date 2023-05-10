/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class LoaiHangHoa {
    int MaLH;
    String TenLH, Mota;

    public LoaiHangHoa() {
    }

    public LoaiHangHoa(int MaLH, String TenLH, String Mota) {
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.Mota = Mota;
    }

    public int getMaLH() {
        return MaLH;
    }

    public void setMaLH(int MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
}
