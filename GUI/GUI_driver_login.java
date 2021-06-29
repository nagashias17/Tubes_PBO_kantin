
package GUI;

import Database.Koneksi_driver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Model_driver;


public class GUI_driver_login extends javax.swing.JFrame {
    
    List<Model_driver> listDriver= new ArrayList<Model_driver>();


    public GUI_driver_login() {
        initComponents();
        listDriver = Koneksi_driver.GetDataDriver();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_id = new javax.swing.JTextField();
        Label_id = new javax.swing.JLabel();
        Txt_pass = new javax.swing.JPasswordField();
        Label_pass = new javax.swing.JLabel();
        LoginDriver = new javax.swing.JButton();
        Label_login = new javax.swing.JLabel();
        Label_driver = new javax.swing.JLabel();
        registrasiButton = new javax.swing.JButton();
        KembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_id.setText("Id driver");

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pass.setText("Password");

        LoginDriver.setBackground(new java.awt.Color(255, 102, 102));
        LoginDriver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoginDriver.setText("LOG IN");
        LoginDriver.setBorder(null);
        LoginDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginDriverActionPerformed(evt);
            }
        });

        Label_login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_login.setText("LOG IN");

        Label_driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_driver.setText("Driver");

        registrasiButton.setBackground(new java.awt.Color(255, 102, 102));
        registrasiButton.setText("Registrasi");
        registrasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasiButtonActionPerformed(evt);
            }
        });

        KembaliButton.setBackground(new java.awt.Color(255, 102, 102));
        KembaliButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KembaliButton.setText("Kembali");
        KembaliButton.setBorder(null);
        KembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(Label_driver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_pass)
                                    .addComponent(Label_id))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_pass)
                                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(registrasiButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(KembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(LoginDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Label_login)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Label_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_driver)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_pass))
                .addGap(18, 18, 18)
                .addComponent(registrasiButton)
                .addGap(38, 38, 38)
                .addComponent(LoginDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(KembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    private void LoginDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginDriverActionPerformed
       if (loginMasukDriver() == true) {
           GUI.GUI_driver_pesanan home = new GUI.GUI_driver_pesanan();
           home.show();
           dispose();
      } else {
          JOptionPane.showConfirmDialog(null, "id atau password salah",
                "Warning",JOptionPane.WARNING_MESSAGE);
          }      
    }//GEN-LAST:event_LoginDriverActionPerformed

    private void KembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliButtonActionPerformed
           GUI_aplikasi lm = new GUI_aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_KembaliButtonActionPerformed

    private void registrasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasiButtonActionPerformed
           GUI_driver_registrasi regis = new GUI_driver_registrasi();
           regis.show();
           dispose();
    }//GEN-LAST:event_registrasiButtonActionPerformed
public boolean loginMasukDriver(){
        boolean kondisi = false;
        int index = 0;
        while (kondisi == false && index < listDriver.size()) {
            System.out.println(listDriver.get(index).getPass_driver());
            if (Txt_id.getText().intern() == listDriver.get(index).getId_driver().intern() && Txt_pass.getText().intern() == listDriver.get(index).getPass_driver().intern()) {
                kondisi = true;
            } else {
                kondisi = false;
            }
            index++;
        }
        
        return kondisi;
    }
    

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
            java.util.logging.Logger.getLogger(GUI_driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_driver_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliButton;
    private javax.swing.JLabel Label_driver;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_login;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JButton LoginDriver;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JButton registrasiButton;
    // End of variables declaration//GEN-END:variables
}
