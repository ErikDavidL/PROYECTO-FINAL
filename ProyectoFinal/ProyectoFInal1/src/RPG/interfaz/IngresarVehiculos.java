
package RPG.interfaz;

import RPG.excepciones.Enteros;
import RPG.jugador.Jugador;
import RPG.vehiculos.Vehiculo;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresarVehiculos extends javax.swing.JFrame {
    
    public static ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
    public static ArrayList<Jugador> listadoJugador =  new ArrayList<Jugador>();
    private final String seleccionAvion = "Avión";
    private final String seleccionTanque = "Tanque"; 
    private int indice;
    private String[][] jugadorSeleccionado;
    private String verJugador;    
    private String arma;
    private final int vidaInicial = 50;
    private final int eliminaciones = 0;
    private final String ataqueInicial = "10";
    private final String defensaInicial = "6";
    
    public IngresarVehiculos() {
        initComponents();
        listadoJugador = (ArrayList<Jugador>) IngresarJugador.listaJugador.clone();
        mostrarTabla();
        this.setLocationRelativeTo(null);
        jLabel3.setText("1");
    }

    public String[][] mostrarTabla(){
        String listado[][] = new String[listadoJugador.size()][2];
        int contador = 1;
        String numero;
        for (int i = 0; i < listadoJugador.size(); i++) {
            numero = Integer.toString(contador);
            listado[i][0]= numero;
            listado[i][1]=listadoJugador.get(i).getNombre();
            contador++;
        }
        verJugadores.setModel(new javax.swing.table.DefaultTableModel(
            listado,
            new String [] {
                "NO.", "JUGADOR"
            }
        ));
        return jugadorSeleccionado = listado;
    }    
    public void busquedaJugador(){     
        if(Enteros.isNumeric(numeroJugador.getText())){
            indice = Integer.parseInt(numeroJugador.getText());
            indice--; 
            if(indice < listadoJugador.size() && 0 <= indice ){                       
                mostrarBusqueda(indice);
            }
            else{
                JOptionPane.showMessageDialog(null, "EL NUMERO SELECCIONADO NO EXISTE EN EL LISTADO");
                numeroJugador.setText(null);
            }
        }else{
            JOptionPane.showMessageDialog(null, "INGRESE UN VALOR CORRECTO");
            numeroJugador.setText(null);
        }  
    }
    public void mostrarBusqueda(int indice){
        verJugador = jugadorSeleccionado[indice][1];
        verPlayer.setText(verJugador);
    }
    public void errorVacio(){
        String texto= numeroJugador.getText();
        String textoJugador= verPlayer.getText();
        String textoArma= nombreVehiculo.getText();
        String textoTipo= tipoVehiculo.getText();
        
        texto = texto.replaceAll(" ", "");        
        textoJugador = textoJugador.replaceAll(" ", "");
        textoArma = textoArma.replaceAll(" ", "");     
        textoTipo = textoTipo.replaceAll(" ", "");
        
        if(texto.length()==0 || textoJugador.length()==0 || textoArma.length()==0 || textoTipo.length()==0){
            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS, POR FAVOR INGRESE TODOS LOS DATOS");            
        }else{
            arma = (String)armaNueva.getSelectedItem();
            int noIdentificador = listaVehiculo.size()+1;
            String identificador = Integer.toString(noIdentificador);
            Vehiculo nuevoVehiculo = new Vehiculo(nombreVehiculo.getText(),tipoVehiculo.getText(),arma,verPlayer.getText(),identificador,vidaInicial,ataqueInicial,defensaInicial,0,0,eliminaciones);
            listaVehiculo.add(nuevoVehiculo);
            JOptionPane.showMessageDialog(null, "VEHÍCULO CREADO CON ÉXITO");
            noIdentificador++;
            jLabel3.setText(identificador);
            nombreVehiculo.setText(null);
            tipoVehiculo.setText(null);
            verPlayer.setText(null);
            numeroJugador.setText(null);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        nombreVehiculo = new javax.swing.JTextField();
        infoTipo = new javax.swing.JLabel();
        panelTipo = new javax.swing.JPanel();
        tipoVehiculo = new javax.swing.JLabel();
        tanque = new javax.swing.JButton();
        infoArma = new javax.swing.JLabel();
        avion = new javax.swing.JButton();
        arma2 = new javax.swing.JLabel();
        armaNueva = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        verJugadores = new javax.swing.JTable();
        seleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroJugador = new javax.swing.JTextField();
        infoJ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        infoJugadr = new javax.swing.JLabel();
        panelVerPlayer = new javax.swing.JPanel();
        verPlayer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO VEHÍCULO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, 50));

        infoNombre.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        infoNombre.setForeground(new java.awt.Color(255, 255, 255));
        infoNombre.setText("NOMBRE");
        getContentPane().add(infoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 100, 40));

        nombreVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        nombreVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        nombreVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nombreVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 380, 40));

        infoTipo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        infoTipo.setForeground(new java.awt.Color(255, 255, 255));
        infoTipo.setText("TIPO ");
        getContentPane().add(infoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        panelTipo.setBackground(new java.awt.Color(255, 255, 255));

        tipoVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        tipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelTipoLayout = new javax.swing.GroupLayout(panelTipo);
        panelTipo.setLayout(panelTipoLayout);
        panelTipoLayout.setHorizontalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
        );
        panelTipoLayout.setVerticalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTipoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        ImageIcon insertarTanque = new ImageIcon(getClass().getResource("/imagenesFondo/tanqueExplosion.png"));
        Icon icoTanque = new ImageIcon(insertarTanque.getImage().getScaledInstance(110, 100, Image.SCALE_DEFAULT));
        tanque.setIcon(icoTanque);
        tanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanqueActionPerformed(evt);
            }
        });
        getContentPane().add(tanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, 80));

        infoArma.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        infoArma.setForeground(new java.awt.Color(255, 255, 255));
        infoArma.setText(" ARMA");
        getContentPane().add(infoArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 70, -1));

        ImageIcon avionImagen = new ImageIcon(getClass().getResource("/imagenesFondo/avionIcono.png"));
        Icon iconoAvion = new ImageIcon(avionImagen.getImage().getScaledInstance(110, 100, Image.SCALE_DEFAULT));
        avion.setIcon(iconoAvion);
        avion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionActionPerformed(evt);
            }
        });
        getContentPane().add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, 80));

        arma2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        arma2.setForeground(new java.awt.Color(255, 255, 255));
        arma2.setText("INCORPORADA");
        getContentPane().add(arma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        armaNueva.setForeground(new java.awt.Color(0, 0, 0));
        armaNueva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK-47", "Fusil ZMG-9MM ", "Fusil M101  " }));
        getContentPane().add(armaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 230, -1));

        guardar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(0, 0, 0));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 110, 40));

        cancelar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("SALIR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, 110, 40));

        verJugadores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        verJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "NO.", "JUGADOR"
            }
        ));
        jScrollPane1.setViewportView(verJugadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 380, 140));

        seleccionar.setText("SELECCIONAR");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, 40));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE EL NUMERO DEL JUGADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 320, 30));
        getContentPane().add(numeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 240, 40));

        infoJ.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoJ.setForeground(new java.awt.Color(255, 255, 255));
        infoJ.setText("EL VEHICULO QUE CREARA SE GUARDARA PARA EL JUGADOR QUE");
        getContentPane().add(infoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE Y SOLO PODRA SER USADO POR ESE JUGADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        infoJugadr.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoJugadr.setForeground(new java.awt.Color(255, 255, 255));
        infoJugadr.setText("JUGADOR SELECCIONADO");
        getContentPane().add(infoJugadr, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 220, 30));

        panelVerPlayer.setBackground(new java.awt.Color(255, 255, 255));

        verPlayer.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        verPlayer.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelVerPlayerLayout = new javax.swing.GroupLayout(panelVerPlayer);
        panelVerPlayer.setLayout(panelVerPlayerLayout);
        panelVerPlayerLayout.setHorizontalGroup(
            panelVerPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerPlayerLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(verPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelVerPlayerLayout.setVerticalGroup(
            panelVerPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(panelVerPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 370, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 80, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1060, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionActionPerformed
        tipoVehiculo.setText(seleccionAvion);
        
    }//GEN-LAST:event_avionActionPerformed

    private void tanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanqueActionPerformed
        tipoVehiculo.setText(seleccionTanque);
    }//GEN-LAST:event_tanqueActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
             errorVacio();
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        OpcionesCrear opcionesCrear = new OpcionesCrear();
        opcionesCrear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        busquedaJugador();
        
    }//GEN-LAST:event_seleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arma2;
    private javax.swing.JComboBox<String> armaNueva;
    private javax.swing.JButton avion;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel infoArma;
    private javax.swing.JLabel infoJ;
    private javax.swing.JLabel infoJugadr;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JLabel infoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombreVehiculo;
    private javax.swing.JTextField numeroJugador;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JPanel panelVerPlayer;
    private javax.swing.JButton seleccionar;
    private javax.swing.JButton tanque;
    private javax.swing.JLabel tipoVehiculo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTable verJugadores;
    private javax.swing.JLabel verPlayer;
    // End of variables declaration//GEN-END:variables
}
