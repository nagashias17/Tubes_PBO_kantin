
package Database;

import static Database.koneksiKantin.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tubes_kelompok.pkg6_apk_order.kantin.tel.u.Driver_Kelompok_6;

public class koneksiDriver {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Driver_Kelompok_6> GetDataDriver(){
        
            try{
            List<Driver_Kelompok_6>  driverList = new ArrayList<Driver_Kelompok_6>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM driver";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                driverList.add(new Driver_Kelompok_6(rs.getString("id_driver"), rs.getString("pass_driver"), rs.getString("nama_driver"), rs.getString("no_hp_driver")));
            }

            stmt.close();
            conn.close();

            return driverList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
