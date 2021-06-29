
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_kantin;

public class Koneksi_kantin {
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Model_kantin> GetDataKantin(){
            try{
            List<Model_kantin>  kantinList = new ArrayList<Model_kantin>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM kantin";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                kantinList.add(new Model_kantin(rs.getString("id_kantin"), rs.getString("nama_kantin"),rs.getString("pass_kantin")));
            }

            stmt.close();
            conn.close();

            return kantinList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
              public static void InsertDataKantin(String id, String nama_kantin, String pass){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                
                String sql = "INSERT INTO kantin(id_kantin, nama_kantin, pass_kantin) VALUES ('"+ id +"','"+ nama_kantin + "','" + pass +"')";
                
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}
