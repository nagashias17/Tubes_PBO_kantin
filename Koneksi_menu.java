
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_menu;
   
public class Koneksi_menu {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Model_menu> GetDataListMenu(){
            try{
            List<Model_menu>  listmenu = new ArrayList<Model_menu>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM list_menu";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                listmenu.add(new Model_menu( rs.getString("id_menu"), rs.getString("id_kantin"), rs.getString("nama_menu"), Integer.parseInt(rs.getString("harga_menu")), rs.getString("deskripsi_menu")));
            }

            stmt.close();
            conn.close();

            return listmenu;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void InsertDataListMenu( String id, String id_kantin,String nama, int harga, String deskripsi){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                
                String sql = "INSERT INTO list_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu) VALUES ('" + id + "','"+ id_kantin +"','" +nama +"','"+ harga + "','" + deskripsi + "')";
                
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
        public static void UpdateDataListMenu(String idmenu, String nama, int harga, String deskripsi){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            
            String sql = "UPDATE list_menu SET nama_menu='"
                + nama + "',  harga_menu  ='"
                + harga + "', deskripsi_menu ='"
                + deskripsi 
                + "' WHERE id_menu ='"
                +  idmenu + "'";
            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
