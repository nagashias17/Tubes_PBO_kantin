
package GUI;

import Database.Koneksi_menu;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_menu;


public class GUI_kantin_updateMenu extends javax.swing.JFrame {


    public List <Model_menu> list;
    public DefaultTableModel modelTable = new DefaultTableModel();
    
    public GUI_kantin_updateMenu() {
        initComponents();
        list = Koneksi_menu.GetDataListMenu();
        setNameColumnTable();
        System.out.println(list.size());
        getDataMenu();
        
    }
    
    public void setNameColumnTable(){
        jTable1.setModel(modelTable);
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

        jTextField1 = new javax.swing.JTextField();
        Panel_menu = new javax.swing.JPanel();
        Label_menu = new javax.swing.JLabel();
        Label_update = new javax.swing.JLabel();
        Label_nama = new javax.swing.JLabel();
        Label_harga = new javax.swing.JLabel();
        Label_rp = new javax.swing.JLabel();
        Label_deskripsi = new javax.swing.JLabel();
        Txt_harga = new javax.swing.JTextField();
        Txt_nama = new javax.swing.JTextField();
        Txt_deskripsi = new javax.swing.JScrollPane();
        TextDeskripsiMenu = new javax.swing.JTextArea();
        logoutButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        Table_menu = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_menu.setBackground(new java.awt.Color(255, 255, 255));

        Label_menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_menu.setForeground(new java.awt.Color(255, 102, 102));
        Label_menu.setText(" Menu");

        Label_update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_update.setForeground(new java.awt.Color(255, 102, 102));
        Label_update.setText("Update Menu");

        Label_nama.setText("Nama Menu");

        Label_harga.setText("Harga Menu");

        Label_rp.setText("Rp.");

        Label_deskripsi.setText("Deskripsi Menu");

        Txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaActionPerformed(evt);
            }
        });

        TextDeskripsiMenu.setColumns(20);
        TextDeskripsiMenu.setRows(5);
        TextDeskripsiMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Txt_deskripsi.setViewportView(TextDeskripsiMenu);

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setText("LogOut");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 102, 102));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(255, 102, 102));
        createButton.setText("Create");
        createButton.setBorder(null);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        Table_menu.setViewportView(jTable1);

        javax.swing.GroupLayout Panel_menuLayout = new javax.swing.GroupLayout(Panel_menu);
        Panel_menu.setLayout(Panel_menuLayout);
        Panel_menuLayout.setHorizontalGroup(
            Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_menuLayout.createSequentialGroup()
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addComponent(Txt_deskripsi)
                    .addGroup(Panel_menuLayout.createSequentialGroup()
                        .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_nama)
                            .addComponent(Label_harga))
                        .addGap(18, 18, 18)
                        .addComponent(Label_rp)
                        .addGap(8, 8, 8)
                        .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_nama)
                            .addComponent(Txt_harga)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(Panel_menuLayout.createSequentialGroup()
                        .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_update)
                            .addComponent(Label_deskripsi))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_menuLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(Label_menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_menuLayout.setVerticalGroup(
            Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Label_menu)
                .addGap(31, 31, 31)
                .addComponent(Table_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_update)
                .addGap(42, 42, 42)
                .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_harga)
                    .addComponent(Txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_rp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_deskripsi)
                .addGap(18, 18, 18)
                .addComponent(Txt_deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        GUI_kantin_createMenu kh = new GUI_kantin_createMenu();
        kh.show();
        dispose();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            String idMenu = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            Koneksi_menu.UpdateDataListMenu(idMenu, Txt_nama.getText(), Integer.parseInt(Txt_harga.getText()), TextDeskripsiMenu.getText());
            JOptionPane.showMessageDialog(null, "Menu berhasil diubah !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            list = Koneksi_menu.GetDataListMenu();
            getDataMenu();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Txt_nama.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        Txt_harga.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        TextDeskripsiMenu.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
           GUI_aplikasi lm = new GUI_aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_kantin_updateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_updateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_updateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_updateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_kantin_updateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_deskripsi;
    private javax.swing.JLabel Label_harga;
    private javax.swing.JLabel Label_menu;
    private javax.swing.JLabel Label_nama;
    private javax.swing.JLabel Label_rp;
    private javax.swing.JLabel Label_update;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JScrollPane Table_menu;
    private javax.swing.JTextArea TextDeskripsiMenu;
    private javax.swing.JScrollPane Txt_deskripsi;
    private javax.swing.JTextField Txt_harga;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JButton createButton;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
