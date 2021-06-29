
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_pesanan;

public class Koneksi_pesanan {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Model_pesanan> GetDataOrder(){
        
            try{
            List<Model_pesanan>  listorder = new ArrayList<Model_pesanan>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM `order` ";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                listorder.add(new Model_pesanan( rs.getString("id_order"), rs.getString("id_menu"), rs.getString("nama_menu"), Integer.parseInt(rs.getString("total_harga"))));
            }

            stmt.close();
            conn.close();

            return listorder;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
        
     public static void InsertOrder(String id, String id_menu , String nama, int total_harga){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                
                String sql = "INSERT INTO `order` (`id_order`, `id_menu`, `nama_menu`, `total_harga`) VALUES ('" + id + "','"+ id_menu +"','" +nama +"','"+ total_harga  + "')";
               
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
     
     public static void DeleteDataOrder(String id, String id_menu , String nama, int total_harga){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            
            String sql = "DELETE FROM `order` WHERE  id_order = '" + id + "'";

            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
     }
}
