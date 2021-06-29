

package GUI;

import Database.Koneksi_kantin;
import javax.swing.JOptionPane;


public class GUI_kantin_registrasi extends javax.swing.JFrame {


    public GUI_kantin_registrasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_registrrasi = new javax.swing.JPanel();
        Label_id = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Label_pass = new javax.swing.JLabel();
        Txt_pass = new javax.swing.JPasswordField();
        registrasButton = new javax.swing.JToggleButton();
        kembaliButton = new javax.swing.JButton();
        Label_registrasi = new javax.swing.JLabel();
        Label_kantin = new javax.swing.JLabel();
        Label_nama = new javax.swing.JLabel();
        Txt_nama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_registrrasi.setBackground(new java.awt.Color(255, 255, 255));

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_id.setText("Id Kantin        :");

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_pass.setText("Password        :");

        Txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_passActionPerformed(evt);
            }
        });

        registrasButton.setBackground(new java.awt.Color(255, 102, 102));
        registrasButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registrasButton.setText("Sign Up");
        registrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasButtonActionPerformed(evt);
            }
        });

        kembaliButton.setBackground(new java.awt.Color(255, 102, 102));
        kembaliButton.setText("Log In");
        kembaliButton.setBorder(null);
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        Label_registrasi.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_registrasi.setText("SIGN UP");

        Label_kantin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_kantin.setForeground(new java.awt.Color(255, 102, 102));
        Label_kantin.setText("Kantin");

        Label_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label_nama.setText("Nama Kantin   :");

        Txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_registrrasiLayout = new javax.swing.GroupLayout(Panel_registrrasi);
        Panel_registrrasi.setLayout(Panel_registrrasiLayout);
        Panel_registrrasiLayout.setHorizontalGroup(
            Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Label_kantin))
                    .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                                .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(Label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Label_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Label_nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_nama)
                                    .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                                        .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Txt_id)
                                                .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(registrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(Label_registrasi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_registrrasiLayout.setVerticalGroup(
            Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_registrrasiLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Label_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_kantin)
                .addGap(82, 82, 82)
                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_registrrasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(registrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_registrrasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_registrrasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    private void registrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasButtonActionPerformed
        Koneksi_kantin.InsertDataKantin(Txt_id.getText(), Txt_nama.getText(),Txt_pass.getText());
            JOptionPane.showMessageDialog(null, "Registrasi berhasil !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            GUI_kantin_login Login = new GUI_kantin_login();
            Login.show();
            dispose();
    }//GEN-LAST:event_registrasButtonActionPerformed

    private void Txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_passActionPerformed

    }//GEN-LAST:event_Txt_passActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
           GUI_aplikasi lm = new GUI_aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_kantin_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_kantin_registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_kantin;
    private javax.swing.JLabel Label_nama;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JLabel Label_registrasi;
    private javax.swing.JPanel Panel_registrrasi;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JToggleButton registrasButton;
    // End of variables declaration//GEN-END:variables

}
