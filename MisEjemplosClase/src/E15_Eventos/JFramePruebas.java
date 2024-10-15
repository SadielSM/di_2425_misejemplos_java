/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E15_Eventos;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author DAM2Alu17
 */
public class JFramePruebas extends javax.swing.JFrame {

    /**
     * Creates new form JFramePruebas
     */
    public JFramePruebas() {
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

        jTextFieldCadena = new javax.swing.JTextField();
        jLabelCadena = new javax.swing.JLabel();
        jTextFieldCopiaCadena = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldCadena.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCadena.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCadena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCadena.setText("Escribe dentro");
        jTextFieldCadena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCadenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCadenaFocusLost(evt);
            }
        });
        jTextFieldCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadenaActionPerformed(evt);
            }
        });
        jTextFieldCadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCadenaKeyPressed(evt);
            }
        });

        jLabelCadena.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCadena.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextFieldCopiaCadena.setEditable(false);
        jTextFieldCopiaCadena.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCopiaCadena.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCopiaCadena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCopiaCadena.setText("Escribe dentro");
        jTextFieldCopiaCadena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCopiaCadenaFocusLost(evt);
            }
        });
        jTextFieldCopiaCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCopiaCadenaActionPerformed(evt);
            }
        });
        jTextFieldCopiaCadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCopiaCadenaKeyPressed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextFieldCopiaCadena, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldCadena, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(jLabelCadena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextFieldCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCopiaCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadenaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Estamos lanzando con un click");
    }//GEN-LAST:event_jTextFieldCadenaActionPerformed

    private void jTextFieldCadenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCadenaFocusLost
        // TODO add your handling code here:
        jLabelCadena.setText(jTextFieldCadena.getText());
       // jTextFieldCadena.setText("Escribe dentro");
       jTextField1.requestFocus();
    }//GEN-LAST:event_jTextFieldCadenaFocusLost

    private void jTextFieldCopiaCadenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCopiaCadenaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCopiaCadenaFocusLost

    private void jTextFieldCopiaCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCopiaCadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCopiaCadenaActionPerformed

    private void jTextFieldCopiaCadenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCopiaCadenaKeyPressed
        // TODO add your handling code here:
        jTextFieldCopiaCadena.setText(jTextFieldCadena.getText());
    }//GEN-LAST:event_jTextFieldCopiaCadenaKeyPressed

    private void jTextFieldCadenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCadenaKeyPressed
        // TODO add your handling code here:
        if(jTextFieldCadena.getText().length()>10){
            jTextFieldCadena.setBackground(Color.blue);
        }else{
            jTextFieldCadena.setBackground(Color.white);
        }
        jTextFieldCadena.setText(jTextFieldCadena.getText());
            
    }//GEN-LAST:event_jTextFieldCadenaKeyPressed

    private void jTextFieldCadenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCadenaFocusGained
        // TODO add your handling code here:
        jTextFieldCadena.setText("");
    }//GEN-LAST:event_jTextFieldCadenaFocusGained

   
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
            java.util.logging.Logger.getLogger(JFramePruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePruebas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCadena;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCadena;
    private javax.swing.JTextField jTextFieldCopiaCadena;
    // End of variables declaration//GEN-END:variables
}
