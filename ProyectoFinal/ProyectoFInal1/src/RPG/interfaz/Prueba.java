
package RPG.interfaz;

import RPG.archivos.ArchivoArma;
import RPG.archivos.ArchivoJugabilidad;
import RPG.archivos.ArchivoJugador;
import RPG.archivos.ArchivoVehiculo;
import RPG.armas.Arma;
import RPG.jugador.Jugador;
import RPG.vehiculos.Vehiculo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
        DefaultTableModel modeloJugador = (DefaultTableModel) tablaJugador.getModel();
        tablaJugador.setRowSorter(new TableRowSorter(modeloJugador));
        
        DefaultTableModel modeloVehiculo = (DefaultTableModel) tablaVehiculo.getModel();
        tablaVehiculo.setRowSorter(new TableRowSorter(modeloVehiculo));
        
        DefaultTableModel modeloArma = (DefaultTableModel) tablaArma.getModel();
        tablaArma.setRowSorter(new TableRowSorter(modeloArma));
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
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"REGISTRO", "JUGADOR", "NIVEL","EXPERIENCIA","DINERO"}));
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
            listado[i][4]= cadena = String.valueOf(listaVehiculo.get(i).getEliminaciones());
        }
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"REGISTRO", "NOMBRE", "TIPO VEHICULO", "PERTENECE A","KILLS"}));
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
        jLabel2 = new javax.swing.JLabel();
        armasinfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1220, 180));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 1220, 170));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 1220, 150));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PUEDE ORDENAR LOS ELEMENTOS DE LAS TABLAS AL HACER CLICK SOBRE LOS TITULOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        armasinfo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        armasinfo.setForeground(new java.awt.Color(255, 255, 255));
        armasinfo.setText("ARMAS");
        jPanel1.add(armasinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 180, 30));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JUGADORES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 180, 30));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VEHICULOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1290, 720));

        jButton1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 820, 150, 50));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADISTICAS DEL JUEGO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 340, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 880));

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
    private javax.swing.JLabel armasinfo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaArma;
    private javax.swing.JTable tablaJugador;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
