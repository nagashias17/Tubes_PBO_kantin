
package Model;


import org.junit.Test;
import static org.junit.Assert.*;

public class Model_kantinTest {
    private String id, nama, pass;
    
    @Test
    public void TestModel_kantin() {
    String Id = "PE004";
    String Nama = "Kantin FKB";
    String Pass = "kantin4";
     Model_kantin kantin = new Model_kantin(id, nama, pass);

    assertEquals(Id, kantin.getId_kantin());
    assertSame(Nama, kantin.getNama_kantin());
    assertSame(Pass, kantin.getPass_kantin());
    }
    
    @Test
     public void testSetId_kantin() {
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setId_kantin("PE004");
        assertTrue(kantin.getId_kantin() == "PE004");
    }
     
     @Test
     public void testSetNama_kantin(){
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setNama_kantin("Kantin FKB");
        assertTrue(kantin.getNama_kantin() == "Kantin FKB");
    }
    
    @Test
    public void testSetPass_kantin(){
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setPass_kantin("kantin4");
        assertTrue(kantin.getPass_kantin() == "kantin4");
    }
    
    @Test
    public void testGetId_kantin() {
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setId_kantin("PE004");
        assertTrue(kantin.getId_kantin() == "PE004");
    }
    
    @Test
    public void testGetNama_kantin() {
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setNama_kantin("Kantin FKB");
        assertTrue(kantin.getNama_kantin() == "Kantin FKB");
    }
    
    @Test
    public void testGetPass_kantin() {
        Model_kantin kantin = new Model_kantin(id, nama, pass);
        kantin.setPass_kantin("kantin4");
        assertTrue(kantin.getPass_kantin() == "kantin4");
    }
}
