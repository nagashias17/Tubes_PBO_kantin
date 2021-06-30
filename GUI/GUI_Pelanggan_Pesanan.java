package GUI;


import Database.Koneksi_Pesanan;
import Database.Koneksi_Kantin;
import Database.Koneksi_Menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_Kantin;
import Model.Model_Menu;
import Model.Model_Pesanan;


public class GUI_Pelanggan_Pesanan extends javax.swing.JFrame {

    public List <Model_Menu> List_Menu;
    public List <Model_Kantin> List_Kantin;
    public List <Model_Pesanan> List_Order;
    
    public DefaultTableModel Model_Table = new DefaultTableModel();
    public DefaultTableModel Model_Table1 = new DefaultTableModel();
    public DefaultTableModel Model_Table2 = new DefaultTableModel();
    public String kodeKantin;
    public int indexMenu;
    
    
    public GUI_Pelanggan_Pesanan() {
        initComponents();
        List_Kantin = Koneksi_Kantin.GetData_Kantin();
        List_Menu = Koneksi_Menu.GetData_List_Menu();
        List_Order = Koneksi_Pesanan.GetData_Order();
        
        SetName_Column_Table_Kantin();
        SetName_Column_Tabel_Menu();
        SetName_Column_Tabel_Order();
        GetData_Tabel_Kantin();
        
    }

     public void SetName_Column_Table_Kantin(){
        Table_Kantin.setModel(Model_Table);
        Model_Table.addColumn("Id Kantin");
        Model_Table.addColumn("Nama Kantin");
    }
     
