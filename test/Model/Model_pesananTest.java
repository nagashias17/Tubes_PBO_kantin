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
 * @author amandadinta
 */
public class Model_pesananTest {
    private String id_order;
    private String id_menu;
    private String nama_menu;
    private int total_harga;
    
    private void Model_pesananTest(){
        String id_order = "IC01";
        String id_menu = "C01";
        String nama_menu = "Ice Cream";
        int total_harga = 6000;
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        
        assertEquals(id_order, pesanan.getId_order());
        assertEquals(id_menu, pesanan.getIdMenu());
        assertEquals(nama_menu, pesanan.getNama_menu());
        assertEquals(total_harga, pesanan.getTotal_harga());
    }
    
    @Test
    public void testGetId_order() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setId_order("IC01");
        assertTrue(pesanan.getId_order() == "IC01");
    }

    /**
     * Test of getIdMenu method, of class Model_pesanan.
     */
    @Test
    public void testGetIdMenu() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setIdMenu("C01");
        assertTrue(pesanan.getIdMenu() == "C01");
    }

    /**
     * Test of getNama_menu method, of class Model_pesanan.
     */
    @Test
    public void testGetNama_menu() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setNama_menu("Ice Cream");
        assertTrue(pesanan.getNama_menu() == "Ice Cream");
    }

    /**
     * Test of getTotal_harga method, of class Model_pesanan.
     */
    @Test
    public void testGetTotal_harga() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setTotal_harga(6000);
        assertTrue(pesanan.getTotal_harga() == 6000);
    }

    /**
     * Test of setId_order method, of class Model_pesanan.
     */
    @Test
    public void testSetId_order() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setId_order("IC01");
        assertTrue(pesanan.getId_order() == "IC01");
    }

    /**
     * Test of setIdMenu method, of class Model_pesanan.
     */
    @Test
    public void testSetIdMenu() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setIdMenu("C01");
        assertTrue(pesanan.getIdMenu() == "C01");
    }

    /**
     * Test of setNama_menu method, of class Model_pesanan.
     */
    @Test
    public void testSetNama_menu() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setNama_menu("Ice Cream");
        assertTrue(pesanan.getNama_menu() == "Ice Cream");
    }

    /**
     * Test of setTotal_harga method, of class Model_pesanan.
     */
    @Test
    public void testSetTotal_harga() {
        Model_pesanan pesanan = new Model_pesanan(id_order, id_menu, nama_menu, total_harga);
        pesanan.setTotal_harga(6000);
        assertTrue(pesanan.getTotal_harga() == 6000);
    }
    
}
