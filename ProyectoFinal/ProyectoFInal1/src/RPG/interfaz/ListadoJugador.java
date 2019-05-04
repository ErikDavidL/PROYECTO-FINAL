
package RPG.interfaz;

import RPG.jugador.Jugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListadoJugador extends javax.swing.JFrame {

    public static ArrayList<Jugador> listaJugador =  new ArrayList<Jugador>();
    public static String dato;
    
    public ListadoJugador() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaJugador = (ArrayList<Jugador>) IngresarJugador.listaJugador.clone();
        mostrarTabla();
    }
    
    public void mostrarTabla(){
        String listado[][] = new String[listaJugador.size()][2];
        for (int i = 0; i < listaJugador.size(); i++) {
            listado[i][0]=listaJugador.get(i).getNombre();
        }
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            listado,
            new String [] {
                "JUGADOR"
            }
        ));
    }    
    public String obtenerJugador(){
        int fila = this.tablaJugador.getSelectedRow();
        int columna = this.tablaJugador.getSelectedColumn();
        dato = String.valueOf(this.tablaJugador.getValueAt(fila,columna));
        return dato;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dibujo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugador = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        verDato = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/cartel.jpg"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -30, 480, 530));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("LISTADO DE JUGADORES");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        tablaJugador = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaJugador.setBackground(new java.awt.Color(120, 210, 136));
        tablaJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        tablaJugador.setForeground(new java.awt.Color(0, 0, 0));
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "JUGADOR"
            }
        ));
        tablaJugador.setGridColor(new java.awt.Color(0, 0, 0));
        tablaJugador.setName("TABLA DE JUGADORES"); // NOI18N
        tablaJugador.setRowMargin(4);
        tablaJugador.setSelectionBackground(new java.awt.Color(0, 102, 51));
        tablaJugador.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJugadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJugador);
        if (tablaJugador.getColumnModel().getColumnCount() > 0) {
            tablaJugador.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 340, 280));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, 50));

        verDato.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        verDato.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(verDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 170, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        SeleccionListado selecListado = new SeleccionListado();
        selecListado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void tablaJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJugadorMouseClicked
        //JOptionPane.showMessageDialog(null, "FUNCIONA EL EVENTO");
        obtenerJugador();
        verDato.setText(dato);
        ListadoVehiculo vehiculo = new ListadoVehiculo();
        vehiculo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_tablaJugadorMouseClicked

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
            java.util.logging.Logger.getLogger(ListadoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaJugador;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel verDato;
    // End of variables declaration//GEN-END:variables
}