      public void GetData_Tabel_Kantin(){
        Model_Table.getDataVector().removeAllElements();
        Model_Table.fireTableDataChanged();
        
        try{
           Object[] obj = new Object[2];
           for (int i = 0 ; i < List_Kantin.size();i++){
               obj[0] = List_Kantin.get(i).GetId_Kantin();
               obj[1] = List_Kantin.get(i).GetNama_Kantin();

               Model_Table.addRow(obj);
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
      }
     
      
      public void SetName_Column_Tabel_Menu(){
        Table_Menu.setModel(Model_Table1);
        Model_Table1.addColumn("Id Menu");
        Model_Table1.addColumn("Id Kantin");
        Model_Table1.addColumn("Nama Menu");
        Model_Table1.addColumn("Harga");
        Model_Table1.addColumn("Deskripsi");
    }
      
      

      public void GetData_Tabel_Menu(){
        Model_Table1.getDataVector().removeAllElements();
        Model_Table1.fireTableDataChanged();
        
        try{
           Object[] ob = new Object[5];
           for (int i = 0 ; i < List_Menu.size();i++){
              if (kodeKantin.intern() == List_Menu.get(i).GetId_Kantin_Menu().intern()) {
                  ob[0] = List_Menu.get(i).GetId_Menu();
                  ob[1] = List_Menu.get(i).GetId_Kantin_Menu();
                  ob[2] = List_Menu.get(i).GetNama_Menu();
                  ob[3] = List_Menu.get(i).GetHarga_Menu();
                  ob[4] = List_Menu.get(i).GetDeskripsi_Menu();
                  Model_Table1.addRow(ob);
              }
               
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
      }
      
      public void SetName_Column_Tabel_Order(){
        Tabel_Keranjang.setModel(Model_Table2);
        Model_Table2.addColumn("Id Order");
        Model_Table2.addColumn("Id Menu");
        Model_Table2.addColumn("Nama Menu");
        Model_Table2.addColumn("Harga");
    }
      
      public void GetData_Tabel_Order(){
        Model_Table2.getDataVector().removeAllElements();
        Model_Table2.fireTableDataChanged();
        
        try{
           Object[] o = new Object[4];
           for (int i = 0 ; i < List_Order.size();i++){
               o[0] = List_Order.get(i).GetId_Order();
               o[1] = List_Order.get(i).GetId_Menu_Order();
               o[2] = List_Order.get(i).GetNama_Menu();
               o[3] = List_Menu.get(i).GetHarga_Menu();
               Model_Table2.addRow(o);
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
        Label_Kantin = new javax.swing.JLabel();
        Label_Menu = new javax.swing.JLabel();
        Tabel_kantin = new javax.swing.JScrollPane();
        Table_Kantin = new javax.swing.JTable();
        Table_menu = new javax.swing.JScrollPane();
        Table_Menu = new javax.swing.JTable();
        Panel_checkout = new javax.swing.JPanel();
        Label_Keranjang = new javax.swing.JLabel();
        Delete_Button = new javax.swing.JButton();
        Table_keranjang = new javax.swing.JScrollPane();
        Tabel_Keranjang = new javax.swing.JTable();
        Tambah_Keranjang_Button = new javax.swing.JButton();
        Pesan_Button = new javax.swing.JButton();
        Logout_Button = new javax.swing.JButton();
        Label_Id = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_pesanan.setBackground(new java.awt.Color(255, 255, 255));
        Panel_pesanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_Kantin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Kantin.setForeground(new java.awt.Color(255, 102, 102));
        Label_Kantin.setText("Daftar Kantin");

        Label_Menu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Menu.setForeground(new java.awt.Color(255, 102, 102));
        Label_Menu.setText("Daftar Menu");

        Table_Kantin.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Kantin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_KantinMousePressed(evt);
            }
        });
        Tabel_kantin.setViewportView(Table_Kantin);

        Table_Menu.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_MenuMousePressed(evt);
            }
        });
        Table_menu.setViewportView(Table_Menu);

        Label_Keranjang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Keranjang.setForeground(new java.awt.Color(255, 102, 102));
        Label_Keranjang.setText("Keranjang");

        Delete_Button.setBackground(new java.awt.Color(255, 102, 102));
        Delete_Button.setText("Delete");
        Delete_Button.setBorder(null);
        Delete_Button.setMaximumSize(new java.awt.Dimension(127, 17));
        Delete_Button.setMinimumSize(new java.awt.Dimension(127, 17));
        Delete_Button.setPreferredSize(new java.awt.Dimension(127, 17));
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Tabel_Keranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_keranjang.setViewportView(Tabel_Keranjang);

        Tambah_Keranjang_Button.setBackground(new java.awt.Color(255, 102, 102));
        Tambah_Keranjang_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tambah_Keranjang_Button.setText("Tambah ke Keranjang");
        Tambah_Keranjang_Button.setBorder(null);
        Tambah_Keranjang_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_Keranjang_ButtonActionPerformed(evt);
            }
        });

        Pesan_Button.setBackground(new java.awt.Color(255, 102, 102));
        Pesan_Button.setText("Pesan");
        Pesan_Button.setBorder(null);
        Pesan_Button.setMaximumSize(new java.awt.Dimension(127, 17));
        Pesan_Button.setMinimumSize(new java.awt.Dimension(127, 17));
        Pesan_Button.setPreferredSize(new java.awt.Dimension(127, 17));
        Pesan_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesan_ButtonActionPerformed(evt);
            }
        });

        Logout_Button.setBackground(new java.awt.Color(255, 102, 102));
        Logout_Button.setText("LogOut");
        Logout_Button.setBorder(null);
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
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
                        .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_checkoutLayout.createSequentialGroup()
                        .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Label_Keranjang))
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(Tambah_Keranjang_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_checkoutLayout.createSequentialGroup()
                                        .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Pesan_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Table_keranjang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_checkoutLayout.setVerticalGroup(
            Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_checkoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tambah_Keranjang_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Keranjang)
                .addGap(18, 18, 18)
                .addComponent(Table_keranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Panel_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesan_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label_Id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Label_Id.setText("ID Order ");

        Txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdActionPerformed(evt);
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
                                .addComponent(Label_Id)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_pesananLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Kantin)
                                    .addComponent(Label_Menu)
                                    .addComponent(Tabel_kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_pesananLayout.setVerticalGroup(
            Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_pesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Kantin)
                .addGap(30, 30, 30)
                .addComponent(Tabel_kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Label_Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Panel_pesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Id)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void Tambah_Keranjang_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_Keranjang_ButtonActionPerformed
        try {
          
        Koneksi_Pesanan.InsertData_Order(Txt_Id.getText(), Table_Menu.getValueAt(indexMenu,0).toString(), Table_Menu.getValueAt(indexMenu,2).toString(), Integer.parseInt(Table_Menu.getValueAt(indexMenu,3).toString()));
        JOptionPane.showMessageDialog(null, "Berhasiil menambahkan " + Table_Menu.getValueAt(indexMenu,2).toString() ,
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        List_Order = Koneksi_Pesanan.GetData_Order();
        GetData_Tabel_Order();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Tambah_Keranjang_ButtonActionPerformed

    private void Table_KantinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_KantinMousePressed
        kodeKantin =  Table_Kantin.getValueAt(Table_Kantin.getSelectedRow(),0).toString();
        GetData_Tabel_Menu();
    }//GEN-LAST:event_Table_KantinMousePressed

    private void Table_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_MenuMousePressed
       indexMenu = Table_Menu.getSelectedRow();
    }//GEN-LAST:event_Table_MenuMousePressed

    private void Txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdActionPerformed

    }//GEN-LAST:event_Txt_IdActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        String idOrder = Tabel_Keranjang.getValueAt(Tabel_Keranjang.getSelectedRow(),0).toString();
        Koneksi_Pesanan.DeleteData_Order(Txt_Id.getText(), Table_Menu.getValueAt(indexMenu,0).toString(), Table_Menu.getValueAt(indexMenu,2).toString(), Integer.parseInt(Table_Menu.getValueAt(indexMenu,3).toString()));
        JOptionPane.showMessageDialog(null, "Menu berhasil dihapus !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
        List_Order = Koneksi_Pesanan.GetData_Order();
        GetData_Tabel_Order();
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        GUI_Aplikasi lm = new GUI_Aplikasi();
        lm.show();
        dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed

    private void Pesan_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesan_ButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Pesanan Sedang diproses !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Pesan_ButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Pelanggan_Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Kantin;
    private javax.swing.JLabel Label_Keranjang;
    private javax.swing.JLabel Label_Menu;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel Panel_checkout;
    private javax.swing.JPanel Panel_pesanan;
    private javax.swing.JButton Pesan_Button;
    private javax.swing.JTable Tabel_Keranjang;
    private javax.swing.JScrollPane Tabel_kantin;
    private javax.swing.JTable Table_Kantin;
    private javax.swing.JTable Table_Menu;
    private javax.swing.JScrollPane Table_keranjang;
    private javax.swing.JScrollPane Table_menu;
    private javax.swing.JButton Tambah_Keranjang_Button;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
