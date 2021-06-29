
package GUI;

import Database.Koneksi_pelanggan;
import javax.swing.JOptionPane;


public class GUI_pelanggan_registrasi extends javax.swing.JFrame {


    public GUI_pelanggan_registrasi() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_registrasi = new javax.swing.JLabel();
        Label_pelanggan = new javax.swing.JLabel();
        Txt_email = new javax.swing.JTextField();
        Txt_id = new javax.swing.JTextField();
        Label_id = new javax.swing.JLabel();
        Label_email = new javax.swing.JLabel();
        Label_pass = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registrasiButton = new javax.swing.JButton();
        Txt_nohp = new javax.swing.JTextField();
        Txt_alamat = new javax.swing.JTextField();
        Label_alamat = new javax.swing.JLabel();
        Label_nohp = new javax.swing.JLabel();
        Txt_pass = new javax.swing.JPasswordField();
        Txt_nama = new javax.swing.JTextField();
        Label_nama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_registrasi.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_registrasi.setText("SIGN UP");

        Label_pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pelanggan.setForeground(new java.awt.Color(255, 102, 102));
        Label_pelanggan.setText("Pelanggan");

        Txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_emailActionPerformed(evt);
            }
        });

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_id.setText("Id Pelanggan");

        Label_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_email.setText("Email");

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pass.setText("Password");

        loginButton.setBackground(new java.awt.Color(255, 102, 102));
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registrasiButton.setBackground(new java.awt.Color(255, 102, 102));
        registrasiButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registrasiButton.setText("Sign Up");
        registrasiButton.setBorder(null);
        registrasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasiButtonActionPerformed(evt);
            }
        });

        Txt_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_nohpActionPerformed(evt);
            }
        });

        Txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_alamatActionPerformed(evt);
            }
        });

        Label_alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_alamat.setText("Alamat");

        Label_nohp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_nohp.setText("No. HP");

        Txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaActionPerformed(evt);
            }
        });

        Label_nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_nama.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Label_nama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_pass)
                                .addComponent(Label_email)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_nohp)
                                        .addComponent(Label_alamat))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registrasiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Label_id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_registrasi)
                                .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Label_pelanggan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Label_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_pelanggan)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_email))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_nohp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(registrasiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_emailActionPerformed

    }//GEN-LAST:event_Txt_emailActionPerformed

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    private void Txt_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_nohpActionPerformed

    }//GEN-LAST:event_Txt_nohpActionPerformed

    private void Txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_alamatActionPerformed

    }//GEN-LAST:event_Txt_alamatActionPerformed

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed

    private void registrasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasiButtonActionPerformed
        
        try {
        Koneksi_pelanggan.InsertDataPelanggan(Txt_id.getText(), Txt_nama.getText(), Txt_pass.getText(), Txt_alamat.getText(), Txt_email.getText(), Txt_nohp.getText());
            JOptionPane.showMessageDialog(null, "Registrasi berhasil !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            GUI_pelanggan_login Login = new GUI_pelanggan_login();
            Login.show();
            dispose();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data yang anda masukan salah !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registrasiButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
           GUI_pelanggan_login plg = new GUI_pelanggan_login();
           plg.show();
           dispose();
    }//GEN-LAST:event_loginButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_pelanggan_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_pelanggan_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_pelanggan_registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_alamat;
    private javax.swing.JLabel Label_email;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_nama;
    private javax.swing.JLabel Label_nohp;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JLabel Label_pelanggan;
    private javax.swing.JLabel Label_registrasi;
    private javax.swing.JTextField Txt_alamat;
    private javax.swing.JTextField Txt_email;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JTextField Txt_nohp;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registrasiButton;
    // End of variables declaration//GEN-END:variables
}
