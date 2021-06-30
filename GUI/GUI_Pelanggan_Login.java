
package GUI;

import Database.Koneksi_Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Model_Pelanggan;


public class GUI_Pelanggan_Login extends javax.swing.JFrame {

    List<Model_Pelanggan> listPelanggan = new ArrayList<Model_Pelanggan>();
    
    public GUI_Pelanggan_Login() {
        initComponents();
        listPelanggan = Koneksi_Pelanggan.GetData_Pelanggan();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Login = new javax.swing.JLabel();
        Label_Pelanggan = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();
        Label_Id = new javax.swing.JLabel();
        Label_Pass = new javax.swing.JLabel();
        login_Button = new javax.swing.JButton();
        Kembali_Button = new javax.swing.JButton();
        Registrasi_Button = new javax.swing.JButton();
        Txt_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Label_Login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_Login.setText("LOG IN");

        Label_Pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pelanggan.setForeground(new java.awt.Color(255, 102, 102));
        Label_Pelanggan.setText("Pelanggan");

        Txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdActionPerformed(evt);
            }
        });

        Label_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Id.setText("ID Pelanggan");

        Label_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pass.setText("Password");

        login_Button.setBackground(new java.awt.Color(255, 102, 102));
        login_Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login_Button.setText("LOG IN");
        login_Button.setBorder(null);
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        Kembali_Button.setBackground(new java.awt.Color(255, 102, 102));
        Kembali_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kembali_Button.setText("Kembali");
        Kembali_Button.setBorder(null);
        Kembali_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kembali_ButtonActionPerformed(evt);
            }
        });

        Registrasi_Button.setBackground(new java.awt.Color(255, 102, 102));
        Registrasi_Button.setText("Registrasi");
        Registrasi_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrasi_ButtonActionPerformed(evt);
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
                            .addComponent(Label_Id)
                            .addComponent(Label_Pass)
                            .addComponent(Registrasi_Button))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Pass)
                            .addComponent(Txt_Id)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(Label_Pelanggan))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Kembali_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Login))))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Label_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Pelanggan)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Registrasi_Button)
                .addGap(67, 67, 67)
                .addComponent(login_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(Kembali_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdActionPerformed

    }//GEN-LAST:event_Txt_IdActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
      if (loginMasukpelanggan() == true) {
           GUI_Pelanggan_Pesanan home = new GUI_Pelanggan_Pesanan();
           home.show();
           dispose();
      } else {
          JOptionPane.showConfirmDialog(null, "id atau password salah",
                "Warning",JOptionPane.WARNING_MESSAGE);
      }
       
    }//GEN-LAST:event_login_ButtonActionPerformed

    public boolean loginMasukpelanggan(){
        boolean kondisi = false;
        int index = 0;
        while (kondisi == false && index < listPelanggan.size()) {
            if (Txt_Id.getText().intern() == listPelanggan.get(index).GetId_Pelanggan().intern() && Txt_Pass.getText().intern() == listPelanggan.get(index).GetPass_Pelanggan().intern()) {
                kondisi = true;
            } else {
                kondisi = false;
            }
            index++;
        }
        return kondisi;
    }
    
    private void Kembali_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kembali_ButtonActionPerformed
           GUI_Aplikasi lm = new GUI_Aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_Kembali_ButtonActionPerformed

    private void Registrasi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrasi_ButtonActionPerformed
           GUI_Pelanggan_Registrasi regis = new GUI_Pelanggan_Registrasi();
           regis.show();
           dispose();
    }//GEN-LAST:event_Registrasi_ButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Pelanggan_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Pelanggan_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali_Button;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Login;
    private javax.swing.JLabel Label_Pass;
    private javax.swing.JLabel Label_Pelanggan;
    private javax.swing.JButton Registrasi_Button;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.JPasswordField Txt_Pass;
    private javax.swing.JButton login_Button;
    // End of variables declaration//GEN-END:variables
}
