
package aplikasi.penggajian.karyawan;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi() throws SQLException
    {
        if (koneksi == null)
        {
            try{
                String url = "JDBC:mysql://localhost:3306/penggajian karyawan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e)
            {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]) throws SQLException
    {
        getKoneksi();
    }
}
