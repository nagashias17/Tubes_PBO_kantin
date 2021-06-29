
package Model;

public class Model_pesanan {
    
    private String id_order;
    private String id_menu;
    private String nama_menu;
    private int total_harga;

     public Model_pesanan(String Id_Order, String id_menu, String nama_menu, int Total_Harga){
         
        this.id_order = Id_Order;
        this.id_menu = id_menu;
        this.nama_menu = nama_menu;
        this.total_harga = Total_Harga;
     }

    
    public String getId_order(){
        
        return id_order;
    }
      
     public String getIdMenu(){
        
        return id_menu;
    }
    
    public String getNama_menu(){
        
        return nama_menu;
    }
    
    public int getTotal_harga(){
        
        return total_harga;
    }
    
    public void setId_order(String Id_Order){
        
        this.id_order = Id_Order;
    }
    
       
    public void setIdMenu(String Id_menu){
        
        id_menu = Id_menu;
    }
    
    public void setNama_menu(String nama_menu){
        
        this.nama_menu = nama_menu;
    }
    
    public void setTotal_harga(int Total_Harga){
        
        this.total_harga = Total_Harga;
    }
}
