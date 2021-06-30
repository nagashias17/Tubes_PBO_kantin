
package GUI;

import Database.Koneksi_Menu;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_Menu;


public class GUI_Kantin_Update_Menu extends javax.swing.JFrame {


    public List <Model_Menu> List;
    public DefaultTableModel Model_Table = new DefaultTableModel();
    
    public GUI_Kantin_Update_Menu() {
        initComponents();
        List = Koneksi_Menu.GetData_List_Menu();
        SetName_Column_Table();
        System.out.println(List.size());
        GetData_Menu();
        
    }
    
    public void SetName_Column_Table(){
        Tabel_Menu.setModel(Model_Table);
        Model_Table.addColumn("Id Menu");
        Model_Table.addColumn("Id Kantin");
        Model_Table.addColumn("Nama Menu");
        Model_Table.addColumn("Harga");
        Model_Table.addColumn("Deskripsi");
    }
    
    public void GetData_Menu(){
        Model_Table.getDataVector().removeAllElements();
        Model_Table.fireTableDataChanged();
        
        try{
           Object[] Obj = new Object[5];
           for (int i = 0 ; i < List.size();i++){
               Obj[0] = List.get(i).GetId_Menu();
               Obj[1] = List.get(i).GetId_Kantin_Menu();
               Obj[2] = List.get(i).GetNama_Menu();
               Obj[3] = List.get(i).GetHarga_Menu();
               Obj[4] = List.get(i).GetDeskripsi_Menu();
               Model_Table.addRow(Obj);
           }
        }catch(Exception E){
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
        Tabel_Menu = new javax.swing.JTable();

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

        Tabel_Menu.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_MenuMouseClicked(evt);
            }
        });
        Table_menu.setViewportView(Tabel_Menu);

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
        GUI_Kantin_Create_Menu Kh = new GUI_Kantin_Create_Menu();
        Kh.show();
        dispose();
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            String Id_Menu = Tabel_Menu.getValueAt(Tabel_Menu.getSelectedRow(),0).toString();
            Koneksi_Menu.UpdateDataListMenu(Id_Menu, Txt_nama.getText(), Integer.parseInt(Txt_harga.getText()), TextDeskripsiMenu.getText());
            JOptionPane.showMessageDialog(null, "Menu berhasil diubah !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            List = Koneksi_Menu.GetData_List_Menu();
            GetData_Menu();

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Error !",
                "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed

    private void Tabel_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_MenuMouseClicked
        Txt_nama.setText(Tabel_Menu.getValueAt(Tabel_Menu.getSelectedRow(),2).toString());
        Txt_harga.setText(Tabel_Menu.getValueAt(Tabel_Menu.getSelectedRow(),3).toString());
        TextDeskripsiMenu.setText(Tabel_Menu.getValueAt(Tabel_Menu.getSelectedRow(),4).toString());
    }//GEN-LAST:event_Tabel_MenuMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
           GUI_Aplikasi Lm = new GUI_Aplikasi();
           Lm.show();
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
            java.util.logging.Logger.getLogger(GUI_Kantin_Update_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Kantin_Update_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Kantin_Update_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Kantin_Update_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Kantin_Update_Menu().setVisible(true);
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
    private javax.swing.JTable Tabel_Menu;
    private javax.swing.JScrollPane Table_menu;
    private javax.swing.JTextArea TextDeskripsiMenu;
    private javax.swing.JScrollPane Txt_deskripsi;
    private javax.swing.JTextField Txt_harga;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
