
package GUI;

import Database.Koneksi_pesanan;
import Database.Koneksi_menu;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_menu;
import Model.Model_pesanan;

public class GUI_driver_pesanan extends javax.swing.JFrame {

    private String id_order;
    private int indexMenu;
    public List <Model_pesanan> listOrder;
    public List <Model_menu> listMenu;
    public DefaultTableModel modelTable2 = new DefaultTableModel();

    public GUI_driver_pesanan() {
        initComponents();
        
        listOrder = Koneksi_pesanan.GetDataOrder();
        listMenu = Koneksi_menu.GetDataListMenu();
        setNameColumnTabelOrder();
        getDataTabelOrder();
    }

public void setNameColumnTabelOrder(){
        TabelPesanan.setModel(modelTable2);
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

        Label_driver = new javax.swing.JLabel();
        Label_pesanan = new javax.swing.JLabel();
        SelesaiButton = new javax.swing.JButton();
        Table_pesanan = new javax.swing.JScrollPane();
        TabelPesanan = new javax.swing.JTable();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_driver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Label_driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_driver.setText("DRIVER");

        Label_pesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pesanan.setText("Status pesanan");

        SelesaiButton.setBackground(new java.awt.Color(255, 102, 102));
        SelesaiButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SelesaiButton.setText("Selesai");
        SelesaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelesaiButtonActionPerformed(evt);
            }
        });

        TabelPesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_pesanan.setViewportView(TabelPesanan);

        LogOutButton.setBackground(new java.awt.Color(255, 102, 102));
        LogOutButton.setText("LogOut");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
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
                        .addComponent(Label_pesanan)
                        .addGap(0, 270, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutButton)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(SelesaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Label_driver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Label_pesanan)
                .addGap(18, 18, 18)
                .addComponent(Table_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(SelesaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(LogOutButton)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelesaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelesaiButtonActionPerformed
        String id_order = TabelPesanan.getValueAt(TabelPesanan.getSelectedRow(),0).toString();
        Koneksi_pesanan.DeleteDataOrder(TabelPesanan.getValueAt(indexMenu,0).toString(), TabelPesanan.getValueAt(indexMenu,1).toString(), TabelPesanan.getValueAt(indexMenu,2).toString(),  Integer.parseInt(TabelPesanan.getValueAt(indexMenu,3).toString()));
        JOptionPane.showMessageDialog(null, "Pesanan telah selseai !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
        listOrder = Koneksi_pesanan.GetDataOrder();
        getDataTabelOrder();
    }//GEN-LAST:event_SelesaiButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        GUI_aplikasi lm = new GUI_aplikasi();
        lm.show();
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

 
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
            java.util.logging.Logger.getLogger(GUI_driver_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_driver_pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_driver;
    private javax.swing.JLabel Label_pesanan;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton SelesaiButton;
    private javax.swing.JTable TabelPesanan;
    private javax.swing.JScrollPane Table_pesanan;
    // End of variables declaration//GEN-END:variables
}
