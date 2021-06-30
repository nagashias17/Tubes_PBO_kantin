
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Model_Driver;

public class Koneksi_Driver {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Model_Driver> GetData_Driver(){
            try{
            List<Model_Driver>  List_Driver = new ArrayList<Model_Driver>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM driver";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                List_Driver.add(new Model_Driver(rs.getString("id_driver"), rs.getString("pass_driver"), rs.getString("nama_driver"), rs.getString("no_hp_driver")));
            }

            stmt.close();
            conn.close();

            return List_Driver;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void InsertData_Driver(String id, String nama, String pass, String no_hp){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                
                String sql = "INSERT INTO driver(id_driver, nama_driver, pass_driver, no_hp_driver) VALUES ('"+ id +"','"+ nama + "','" + pass + "','" +no_hp +"')";
                
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}
