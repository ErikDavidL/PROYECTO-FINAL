
package RPG.interfaz;

import RPG.archivos.ArchivoArma;
import RPG.archivos.ArchivoJugabilidad;
import RPG.archivos.ArchivoJugador;
import RPG.archivos.ArchivoVehiculo;
import RPG.armas.Arma;
import RPG.jugador.Jugador;
import RPG.vehiculos.Vehiculo;
import java.util.ArrayList;

public class Prueba extends javax.swing.JFrame {

    ArrayList<Jugador> listaJugador = new ArrayList<>();
    ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();
    ArrayList<Arma> listaArma = new ArrayList<>();
    Jugador jugadorPartida = null;
    
    ArchivoJugador archivoJugador = new ArchivoJugador();
    ArchivoArma archivoArma = new ArchivoArma();
    ArchivoVehiculo archivoVehiculo = new ArchivoVehiculo();
    ArchivoJugabilidad archivoPartida = new ArchivoJugabilidad();
    
    public Prueba() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaJugador = archivoJugador.leerArchivo();
        listaArma = archivoArma.leerArchivo();
        listaVehiculo = archivoVehiculo.leerArchivo();
        jugadorPartida = archivoPartida.leerJugador();
        tablaJugadores();
        tablaArmas();
        tablaVehiculos();
        tablaJugadorPartida();
    }
    public void tablaJugadorPartida(){
        String listado[][] = new String[2][4];
        String cadena;
        for (int i = 0; i < 1; i++) {
            listado[i][0]= cadena = String.valueOf(jugadorPartida.getIdentificador());
            listado[i][1]= jugadorPartida.getNombre();
            listado[i][2]= cadena = String.valueOf(jugadorPartida.getNivel());
        } 
        tablaPartida.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NUMERO", "JUGADOR", "NIVEL"}));        
    }
    public void tablaJugadores(){
        String listado[][] = new String[listaJugador.size()][5];
        String cadena;
        for (int i = 0; i < listaJugador.size(); i++) {
            listado[i][0]= cadena = String.valueOf(listaJugador.get(i).getIdentificador());
            listado[i][1]=listaJugador.get(i).getNombre();
            listado[i][2]= cadena = String.valueOf(listaJugador.get(i).getNivel());
            listado[i][3]= cadena = String.valueOf(listaJugador.get(i).getExperiencia());
            listado[i][4]= cadena = String.valueOf(listaJugador.get(i).getDinero());
        } 
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NUMERO", "JUGADOR", "NIVEL","EXPERIENCIA","DINERO"}));
    }
    public void tablaArmas(){
        String listado[][] = new String[listaArma.size()][5];
        String cadena;
        for (int i = 0; i < listaArma.size(); i++) {
            listado[i][0]= listaArma.get(i).getNombre();
            listado[i][1]= listaArma.get(i).getTipoArma();
            listado[i][2]= listaArma.get(i).getAtaque();
            listado[i][3]= listaArma.get(i).getPunteria();
            listado[i][4]= listaArma.get(i).getPrecio();
        } 
        tablaArma.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NOMBRE", "TIPO DE ARMA", "ATAQUE", "PUNTERIA", "PRECIO"}));
    }
    public void tablaVehiculos(){
        String listado[][] = new String[listaVehiculo.size()][6];
        String cadena;
        for (int i = 0; i < listaVehiculo.size(); i++) {
            listado[i][0]= cadena = String.valueOf(listaVehiculo.get(i).getIdentificador());
            listado[i][1]= listaVehiculo.get(i).getNombre();
            listado[i][2]= listaVehiculo.get(i).getTipoVehiculo();
            listado[i][3]= listaVehiculo.get(i).getCreadorAuto();
            listado[i][4]= cadena = String.valueOf(listaVehiculo.get(i).getCodigoCreador());
            listado[i][5]= cadena = String.valueOf(listaVehiculo.get(i).getEliminaciones());
        }
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NUMERO", "NOMBRE", "TIPO VEHICULO", "PERTENECE A","REGISTRO CREADOR","KILLS"}));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugador = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArma = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPartida = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUMERO", "JUGADOR", "NIVEL", "EXPERIENCIA", "DINERO"
            }
        ));
        jScrollPane1.setViewportView(tablaJugador);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, 1240, 106));

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "TIPO VEHICULO", "PERTENECE A", "REGISTRO CREADOR", "KILLS"
            }
        ));
        jScrollPane2.setViewportView(tablaVehiculo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 145, 1210, 126));

        tablaArma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "TIPO DE ARMA", "ATAQUE", "PUNTERIA", "PRECIO"
            }
        ));
        jScrollPane3.setViewportView(tablaArma);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 303, 1100, 131));

        tablaPartida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NUMERO", "JUGADOR", "NIVEL"
            }
        ));
        jScrollPane5.setViewportView(tablaPartida);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1080, 60));

        jButton1.setText("REGRESA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1260, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaArma;
    private javax.swing.JTable tablaJugador;
    private javax.swing.JTable tablaPartida;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
