
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_Menu;
   
public class Koneksi_Menu {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection Conn;
    static Statement Stmt;
    static ResultSet RS;
    
    public static List<Model_Menu> GetData_List_Menu(){
            try{
            List<Model_Menu>  List_Menu = new ArrayList<Model_Menu>();

            Conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Stmt = Conn.createStatement();

            String sql = "SELECT * FROM list_menu";
            RS = Stmt.executeQuery(sql);


            while(RS.next()){
                List_Menu.add(new Model_Menu( RS.getString("id_menu"), RS.getString("id_kantin"), RS.getString("nama_menu"), Integer.parseInt(RS.getString("harga_menu")), RS.getString("deskripsi_menu")));
            }

            Stmt.close();
            Conn.close();

            return List_Menu;

        }catch(Exception E){
            E.printStackTrace();
            return null;
        }
    }
    
    public static void InsertDataListMenu( String Id, String Id_Kantin,String Nama, int Harga, String Deskripsi){
            try{
                Conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                Stmt = Conn.createStatement();  
                
                
                String sql = "INSERT INTO list_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu) VALUES ('" + Id + "','"+ Id_Kantin +"','" +Nama +"','"+ Harga + "','" + Deskripsi + "')";
                
                Stmt.execute(sql);
                Stmt.close();
                Conn.close();
            }catch(Exception E){
                E.printStackTrace();
            }
    }
    
        public static void UpdateDataListMenu(String Id_Menu, String Nama, int Harga, String Deskripsi){
        try{
            Conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Stmt = Conn.createStatement();
            
            
            String sql = "UPDATE list_menu SET nama_menu='"
                + Nama + "',  harga_menu  ='"
                + Harga + "', deskripsi_menu ='"
                + Deskripsi 
                + "' WHERE id_menu ='"
                +  Id_Menu + "'";
            
            Stmt.execute(sql);
            Stmt.close();
            Conn.close();
        }catch(Exception E){
            E.printStackTrace();
        }
    }
}
