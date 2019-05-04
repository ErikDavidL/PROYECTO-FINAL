
package RPG.interfaz;

import RPG.escenario.IconoAvion;
import RPG.escenario.IconoTanque;
import RPG.escenario.Terreno;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Escenario extends javax.swing.JFrame {

    public static int recibirFila,recibirColumna;
    
    JButton[][] escenario;
    JLabel[][] matriz;
    Border borde = LineBorder.createBlackLineBorder();
    Terreno terrenos = new Terreno();
    String[][] tipoVehiculos;
    Icon iconoVehiculo;
    
    IconoAvion iconoAvion = new IconoAvion();
    IconoTanque iconoTanque = new IconoTanque();
    
    int[][] movimientos;
    int filas,columnas;
    String tipo;
    String trueFalse;
            
    public Escenario() {
        initComponents();
        this.setLocationRelativeTo(null);
        recibirFila = IniciarJuego.fila;
        recibirColumna = IniciarJuego.columna;
        generarEscenario(recibirFila,recibirColumna);
        
    }
    
    public void generarEscenario(int entradaFila,int entradaColumna){
        filas = entradaFila;
        columnas = entradaColumna;
        escenario = new JButton[filas][columnas];
        tipoVehiculos = new String[filas][columnas];
        
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                               
                escenario[fila][columna] = new JButton();
                //agregamos un borde a cada boton
                escenario[fila][columna].setBorder(borde);
                escenario[fila][columna].setIcon(terrenos.insertarIcono(filas));
                
                tipoVehiculos[fila][columna] = Terreno.nombreTemporal;
                
                ImagenVehiculo imagenVehiculo = new ImagenVehiculo();
                //iniciamos el ActionListener
                escenario[fila][columna].addActionListener(imagenVehiculo);
                //agregamos el boton del arreglo de botones en el panel Tablero                
                panelEscenario.add(escenario[fila][columna]);
                //redimensionamos el tamaño del tablero de ajedrez conforme al panel
                panelEscenario.setLayout(new GridLayout(filas, columnas));
                //actualizamos el panel
                panelEscenario.updateUI();
            }
        }
    }
    
    private class ImagenVehiculo implements ActionListener{
        //metodo para realizar una accion al momento de hacer click
        @Override
        public void actionPerformed(ActionEvent click) {
            for( int fila = 0 ; fila < recibirFila ; fila ++ ) {            
                for( int columna = 0 ; columna < recibirColumna ; columna ++ ) {
                    if(click.getSource().equals(escenario[fila][columna])){
                        
                        
                        prueba.setText(tipoVehiculos[fila][columna]);
                        tipo = tipoVehiculos[fila][columna];
                        
                        definirVehiculo(tipo);
                        
                        if(trueFalse.equals("false")){
                            verColumna.setText("NO SE MODIFICA LA IMAGEN");
                        }
                        if(trueFalse.equals("true")){                        
                        escenario[fila][columna].setIcon(iconoVehiculo);
                        }
                                                
                        panelEscenario.updateUI();  
                    }
                }
            }
        }     
    }
    
   public Icon definirVehiculo(String tipo){        
        if(tipoVehiculo.getText() != "Tanque" && tipoVehiculo.getText() != "Avión"){
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UN VEHICULO");
            trueFalse = "false";
        }
        if(tipoVehiculo.getText().equals("Tanque")){
            iconoVehiculo = iconoTanque.insertarIcono(filas, tipo);
            trueFalse = IconoTanque.trueFalse;
        }
        if(tipoVehiculo.getText().equals("Avión")){ 
            iconoVehiculo = iconoAvion.insertarIcono(filas, tipo);
            trueFalse = IconoAvion.trueFalse;
        }
        return iconoVehiculo;
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfo = new javax.swing.JPanel();
        verColumna = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        addVehiculo = new javax.swing.JButton();
        addAvion = new javax.swing.JButton();
        tipoVehiculo = new javax.swing.JLabel();
        prueba = new javax.swing.JLabel();
        panelEscenario = new javax.swing.JPanel();
        panelJugabilidad = new javax.swing.JPanel();
        seleccVehiculo = new javax.swing.JButton();
        seleccMovimiento = new javax.swing.JButton();
        seleccAtacar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInfo.setBackground(new java.awt.Color(0, 0, 0));

        verColumna.setForeground(new java.awt.Color(255, 255, 255));

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        addVehiculo.setText("AGREGAR TANQUE");
        addVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehiculoActionPerformed(evt);
            }
        });

        addAvion.setText("AGREGAR AVION");
        addAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAvionActionPerformed(evt);
            }
        });

        tipoVehiculo.setForeground(new java.awt.Color(255, 255, 255));

        prueba.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(verColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addAvion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(addVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(addAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(verColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 1340, 110));

        panelEscenario.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelEscenarioLayout = new javax.swing.GroupLayout(panelEscenario);
        panelEscenario.setLayout(panelEscenarioLayout);
        panelEscenarioLayout.setHorizontalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
        );
        panelEscenarioLayout.setVerticalGroup(
            panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(panelEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 135, 1340, 720));

        panelJugabilidad.setBackground(new java.awt.Color(0, 0, 0));
        panelJugabilidad.setForeground(new java.awt.Color(0, 0, 0));
        panelJugabilidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seleccVehiculo.setText("CAMBIAR ");
        panelJugabilidad.add(seleccVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 105, -1));

        seleccMovimiento.setText("MOVERSE");
        panelJugabilidad.add(seleccMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        seleccAtacar.setText("ATACAR");
        panelJugabilidad.add(seleccAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "VEHICULOS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelJugabilidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 360, 80));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ATRIBUTO", "PUNTOS"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelJugabilidad.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 350, 90));

        getContentPane().add(panelJugabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 20, 410, 830));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void addVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehiculoActionPerformed
        tipoVehiculo.setText("Tanque");
        panelInfo.updateUI();
    }//GEN-LAST:event_addVehiculoActionPerformed

    private void addAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAvionActionPerformed
        tipoVehiculo.setText("Avión");
        panelInfo.updateUI();
    }//GEN-LAST:event_addAvionActionPerformed

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
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escenario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escenario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAvion;
    private javax.swing.JButton addVehiculo;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelEscenario;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelJugabilidad;
    private javax.swing.JLabel prueba;
    private javax.swing.JButton salir;
    private javax.swing.JButton seleccAtacar;
    private javax.swing.JButton seleccMovimiento;
    private javax.swing.JButton seleccVehiculo;
    private javax.swing.JLabel tipoVehiculo;
    private javax.swing.JLabel verColumna;
    // End of variables declaration//GEN-END:variables
}
