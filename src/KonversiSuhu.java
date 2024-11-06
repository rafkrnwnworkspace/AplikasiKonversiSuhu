
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KonversiSuhu extends javax.swing.JFrame {
 
    public KonversiSuhu() {
        initComponents();
        setupButtonGroup();
        setTitle("Aplikasi Konversi Suhu");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
     private void setupButtonGroup() {
        bgSuhu = new ButtonGroup();
        bgSuhu.add(rbCelsius);
        bgSuhu.add(rbFahrenheit);
        bgSuhu.add(rbReamur);
        bgSuhu.add(rbKelvin);
        
        rbCelsius.setSelected(true); // Set default
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSuhu = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        lblInput = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        cmbSuhu = new javax.swing.JComboBox<>();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbCelsius = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(228, 232, 237));

        lblInput.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblInput.setText("Masukkan Suhu:");

        lblHasil.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblHasil.setText("Hasil Konversi:");

        lblOutput.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lblOutput.setText("0.0");

        txtSuhu.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        txtSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuhuActionPerformed(evt);
            }
        });

        cmbSuhu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cmbSuhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Reamur", "Kelvin" }));
        cmbSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSuhuActionPerformed(evt);
            }
        });

        rbFahrenheit.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbFahrenheit.setText("Fahrenheit");

        rbReamur.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbReamur.setText("Reamur");

        rbKelvin.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbKelvin.setText("Kelvin");

        rbCelsius.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbCelsius.setText("Celsius");

        btnKonversi.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI KONVERSI SUHU");

        btnKeluar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblHasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblOutput)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(rbCelsius)
                            .addGap(18, 18, 18)
                            .addComponent(rbFahrenheit)
                            .addGap(18, 18, 18)
                            .addComponent(rbReamur)
                            .addGap(27, 27, 27)
                            .addComponent(rbKelvin))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cmbSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblHasil))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblOutput)))
                .addGap(39, 39, 39)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelsius)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbReamur)
                    .addComponent(rbKelvin))
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSuhuActionPerformed
       try {
        double suhu = Double.parseDouble(txtSuhu.getText());
        double hasil = 0;
        String satuanHasil = "";

        String satuanAwal = (String) cmbSuhu.getSelectedItem();
        String satuanTujuan = "";

        if (rbCelsius.isSelected()) satuanTujuan = "Celsius";
        else if (rbFahrenheit.isSelected()) satuanTujuan = "Fahrenheit";
        else if (rbReamur.isSelected()) satuanTujuan = "Reamur";
        else if (rbKelvin.isSelected()) satuanTujuan = "Kelvin";

        // Konversi dari Celsius
        if (satuanAwal.equals("Celsius")) {
            if (satuanTujuan.equals("Fahrenheit")) {
                hasil = (suhu * 9/5) + 32;
                satuanHasil = "°F";
            } else if (satuanTujuan.equals("Reamur")) {
                hasil = suhu * 4/5;
                satuanHasil = "°R";
            } else if (satuanTujuan.equals("Kelvin")) {
                hasil = suhu + 273.15;
                satuanHasil = "K";
            } else {
                hasil = suhu;
                satuanHasil = "°C";
            }
        } 
        // Konversi dari Fahrenheit
        else if (satuanAwal.equals("Fahrenheit")) {
            if (satuanTujuan.equals("Celsius")) {
                hasil = (suhu - 32) * 5/9;
                satuanHasil = "°C";
            } else if (satuanTujuan.equals("Reamur")) {
                hasil = (suhu - 32) * 4/9;
                satuanHasil = "°R";
            } else if (satuanTujuan.equals("Kelvin")) {
                hasil = (suhu - 32) * 5/9 + 273.15;
                satuanHasil = "K";
            } else {
                hasil = suhu;
                satuanHasil = "°F";
            }
        } 
        // Konversi dari Reamur
        else if (satuanAwal.equals("Reamur")) {
            if (satuanTujuan.equals("Celsius")) {
                hasil = suhu * 5/4;
                satuanHasil = "°C";
            } else if (satuanTujuan.equals("Fahrenheit")) {
                hasil = (suhu * 9/4) + 32;
                satuanHasil = "°F";
            } else if (satuanTujuan.equals("Kelvin")) {
                hasil = (suhu * 5/4) + 273.15;
                satuanHasil = "K";
            } else {
                hasil = suhu;
                satuanHasil = "°R";
            }
        } 
        // Konversi dari Kelvin
        else if (satuanAwal.equals("Kelvin")) {
            if (satuanTujuan.equals("Celsius")) {
                hasil = suhu - 273.15;
                satuanHasil = "°C";
            } else if (satuanTujuan.equals("Fahrenheit")) {
                hasil = (suhu - 273.15) * 9/5 + 32;
                satuanHasil = "°F";
            } else if (satuanTujuan.equals("Reamur")) {
                hasil = (suhu - 273.15) * 4/5;
                satuanHasil = "°R";
            } else {
                hasil = suhu;
                satuanHasil = "K";
            }
            
        if (rbCelsius.isSelected()) {
            satuanTujuan = "Celsius";
        } else if (rbFahrenheit.isSelected()) {
            satuanTujuan = "Fahrenheit";
        } else if (rbReamur.isSelected()) {
            satuanTujuan = "Reamur";
        } else if (rbKelvin.isSelected()) {
            satuanTujuan = "Kelvin";
        }
        }

        // Menampilkan hasil dengan format 2 angka desimal
        lblOutput.setText(String.format("%.2f %s", hasil, satuanHasil));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cmbSuhuActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
          try {
        double suhu = Double.parseDouble(txtSuhu.getText());
        double hasil = 0;
        String satuanHasil = "";

        String satuanAwal = (String) cmbSuhu.getSelectedItem();
        String satuanTujuan = "";

        if (rbCelsius.isSelected()) satuanTujuan = "Celsius";
        else if (rbFahrenheit.isSelected()) satuanTujuan = "Fahrenheit";
        else if (rbReamur.isSelected()) satuanTujuan = "Reamur";
        else if (rbKelvin.isSelected()) satuanTujuan = "Kelvin";

        if (satuanAwal.equals("Celsius")) {
            if (satuanTujuan.equals("Fahrenheit")) {
                hasil = (suhu * 9/5) + 32;
                satuanHasil = "°F";
            } else if (satuanTujuan.equals("Reamur")) {
                hasil = suhu * 4/5;
                satuanHasil = "°R";
            } else if (satuanTujuan.equals("Kelvin")) {
                hasil = suhu + 273.15;
                satuanHasil = "K";
            } else {
                hasil = suhu;
                satuanHasil = "°C";
            }
        } else if (satuanAwal.equals("Fahrenheit")) {
            // Konversi dari Fahrenheit ke satuan lain
            // (Tambahkan logika konversi yang sesuai)
        } else if (satuanAwal.equals("Reamur")) {
            // Konversi dari Reamur ke satuan lain
            // (Tambahkan logika konversi yang sesuai)
        } else if (satuanAwal.equals("Kelvin")) {
            // Konversi dari Kelvin ke satuan lain
            // (Tambahkan logika konversi yang sesuai)
        }

        lblOutput.setText(String.format("%.2f %s", hasil, satuanHasil));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       btnHapus.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        txtSuhu.setText("");
        lblOutput.setText("0.0");
        cmbSuhu.setSelectedIndex(0);
        bgSuhu.clearSelection();
    }
});
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuhuActionPerformed
        txtSuhu.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c >= '0' && c <= '9') || 
              c == '.' || 
              c == '-' || 
              c == KeyEvent.VK_BACK_SPACE || 
              c == KeyEvent.VK_DELETE)) {
            e.consume();
        }
    }
});
    }//GEN-LAST:event_txtSuhuActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new KonversiSuhu());
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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSuhu;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JComboBox<String> cmbSuhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
