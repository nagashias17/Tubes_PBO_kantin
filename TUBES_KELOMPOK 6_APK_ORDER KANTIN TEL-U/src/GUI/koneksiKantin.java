
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tubes_kelompok.pkg6_apk_order.kantin.tel.u.Kantin_Kelompok_6;

public class koneksiKantin {
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Kantin_Kelompok_6> GetDataKantin(){
        
            try{
            List<Kantin_Kelompok_6>  kantinList = new ArrayList<Kantin_Kelompok_6>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM kantin";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                kantinList.add(new Kantin_Kelompok_6(rs.getString("id_kantin"), rs.getString("pass_kantin")));
            }

            stmt.close();
            conn.close();

            return kantinList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
