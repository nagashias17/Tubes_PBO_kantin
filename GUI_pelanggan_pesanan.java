package GUI;


import Database.Koneksi_pesanan;
import Database.Koneksi_kantin;
import Database.Koneksi_menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_kantin;
import Model.Model_menu;
import Model.Model_pesanan;


public class GUI_pelanggan_pesanan extends javax.swing.JFrame {

    public List <Model_menu> listMenu;
    public List <Model_kantin> listKantin;
    public List <Model_pesanan> listOrder;
    
    public DefaultTableModel modelTable = new DefaultTableModel();
    public DefaultTableModel modelTable1 = new DefaultTableModel();
    public DefaultTableModel modelTable2 = new DefaultTableModel();
    public String kodeKantin;
    public int indexMenu;
    
    
    public GUI_pelanggan_pesanan() {
        initComponents();
        listKantin = Koneksi_kantin.GetDataKantin();
        listMenu = Koneksi_menu.GetDataListMenu();
        listOrder = Koneksi_pesanan.GetDataOrder();
        
        setNameColumnTableKantin();
        setNameColumnTabelMenu();
        setNameColumnTabelOrder();
        getDataTabelKantin();
        
    }

     public void setNameColumnTableKantin(){
        TableKantin.setModel(modelTable);
        modelTable.addColumn("Id Kantin");
        modelTable.addColumn("Nama Kantin");
    }
     
      public void getDataTabelKantin(){
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        try{
           Object[] obj = new Object[2];
           for (int i = 0 ; i < listKantin.size();i++){
               obj[0] = listKantin.get(i).getId_kantin();
               obj[1] = listKantin.get(i).getNama_kantin();

               modelTable.addRow(obj);
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
      }
     
      
      public void setNameColumnTabelMenu(){
        TableMenu.setModel(modelTable1);
        modelTable1.addColumn("Id Menu");
        modelTable1.addColumn("Id Kantin");
        modelTable1.addColumn("Nama Menu");
        modelTable1.addColumn("Harga");
        modelTable1.addColumn("Deskripsi");
    }
      
      

      public void getDataTabelMenu(){
        modelTable1.getDataVector().removeAllElements();
        modelTable1.fireTableDataChanged();
        
        try{
           Object[] ob = new Object[5];
           for (int i = 0 ; i < listMenu.size();i++){
              if (kodeKantin.intern() == listMenu.get(i).getId_Kantinmenu().intern()) {
                  ob[0] = listMenu.get(i).getId_menu();
                  ob[1] = listMenu.get(i).getId_Kantinmenu();
                  ob[2] = listMenu.get(i).getNama_Menu();
                  ob[3] = listMenu.get(i).getHarga_Menu();
                  ob[4] = listMenu.get(i).getDeskripsi_Menu();
                  modelTable1.addRow(ob);
              }
               
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
      }
      
      public void setNameColumnTabelOrder(){
        TabelKeranjang.setModel(modelTable2);
        modelTable2.addColumn("Id Order");
        modelTable2.addColumn("Id Menu");
        modelTable2.addColumn("Nama Menu");
        modelTable2.addColumn("Harga");
    }
      
      public void getDataTabelOrder(){
        modelTable2.getDataVector().removeAllElements();
        modelTable2.fireTableDataChanged();
        
        try{
           Object[] o = new Object[4];
           for (int i = 0 ; i < listOrder.size();i++){
               o[0] = listOrder.get(i).getId_order();
               o[1] = listOrder.get(i).getIdMenu();
               o[2] = listOrder.get(i).getNama_menu();
               o[3] = listMenu.get(i).getHarga_Menu();
               modelTable2.addRow(o);
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
      }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        Panel_pesanan = new javax.swing.JPanel();
        Label_kantin = new javax.swing.JLabel();
        Label_menu = new javax.swing.JLabel();
        Tabel_kantin = new javax.swing.JScrollPane();
        TableKantin = new javax.swing.JTable();
        Table_menu = new javax.swing.JScrollPane();
        TableMenu = new javax.swing.JTable();
        Panel_checkout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        Table_keranjang = new javax.swing.JScrollPane();
        TabelKeranjang = new javax.swing.JTable();
        keranjangButton = new javax.swing.JButton();
        PesanButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        Label_id = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_pesanan.setBackground(new java.awt.Color(255, 255, 255));
        Panel_pesanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_kantin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_kantin.setForeground(new java.awt.Color(255, 102, 102));
        Label_kantin.setText("Daftar Kantin");

        Label_menu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_menu.setForeground(new java.awt.Color(255, 102, 102));
        Label_menu.setText("Daftar Menu");

        TableKantin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableKantin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableKantinMousePressed(evt);
            }
        });
        Tabel_kantin.setViewportView(TableKantin);

        TableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableMenuMousePressed(evt);
            }
        });
        Table_menu.setViewportView(TableMenu);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Keranjang");

        DeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(null);
        DeleteButton.setMaximumSize(new java.awt.Dimension(127, 17));
        DeleteButton.setMinimumSize(new java.awt.Dimension(127, 17));
        DeleteButton.setPreferredSize(new java.awt.Dimension(127, 17));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        TabelKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_keranjang.setViewportView(TabelKeranjang);

        keranjangButton.setBackground(new java.awt.Color(255, 102, 102));
        keranjangButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keranjangButton.setText("Tambah ke Keranjang");
        keranjangButton.setBorder(null);
        keranjangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keranjangButtonActionPerformed(evt);
            }
        });

        PesanButton.setBackground(new java.awt.Color(255, 102, 102));
        PesanButton.setText("Pesan");
        PesanButton.setBorder(null);
        PesanButton.setMaximumSize(new java.awt.Dimension(127, 17));
        PesanButton.setMinimumSize(new java.awt.Dimension(127, 17));
        PesanButton.setPreferredSize(new java.awt.Dimension(127, 17));
        PesanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanButtonActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(255, 102, 102));
        LogOutButton.setText("LogOut");
        LogOutButton.setBorder(null);
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_checkoutLayout = new javax.swing.GroupLayout(Panel_checkout);
        Panel_checkout.setLayout(Panel_checkoutLayout);
        Panel_checkoutLayout.setHorizontalGroup(
            Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_checkoutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_checkoutLayout.createSequentialGroup()
                        .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(keranjangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_checkoutLayout.createSequentialGroup()
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PesanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Table_keranjang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_checkoutLayout.setVerticalGroup(
            Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keranjangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Table_keranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_id.setText("ID Order ");

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_pesananLayout = new javax.swing.GroupLayout(Panel_pesanan);
        Panel_pesanan.setLayout(Panel_pesananLayout);
        Panel_pesananLayout.setHorizontalGroup(
            Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_pesananLayout.createSequentialGroup()
                .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_pesananLayout.createSequentialGroup()
                        .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_pesananLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(Label_id)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_pesananLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_kantin)
                                    .addComponent(Label_menu)
                                    .addComponent(Tabel_kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_pesananLayout.setVerticalGroup(
            Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_pesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_kantin)
                .addGap(30, 30, 30)
                .addComponent(Tabel_kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Label_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_id)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Panel_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel_pesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keranjangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keranjangButtonActionPerformed
        try {
          
        Koneksi_pesanan.InsertOrder(Txt_id.getText(), TableMenu.getValueAt(indexMenu,0).toString(), TableMenu.getValueAt(indexMenu,2).toString(), Integer.parseInt(TableMenu.getValueAt(indexMenu,3).toString()));
        JOptionPane.showMessageDialog(null, "Berhasiil menambahkan " + TableMenu.getValueAt(indexMenu,2).toString() ,
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        listOrder = Koneksi_pesanan.GetDataOrder();
        getDataTabelOrder();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_keranjangButtonActionPerformed

    private void TableKantinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKantinMousePressed
        kodeKantin =  TableKantin.getValueAt(TableKantin.getSelectedRow(),0).toString();
        getDataTabelMenu();
    }//GEN-LAST:event_TableKantinMousePressed

    private void TableMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMenuMousePressed
       indexMenu = TableMenu.getSelectedRow();
    }//GEN-LAST:event_TableMenuMousePressed

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String idOrder = TabelKeranjang.getValueAt(TabelKeranjang.getSelectedRow(),0).toString();
        Koneksi_pesanan.DeleteDataOrder(Txt_id.getText(), TableMenu.getValueAt(indexMenu,0).toString(), TableMenu.getValueAt(indexMenu,2).toString(), Integer.parseInt(TableMenu.getValueAt(indexMenu,3).toString()));
        JOptionPane.showMessageDialog(null, "Menu berhasil dihapus !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
        listOrder = Koneksi_pesanan.GetDataOrder();
        getDataTabelOrder();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        GUI_aplikasi lm = new GUI_aplikasi();
        lm.show();
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void PesanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Pesanan Sedang diproses !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_PesanButtonActionPerformed


    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_pelanggan_pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_kantin;
    private javax.swing.JLabel Label_menu;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JPanel Panel_checkout;
    private javax.swing.JPanel Panel_pesanan;
    private javax.swing.JButton PesanButton;
    private javax.swing.JTable TabelKeranjang;
    private javax.swing.JScrollPane Tabel_kantin;
    private javax.swing.JTable TableKantin;
    private javax.swing.JTable TableMenu;
    private javax.swing.JScrollPane Table_keranjang;
    private javax.swing.JScrollPane Table_menu;
    private javax.swing.JTextField Txt_id;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton keranjangButton;
    // End of variables declaration//GEN-END:variables
}
