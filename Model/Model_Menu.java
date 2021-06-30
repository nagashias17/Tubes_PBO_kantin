
package Model;


public class Model_Menu {
    
    private String Nama_Menu;
    private int Harga_Menu;
    private String Deskripsi_Menu;
    private String Id_Menu;
    private String Id_Kantin;
    
    public Model_Menu( String Id_Menu, String Id_Kantin, String Nama_Menu, int Harga_Menu, String Deskripsi_Menu){
        
        this.Id_Menu = Id_Menu;
        this.Id_Kantin = Id_Kantin;
        this.Nama_Menu = Nama_Menu;
        this.Harga_Menu = Harga_Menu;
        this.Deskripsi_Menu = Deskripsi_Menu;
    }

    public String GetId_Menu() {
        return Id_Menu;
    }

    public String GetId_Kantin_Menu() {
        return Id_Kantin;
    }
    
    public String GetNama_Menu(){
        return Nama_Menu;
    }
    public int GetHarga_Menu(){
        return Harga_Menu;
    }
    
    public String GetDeskripsi_Menu(){
        return Deskripsi_Menu;
    }
    
    public void SetId_Menu(String Id_Menu) {
        this.Id_Menu = Id_Menu;
    }
    
    public void SetId_Kantin_Menu(String Id_Kantin) {
        this.Id_Kantin = Id_Kantin;
    }
    
    public void SetNama_Menu(String Nama_Menu){
        this.Nama_Menu = Nama_Menu;
    }
    public void SetHarga_Menu(int Harga_Menu){
        this.Harga_Menu = Harga_Menu;
    }

    public void SetDeskripsi_Menu(String Deskripsi_Menu){
        this.Deskripsi_Menu = Deskripsi_Menu;
    }
}
