package GUI;

import Database.Koneksi_Driver;
import javax.swing.JOptionPane;



public class GUI_Driver_Registrasi extends javax.swing.JFrame {


    public GUI_Driver_Registrasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_driver = new javax.swing.JPanel();
        Label_Nama = new javax.swing.JLabel();
        Text_Nama = new javax.swing.JTextField();
        Label_Pass = new javax.swing.JLabel();
        Text_Pass = new javax.swing.JPasswordField();
        Button_Signup_Driver = new javax.swing.JButton();
        Label_Registrasi = new javax.swing.JLabel();
        Label_Driver = new javax.swing.JLabel();
        Button_Login_Driver = new javax.swing.JButton();
        Label_No_Hp = new javax.swing.JLabel();
        Text_No_Hp = new javax.swing.JTextField();
        Label_Id = new javax.swing.JLabel();
        Text_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_driver.setBackground(new java.awt.Color(255, 255, 255));

        Label_Nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Nama.setText("Nama");

        Text_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NamaActionPerformed(evt);
            }
        });

        Label_Pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Pass.setText("Password");

        Button_Signup_Driver.setBackground(new java.awt.Color(255, 102, 102));
        Button_Signup_Driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_Signup_Driver.setText("Sign Up");
        Button_Signup_Driver.setBorder(null);
        Button_Signup_Driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Signup_DriverActionPerformed(evt);
            }
        });

        Label_Registrasi.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Label_Registrasi.setText("SIGN UP");

        Label_Driver.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_Driver.setForeground(new java.awt.Color(255, 102, 102));
        Label_Driver.setText("Driver");

        Button_Login_Driver.setBackground(new java.awt.Color(255, 102, 102));
        Button_Login_Driver.setText("Log In");
        Button_Login_Driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Login_DriverActionPerformed(evt);
            }
        });

        Label_No_Hp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_No_Hp.setText("No Hp");

        Text_No_Hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_No_HpActionPerformed(evt);
            }
        });

        Label_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label_Id.setText("Id Driver");

        Text_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IdActionPerformed(evt);
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
                        .addComponent(Label_Driver))
                    .addGroup(Panel_driverLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(Label_Registrasi))
                    .addGroup(Panel_driverLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Login_Driver)
                            .addGroup(Panel_driverLayout.createSequentialGroup()
                                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Nama)
                                    .addComponent(Label_No_Hp)
                                    .addComponent(Label_Id)
                                    .addComponent(Label_Pass))
                                .addGap(37, 37, 37)
                                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_Pass)
                                    .addComponent(Text_No_Hp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(Text_Nama)
                                    .addComponent(Text_Id))))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_driverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_Signup_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        Panel_driverLayout.setVerticalGroup(
            Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_driverLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Label_Registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Driver)
                .addGap(64, 64, 64)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Id)
                    .addComponent(Text_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nama)
                    .addComponent(Text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Pass)
                    .addComponent(Text_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Panel_driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_No_Hp)
                    .addComponent(Text_No_Hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button_Login_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Button_Signup_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Text_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NamaActionPerformed

    }//GEN-LAST:event_Text_NamaActionPerformed

    private void Button_Signup_DriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Signup_DriverActionPerformed
        Koneksi_Driver.InsertData_Driver(Text_Id.getText(), Text_Nama.getText(), Text_Pass.getText(), Text_No_Hp.getText());
           JOptionPane.showMessageDialog(null, "Registrasi berhasil !",
                "sucsess",JOptionPane.INFORMATION_MESSAGE);
            GUI_Driver_Login driver = new GUI_Driver_Login();
           driver.show();
           dispose();
    }//GEN-LAST:event_Button_Signup_DriverActionPerformed

    private void Text_No_HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_No_HpActionPerformed
 
    }//GEN-LAST:event_Text_No_HpActionPerformed

    private void Button_Login_DriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Login_DriverActionPerformed
           GUI_Driver_Login driver = new GUI_Driver_Login();
           driver.show();
           dispose();
    }//GEN-LAST:event_Button_Login_DriverActionPerformed

    private void Text_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IdActionPerformed

    }//GEN-LAST:event_Text_IdActionPerformed

    
    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Driver_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Driver_Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Login_Driver;
    private javax.swing.JButton Button_Signup_Driver;
    private javax.swing.JLabel Label_Driver;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Nama;
    private javax.swing.JLabel Label_No_Hp;
    private javax.swing.JLabel Label_Pass;
    private javax.swing.JLabel Label_Registrasi;
    private javax.swing.JPanel Panel_driver;
    private javax.swing.JTextField Text_Id;
    private javax.swing.JTextField Text_Nama;
    private javax.swing.JTextField Text_No_Hp;
    private javax.swing.JPasswordField Text_Pass;
    // End of variables declaration//GEN-END:variables
}
