package GUI;

public class GUI_Aplikasi extends javax.swing.JFrame {


    public GUI_Aplikasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_apliikasi = new javax.swing.JPanel();
        Panelsub_aplikasi = new javax.swing.JPanel();
        Label_Login = new javax.swing.JLabel();
        Button_Kantin = new javax.swing.JButton();
        Button_Driver = new javax.swing.JButton();
        Button_Pelanggan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_apliikasi.setBackground(new java.awt.Color(255, 255, 255));

        Panelsub_aplikasi.setBackground(new java.awt.Color(255, 255, 255));
        Panelsub_aplikasi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_Login.setBackground(new java.awt.Color(255, 255, 255));
        Label_Login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Login.setText("Login Sebagai");

        Button_Kantin.setBackground(new java.awt.Color(255, 102, 102));
        Button_Kantin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_Kantin.setText("Kantin");
        Button_Kantin.setBorder(null);
        Button_Kantin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KantinActionPerformed(evt);
            }
        });

        Button_Driver.setBackground(new java.awt.Color(255, 102, 102));
        Button_Driver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_Driver.setText("Driver");
        Button_Driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DriverActionPerformed(evt);
            }
        });

        Button_Pelanggan.setBackground(new java.awt.Color(255, 102, 102));
        Button_Pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_Pelanggan.setText("Pelanggan");
        Button_Pelanggan.setBorder(null);
        Button_Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panelsub_aplikasiLayout = new javax.swing.GroupLayout(Panelsub_aplikasi);
        Panelsub_aplikasi.setLayout(Panelsub_aplikasiLayout);
        Panelsub_aplikasiLayout.setHorizontalGroup(
            Panelsub_aplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelsub_aplikasiLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(Panelsub_aplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelsub_aplikasiLayout.createSequentialGroup()
                        .addGroup(Panelsub_aplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelsub_aplikasiLayout.createSequentialGroup()
                        .addComponent(Label_Login)
                        .addGap(126, 126, 126))))
        );
        Panelsub_aplikasiLayout.setVerticalGroup(
            Panelsub_aplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelsub_aplikasiLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Label_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Button_Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Button_Kantin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Button_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_apliikasiLayout = new javax.swing.GroupLayout(Panel_apliikasi);
        Panel_apliikasi.setLayout(Panel_apliikasiLayout);
        Panel_apliikasiLayout.setHorizontalGroup(
            Panel_apliikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelsub_aplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_apliikasiLayout.setVerticalGroup(
            Panel_apliikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelsub_aplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_apliikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_apliikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PelangganActionPerformed
           GUI_Pelanggan_Login  plg = new GUI_Pelanggan_Login();
           plg.show();
           dispose();
    }//GEN-LAST:event_Button_PelangganActionPerformed

    private void Button_KantinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KantinActionPerformed
           GUI_Kantin_Login  kantin = new GUI_Kantin_Login();
           kantin.show();
           dispose();    }//GEN-LAST:event_Button_KantinActionPerformed

    private void Button_DriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DriverActionPerformed
           GUI_Driver_Login  driver = new GUI_Driver_Login();
           driver.show();
           dispose();
    }//GEN-LAST:event_Button_DriverActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Driver;
    private javax.swing.JButton Button_Kantin;
    private javax.swing.JButton Button_Pelanggan;
    private javax.swing.JLabel Label_Login;
    private javax.swing.JPanel Panel_apliikasi;
    private javax.swing.JPanel Panelsub_aplikasi;
    // End of variables declaration//GEN-END:variables
}
