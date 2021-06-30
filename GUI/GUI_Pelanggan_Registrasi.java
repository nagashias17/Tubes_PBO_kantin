
package GUI;

import Database.Koneksi_Pelanggan;
import javax.swing.JOptionPane;


public class GUI_Pelanggan_Registrasi extends javax.swing.JFrame {


    public GUI_Pelanggan_Registrasi() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Registrasi = new javax.swing.JLabel();
        Label_Pelanggan = new javax.swing.JLabel();
        Txt_Email = new javax.swing.JTextField();
        Txt_Id = new javax.swing.JTextField();
        Label_Id = new javax.swing.JLabel();
        Label_Email = new javax.swing.JLabel();
        Label_Pass = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Registrasi_Button = new javax.swing.JButton();
        Txt_No_Hp = new javax.swing.JTextField();
        Txt_Alamat = new javax.swing.JTextField();
        Label_Alamat = new javax.swing.JLabel();
        Label_No_Hp = new javax.swing.JLabel();
        Txt_Pass = new javax.swing.JPasswordField();
        Txt_Nama = new javax.swing.JTextField();
        Label_Nama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_Registrasi.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_Registrasi.setText("SIGN UP");

        Label_Pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pelanggan.setForeground(new java.awt.Color(255, 102, 102));
        Label_Pelanggan.setText("Pelanggan");

        Txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_EmailActionPerformed(evt);
            }
        });

        Txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdActionPerformed(evt);
            }
        });

        Label_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Id.setText("Id Pelanggan");

        Label_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Email.setText("Email");

        Label_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pass.setText("Password");

        Login_Button.setBackground(new java.awt.Color(255, 102, 102));
        Login_Button.setText("Log In");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Registrasi_Button.setBackground(new java.awt.Color(255, 102, 102));
        Registrasi_Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Registrasi_Button.setText("Sign Up");
        Registrasi_Button.setBorder(null);
        Registrasi_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrasi_ButtonActionPerformed(evt);
            }
        });

        Txt_No_Hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_No_HpActionPerformed(evt);
            }
        });

        Txt_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_AlamatActionPerformed(evt);
            }
        });

        Label_Alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Alamat.setText("Alamat");

        Label_No_Hp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_No_Hp.setText("No. HP");

        Txt_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NamaActionPerformed(evt);
            }
        });

        Label_Nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Nama.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Login_Button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Label_Nama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_Pass)
                                .addComponent(Label_Email)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_No_Hp)
                                        .addComponent(Label_Alamat))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Registrasi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_No_Hp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Label_Id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_Registrasi)
                                .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Label_Pelanggan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Label_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Pelanggan)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Email))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_No_Hp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_No_Hp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Registrasi_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EmailActionPerformed

    }//GEN-LAST:event_Txt_EmailActionPerformed

    private void Txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdActionPerformed

    }//GEN-LAST:event_Txt_IdActionPerformed

    private void Txt_No_HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_No_HpActionPerformed

    }//GEN-LAST:event_Txt_No_HpActionPerformed

    private void Txt_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_AlamatActionPerformed

    }//GEN-LAST:event_Txt_AlamatActionPerformed

    private void Txt_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NamaActionPerformed

    }//GEN-LAST:event_Txt_NamaActionPerformed

    private void Registrasi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrasi_ButtonActionPerformed
        
        try {
        Koneksi_Pelanggan.InsertData_Pelanggan(Txt_Id.getText(), Txt_Nama.getText(), Txt_Pass.getText(), Txt_Alamat.getText(), Txt_Email.getText(), Txt_No_Hp.getText());
            JOptionPane.showMessageDialog(null, "Registrasi berhasil !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            GUI_Pelanggan_Login Login = new GUI_Pelanggan_Login();
            Login.show();
            dispose();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data yang anda masukan salah !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Registrasi_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
           GUI_Pelanggan_Login plg = new GUI_Pelanggan_Login();
           plg.show();
           dispose();
    }//GEN-LAST:event_Login_ButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Pelanggan_Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Alamat;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Nama;
    private javax.swing.JLabel Label_No_Hp;
    private javax.swing.JLabel Label_Pass;
    private javax.swing.JLabel Label_Pelanggan;
    private javax.swing.JLabel Label_Registrasi;
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton Registrasi_Button;
    private javax.swing.JTextField Txt_Alamat;
    private javax.swing.JTextField Txt_Email;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.JTextField Txt_Nama;
    private javax.swing.JTextField Txt_No_Hp;
    private javax.swing.JPasswordField Txt_Pass;
    // End of variables declaration//GEN-END:variables
}
