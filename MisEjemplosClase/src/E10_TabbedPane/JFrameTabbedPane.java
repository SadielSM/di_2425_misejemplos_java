/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E10_TabbedPane;

/**
 *
 * @author DAM2Alu17
 */
public class JFrameTabbedPane extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTabbedPane
     */
    public JFrameTabbedPane() {
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

        jPanelMain = new javax.swing.JPanel();
        jTabbedPaneGestor = new javax.swing.JTabbedPane();
        jPanelCoche = new javax.swing.JPanel();
        jLabelCoche = new javax.swing.JLabel();
        jPanelEmpleados = new javax.swing.JPanel();
        jLabelEmpledos = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonIzquierda = new javax.swing.JButton();
        jButtonDerecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanelMain.setBackground(new java.awt.Color(0, 153, 51));

        jTabbedPaneGestor.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneGestor.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPaneGestor.setForeground(new java.awt.Color(153, 51, 0));
        jTabbedPaneGestor.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanelCoche.setBackground(new java.awt.Color(153, 255, 204));

        jLabelCoche.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCoche.setFont(new java.awt.Font("Segoe UI Historic", 2, 24)); // NOI18N
        jLabelCoche.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoche.setText("Coches");

        javax.swing.GroupLayout jPanelCocheLayout = new javax.swing.GroupLayout(jPanelCoche);
        jPanelCoche.setLayout(jPanelCocheLayout);
        jPanelCocheLayout.setHorizontalGroup(
            jPanelCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCocheLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanelCocheLayout.setVerticalGroup(
            jPanelCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCocheLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPaneGestor.addTab("Coche", jPanelCoche);

        jPanelEmpleados.setBackground(new java.awt.Color(153, 255, 204));

        jLabelEmpledos.setFont(new java.awt.Font("Segoe UI Historic", 2, 24)); // NOI18N
        jLabelEmpledos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmpledos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpledos.setText("Empleados");

        javax.swing.GroupLayout jPanelEmpleadosLayout = new javax.swing.GroupLayout(jPanelEmpleados);
        jPanelEmpleados.setLayout(jPanelEmpleadosLayout);
        jPanelEmpleadosLayout.setHorizontalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelEmpledos, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelEmpleadosLayout.setVerticalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelEmpledos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPaneGestor.addTab("Empleados", jPanelEmpleados);

        jPanelClientes.setBackground(new java.awt.Color(153, 255, 204));
        jPanelClientes.setForeground(new java.awt.Color(0, 0, 0));

        jLabelClientes.setFont(new java.awt.Font("Segoe UI Historic", 2, 24)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientes.setText("Clientes");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPaneGestor.addTab("Clientes", jPanelClientes);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 2, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("APLICACIÓN INTEGRAL PARA LA GESTIÓN DE COCHES");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneGestor))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneGestor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIzquierda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIzquierda.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIzquierda.setText("<");
        jButtonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzquierdaActionPerformed(evt);
            }
        });

        jButtonDerecha.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDerecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDerecha.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDerecha.setText(">");
        jButtonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIzquierda)
                    .addComponent(jButtonDerecha))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void jButtonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzquierdaActionPerformed
        // TODO add your handling code here:
        if(jButtonIzquierda.isSelected()){
            
        }
    }//GEN-LAST:event_jButtonIzquierdaActionPerformed

    private void jButtonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTabbedPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDerecha;
    private javax.swing.JButton jButtonIzquierda;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelCoche;
    private javax.swing.JLabel jLabelEmpledos;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelCoche;
    private javax.swing.JPanel jPanelEmpleados;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTabbedPane jTabbedPaneGestor;
    // End of variables declaration//GEN-END:variables
}
