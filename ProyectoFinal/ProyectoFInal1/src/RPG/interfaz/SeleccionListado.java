
package RPG.interfaz;

public class SeleccionListado extends javax.swing.JFrame {

    public SeleccionListado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        verVehiculos = new javax.swing.JButton();
        verJugadores = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        dibujo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("LISTADOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        verVehiculos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        verVehiculos.setForeground(new java.awt.Color(0, 0, 0));
        verVehiculos.setText("VEHÍCULOS");
        verVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVehiculosActionPerformed(evt);
            }
        });
        getContentPane().add(verVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 50));

        verJugadores.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        verJugadores.setForeground(new java.awt.Color(0, 0, 0));
        verJugadores.setText("JUGADORES");
        verJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(verJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, 50));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 140, 50));

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/z.jpg"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 260, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        OpcionesCrear crear = new OpcionesCrear();
        crear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void verVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVehiculosActionPerformed
        ListadoVehiculo listadoVehiculo = new ListadoVehiculo();
        listadoVehiculo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_verVehiculosActionPerformed

    private void verJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verJugadoresActionPerformed
        ListadoJugador listadoJugador = new ListadoJugador();
        listadoJugador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_verJugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton verJugadores;
    private javax.swing.JButton verVehiculos;
    // End of variables declaration//GEN-END:variables
}
