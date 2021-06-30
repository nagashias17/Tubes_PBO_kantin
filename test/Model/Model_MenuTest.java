
package Model;


import org.junit.Test;
import static org.junit.Assert.*;


public class Model_MenuTest {
    
     private String Nama_Menu;
    private int Harga_Menu;
    private String Deskripsi_Menu; 
    private String Id_Menu;
    private String Id_Kantin;
    
    @Test
    public void Model_MenuTest() {
    String Nama_menu = "asd";
    int Harga_Menu =  60000; 
    String Deskripsi_Menu = "das"; 
    String Id_Menu = "asd";
    String Id_Kantin = "la";
    Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);

    assertEquals(Id_Menu, Menu.GetId_Menu());
    assertEquals(Id_Kantin, Menu.GetId_Kantin_Menu());
    assertEquals(Nama_Menu, Menu.GetNama_Menu());
    assertEquals(Harga_Menu, Menu.GetHarga_Menu());
    assertEquals(Deskripsi_Menu, Menu.GetDeskripsi_Menu());
    }
    
    @Test
     public void TestSetId_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetId_Menu("la");
        assertTrue(Menu.GetId_Menu() == "la");
    }
     
     @Test
     public void TestSetId_Kantin_Menu(){
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetId_Kantin_Menu("asd");
        assertTrue(Menu.GetId_Kantin_Menu() == "asd");
    }
    
    @Test
    public void TestSetNama_Menu(){
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetNama_Menu("la");
        assertTrue(Menu.GetNama_Menu() == "la");
    }
    
    @Test
    public void TestSetHarga_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetHarga_Menu(6000);
        assertTrue(Menu.GetHarga_Menu() == 6000);
    }
    
    @Test
    public void TestSetDeskripsi_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetDeskripsi_Menu("la");
        assertTrue(Menu.GetDeskripsi_Menu() == "la");
    }
    
    @Test
     public void TestGetId_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetId_Menu("asd");
        assertTrue(Menu.GetId_Menu() == "asd");
    }
     
     @Test
     public void TestGetId_Kantin_Menu(){
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetId_Kantin_Menu("asd");
        assertTrue(Menu.GetId_Kantin_Menu() == "asd");
    }
    
    @Test
    public void TestGetNama_Menu(){
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetNama_Menu("la");
        assertTrue(Menu.GetNama_Menu() == "la");
    }
    
    @Test
    public void TestGetHarga_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetHarga_Menu(6000);
        assertTrue(Menu.GetHarga_Menu() == 6000);
    }
    
    @Test
    public void TestGetDeskripsi_Menu() {
        Model_Menu Menu = new Model_Menu(Id_Menu, Id_Kantin, Nama_Menu, Harga_Menu, Deskripsi_Menu);
        Menu.SetDeskripsi_Menu("la");
        assertTrue(Menu.GetDeskripsi_Menu() == "la");
    }
}
