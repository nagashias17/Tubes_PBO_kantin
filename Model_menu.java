
package Model;


public class Model_menu {
    
    private String nama_menu;
    private int harga_menu;
    private String deskripsi_menu;
    private String id_menu;
    private String id_kantin;
    
    public Model_menu( String id_menu, String id_kantin, String Nama_Menu, int Harga_Menu, String Deskripsi_Menu){
        
        this.id_menu = id_menu;
        this.id_kantin = id_kantin;
        this.nama_menu = Nama_Menu;
        this.harga_menu = Harga_Menu;
        this.deskripsi_menu = Deskripsi_Menu;
    }


    public String getId_menu() {
        return id_menu;
    }

    public String getId_Kantinmenu() {
        return id_kantin;
    }
    
    public String getNama_Menu(){
        return nama_menu;
    }
    public int getHarga_Menu(){
        return harga_menu;
    }
    
    public String getDeskripsi_Menu(){
        return deskripsi_menu;
    }
    
    public void setId_menu(String id_menu) {
        this.id_menu = id_menu;
    }
    
    public void setId_Kantinmenu(String id_kantin) {
        this.id_kantin = id_kantin;
    }
    
    public void setNama_Menu(String Nama_Menu){
        nama_menu = Nama_Menu;
    }
    public void setHarga_Menu(int Harga_Menu){
        harga_menu = Harga_Menu;
    }

    public void setDeskripsi_Menu(String Deskripsi_Menu){
        deskripsi_menu = Deskripsi_Menu;
    }
}
