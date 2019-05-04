
package RPG.interfaz;

import javax.swing.JOptionPane;

public class IniciarJuego extends javax.swing.JFrame {

    public static int fila,columna;
    
    public IniciarJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void definirDimension(){
        if(ingresarDimensiones.getSelectedItem() == "----------------"){
           fila = 0;
           columna =0;
        }
        if(ingresarDimensiones.getSelectedItem() == "FACIL     4X4"){
           fila = 4;
           columna =4;
        }
        if(ingresarDimensiones.getSelectedItem() == "MEDIO   6x4"){
           fila = 6;
           columna =4;
        }
        if(ingresarDimensiones.getSelectedItem() == "DIFICIL  8X9"){
           fila = 8;
           columna =9;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        ingresarDimensiones = new javax.swing.JComboBox<>();
        empezar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("SELECCIONE EL MODO DE JUEGO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        ingresarDimensiones.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        ingresarDimensiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "FACIL     4X4", "MEDIO   6x4", "DIFICIL  8X9" }));
        ingresarDimensiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ingresarDimensionesItemStateChanged(evt);
            }
        });
        getContentPane().add(ingresarDimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        empezar.setText("EMPEZAR");
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        getContentPane().add(empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarDimensionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingresarDimensionesItemStateChanged
        definirDimension();
    }//GEN-LAST:event_ingresarDimensionesItemStateChanged

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        if(ingresarDimensiones.getSelectedItem() == "----------------"){
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UN MODO DE JUEGO");
        }else{
            ListadoJugador listadoJugador = new ListadoJugador();
            listadoJugador.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_empezarActionPerformed
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
            java.util.logging.Logger.getLogger(IniciarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empezar;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> ingresarDimensiones;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
