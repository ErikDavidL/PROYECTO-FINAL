
package RPG.interfaz;

public class OpcionesJuego extends javax.swing.JFrame {

    public OpcionesJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        crearJugador = new javax.swing.JButton();
        crearVehiculo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        casco = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("MODO DE JUEGO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        crearJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crearJugador.setForeground(new java.awt.Color(0, 0, 0));
        crearJugador.setText("UN JUGADOR");
        crearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(crearJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, 50));

        crearVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crearVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        crearVehiculo.setText("MULTIJUGADOR");
        crearVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(crearVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, 50));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, 50));

        casco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/casco.png"))); // NOI18N
        getContentPane().add(casco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 370, 380));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void crearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJugadorActionPerformed
        ListadoJugador multi = new ListadoJugador();
        multi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearJugadorActionPerformed

    private void crearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVehiculoActionPerformed
        ListadoMultiJugador multi = new ListadoMultiJugador();
        multi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casco;
    private javax.swing.JButton crearJugador;
    private javax.swing.JButton crearVehiculo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
