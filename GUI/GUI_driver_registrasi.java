package GUI;

import Database.Koneksi_driver;
import javax.swing.JOptionPane;



public class GUI_driver_registrasi extends javax.swing.JFrame {


    public GUI_driver_registrasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_driver = new javax.swing.JPanel();
        Label_nama = new javax.swing.JLabel();
        Txt_nama = new javax.swing.JTextField();
        Label_pass = new javax.swing.JLabel();
        Txt_pass = new javax.swing.JPasswordField();
        DaftarDriverButton = new javax.swing.JButton();
        Label_registrasi = new javax.swing.JLabel();
        Label_driver = new javax.swing.JLabel();
        LogginDriverButton = new javax.swing.JButton();
        label_nohp = new javax.swing.JLabel();
        Txt_nohp = new javax.swing.JTextField();
        Label_id = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_driver.setBackground(new java.awt.Color(255, 255, 255));

        Label_nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_nama.setText("Nama");

        Txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaActionPerformed(evt);
            }
        });

        Label_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_pass.setText("Password");

        DaftarDriverButton.setBackground(new java.awt.Color(255, 102, 102));
        DaftarDriverButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DaftarDriverButton.setText("Sign Up");
        DaftarDriverButton.setBorder(null);
        DaftarDriverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarDriverButtonActionPerformed(evt);
            }
        });

        Label_registrasi.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_registrasi.setText("SIGN UP");

        Label_driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_driver.setText("Driver");

        LogginDriverButton.setBackground(new java.awt.Color(255, 102, 102));
        LogginDriverButton.setText("Log In");
        LogginDriverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogginDriverButtonActionPerformed(evt);
            }
        });

        label_nohp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_nohp.setText("No Hp");

        Txt_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_nohpActionPerformed(evt);
            }
        });

        Label_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_id.setText("Id Driver");

        Txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_driverLayout = new javax.swing.GroupLayout(Panel_driver);
        Panel_driver.setLayout(Panel_driverLayout);
        Panel_driverLayout.setHorizontalGroup(
            Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_driverLayout.createSequentialGroup()
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_driverLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Label_driver))
                    .addGroup(Panel_driverLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Label_registrasi))
                    .addGroup(Panel_driverLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogginDriverButton)
                            .addGroup(Panel_driverLayout.createSequentialGroup()
                                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_nama)
                                    .addComponent(label_nohp)
                                    .addComponent(Label_id)
                                    .addComponent(Label_pass))
                                .addGap(37, 37, 37)
                                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_pass)
                                    .addComponent(Txt_nohp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(Txt_nama)
                                    .addComponent(Txt_id))))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_driverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DaftarDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        Panel_driverLayout.setVerticalGroup(
            Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_driverLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Label_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_driver)
                .addGap(64, 64, 64)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_id)
                    .addComponent(Txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nama)
                    .addComponent(Txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_pass)
                    .addComponent(Txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nohp)
                    .addComponent(Txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LogginDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(DaftarDriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_driver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_driver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaActionPerformed

    }//GEN-LAST:event_Txt_namaActionPerformed

    private void DaftarDriverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarDriverButtonActionPerformed
        Koneksi_driver.InsertDataDriver(Txt_id.getText(), Txt_nama.getText(), Txt_pass.getText(), Txt_nohp.getText());
           JOptionPane.showMessageDialog(null, "Registrasi berhasil !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            GUI_driver_login driver = new GUI_driver_login();
           driver.show();
           dispose();
    }//GEN-LAST:event_DaftarDriverButtonActionPerformed

    private void Txt_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_nohpActionPerformed
 
    }//GEN-LAST:event_Txt_nohpActionPerformed

    private void LogginDriverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogginDriverButtonActionPerformed
           GUI_driver_login driver = new GUI_driver_login();
           driver.show();
           dispose();
    }//GEN-LAST:event_LogginDriverButtonActionPerformed

    private void Txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_idActionPerformed

    }//GEN-LAST:event_Txt_idActionPerformed

    
    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_driver_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_driver_registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarDriverButton;
    private javax.swing.JLabel Label_driver;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_nama;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JLabel Label_registrasi;
    private javax.swing.JButton LogginDriverButton;
    private javax.swing.JPanel Panel_driver;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JTextField Txt_nohp;
    private javax.swing.JPasswordField Txt_pass;
    private javax.swing.JLabel label_nohp;
    // End of variables declaration//GEN-END:variables
}
