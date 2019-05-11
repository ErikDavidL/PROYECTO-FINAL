
package RPG.interfaz;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        iniciarJuego = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        estadisticas = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        dibujo1 = new javax.swing.JLabel();
        dibujo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("IT IS WAR!");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/conkerAndFriends.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 790, -1));

        iniciarJuego.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        iniciarJuego.setForeground(new java.awt.Color(0, 0, 0));
        iniciarJuego.setText("PARTIDA");
        iniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 150, 50));

        tienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        tienda.setForeground(new java.awt.Color(0, 0, 0));
        tienda.setText("TIENDA");
        tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendaActionPerformed(evt);
            }
        });
        getContentPane().add(tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 150, 50));

        crear.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        crear.setForeground(new java.awt.Color(0, 0, 0));
        crear.setText("CREAR");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 150, 50));

        estadisticas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        estadisticas.setForeground(new java.awt.Color(0, 0, 0));
        estadisticas.setText("ESTADÍSTICAS");
        getContentPane().add(estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 150, 50));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 150, 50));

        titulo2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("MENÚ PRINCIPAL");
        getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        dibujo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(dibujo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 790, 290));

        dibujo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(dibujo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        OpcionesCrear opcionesCrear = new OpcionesCrear();
        opcionesCrear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendaActionPerformed
        Tienda irTienda = new Tienda();
        irTienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tiendaActionPerformed

    private void iniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJuegoActionPerformed
        IniciarJuego juego = new IniciarJuego();
        juego.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iniciarJuegoActionPerformed


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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JLabel dibujo1;
    private javax.swing.JLabel dibujo2;
    private javax.swing.JButton estadisticas;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton iniciarJuego;
    private javax.swing.JButton salir;
    private javax.swing.JButton tienda;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
