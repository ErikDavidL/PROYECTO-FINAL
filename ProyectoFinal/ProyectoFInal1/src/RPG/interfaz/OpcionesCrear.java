
package RPG.interfaz;

public class OpcionesCrear extends javax.swing.JFrame {

    public OpcionesCrear() {
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
        crearArma = new javax.swing.JButton();
        listados = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        casco = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("MENÚ DE CREACIONES");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        crearJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crearJugador.setForeground(new java.awt.Color(0, 0, 0));
        crearJugador.setText("CREAR JUGADOR");
        crearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(crearJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, 50));

        crearVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crearVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        crearVehiculo.setText("CREAR VEHICULO");
        crearVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(crearVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, 50));

        crearArma.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crearArma.setForeground(new java.awt.Color(0, 0, 0));
        crearArma.setText("CREAR ARMA");
        crearArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArmaActionPerformed(evt);
            }
        });
        getContentPane().add(crearArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 50));

        listados.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        listados.setForeground(new java.awt.Color(0, 0, 0));
        listados.setText("LISTADOS");
        listados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadosActionPerformed(evt);
            }
        });
        getContentPane().add(listados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, 50));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 180, 50));

        casco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/casco.png"))); // NOI18N
        getContentPane().add(casco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 370, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void crearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJugadorActionPerformed
        IngresarJugador jugador = new IngresarJugador();
        jugador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearJugadorActionPerformed

    private void crearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVehiculoActionPerformed
        IngresarVehiculos vehiculo = new IngresarVehiculos();
        vehiculo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearVehiculoActionPerformed

    private void crearArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArmaActionPerformed
        IngresarArma arma = new IngresarArma();
        arma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearArmaActionPerformed

    private void listadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadosActionPerformed
        SeleccionListado verListados = new SeleccionListado();
        verListados.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listadosActionPerformed

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
    private javax.swing.JButton crearArma;
    private javax.swing.JButton crearJugador;
    private javax.swing.JButton crearVehiculo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton listados;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
