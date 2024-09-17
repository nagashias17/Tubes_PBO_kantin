
package GUI;

import Database.Koneksi_pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Model_pelanggan;


public class GUI_pelanggan_login extends javax.swing.JFrame {

    List<Model_pelanggan> listPelanggan = new ArrayList<Model_pelanggan>();
    
    public GUI_pelanggan_login() {
        initComponents();
        listPelanggan = Koneksi_pelanggan.GetDataPelanggan();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_login = new javax.swing.JLabel();
        Label_pelanggan = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Label_id = new javax.swing.JLabel();
        Label_pass = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        registrasiButton = new javax.swing.JButton();
        Txt_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_login.setText("LOG IN");

        Label_pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pelanggan.setForeground(new java.awt.Color(255, 102, 102));
        Label_pelanggan.setText("Pelanggan");

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_id.setText("ID Pelanggan");

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pass.setText("Password");

        loginButton.setBackground(new java.awt.Color(255, 102, 102));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setText("LOG IN");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        kembaliButton.setBackground(new java.awt.Color(255, 102, 102));
        kembaliButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.setBorder(null);
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        registrasiButton.setBackground(new java.awt.Color(255, 102, 102));
        registrasiButton.setText("Registrasi");
        registrasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_id)
                            .addComponent(Label_pass)
                            .addComponent(registrasiButton))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_pass)
                            .addComponent(Txt_id)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(Label_pelanggan))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_login))))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Label_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_pelanggan)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrasiButton)
                .addGap(67, 67, 67)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      if (loginMasukpelanggan() == true) {
           GUI_pelanggan_pesanan home = new GUI_pelanggan_pesanan();
           home.show();
           dispose();
      } else {
          JOptionPane.showConfirmDialog(null, "id atau password salah",
                "Warning",JOptionPane.WARNING_MESSAGE);
      }
       
    }//GEN-LAST:event_loginButtonActionPerformed

    public boolean loginMasukpelanggan(){
        boolean kondisi = false;
        int index = 0;
        while (kondisi == false && index < listPelanggan.size()) {
            if (Txt_id.getText().intern() == listPelanggan.get(index).getId_Pelanggan().intern() && Txt_pass.getText().intern() == listPelanggan.get(index).getPass_pelanggan().intern()) {
                kondisi = true;
            } else {
                kondisi = false;
            }
            index++;
        }
        return kondisi;
    }
    
    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
           GUI_aplikasi lm = new GUI_aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void registrasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasiButtonActionPerformed
           GUI_pelanggan_registrasi regis = new GUI_pelanggan_registrasi();
           regis.show();
           dispose();
    }//GEN-LAST:event_registrasiButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_pelanggan_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_pelanggan_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_login;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JLabel Label_pelanggan;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registrasiButton;
    // End of variables declaration//GEN-END:variables
}
