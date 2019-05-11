
package RPG.interfaz;

import RPG.vehiculos.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListadoVehiculo extends javax.swing.JFrame {

    public static ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();
    public static ArrayList<Vehiculo> vehiculosJuego = new ArrayList<Vehiculo>();
    private String dato,nombreComparado, nombre, tipoVehiculo,armaIntegrada,creadorVehiculo,ataque,defensa;
    private int vida,eliminaciones;
    private int contadorVehiculo = 0;
 
    String[] arregloTemporal = new String[3];
    
    public static Vehiculo vehiculoUno;
    public static Vehiculo vehiculoDos;
    public static Vehiculo vehiculoTres;
    
    int contadorVer = 2;   
    
    public ListadoVehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        listadoVehiculos = (ArrayList<Vehiculo>) IngresarVehiculos.listaVehiculo.clone();
        creadorVehiculo = ListadoJugador.nombre;
        mostrarListado(); 
        listadoNulo();
        verContador.setText("3");
    }
    public void listadoNulo(){
        arregloTemporal[0] = "";
        arregloTemporal[1] = "";
        arregloTemporal[2] = "";
    }
    public void mostrarListado(){
        String listado[][] = new String[listadoVehiculos.size()][5];
        for (int i = 0; i < listadoVehiculos.size(); i++) {
            listado[i][0]=listadoVehiculos.get(i).getIdentificador();
            listado[i][1]=listadoVehiculos.get(i).getNombre();
            listado[i][2]=listadoVehiculos.get(i).getTipoVehiculo();
            listado[i][3]=listadoVehiculos.get(i).getArmaIntegrada();
            listado[i][4]=listadoVehiculos.get(i).getCreadorAuto();
        }
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(listado,new String [] {
                "NO.","NOMBRE", "TIPO DE VEHICULO", "ARMA INTEGRADA","PERTENECE A"
        }));
    } 
    public void mostrarVehiculos(){       
        String [][] listadoJuego = new String[3][3];
            listadoJuego[0][0] = vehiculoUno.getNombre();
            listadoJuego[1][0] = vehiculoDos.getNombre();
            listadoJuego[2][0] = vehiculoTres.getNombre();
            listadoJuego[0][1] = vehiculoUno.getTipoVehiculo();
            listadoJuego[1][1] = vehiculoDos.getTipoVehiculo();
            listadoJuego[2][1] = vehiculoTres.getTipoVehiculo();
            listadoJuego[0][2] = vehiculoUno.getArmaIntegrada();
            listadoJuego[1][2] = vehiculoDos.getArmaIntegrada();
            listadoJuego[2][2] = vehiculoTres.getArmaIntegrada();
        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(listadoJuego, new String [] {
                "NOMBRE", "TIPO DE VEHICULO", "ARMA INTEGRADA"
            }
        ));
    }
        
    public void obtenerVehiculo(int contador){
        int fila = this.tablaVehiculo.getSelectedRow();
        nombre = String.valueOf(this.tablaVehiculo.getValueAt(fila,1));
        tipoVehiculo = String.valueOf(this.tablaVehiculo.getValueAt(fila,2));
        armaIntegrada = String.valueOf(this.tablaVehiculo.getValueAt(fila,3)); 
        String comparador = String.valueOf(this.tablaVehiculo.getValueAt(fila,0));
        arregloTemporal[contadorVehiculo] = comparador;
        vida = listadoVehiculos.get(fila).getVida();
        ataque = listadoVehiculos.get(fila).getAtaque();
        defensa = listadoVehiculos.get(fila).getDefensa();
        eliminaciones = listadoVehiculos.get(fila).getVida();
        if(contador == 0){
            vehiculoUno = new Vehiculo(nombre, tipoVehiculo,armaIntegrada,creadorVehiculo,comparador,vida,ataque,defensa,0,0,eliminaciones);
        }
        if(contador == 1){
            vehiculoDos = new Vehiculo(nombre, tipoVehiculo,armaIntegrada,creadorVehiculo,comparador,vida,ataque,defensa,0,0,eliminaciones);
        }
        if(contador == 2){
            vehiculoTres = new Vehiculo(nombre, tipoVehiculo,armaIntegrada,creadorVehiculo,comparador,vida,ataque,defensa,0,0,eliminaciones);
        }   
        
    }
    public void seleccionVehiculos(){
        int fila = this.tablaVehiculo.getSelectedRow();
        dato = String.valueOf(this.tablaVehiculo.getValueAt(fila,0));
        nombreComparado = String.valueOf(this.tablaVehiculo.getValueAt(fila,4));
        if(nombreComparado.equals(creadorVehiculo)){
            if(dato.equals(arregloTemporal[0]) || dato.equals(arregloTemporal[1]) || dato.equals(arregloTemporal[2])){
                JOptionPane.showMessageDialog(null, "EL VEHICULO YA FUE SELECCIONADO");
            }else{
                cupoLleno(contadorVehiculo);       
                contadorVehiculo++;
                String cadena = Integer.toString(contadorVer);
     
                verContador.setText(cadena);
                contadorVer--;
            }
        }else{
            JOptionPane.showMessageDialog(null, "EL VEHICULO NO PERTENECE AL JUGADOR SELECCIONADO");
        }
    }
    public void cupoLleno(int noContador){    
        if(noContador < 3){
            obtenerVehiculo(noContador);
        }else{
            JOptionPane.showMessageDialog(null, "SELECCION DE AUTOS COMPLETA");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        panelContador = new javax.swing.JPanel();
        infoContador1 = new javax.swing.JLabel();
        infoContador2 = new javax.swing.JLabel();
        verContador = new javax.swing.JLabel();
        panelVehiculo = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        dibujo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSeleccionados = new javax.swing.JTable();
        verSeleccionados = new javax.swing.JButton();
        iniciarPartida = new javax.swing.JButton();
        reelegir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("LISTADO DE VEHÍCULOS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        panelContador.setBackground(new java.awt.Color(255, 255, 255));

        infoContador1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoContador1.setForeground(new java.awt.Color(0, 0, 0));
        infoContador1.setText("FALTAN ");

        infoContador2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoContador2.setForeground(new java.awt.Color(0, 0, 0));
        infoContador2.setText("VEHICULOS POR SELECCIONAR");

        verContador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        verContador.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelContadorLayout = new javax.swing.GroupLayout(panelContador);
        panelContador.setLayout(panelContadorLayout);
        panelContadorLayout.setHorizontalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoContador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verContador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoContador2)
                .addContainerGap())
        );
        panelContadorLayout.setVerticalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoContador1)
                    .addComponent(infoContador2)
                    .addComponent(verContador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 380, 40));

        panelVehiculo.setBackground(new java.awt.Color(0, 102, 0));

        tablaVehiculo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaVehiculo.setBackground(new java.awt.Color(138, 197, 138));
        tablaVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        tablaVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NO.", "NOMBRE", "TIPO DE VEHICULO", "ARMA INTEGRADA", "PERTENECE A "
            }
        ));
        tablaVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVehiculoMouseClicked(evt);
            }
        });
        panelVehiculo.setViewportView(tablaVehiculo);

        getContentPane().add(panelVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 840, 230));

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 170, 40));

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/tanques.png"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -170, 1090, -1));

        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "TIPO DE VEHICULO", "ARMA INTEGRADA"
            }
        ));
        jScrollPane1.setViewportView(tablaSeleccionados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 630, 90));

        verSeleccionados.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        verSeleccionados.setForeground(new java.awt.Color(0, 0, 0));
        verSeleccionados.setText("VER SELECCIONADOS");
        verSeleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSeleccionadosActionPerformed(evt);
            }
        });
        getContentPane().add(verSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 190, 40));

        iniciarPartida.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        iniciarPartida.setForeground(new java.awt.Color(0, 0, 0));
        iniciarPartida.setText("EMPEZAR PARTIDA");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 170, 60));

        reelegir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        reelegir.setForeground(new java.awt.Color(0, 0, 0));
        reelegir.setText("VOLVER A ELEGIR");
        reelegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reelegirActionPerformed(evt);
            }
        });
        getContentPane().add(reelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 190, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void tablaVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVehiculoMouseClicked
        seleccionVehiculos();
    }//GEN-LAST:event_tablaVehiculoMouseClicked

    private void verSeleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSeleccionadosActionPerformed
        if(contadorVehiculo < 3){
            JOptionPane.showMessageDialog(null, "NO HA TERMINADO DE SELECCIONAR LOS VEHICULOS"); 
        }else{
            mostrarVehiculos();
        }
    }//GEN-LAST:event_verSeleccionadosActionPerformed

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
        if(contadorVehiculo < 3){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE INICIAR LA PARTIDA, COMPLETE LA SELECION"); 
        }else{
            Escenario escenario = new Escenario();
            escenario.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void reelegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reelegirActionPerformed
        JOptionPane.showMessageDialog(null, "PUEDE VOLVER A ELEGIR LOS VEHICULOS");
        this.setVisible(false);
        ListadoVehiculo nuevoListado =  new ListadoVehiculo();
        nuevoListado.setVisible(true);
    }//GEN-LAST:event_reelegirActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel infoContador1;
    private javax.swing.JLabel infoContador2;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelContador;
    private javax.swing.JScrollPane panelVehiculo;
    private javax.swing.JButton reelegir;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaSeleccionados;
    private javax.swing.JTable tablaVehiculo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel verContador;
    private javax.swing.JButton verSeleccionados;
    // End of variables declaration//GEN-END:variables
}
