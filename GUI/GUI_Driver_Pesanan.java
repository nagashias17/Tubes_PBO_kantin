
package GUI;

import Database.Koneksi_Pesanan;
import Database.Koneksi_Menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_Menu;
import Model.Model_Pesanan;

public class GUI_Driver_Pesanan extends javax.swing.JFrame {

    private String Id_Order;
    private int Index_Menu;
    public List <Model_Pesanan> List_Order;
    public List <Model_Menu> List_Menu;
    public DefaultTableModel Model_Table2 = new DefaultTableModel();

    public GUI_Driver_Pesanan() {
        initComponents();
        
        List_Order = Koneksi_Pesanan.GetData_Order();
        List_Menu = Koneksi_Menu.GetData_List_Menu();
        SetName_Column_Tabel_Order();
        GetData_Tabel_Order();
    }

public void SetName_Column_Tabel_Order(){
        Tabel_Pesanan.setModel(Model_Table2);
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

        Label_Driver = new javax.swing.JLabel();
        Label_Pesanan = new javax.swing.JLabel();
        Button_Pesanan = new javax.swing.JButton();
        Table_pesanan = new javax.swing.JScrollPane();
        Tabel_Pesanan = new javax.swing.JTable();
        Button_Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_Driver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Label_Driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_Driver.setText("DRIVER");

        Label_Pesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pesanan.setText("Status pesanan");

        Button_Pesanan.setBackground(new java.awt.Color(255, 102, 102));
        Button_Pesanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_Pesanan.setText("Selesai");
        Button_Pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PesananActionPerformed(evt);
            }
        });

        Tabel_Pesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_pesanan.setViewportView(Tabel_Pesanan);

        Button_Logout.setBackground(new java.awt.Color(255, 102, 102));
        Button_Logout.setText("Log Out");
        Button_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Table_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Pesanan)
                        .addGap(0, 270, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Logout)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(Button_Pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Label_Driver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Label_Pesanan)
                .addGap(18, 18, 18)
                .addComponent(Table_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Button_Pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(Button_Logout)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PesananActionPerformed
        String Id_Order = Tabel_Pesanan.getValueAt(Tabel_Pesanan.getSelectedRow(),0).toString();
        Koneksi_Pesanan.DeleteData_Order(Tabel_Pesanan.getValueAt(Index_Menu,0).toString(), Tabel_Pesanan.getValueAt(Index_Menu,1).toString(), Tabel_Pesanan.getValueAt(Index_Menu,2).toString(),  Integer.parseInt(Tabel_Pesanan.getValueAt(Index_Menu,3).toString()));
        
        JOptionPane.showMessageDialog(null, "Pesanan telah selseai !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
        List_Order = Koneksi_Pesanan.GetData_Order();
        GetData_Tabel_Order();
    }//GEN-LAST:event_Button_PesananActionPerformed

    private void Button_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LogoutActionPerformed
        GUI_Aplikasi lm = new GUI_Aplikasi();
        lm.show();
        dispose();
    }//GEN-LAST:event_Button_LogoutActionPerformed

 
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
            java.util.logging.Logger.getLogger(GUI_Driver_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Driver_Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Logout;
    private javax.swing.JButton Button_Pesanan;
    private javax.swing.JLabel Label_Driver;
    private javax.swing.JLabel Label_Pesanan;
    private javax.swing.JTable Tabel_Pesanan;
    private javax.swing.JScrollPane Table_pesanan;
    // End of variables declaration//GEN-END:variables
}
