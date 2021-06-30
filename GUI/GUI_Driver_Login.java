
package GUI;

import Database.Koneksi_Driver;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.Model_Driver;


public class GUI_Driver_Login extends javax.swing.JFrame {
    
    List<Model_Driver> List_Driver= new ArrayList<Model_Driver>();


    public GUI_Driver_Login() {
        initComponents();
        List_Driver = Koneksi_Driver.GetData_Driver();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_Id = new javax.swing.JTextField();
        Label_Id = new javax.swing.JLabel();
        Text_Pass = new javax.swing.JPasswordField();
        Label_Pass = new javax.swing.JLabel();
        Button_Login_Driver = new javax.swing.JButton();
        Label_Login = new javax.swing.JLabel();
        Label_Driver = new javax.swing.JLabel();
        Button_Registrasi = new javax.swing.JButton();
        Button_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Text_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IdActionPerformed(evt);
            }
        });

        Label_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Id.setText("Id driver");

        Label_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pass.setText("Password");

        Button_Login_Driver.setBackground(new java.awt.Color(255, 102, 102));
        Button_Login_Driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Login_Driver.setText("LOG IN");
        Button_Login_Driver.setBorder(null);
        Button_Login_Driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Login_DriverActionPerformed(evt);
            }
        });

        Label_Login.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_Login.setText("LOG IN");

        Label_Driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_Driver.setText("Driver");

        Button_Registrasi.setBackground(new java.awt.Color(255, 102, 102));
        Button_Registrasi.setText("Registrasi");
        Button_Registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegistrasiActionPerformed(evt);
            }
        });

        Button_Kembali.setBackground(new java.awt.Color(255, 102, 102));
        Button_Kembali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_Kembali.setText("Kembali");
        Button_Kembali.setBorder(null);
        Button_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KembaliActionPerformed(evt);
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
                        .addComponent(Label_Driver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Pass)
                                    .addComponent(Label_Id))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_Pass)
                                    .addComponent(Text_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Button_Registrasi)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Button_Login_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Label_Login)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Label_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Driver)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Pass))
                .addGap(18, 18, 18)
                .addComponent(Button_Registrasi)
                .addGap(38, 38, 38)
                .addComponent(Button_Login_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(Button_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IdActionPerformed

    }//GEN-LAST:event_Text_IdActionPerformed

    private void Button_Login_DriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Login_DriverActionPerformed
       if (Login_Masuk_Driver() == true) {
           GUI.GUI_Driver_Pesanan home = new GUI.GUI_Driver_Pesanan();
           home.show();
           dispose();
      } else {
          JOptionPane.showConfirmDialog(null, "id atau password salah",
                "Warning",JOptionPane.WARNING_MESSAGE);
          }      
    }//GEN-LAST:event_Button_Login_DriverActionPerformed

    private void Button_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KembaliActionPerformed
           GUI_Aplikasi lm = new GUI_Aplikasi();
           lm.show();
           dispose();
    }//GEN-LAST:event_Button_KembaliActionPerformed

    private void Button_RegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegistrasiActionPerformed
           GUI_Driver_Registrasi regis = new GUI_Driver_Registrasi();
           regis.show();
           dispose();
    }//GEN-LAST:event_Button_RegistrasiActionPerformed

    public boolean Login_Masuk_Driver(){
        boolean kondisi = false;
        int index = 0;
        while (kondisi == false && index < List_Driver.size()) {
            System.out.println(List_Driver.get(index).GetPass_Driver());
            if (Text_Id.getText().intern() == List_Driver.get(index).GetId_Driver().intern() && Text_Pass.getText().intern() == List_Driver.get(index).GetPass_Driver().intern()) {
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
            java.util.logging.Logger.getLogger(GUI_Driver_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Driver_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Kembali;
    private javax.swing.JButton Button_Login_Driver;
    private javax.swing.JButton Button_Registrasi;
    private javax.swing.JLabel Label_Driver;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Login;
    private javax.swing.JLabel Label_Pass;
    private javax.swing.JTextField Text_Id;
    private javax.swing.JPasswordField Text_Pass;
    // End of variables declaration//GEN-END:variables
}
