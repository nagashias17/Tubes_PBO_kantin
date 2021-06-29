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
 * @author asus
 */
public class Model_pelangganTest {
    private String id, nama, pass, alamat, email, no_hp;
    
    @Test
    public void Model_pelangganTest() {
    String Id = "PEL004";
    String Nama = "Rizal";
    String Pass = "ZALZAL123";
    String Alamat = "tasik";
    String Email = "rizal@gmail.com";
    String No_hp = "08904826773"   ;     
    Model_pelanggan pelanggan = new Model_pelanggan (id, nama, pass, alamat, email, no_hp);

    assertEquals(Id, pelanggan.getId_Pelanggan());
    assertSame(Nama, pelanggan.getNama_Pelanggan());
    assertSame(Pass, pelanggan.getPass_pelanggan());
    assertSame(Alamat, pelanggan.getAlamat_pelanggan());
    assertSame(Email, pelanggan.getEmail_pelanggan());
    assertSame(No_hp, pelanggan.getNo_hp_pelanggan());
    }
    
    @Test
     public void testsetId_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setId_pelanggan("PEL004");
        assertTrue(pelanggan.getId_Pelanggan() == "PEL004");
    }
     
     @Test
     public void testsetPass_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setPass_pelanggan("ZALZAL123");
        assertTrue(pelanggan.getPass_pelanggan() == "ZALZAL123");
    }
     
         @Test
     public void testsetNama_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setNama_pelanggan("Rizal");
        assertTrue(pelanggan.getNama_Pelanggan() == "Rizal");
    }
     
         @Test
     public void testsetAlamat_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setAlamat_pelanggan("tasik");
        assertTrue(pelanggan.getAlamat_pelanggan() == "tasik");
    }
     
         @Test
     public void testsetEmail_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setEmail_pelanggan("rizal@gmail.com");
        assertTrue(pelanggan.getEmail_pelanggan() == "rizal@gmail.com");
    }
     
         @Test
     public void testsetNo_hp_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setNo_hp_pelanggan("08904826773");
        assertTrue(pelanggan.getNo_hp_pelanggan() == "08904826773");
    }
     
    @Test
    public void testgetId_Pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setId_pelanggan("PEL004");
        assertTrue(pelanggan.getId_Pelanggan() == "PEL004");
    }
    
       @Test
    public void testgetPass_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setPass_pelanggan("ZALZAL123");
        assertTrue(pelanggan.getPass_pelanggan() == "ZALZAL123");
    }
    
        @Test
    public void testgetNama_Pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setNama_pelanggan("Rizal");
        assertTrue(pelanggan.getNama_Pelanggan() == "Rizal");
    }
    
        @Test
    public void testgetAlamat_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setAlamat_pelanggan("tasik");
        assertTrue(pelanggan.getAlamat_pelanggan() == "tasik");
    }
    
        @Test
    public void testgetEmail_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setEmail_pelanggan("rizal@gmail.com");
        assertTrue(pelanggan.getEmail_pelanggan() == "rizal@gmail.com");
    }
    
        @Test
    public void testgetNo_hp_pelanggan() {
        Model_pelanggan pelanggan = new Model_pelanggan(id, nama, pass, alamat, email, no_hp);
        pelanggan.setNo_hp_pelanggan("08904826773");
        assertTrue(pelanggan.getNo_hp_pelanggan() == "08904826773");
    }
    
}