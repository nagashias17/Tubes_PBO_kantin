package GUI;

public class GUI_aplikasi extends javax.swing.JFrame {


    public GUI_aplikasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_apliikasi = new javax.swing.JPanel();
        Panelsub_aplikasi = new javax.swing.JPanel();
        LabelLogin = new javax.swing.JLabel();
        KantinButton = new javax.swing.JButton();
        DriverButton = new javax.swing.JButton();
        pelangganButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_apliikasi.setBackground(new java.awt.Color(255, 255, 255));

        Panelsub_aplikasi.setBackground(new java.awt.Color(255, 255, 255));
        Panelsub_aplikasi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelLogin.setBackground(new java.awt.Color(255, 255, 255));
        LabelLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelLogin.setText("Login Sebagai");

        KantinButton.setBackground(new java.awt.Color(255, 102, 102));
        KantinButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KantinButton.setText("Kantin");
        KantinButton.setBorder(null);
        KantinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantinButtonActionPerformed(evt);
            }
        });

        DriverButton.setBackground(new java.awt.Color(255, 102, 102));
        DriverButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DriverButton.setText("Driver");
        DriverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverButtonActionPerformed(evt);
            }
        });

        pelangganButton.setBackground(new java.awt.Color(255, 102, 102));
        pelangganButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pelangganButton.setText("Pelanggan");
        pelangganButton.setBorder(null);
        pelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelangganButtonActionPerformed(evt);
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
                            .addComponent(DriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KantinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pelangganButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panelsub_aplikasiLayout.createSequentialGroup()
                        .addComponent(LabelLogin)
                        .addGap(126, 126, 126))))
        );
        Panelsub_aplikasiLayout.setVerticalGroup(
            Panelsub_aplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panelsub_aplikasiLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(pelangganButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(KantinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(DriverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void pelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelangganButtonActionPerformed
           GUI_pelanggan_login  plg = new GUI_pelanggan_login();
           plg.show();
           dispose();
    }//GEN-LAST:event_pelangganButtonActionPerformed

    private void KantinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantinButtonActionPerformed
           GUI_kantin_login  kantin = new GUI_kantin_login();
           kantin.show();
           dispose();    }//GEN-LAST:event_KantinButtonActionPerformed

    private void DriverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverButtonActionPerformed
           GUI_driver_login  driver = new GUI_driver_login();
           driver.show();
           dispose();
    }//GEN-LAST:event_DriverButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DriverButton;
    private javax.swing.JButton KantinButton;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JPanel Panel_apliikasi;
    private javax.swing.JPanel Panelsub_aplikasi;
    private javax.swing.JButton pelangganButton;
    // End of variables declaration//GEN-END:variables
}
