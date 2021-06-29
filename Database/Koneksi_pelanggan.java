
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_pelanggan;


public class Koneksi_pelanggan {
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
        public static List<Model_pelanggan> GetDataPelanggan(){
            try{
            List<Model_pelanggan>  pelangganList = new ArrayList<Model_pelanggan>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM pelanggan";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                pelangganList.add(new Model_pelanggan(rs.getString("id_pelanggan"), rs.getString("pass_pelanggan"),rs.getString("nama_pelanggan"), rs.getString("alamat_pelanggan"),  rs.getString("email_pelanggan"), rs.getString("no_hp_pelanggan")));
            }

            stmt.close();
            conn.close();

            return pelangganList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
        
          public static void InsertDataPelanggan(String id, String nama, String pass, String alamat, String email, String no_hp){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                
                String sql = "INSERT INTO pelanggan(id_pelanggan,nama_pelanggan,pass_pelanggan, alamat_pelanggan, email_pelanggan , no_hp_pelanggan) VALUES ('"+id+"','"+nama+"','"+pass+"','"+alamat+"','"+email+"','"+ no_hp +"')";
                
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}

