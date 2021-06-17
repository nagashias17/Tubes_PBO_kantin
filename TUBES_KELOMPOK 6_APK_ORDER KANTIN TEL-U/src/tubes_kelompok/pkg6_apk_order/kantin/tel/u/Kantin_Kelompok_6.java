

package tubes_kelompok.pkg6_apk_order.kantin.tel.u;

import java.util.List;
import java.util.ArrayList;


public class Kantin_Kelompok_6 {
    
    private String id_kantin;
    private String pass_kantin;
    private String jadwal_kantin;
    private List<List_Menu_Kelompok_6> list_menu;
    private int no_menu = 0;
    private static int kotak = 1;
    
    public Kantin_Kelompok_6(String Id_Kantin, String Pass_Kantin, String Jadwal_Kantin){
        
        this.id_kantin = Id_Kantin;
        this.pass_kantin = Pass_Kantin;
        this.jadwal_kantin = Jadwal_Kantin;
        list_menu = new ArrayList();
        kotak++;
    }
    
    public String getId_kantin(){
        
        return id_kantin;
    }
    
    public String getPass_kantin(){
        
        return pass_kantin;
    }
    
    public String getJadwal_kantin(){
        return jadwal_kantin;
    }
    
    public void setId_kantin(String Id_Kantin){
        
        id_kantin = Id_Kantin;
    }
    
    public void setPass_kantin(String Pass_Kantin){
        
        pass_kantin = Pass_Kantin;
    }
    public void setJadwal_kantin(String Jadwal_Kantin){
        
        jadwal_kantin = Jadwal_Kantin;
    }
    
    public List<List_Menu_Kelompok_6> getList_menu(){
        
        return list_menu;
    }
    
    public int getNo_menu(){
        
        return no_menu;
    }
    
    public String[] getList_Menu(){
        
        String[] list;
        list = new String[list_menu.size()];
        int L = 0;
        
        for (List_Menu_Kelompok_6 isi: list_menu){
            list[L] = isi.getNama_Menu();
            L++;
        }
        return list;
    } 
    
    public Kantin_Kelompok_6(String Id_Kantin, String Pass_Kantin){
        
        this.id_kantin = Id_Kantin;
        this.pass_kantin = Pass_Kantin;
        list_menu = new ArrayList();
    }
    
    public String toString(){
        return "ID Kantin" + id_kantin + "berhasil ditambahkan";
    }
    
    public Kantin_Kelompok_6(String Id_Kantin){
        
        this.id_kantin = Id_Kantin;
        list_menu = new ArrayList();
    }
}
