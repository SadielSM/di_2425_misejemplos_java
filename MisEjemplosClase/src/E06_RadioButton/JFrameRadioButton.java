/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E06_RadioButton;

/**
 *
 * @author DAM2Alu17
 */
public class JFrameRadioButton extends javax.swing.JFrame {

    /**
     * Creates new form JFrameRadioButton
     */
    public JFrameRadioButton() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelColores = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();
        btn_Seleccionar = new javax.swing.JButton();
        jRadioButtonVerde = new javax.swing.JRadioButton();
        jRadioButtonAzul = new javax.swing.JRadioButton();
        jRadioButtonRojo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RadioButtonColores");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("COLORES");

        jPanelColores.setBackground(new java.awt.Color(153, 153, 255));
        jPanelColores.setForeground(new java.awt.Color(0, 0, 0));

        jLabelResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(51, 51, 255));
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("SIN COLOR");

        btn_Seleccionar.setText("SELECCIONAR");
        btn_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonVerde);
        jRadioButtonVerde.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButtonVerde.setText("Verde");
        jRadioButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVerdeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAzul);
        jRadioButtonAzul.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButtonAzul.setText("Azul");

        buttonGroup1.add(jRadioButtonRojo);
        jRadioButtonRojo.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButtonRojo.setText("Rojo");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("COLORES");

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColoresLayout.createSequentialGroup()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelColoresLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRojo)
                            .addComponent(jRadioButtonAzul)
                            .addComponent(jRadioButtonVerde))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColoresLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonVerde)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonAzul)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btn_Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionarActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonVerde.isSelected()){
            jLabelResultado.setText("Verde");
        }else if(jRadioButtonAzul.isSelected()){
                jLabelResultado.setText("Azul");
        }else if (jRadioButtonRojo.isSelected()) {
            jLabelResultado.setText("Rojo");
        }
               
    }//GEN-LAST:event_btn_SeleccionarActionPerformed

    private void jRadioButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonVerdeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRadioButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRadioButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Seleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JRadioButton jRadioButtonAzul;
    private javax.swing.JRadioButton jRadioButtonRojo;
    private javax.swing.JRadioButton jRadioButtonVerde;
    // End of variables declaration//GEN-END:variables
}
