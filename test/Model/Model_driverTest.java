/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rizal Syalman
 */
public class Model_driverTest {
    
    private String id, nama, pass, no_hp;
    
    @Test
    public void Model_driverTest() {
    String id_driver = "DR001";
    String nama_driver = "Asep";
    String pass_driver = "driver1";
    String no_hp_driver = "087123456789";
     Model_driver driver = new Model_driver(id, nama, pass, no_hp);

    assertEquals(id_driver, driver.getId_driver());
    assertSame(nama_driver, driver.getNama_driver());
    assertSame(pass_driver, driver.getPass_driver());
    assertSame(no_hp_driver, driver.getNo_hp_driver());
    }
    
    @Test
     public void testsetId_driver() {
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setId_driver("DR001");
        assertTrue(driver.getId_driver() == "DR001");
    }
     
     @Test
     public void testsetNama_driver(){
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setNama_driver("Asep");
        assertTrue(driver.getNama_driver() == "Asep");
    }
    
    @Test
    public void testsetPass_driver(){
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setPass_driver("driver1");
        assertTrue(driver.getPass_driver() == "driver1");
    }
    
    @Test
    public void testsetNo_hp_driver(){
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setNo_hp_driver("087123456789");
        assertTrue(driver.getNo_hp_driver()=="087123456789");
    }
    @Test
    public void testGetId_driver() {
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setId_driver("DR001");
        assertTrue(driver.getId_driver() == "DR001");
    }
    
    @Test
    public void testGetNama_driver() {
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setNama_driver("Asep");
        assertTrue(driver.getNama_driver() == "Asep");
    }
    
    @Test
    public void testGetPass_driver() {
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setPass_driver("driver1");
        assertTrue(driver.getPass_driver() == "driver1");
    }
    
    @Test
    public void testGetNo_hp_driver(){
        Model_driver driver = new Model_driver(id, nama, pass, no_hp);
        driver.setNo_hp_driver("087123456789");
        assertTrue(driver.getNo_hp_driver()=="087123456789");
    }
}
