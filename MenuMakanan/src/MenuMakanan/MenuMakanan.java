package MenuMakanan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simbolon-PC
 */

import javax.swing.JOptionPane;
public class MenuMakanan extends javax.swing.JFrame {
        public static int hargaSoto = 5000;
        public static int hargaRawon = 6000;
        public static int hargaBakso = 4000;
        public static int hargaGudeg = 8000;
    /**
     * Creates new form MenuMakanan
     */
    public MenuMakanan() {
      
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        tfGudeg = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        cbSoto.setText("Soto : 5000");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("Rawon : 6000");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setText("Bakso : 4000");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setText("Gudeg : 8000");
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Makanan");

        jLabel2.setText("Hitung :");

        tfSoto.setEditable(false);
        tfSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSotoActionPerformed(evt);
            }
        });

        tfRawon.setEditable(false);

        tfBakso.setEditable(false);

        tfTotal.setEditable(false);
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        tfGudeg.setEditable(false);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbRawon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbGudeg)
                                    .addComponent(cbSoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbBakso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfRawon)
                                    .addComponent(tfBakso)
                                    .addComponent(tfGudeg)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bHitung)
                                        .addGap(18, 18, 18)
                                        .addComponent(bClear)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfTotal)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRawon)
                    .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGudeg)
                    .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bClear))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        if (cbSoto.isSelected() == true){
            tfSoto.setEditable(true);
        }
        else{
            tfSoto.setEditable(false);
            tfSoto.setText("");
        }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void tfSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSotoActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
//        float Angka1, Angka2, Hasil1;
//        
//        Angka1 = Float.parseFloat(isiSoto.getText());
//        Angka2 = Float.parseFloat(isi.getText());
//        Hasil1 = Angka1 + Angka2;
//        Hasil.setText(String.valueOf(Hasil1));
    }//GEN-LAST:event_tfTotalActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
            if (cbRawon.isSelected() == true){
            tfRawon.setEditable(true);
        }
        else{
            tfRawon.setEditable(false);
            tfRawon.setText("");
        }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        if (cbBakso.isSelected() == true){
            tfBakso.setEditable(true);
        }
        else{
            tfBakso.setEditable(false);
            tfBakso.setText("");
        }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        if (cbGudeg.isSelected() == true){
            tfGudeg.setEditable(true);
        }
        else{
            tfGudeg.setEditable(false);
            tfGudeg.setText("");
        }
    }//GEN-LAST:event_cbGudegActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
    int totalHarga = 0;
    
        if(cbSoto.isSelected()){
            if(!tfSoto.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfSoto.getText())* hargaSoto;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbBakso.isSelected()){
            if(!tfBakso.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfBakso.getText())* hargaBakso;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbRawon.isSelected()){
            if(!tfRawon.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfRawon.getText())* hargaRawon;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(cbGudeg.isSelected()){
            if(!tfGudeg.getText().equalsIgnoreCase("")){
                totalHarga+=Integer.parseInt(tfGudeg.getText())* hargaGudeg;
            }
            else
            JOptionPane.showMessageDialog(null,"Maaf Jumlah Makanan Belum Terisi","Error",JOptionPane.ERROR_MESSAGE);
        }
        tfTotal.setText(""+totalHarga);
    }//GEN-LAST:event_bHitungActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
tfSoto.setText("");
tfBakso.setText("");
tfRawon.setText("");
tfGudeg.setText("");
tfTotal.setText("");
cbSoto.setSelected(false);
cbBakso.setSelected(false);
cbRawon.setSelected(false);
cbGudeg.setSelected(false);
tfSoto.setEditable(false);
tfBakso.setEditable(false);
tfRawon.setEditable(false);
tfGudeg.setEditable(false);
    }//GEN-LAST:event_bClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bHitung;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfGudeg;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSoto;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
