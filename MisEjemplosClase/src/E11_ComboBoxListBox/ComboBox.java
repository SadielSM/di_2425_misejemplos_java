/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E11_ComboBoxListBox;

import javax.swing.DefaultListModel;

/**
 *
 * @author DAM2Alu17
 */
public class ComboBox extends javax.swing.JFrame {

    /**
     * Creates new form ComboBox
     */
    DefaultListModel dlm;
    
    String labels[] = { "A", "B", "C", "D","E", "F", "G", "H","I", "J" };
  
    
    public ComboBox() {
        initComponents();
        
        dlm = new DefaultListModel();
        jListOpciones.setModel(dlm);
        
        
        for(int i=0;i<20;i++){
            dlm.addElement("Opcion "+i);
        }//del for
        
        jComboBoxEtiquetas.removeAllItems();
        for(String label : labels){
            jComboBoxEtiquetas.addItem(label);
        }
            
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOpciones = new javax.swing.JList<>();
        jButtonAnyadir = new javax.swing.JButton();
        jComboBoxEtiquetas = new javax.swing.JComboBox<>();
        jButtonIndice = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComboBox");
        setForeground(new java.awt.Color(0, 153, 51));

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Huesca", "Zaragoza", "Teruel", "Real Sociedad" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jListOpciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListOpciones);

        jButtonAnyadir.setText("Añadir");
        jButtonAnyadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyadirActionPerformed(evt);
            }
        });

        jComboBoxEtiquetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEtiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEtiquetasActionPerformed(evt);
            }
        });

        jButtonIndice.setText("Índice");
        jButtonIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndiceActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAnyadir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIndice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrar)))
                .addGap(42, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnyadir)
                    .addComponent(jButtonIndice)
                    .addComponent(jButtonBorrar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonAnyadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyadirActionPerformed
        for(int i=20;i<30;i++){
            dlm.addElement("Opcion "+i);
        }//del for
        
        
    }//GEN-LAST:event_jButtonAnyadirActionPerformed

    private void jComboBoxEtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEtiquetasActionPerformed
        // TODO add your handling code here:
        if(jComboBoxEtiquetas.getSelectedIndex()==-1){
            System.out.println("No se ha seleccionado ninguna opcion");
        }else{
            System.out.println("Se ha seleccionado el elemento "+jComboBoxEtiquetas.getItemAt(jComboBoxEtiquetas.getSelectedIndex()));
        }
    }//GEN-LAST:event_jComboBoxEtiquetasActionPerformed

    private void jButtonIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndiceActionPerformed
        // TODO add your handling code here:
       
        if(jListOpciones.getSelectedIndex()==-1){
          System.out.print("No se ha seleccionado ningun elemento");
        }else if (jListOpciones.getSelectedIndices().length !=0) {
            for (int i : jListOpciones.getSelectedIndices()) {
                System.out.println("Indice: "+ i +"  Item: "+ dlm.getElementAt(i));
            }
              
        }
       
    }//GEN-LAST:event_jButtonIndiceActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
       
        if(jListOpciones.getSelectedIndex()==-1){
            System.out.println("No se ha seleccionado ningun elemento");
        }else if (jListOpciones.getSelectedValue().length()!=0) {
            for (int i : jListOpciones.getSelectedIndices()) {
                dlm.remove(i);
            }
                  
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnyadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonIndice;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEtiquetas;
    private javax.swing.JList<String> jListOpciones;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
