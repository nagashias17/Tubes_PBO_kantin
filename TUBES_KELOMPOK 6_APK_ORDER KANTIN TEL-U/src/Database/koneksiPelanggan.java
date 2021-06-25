/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import GUI.Registrasi_pelanggan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tubes_kelompok.pkg6_apk_order.kantin.tel.u.Pelanggan_Kelompok_6;

/**
 *
 * @author ASUS ROG
 */
public class koneksiPelanggan {
    static final String DB_URL = "jdbc:mysql://localhost/db_kantin";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
        public static List<Pelanggan_Kelompok_6> GetDataPelanggan(){
        
            try{
            List<Pelanggan_Kelompok_6>  pelangganList = new ArrayList<Pelanggan_Kelompok_6>();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM pelanggan";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                pelangganList.add(new Pelanggan_Kelompok_6(rs.getString("id_pelanggan"), rs.getString("pass_pelanggan"),rs.getString("nama_pelanggan"), rs.getString("alamat_pelanggan"),  rs.getString("email_pelanggan"), rs.getString("no_hp_pelanggan")));
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

