
package tubes_kelompok.pkg6_apk_order.kantin.tel.u;

import java.util.List;
import java.util.ArrayList;

public class Order_Kelompok_6 {
    
    private String id_order;
    private Driver_Kelompok_6 driver;
    private Kantin_Kelompok_6 kantin;
    private List<List_Menu_Kelompok_6> keranjang = new ArrayList();
    private int total_porsi, total_harga;
    private static int kotak = 1;
    private String status_order;
    
     public Order_Kelompok_6(String Id_Order, Kantin_Kelompok_6 Kantin, Driver_Kelompok_6 Driver){
         
        setDriver(Driver);
        setKantin(Kantin);
        id_order = Id_Order;
     }
     public Order_Kelompok_6(String Id_Order, Kantin_Kelompok_6 Kantin, Driver_Kelompok_6 Driver, int Total_Porsi, int Total_Harga){
         
        setDriver(Driver);
        setKantin(Kantin);
        id_order = Id_Order;
        total_porsi = Total_Porsi;
        total_harga = Total_Harga;
     }
    public Order_Kelompok_6(Kantin_Kelompok_6 Kantin, Driver_Kelompok_6 Driver){
        
        setDriver(Driver);
        setKantin(Kantin);
        this.id_order = " " + kotak;
        kotak++;
    }
    
    public String getId_order(){
        
        return id_order;
    }
    
    public Driver_Kelompok_6 getDriver(){
        
        return driver;
    }
    
    public Kantin_Kelompok_6 getKantin(){
        
        return kantin;
    }
    
    public ArrayList getKeranjang(){
        
        return (ArrayList) keranjang;
    }
    
    public int getTotal_porsi(){
        
        return total_porsi;
    }
    
    public int getTotal_harga(){
        
        return total_harga;
    }
    
    public String getStatus_order(){
        
        return "Pesanan sedang diproses";
    }
    
    public void setId_order(String Id_Order){
        
        this.id_order = Id_Order;
    }
    
    public void setDriver(Driver_Kelompok_6 Driver){
        
        this.driver = Driver;
    }
    
    public void setKantin(Kantin_Kelompok_6 Kantin){
        
        this.kantin = Kantin;
    }
    
    public void setKeranjang(ArrayList Keranjang){
        
        keranjang = Keranjang;
    }
    
    public void setTotal_porsi(int Total_Porsi){
        
        this.total_porsi = Total_Porsi;
    }
    
    public void setTotal_harga(int Total_Harga){
        
        this.total_harga = Total_Harga;
    }
    
    public void SetStatus_order(String Status_Order){
        
        this.status_order = Status_Order;
    }
    
    public void AddKeranjang(List_Menu_Kelompok_6 menu){
        
        keranjang.add(menu);
    }
    
    public String infoOrder(){
        
        String info = "============ Order ============= \n"  + "Kantin :" + this.kantin.getId_kantin() + "\n" + "Keranjang : \n";
        
        int i = 1;
        for (List_Menu_Kelompok_6 Keranjang : keranjang){
            
            info += i + " " + Keranjang.getNama_Menu() + "\t\tHarga Rp. " + Keranjang.getHarga_Menu() + "\n" + Keranjang.getDeskripsi_Menu() + "\n";
            i++;
        }
        
        info += "Nama Driver : " + this.driver.getId_driver() + "/n"+"No Hp : " + this.driver.getNo_hp_driver();
        info += " " + getStatus_order();
        
        return info;
    } 
}
