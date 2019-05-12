
package RPG.interfaz;

import RPG.archivos.ArchivoArma;
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
    
    ArchivoJugador archivoJugador = new ArchivoJugador();
    ArchivoArma archivoArma = new ArchivoArma();
    ArchivoVehiculo archivoVehiculo = new ArchivoVehiculo();
    
    public Prueba() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaJugador = archivoJugador.leerArchivo();
        listaArma = archivoArma.leerArchivo();
        listaVehiculo = archivoVehiculo.leerArchivo();
        tablaJugadores();
        tablaArmas();
        tablaVehiculos();
    }
    public void tablaJugadores(){
        String listado[][] = new String[listaJugador.size()][4];
        String cadena;
        for (int i = 0; i < listaJugador.size(); i++) {
            listado[i][0]= cadena = String.valueOf(listaJugador.get(i).getIdentificador());
            listado[i][1]=listaJugador.get(i).getNombre();
            listado[i][2]= cadena = String.valueOf(listaJugador.get(i).getNivel());
        } 
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NUMERO", "JUGADOR", "NIVEL"}));
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
        String listado[][] = new String[listaVehiculo.size()][4];
        String cadena;
        for (int i = 0; i < listaVehiculo.size(); i++) {
            listado[i][0]= cadena = String.valueOf(listaVehiculo.get(i).getIdentificador());
            listado[i][1]= listaVehiculo.get(i).getNombre();
            listado[i][2]= listaVehiculo.get(i).getTipoVehiculo();
            listado[i][3]= listaVehiculo.get(i).getCreadorAuto();
        }
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {"NUMERO", "NOMBRE", "TIPO VEHICULO", "PERTENECE A"}));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NUMERO", "JUGADOR", "NIVEL"
            }
        ));
        jScrollPane1.setViewportView(tablaJugador);

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "TIPO VEHICULO", "PERTENECE A"
            }
        ));
        jScrollPane2.setViewportView(tablaVehiculo);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaArma;
    private javax.swing.JTable tablaJugador;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
