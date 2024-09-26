/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rose
 */
public class Model_menuTest {
    
    private String nama_menu;
    private int harga_menu;
    private String deskripsi_menu; 
    private String id_menu;
    private String id_kantin;
    
    @Test
    public void TestModel_menu() {
    String nama_menu = "asd";
    int harga_menu =  60000; 
    String deskripsi_menu = "das"; 
    String id_menu = "asd";
    String id_kantin = "la";
    Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);

    assertEquals(id_menu, menu.getId_menu());
    assertEquals(id_kantin, menu.getId_Kantinmenu());
    assertEquals(nama_menu, menu.getNama_Menu());
    assertEquals(harga_menu, menu.getHarga_Menu());
    assertEquals(deskripsi_menu, menu.getDeskripsi_Menu());
    }
    
    @Test
     public void testsetId_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setId_menu("la");
        assertTrue(menu.getId_menu() == "la");
    }
     
     @Test
     public void testSetId_kantinmenu(){
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setId_Kantinmenu("asd");
        assertTrue(menu.getId_Kantinmenu() == "asd");
    }
    
    @Test
    public void testSetNama_Menu(){
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setNama_Menu("la");
        assertTrue(menu.getNama_Menu() == "la");
    }
    
    @Test
    public void testSetHarga_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setHarga_Menu(6000);
        assertTrue(menu.getHarga_Menu() == 6000);
    }
    
    @Test
    public void testSetDeskripsi_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setDeskripsi_Menu("la");
        assertTrue(menu.getDeskripsi_Menu() == "la");
    }
    
    @Test
     public void testGetId_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setId_menu("asd");
        assertTrue(menu.getId_menu() == "asd");
    }
     
     @Test
     public void testGetId_kantinmenu(){
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setId_Kantinmenu("asd");
        assertTrue(menu.getId_Kantinmenu() == "asd");
    }
    
    @Test
    public void testGetNama_Menu(){
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setNama_Menu("la");
        assertTrue(menu.getNama_Menu() == "la");
    }
    
    @Test
    public void testGetHarga_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setHarga_Menu(6000);
        assertTrue(menu.getHarga_Menu() == 6000);
    }
    
    @Test
    public void testGetDeskripsi_menu() {
        Model_menu menu = new Model_menu(id_menu, id_kantin, nama_menu, harga_menu, deskripsi_menu);
        menu.setDeskripsi_Menu("la");
        assertTrue(menu.getDeskripsi_Menu() == "la");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
