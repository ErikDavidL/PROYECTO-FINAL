
package RPG.interfaz;

import RPG.archivos.ArchivoJugador;
import RPG.jugador.Jugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IngresarJugador extends javax.swing.JFrame {

    private ArrayList<Jugador> listaJugador = new ArrayList<>();
    private final int nivel = 1;
    private final int experiencia = 0;
    private final int dinero = 100;
    ArchivoJugador archivoJugador = new ArchivoJugador();
   
    public IngresarJugador() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaJugador = archivoJugador.leerArchivo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        infoJugador = new javax.swing.JLabel();
        nombreJugador = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        dibujo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO    JUGADOR");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 210, 40));

        infoJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoJugador.setForeground(new java.awt.Color(255, 255, 255));
        infoJugador.setText("INGRESE EL NOMBRE");
        getContentPane().add(infoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 30));

        nombreJugador.setBackground(new java.awt.Color(255, 255, 255));
        nombreJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        nombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 360, 40));

        guardar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(0, 0, 0));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 50));

        cancelar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("SALIR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 110, 50));

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/Tediz.png"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, 280));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int noIdentificador = listaJugador.size()+1;
        Jugador jugador = new Jugador(nombreJugador.getText(),nivel,experiencia,noIdentificador,dinero);
        listaJugador.add(jugador);
        archivoJugador.guardarArchivo(listaJugador);
        JOptionPane.showMessageDialog(null, "JUGADOR CREADO CON ÉXITO");
        nombreJugador.setText(null);
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        OpcionesCrear opcionesCrear = new OpcionesCrear();
        opcionesCrear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel infoJugador;
    private javax.swing.JTextField nombreJugador;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
