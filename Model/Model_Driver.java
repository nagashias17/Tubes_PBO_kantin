
package Model;


public class Model_Driver {
    
    private String Id_Driver;
    private String Pass_Driver;
    private String Nama_Driver;
    private String No_Hp_Driver;
    
    public Model_Driver(String Id_Driver, String Pass_Driver, String Nama_Driver, String No_Hp_Driver){
        
        this.Id_Driver = Id_Driver;
        this.Nama_Driver = Nama_Driver;
        this.Pass_Driver = Pass_Driver;
        this.No_Hp_Driver = No_Hp_Driver;
    }
    
    public String GetId_Driver(){
        
        return Id_Driver;
    }
    
    public String GetPass_Driver(){
        
        return Pass_Driver;
    }
    
    public String GetNama_Driver(){
        
        return Nama_Driver;
    }
    
    public String GetNo_Hp_Driver(){
        
        return No_Hp_Driver;
    }
    
    public void SetId_Driver(String Id_Driver){
        
        this.Id_Driver = Id_Driver;
    }
    
    public void SetPass_Driver(String Pass_Driver){
        
        this.Pass_Driver = Pass_Driver;
    }
    
    public void SetNama_Driver(String Nama_Driver){
        
        this.Nama_Driver = Nama_Driver;
    }
    
    public void SetNo_Hp_Driver(String No_Hp_Driver){
        
        this.No_Hp_Driver = No_Hp_Driver;
    }
}
