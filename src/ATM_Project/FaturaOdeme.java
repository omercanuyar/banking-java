/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omerc
 */
public class FaturaOdeme extends javax.swing.JFrame {

    /**
     * Creates new form FaturaOdeme
     */
    public FaturaOdeme() {
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

        jBtnGeriIslemMenusu = new javax.swing.JButton();
        jBtnBakiyeGoster = new javax.swing.JButton();
        jBtnSuOde = new javax.swing.JButton();
        jBtnElektrikOde = new javax.swing.JButton();
        jBtnDogalgazOde = new javax.swing.JButton();
        jBtnInternetOde = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnGeriIslemMenusu.setText("Geri");
        jBtnGeriIslemMenusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGeriIslemMenusuActionPerformed(evt);
            }
        });

        jBtnBakiyeGoster.setText("Bakiye Göster");
        jBtnBakiyeGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBakiyeGosterActionPerformed(evt);
            }
        });

        jBtnSuOde.setText("Su Öde");
        jBtnSuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSuOdeActionPerformed(evt);
            }
        });

        jBtnElektrikOde.setText("Elektrik Öde");
        jBtnElektrikOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElektrikOdeActionPerformed(evt);
            }
        });

        jBtnDogalgazOde.setText("Doğalgaz Öde");
        jBtnDogalgazOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDogalgazOdeActionPerformed(evt);
            }
        });

        jBtnInternetOde.setText("İnternet Öde");
        jBtnInternetOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInternetOdeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Ödeme Miktarı:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bakiye"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnBakiyeGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnGeriIslemMenusu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnElektrikOde, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnInternetOde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDogalgazOde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDogalgazOde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnElektrikOde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnInternetOde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jBtnBakiyeGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jBtnGeriIslemMenusu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGeriIslemMenusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGeriIslemMenusuActionPerformed
            this.toBack();
            setVisible(false);
            new IslemMenusu().toFront();
            new IslemMenusu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jBtnGeriIslemMenusuActionPerformed

    private void jBtnBakiyeGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBakiyeGosterActionPerformed
try {
           Kullanıcı k = new Kullanıcı();
           Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bank","omer","omer");
           k.user_();
           Statement st = conn.createStatement();
           String sql = "SELECT BAKIYE FROM OMER.KULLANICI WHERE ID = '"+k.user_()+"' ";
           ResultSet rs = st.executeQuery(sql);
       
           
           while(rs.next()){
              double bakiye = rs.getDouble(1);
               String BAKIYE =String.valueOf(bakiye);
               String tbData[] = {BAKIYE};
               DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
               tblModel.addRow(tbData);
           }
          conn.close();
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_jBtnBakiyeGosterActionPerformed

    private void jBtnSuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSuOdeActionPerformed
        String miktar = jTextField1.getText();
        int t = Integer.parseInt(miktar);
        Kullanıcı k = new Kullanıcı();
        try {
            k.FaturaOdeme(t);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaOdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText(null);
        JOptionPane.showMessageDialog(null,"Su Faturası Ödendi","Fatura Ödeme",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jBtnSuOdeActionPerformed

    private void jBtnElektrikOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElektrikOdeActionPerformed
        String miktar = jTextField1.getText();
        int t = Integer.parseInt(miktar);
        Kullanıcı k = new Kullanıcı();
        try {
            k.FaturaOdeme(t);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaOdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText(null);
        JOptionPane.showMessageDialog(null,"Elektrik Faturası Ödendi","Fatura Ödeme",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnElektrikOdeActionPerformed

    private void jBtnDogalgazOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDogalgazOdeActionPerformed
      String miktar = jTextField1.getText();
        int t = Integer.parseInt(miktar);
        Kullanıcı k = new Kullanıcı();
        try {
            k.FaturaOdeme(t);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaOdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText(null);
        JOptionPane.showMessageDialog(null,"Doğalgaz Faturası Ödendi","Fatura Ödeme",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnDogalgazOdeActionPerformed

    private void jBtnInternetOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInternetOdeActionPerformed
       String miktar = jTextField1.getText();
        int t = Integer.parseInt(miktar);
        Kullanıcı k = new Kullanıcı();
        try {
            k.FaturaOdeme(t);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaOdeme.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText(null);
        JOptionPane.showMessageDialog(null,"İnternet Faturası Ödendi","Fatura Ödeme",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnInternetOdeActionPerformed

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
            java.util.logging.Logger.getLogger(FaturaOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaturaOdeme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBakiyeGoster;
    private javax.swing.JButton jBtnDogalgazOde;
    private javax.swing.JButton jBtnElektrikOde;
    private javax.swing.JButton jBtnGeriIslemMenusu;
    private javax.swing.JButton jBtnInternetOde;
    private javax.swing.JButton jBtnSuOde;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
