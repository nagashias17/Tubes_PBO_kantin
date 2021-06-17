
package tubes_kelompok.pkg6_apk_order.kantin.tel.u;


public class List_Menu_Kelompok_6 {
    
    private String nama_menu;
    private int harga_menu;
    private String deskripsi_menu;
    private static int kotak = 1;
    
    public List_Menu_Kelompok_6(String Nama_Menu, int Harga_Menu, String Deskripsi_Menu){
        
        this.nama_menu = Nama_Menu;
        this.harga_menu = Harga_Menu;
        this.deskripsi_menu = Deskripsi_Menu;
        kotak++;
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
    
    public void setNama_Menu(String Nama_Menu){
        nama_menu = Nama_Menu;
    }
    public void setHarga_Menu(int Harga_Menu){
        harga_menu = Harga_Menu;
    }

    public void setDeskripsi_Menu(String Deskripsi_Menu){
        deskripsi_menu = Deskripsi_Menu;
    }
    
    public void infoList_Menu(){
        System.out.println( " " + this.getNama_Menu());
        System.out.println("Harga           : " + this.getHarga_Menu());
        System.out.println("Deskripsi Menu  : " + this.getDeskripsi_Menu());
    }
}
