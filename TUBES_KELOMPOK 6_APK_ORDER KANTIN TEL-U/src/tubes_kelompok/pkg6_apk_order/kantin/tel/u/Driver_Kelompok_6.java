
package tubes_kelompok.pkg6_apk_order.kantin.tel.u;


public class Driver_Kelompok_6 {
    
    private String id_driver;
    private String pass_driver;
    private String nama_driver;
    private String no_hp_driver;
    private static int kotak = 1;
    
    public Driver_Kelompok_6(String Id_Driver, String Pass_Driver, String Nama_Driver, String No_Hp_Driver){
        
        this.id_driver = Id_Driver;
        this.no_hp_driver = Pass_Driver;
        this.nama_driver = Nama_Driver;
        this.no_hp_driver = No_Hp_Driver;
        kotak++;
    }
    
    public String getId_driver(){
        
        return id_driver;
    }
    
    public String getPass_driver(){
        
        return pass_driver;
    }
    
    public String getNama_driver(){
        
        return nama_driver;
    }
    
    public String getNo_hp_driver(){
        
        return no_hp_driver;
    }
    
    public static int getKotak(){
        
        return kotak;
    }
    
    public void setId_driver(String Id_Driver){
        
        this.id_driver = Id_Driver;
    }
    
    public void setPass_driver(String Pass_Driver){
        
        this.pass_driver = Pass_Driver;
    }
    
    public void setNama_driver(String Nama_Driver){
        
        this.nama_driver = Nama_Driver;
    }
    
    public void setNo_hp_driver(String No_Hp_Driver){
        
        this.no_hp_driver = No_Hp_Driver;
    }
    
    public void InfoDriver(){
        System.out.println("Nama Driver     : " + getNama_driver());
        System.out.println("Nomor Hp Driver : " + getNo_hp_driver());
    }
}
