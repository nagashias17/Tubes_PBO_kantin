
package GUI;

import Database.Koneksi_kantin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Model_kantin;



public class GUI_kantin_login extends javax.swing.JFrame {


    
    List<Model_kantin> listKantin= new ArrayList<Model_kantin>();
    
    public GUI_kantin_login() {
        initComponents();
         listKantin = Koneksi_kantin.GetDataKantin();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_login = new javax.swing.JPanel();
        Label_id = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Label_pass = new javax.swing.JLabel();
        Txt_pass = new javax.swing.JPasswordField();
        Label_login = new javax.swing.JLabel();
        Label_kantin = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        registrasiButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Panel_login.setBackground(new java.awt.Color(255, 255, 255));

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_id.setText("Id Kantin     :");

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pass.setText("Password     :");

        Txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_passActionPerformed(evt);
            }
        });

        Label_login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_login.setText("LOG IN");

        Label_kantin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_kantin.setForeground(new java.awt.Color(255, 102, 102));
        Label_kantin.setText("Kantin");

        LoginButton.setBackground(new java.awt.Color(255, 102, 102));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoginButton.setText("LOG IN");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        registrasiButton.setBackground(new java.awt.Color(255, 102, 102));
        registrasiButton.setText("Registrasi");
        registrasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrasiButtonActionPerformed(evt);
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

        javax.swing.GroupLayout Panel_loginLayout = new javax.swing.GroupLayout(Panel_login);
        Panel_login.setLayout(Panel_loginLayout);
        Panel_loginLayout.setHorizontalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Label_login))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_pass)
                            .addComponent(Label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrasiButton))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_id)
                            .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(Label_kantin)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        Panel_loginLayout.setVerticalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Label_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_kantin)
                .addGap(125, 125, 125)
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_pass)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrasiButton)
                .addGap(80, 80, 80)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed
 
    }//GEN-LAST:event_Txt_idActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    if (loginMasukKantin() == true) {
           GUI.GUI_kantin_createMenu home = new GUI.GUI_kantin_createMenu();
           home.show();
           dispose();
      } else {
          JOptionPane.showConfirmDialog(null, "id atau password salah",
                "Warning",JOptionPane.WARNING_MESSAGE);
      }    }//GEN-LAST:event_LoginButtonActionPerformed
    
    public boolean loginMasukKantin(){
        boolean kondisi = false;
        int index = 0;
        while (kondisi == false && index < listKantin.size()) {
            if (Txt_id.getText().intern() == listKantin.get(index).getId_kantin().intern() && Txt_pass.getText().intern() == listKantin.get(index).getPass_kantin().intern()) {
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

    private void Txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_passActionPerformed

    }//GEN-LAST:event_Txt_passActionPerformed

    private void registrasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrasiButtonActionPerformed
           GUI_kantin_registrasi regis = new GUI_kantin_registrasi();
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
            java.util.logging.Logger.getLogger(GUI_kantin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_kantin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_kantin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_kantin;
    private javax.swing.JLabel Label_login;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Panel_login;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton registrasiButton;
    // End of variables declaration//GEN-END:variables
}
