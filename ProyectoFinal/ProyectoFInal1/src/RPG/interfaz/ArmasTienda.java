
package RPG.interfaz;

import RPG.archivos.ArchivoArma;
import RPG.armas.Arma;
import RPG.excepciones.Enteros;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ArmasTienda extends javax.swing.JFrame {
    //variables para generar el listado y seleccion
    ArchivoArma archivoArma = new ArchivoArma();
    public static ArrayList<Arma> listadoArmas = new ArrayList<Arma>();
    private int numeroArma;
    String[][] listadoBusqueda,listadoExtra;
    String nombre,precio;
    
    
    public ArmasTienda() {
        initComponents();
        this.setLocationRelativeTo(null);
        listadoArmas = archivoArma.leerArchivo();
        mostrarTabla();
    }
    //metodo para mostrar la tabla de armas
    public String[][] mostrarTabla(){
        String listado[][] = new String[listadoArmas.size()][6];
        int contador = 1;
        String numero;
        for (int i = 0; i < listadoArmas.size(); i++) {
            numero = Integer.toString(contador);
            listado[i][0] = numero;
            listado[i][1]=listadoArmas.get(i).getNombre();
            listado[i][2]=listadoArmas.get(i).getTipoArma();
            listado[i][3]=listadoArmas.get(i).getAtaque();
            listado[i][4]=listadoArmas.get(i).getPunteria();
            listado[i][5]=listadoArmas.get(i).getPrecio();
            contador++;
        }
        tablaArmas.setModel(new javax.swing.table.DefaultTableModel(
            listado,
            new String [] {
                "NO.", "NOMBRE", "TIPO DE ARMA", "PUNTOS DE ATAQUE", "PUNTERIA (%)", "PRECIO (Q)"
            }
        ));
        listadoBusqueda = listado;
        return listadoBusqueda;
    }
    //errro por si no ingresa un valor correcto
    public void errorCompra(){
        
        if(Enteros.isNumeric(ingresarNumero.getText())){
            numeroArma = Integer.parseInt(ingresarNumero.getText());
            numeroArma--;
            if(numeroArma < listadoArmas.size() && 0 <= numeroArma ){                   
                mostrarArma();
            }
            else{
                JOptionPane.showMessageDialog(null, "EL NUMERO SELECCIONADO NO EXISTE EN EL LISTADO");
                ingresarNumero.setText(null);
            }
        }else{
            JOptionPane.showMessageDialog(null, "INGRESE UN VALOR CORRECTO");
            ingresarNumero.setText(null);
        }  
    }
    //mostrar la arma que se quiere comprar
    public void mostrarArma(){
        listadoExtra = new String[1][6];
        listadoExtra[0][0] = listadoBusqueda[numeroArma][1];
        listadoExtra[0][1] = listadoBusqueda[numeroArma][2];
        listadoExtra[0][2] = listadoBusqueda[numeroArma][3];
        listadoExtra[0][3] = listadoBusqueda[numeroArma][4];
        listadoExtra[0][4] = listadoBusqueda[numeroArma][5];
        
        armaSelec.setModel(new javax.swing.table.DefaultTableModel(
            listadoExtra,
            new String [] {
                "NOMBRE", "TIPO DE ARMA", "PUNTOS DE ATAQUE", "PUNTERIA (%)", "PRECIO (Q)"
            }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArmas = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        infoNo = new javax.swing.JLabel();
        ingresarNumero = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        infoMoney = new javax.swing.JLabel();
        dineroJugador = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        armaSelec = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        dibujo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaArmas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaArmas.setBackground(new java.awt.Color(76, 148, 112));
        tablaArmas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        tablaArmas.setForeground(new java.awt.Color(0, 0, 0));
        tablaArmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO.", "NOMBRE", "TIPO DE ARMA", "PUNTOS DE ATAQUE", "PUNTERIA  (%)", "PRECIO (Q)"
            }
        ));
        jScrollPane1.setViewportView(tablaArmas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1020, 350));

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("ARMAS CREADAS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 31, 0));

        infoNo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoNo.setForeground(new java.awt.Color(255, 255, 255));
        infoNo.setText("INGRESE EL NÚMERO DEL ARMA");

        ingresarNumero.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N

        seleccionar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        seleccionar.setForeground(new java.awt.Color(0, 0, 0));
        seleccionar.setText("SELECCIONAR");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        comprar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        comprar.setForeground(new java.awt.Color(0, 0, 0));
        comprar.setText("COMPRAR");

        infoMoney.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoMoney.setForeground(new java.awt.Color(255, 255, 255));
        infoMoney.setText("DINERO DEL JUGADOR      Q ");

        dineroJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N

        armaSelec = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        armaSelec.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        armaSelec.setForeground(new java.awt.Color(0, 0, 0));
        armaSelec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "TIPO DE ARMA", "PUNTOS DE ATAQUE", "PUNTERIA (%)", "PRECIO (Q)"
            }
        ));
        jScrollPane2.setViewportView(armaSelec);

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoNo)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(infoMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dineroJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingresarNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(143, 143, 143)
                        .addComponent(seleccionar)
                        .addGap(27, 27, 27)
                        .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoNo)
                    .addComponent(ingresarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dineroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 1020, 210));

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/explosion.png"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 1350, 730));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Tienda tienda = new Tienda();
        tienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        errorCompra();
        
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
            java.util.logging.Logger.getLogger(ArmasTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmasTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmasTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmasTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArmasTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable armaSelec;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel dineroJugador;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel infoMoney;
    private javax.swing.JLabel infoNo;
    private javax.swing.JTextField ingresarNumero;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salir;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tablaArmas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
