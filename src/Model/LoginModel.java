/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DIEM QUYNH
 */
public class LoginModel {
    String TenTk, MatKhau, VaiTro;

    public LoginModel() {
    }

    public LoginModel(String TenTk, String MatKhau, String VaiTro) {
        this.TenTk = TenTk;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getTenTk() {
        return TenTk;
    }

    public void setTenTk(String TenTk) {
        this.TenTk = TenTk;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
    
}
