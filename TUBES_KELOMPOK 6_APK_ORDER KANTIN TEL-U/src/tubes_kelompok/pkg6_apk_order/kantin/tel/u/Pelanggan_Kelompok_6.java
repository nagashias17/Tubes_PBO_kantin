
package tubes_kelompok.pkg6_apk_order.kantin.tel.u;


public class Pelanggan_Kelompok_6 {
    
    private String id_pelanggan;
    private String nama_pelanggan;
    private String pass_pelanggan;
    private String alamat_pelanggan;
    private String email_pelanggan;
    private String no_hp_pelanggan;
    private static int kotak = 1;
    
    //membuat constructor pelanggan
    public Pelanggan_Kelompok_6(String Id_Pelanggan, String Pass_Pelanggan, String Nama_Pelanggan,String Alamat_Pelanggan, String Email_Pelanggan,String No_Hp_Pelanggan){
        
        this.id_pelanggan = Id_Pelanggan;
        this.pass_pelanggan = Pass_Pelanggan;
        this.nama_pelanggan = Nama_Pelanggan;
        this.alamat_pelanggan = Alamat_Pelanggan;
        this.email_pelanggan = Email_Pelanggan;
        this.no_hp_pelanggan = No_Hp_Pelanggan;
        kotak++;
    }
    
        //membuat getter untuk id_pelanggan
    public String getId_Pelanggan(){
        
        return id_pelanggan;
    }
    
    //membuat getter untuk nama_pelanggan
    public String getPass_pelanggan(){
        
        return pass_pelanggan;
    }
    
    public String getNama_Pelanggan(){
        
        return nama_pelanggan;
    }
    //membuat getter untuk alamat_pelanggan
    public String getAlamat_pelanggan(){
        
        return alamat_pelanggan;
    }
    
    //membuat getter untuk email_pelanggan
    public String getEmail_pelanggan(){
        
        return email_pelanggan;
    }
    
    //membuat getter untuk no_hp_pelanggan
    public String getNo_hp_pelanggan(){
        
        return no_hp_pelanggan;
    }
    
    public static int getKotak(){
        
        return kotak;
    }
    
    //membuat setter untuk id_pelanggan
    public void setId_pelanggan(String Id_Pelanggan){
        
        this.id_pelanggan = Id_Pelanggan;
    }
    
    //membuat setter untuk nama_pelanggan
    public void setPass_pelanggan(String Pass_Pelanggan){
        
        this.pass_pelanggan = Pass_Pelanggan;
    }
    
    public void setNama_pelanggan(String Nama_Pelanggan){
        
        this.nama_pelanggan = Nama_Pelanggan;
    }
    
    //membuat setter untuk alamat_pelanggan
    public void setAlamat_pelanggan(String Alamat_Pelanggan){
        
        this.alamat_pelanggan = Alamat_Pelanggan;
    }
    
    //membuat setter untuk email_pelanggan
    public void setEmail_pelanggan(String Email_Pelanggan){
        
        this.email_pelanggan = Email_Pelanggan;
    }
    
    //membuat setter untuk no_hp_pelanggan
    public void setNo_hp_pelanggan(String No_Hp_Pelanggan){
        
        this.no_hp_pelanggan = No_Hp_Pelanggan;
    }
}
