/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siskrip;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class Siskrip {

    public static Connection con;
    public static Statement stm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/siskrip";
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.print("Koneksi Berhasil!!");
        } catch(Exception e){
            System.err.println("Koneksi Gagal"+e.getMessage());
        }
    }
    
}
