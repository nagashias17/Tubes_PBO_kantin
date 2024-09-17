

package Model;


public class Model_kantin {
    
    private String id_kantin;
    private String nama_kantin;
    private String pass_kantin;

    
    public Model_kantin(String Id_Kantin, String Nama_Kantin, String Pass_Kantin){
        
        this.id_kantin = Id_Kantin;
        this.nama_kantin = Nama_Kantin;
        this.pass_kantin = Pass_Kantin;
    }
    
    public String getId_kantin(){
        
        return id_kantin;
    }
    
    public String getNama_kantin(){
        return nama_kantin;
    }
    
    public String getPass_kantin(){
        
        return pass_kantin;
    }
    
    public void setId_kantin(String Id_Kantin){
        
        id_kantin = Id_Kantin;
    }
    
    public void setNama_kantin(String Nama_Kantin){
        
        nama_kantin = Nama_Kantin;
    }
    
    public void setPass_kantin(String Pass_Kantin){
        
        pass_kantin = Pass_Kantin;
    }
}
