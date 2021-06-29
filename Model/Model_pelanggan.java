
package Model;


public class Model_pelanggan {
    
    private String id_pelanggan;
    private String nama_pelanggan;
    private String pass_pelanggan;
    private String alamat_pelanggan;
    private String email_pelanggan;
    private String no_hp_pelanggan;
    

    public Model_pelanggan(String Id_Pelanggan, String Pass_Pelanggan, String Nama_Pelanggan,String Alamat_Pelanggan, String Email_Pelanggan,String No_Hp_Pelanggan){
        
        this.id_pelanggan = Id_Pelanggan;
        this.pass_pelanggan = Pass_Pelanggan;
        this.nama_pelanggan = Nama_Pelanggan;
        this.alamat_pelanggan = Alamat_Pelanggan;
        this.email_pelanggan = Email_Pelanggan;
        this.no_hp_pelanggan = No_Hp_Pelanggan;
    }
    

    public String getId_Pelanggan(){
        
        return id_pelanggan;
    }
    
    public String getPass_pelanggan(){
        
        return pass_pelanggan;
    }
    
    public String getNama_Pelanggan(){
        
        return nama_pelanggan;
    }
    public String getAlamat_pelanggan(){
        
        return alamat_pelanggan;
    }
    
    public String getEmail_pelanggan(){
        
        return email_pelanggan;
    }
    
    public String getNo_hp_pelanggan(){
        
        return no_hp_pelanggan;
    }
    
    public void setId_pelanggan(String Id_Pelanggan){
        
        this.id_pelanggan = Id_Pelanggan;
    }
    
    public void setPass_pelanggan(String Pass_Pelanggan){
        
        this.pass_pelanggan = Pass_Pelanggan;
    }
    
    public void setNama_pelanggan(String Nama_Pelanggan){
        
        this.nama_pelanggan = Nama_Pelanggan;
    }
    
    public void setAlamat_pelanggan(String Alamat_Pelanggan){
        
        this.alamat_pelanggan = Alamat_Pelanggan;
    }
    
    public void setEmail_pelanggan(String Email_Pelanggan){
        
        this.email_pelanggan = Email_Pelanggan;
    }
    
    public void setNo_hp_pelanggan(String No_Hp_Pelanggan){
        
        this.no_hp_pelanggan = No_Hp_Pelanggan;
    }
}
