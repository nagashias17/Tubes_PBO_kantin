
package GUI;

import Database.Koneksi_menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_menu;

public class GUI_kantin_createMenu extends javax.swing.JFrame {

    public List <Model_menu> list;
    public DefaultTableModel modelTable = new DefaultTableModel();
    
    public GUI_kantin_createMenu() {
        initComponents();
        list = Koneksi_menu.GetDataListMenu();
        setNameColumnTable();
        System.out.println(list.size());
        getDataMenu();
    }

    public void setNameColumnTable(){
        TableMenu.setModel(modelTable);
        modelTable.addColumn("Id Menu");
        modelTable.addColumn("Id Kantin");
        modelTable.addColumn("Nama Menu");
        modelTable.addColumn("Harga");
        modelTable.addColumn("Deskripsi");
    }
    
        public void getDataMenu(){
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        try{
           Object[] obj = new Object[5];
           for (int i = 0 ; i < list.size();i++){
               obj[0] = list.get(i).getId_menu();
               obj[1] = list.get(i).getId_Kantinmenu();
               obj[2] = list.get(i).getNama_Menu();
               obj[3] = list.get(i).getHarga_Menu();
               obj[4] = list.get(i).getDeskripsi_Menu();
               modelTable.addRow(obj);
           }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_menu = new javax.swing.JPanel();
        Label_menu = new javax.swing.JLabel();
        Table_menu = new javax.swing.JScrollPane();
        TableMenu = new javax.swing.JTable();
        Panel_create = new javax.swing.JPanel();
        Panel_create1 = new javax.swing.JPanel();
        Label_nama = new javax.swing.JLabel();
        Txt_nama = new javax.swing.JTextField();
        Label_harga = new javax.swing.JLabel();
        Label_rp = new javax.swing.JLabel();
        Txt_harga = new javax.swing.JTextField();
        Label_deskripsi = new javax.swing.JLabel();
        CreateButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        Txt_deskripsi = new javax.swing.JScrollPane();
        TextDeskripsiMenu = new javax.swing.JTextArea();
        label_id_menu = new javax.swing.JLabel();
        Txt_id_menu = new javax.swing.JTextField();
        LogOutButton = new javax.swing.JButton();
        Txt_id_kantin = new javax.swing.JTextField();
        label_id_kantin = new javax.swing.JLabel();
        Label_create = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_menu.setForeground(new java.awt.Color(255, 102, 102));
        Label_menu.setText("Menu");

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
        TableMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TableMenuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMenuMouseClicked(evt);
            }
        });
        Table_menu.setViewportView(TableMenu);

        javax.swing.GroupLayout Panel_menuLayout = new javax.swing.GroupLayout(Panel_menu);
        Panel_menu.setLayout(Panel_menuLayout);
        Panel_menuLayout.setHorizontalGroup(
            Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Panel_menuLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(Label_menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_menuLayout.setVerticalGroup(
            Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_menuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Label_menu)
                .addGap(18, 18, 18)
                .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Label_nama.setText("Nama Menu");

        Txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaActionPerformed(evt);
            }
        });

        Label_harga.setText("Harga Menu");

        Label_rp.setText("Rp.");

        Txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_hargaActionPerformed(evt);
            }
        });

        Label_deskripsi.setText("Deskripsi Menu");

        CreateButton.setBackground(new java.awt.Color(255, 102, 102));
        CreateButton.setText("Create");
        CreateButton.setBorder(null);
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(255, 102, 102));
        UpdateButton.setText("Update");
        UpdateButton.setBorder(null);
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        TextDeskripsiMenu.setColumns(20);
        TextDeskripsiMenu.setRows(5);
        TextDeskripsiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Txt_deskripsi.setViewportView(TextDeskripsiMenu);

        label_id_menu.setText("ID Menu");

        Txt_id_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_id_menuActionPerformed(evt);
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

        Txt_id_kantin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_id_kantinActionPerformed(evt);
            }
        });

        label_id_kantin.setText("ID Kantin");

        javax.swing.GroupLayout Panel_create1Layout = new javax.swing.GroupLayout(Panel_create1);
        Panel_create1.setLayout(Panel_create1Layout);
        Panel_create1Layout.setHorizontalGroup(
            Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_create1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_create1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_create1Layout.createSequentialGroup()
                        .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_create1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
                            .addComponent(Txt_deskripsi)
                            .addGroup(Panel_create1Layout.createSequentialGroup()
                                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_id_menu)
                                    .addComponent(label_id_kantin))
                                .addGap(56, 56, 56)
                                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_id_kantin)
                                    .addComponent(Txt_id_menu)))
                            .addGroup(Panel_create1Layout.createSequentialGroup()
                                .addComponent(Label_nama)
                                .addGap(44, 44, 44)
                                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_harga, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_nama)))
                            .addGroup(Panel_create1Layout.createSequentialGroup()
                                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_deskripsi)
                                    .addGroup(Panel_create1Layout.createSequentialGroup()
                                        .addComponent(Label_harga)
                                        .addGap(18, 18, 18)
                                        .addComponent(Label_rp)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        Panel_create1Layout.setVerticalGroup(
            Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_create1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id_menu)
                    .addComponent(Txt_id_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_id_kantin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_id_kantin))
                .addGap(14, 14, 14)
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_harga)
                    .addComponent(Label_rp)
                    .addComponent(Txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_deskripsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_create1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Label_create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_create.setForeground(new java.awt.Color(255, 102, 102));
        Label_create.setText("Tambah Menu");

        javax.swing.GroupLayout Panel_createLayout = new javax.swing.GroupLayout(Panel_create);
        Panel_create.setLayout(Panel_createLayout);
        Panel_createLayout.setHorizontalGroup(
            Panel_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_createLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_create1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_createLayout.createSequentialGroup()
                        .addComponent(Label_create)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_createLayout.setVerticalGroup(
            Panel_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_createLayout.createSequentialGroup()
                .addComponent(Label_create)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_create1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_hargaActionPerformed

    }//GEN-LAST:event_Txt_hargaActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
           GUI_kantin_updateMenu up = new GUI_kantin_updateMenu();
           up.show();
           dispose();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
         try {
        Koneksi_menu.InsertDataListMenu(Txt_id_menu.getText(), Txt_id_kantin.getText(),Txt_nama.getText(), Integer.parseInt(Txt_harga.getText()), TextDeskripsiMenu.getText());
        JOptionPane.showMessageDialog(null, "Menu berhasil ditambahkan !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            list = Koneksi_menu.GetDataListMenu();
            getDataMenu();
            
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menu yang ada tambahkan sudah ada !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void Txt_id_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_id_menuActionPerformed

    }//GEN-LAST:event_Txt_id_menuActionPerformed

    private void TableMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TableMenuAncestorAdded

    }//GEN-LAST:event_TableMenuAncestorAdded

    private void TableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMenuMouseClicked

    }//GEN-LAST:event_TableMenuMouseClicked

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
           GUI_aplikasi lm = new GUI_aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void Txt_id_kantinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_id_kantinActionPerformed

    }//GEN-LAST:event_Txt_id_kantinActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_kantin_createMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_createMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_createMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_createMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_kantin_createMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel Label_create;
    private javax.swing.JLabel Label_deskripsi;
    private javax.swing.JLabel Label_harga;
    private javax.swing.JLabel Label_menu;
    private javax.swing.JLabel Label_nama;
    private javax.swing.JLabel Label_rp;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JPanel Panel_create;
    private javax.swing.JPanel Panel_create1;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JTable TableMenu;
    private javax.swing.JScrollPane Table_menu;
    private javax.swing.JTextArea TextDeskripsiMenu;
    private javax.swing.JScrollPane Txt_deskripsi;
    private javax.swing.JTextField Txt_harga;
    private javax.swing.JTextField Txt_id_kantin;
    private javax.swing.JTextField Txt_id_menu;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel label_id_kantin;
    private javax.swing.JLabel label_id_menu;
    // End of variables declaration//GEN-END:variables
}
