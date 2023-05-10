package Helper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DIEM QUYNH
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiSQL {
 private static String url = "jdbc:mysql://localhost:3306/btl_java_cf";
    private static String driveName = "com.mysql.cj.jdbc.Driver";
    private static String username = "root";
    private static String password = "enter";
    private static Connection connection;
    private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driveName);
            try {
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Thanh cong");
            } catch (SQLException ex) {
                System.out.println("Khong tao duoc ket noi co so du lieu");
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong tim thay Driver");
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
