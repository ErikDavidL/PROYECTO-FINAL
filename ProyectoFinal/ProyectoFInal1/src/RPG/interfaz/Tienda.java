
package RPG.interfaz;

import RPG.objetos.Objeto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tienda extends javax.swing.JFrame {

    public static ArrayList<Objeto> listadoObjetos = new ArrayList<Objeto>();
    private String puntos;
    
    public Tienda() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void elegirKit(){
        if(elegirKit.getSelectedItem() == "---------------"){
            ptsKit.setText(null);
            objetoSeleccionado.setText(null);
            costoObjeto.setText(null);
            siNo.setText(null);
        }
        if(elegirKit.getSelectedItem() == "KIT MENOR"){
            ptsKit.setText("20 PUNTOS");
            objetoSeleccionado.setText("KIT MENOR");
            costoObjeto.setText("30");
            siNo.setText("NO");
        }
        if(elegirKit.getSelectedItem() == "KIT MAYOR"){
            ptsKit.setText("30 PUNTOS");
            objetoSeleccionado.setText("KIT MAYOR");
            costoObjeto.setText("45");
            siNo.setText("NO");
        }
        if(elegirKit.getSelectedItem() == "RESTAURADOR"){
            ptsKit.setText("50% DE VIDA");
            objetoSeleccionado.setText("RESTAURADOR");
            costoObjeto.setText("60");
            siNo.setText("SI");
        }
    }
    
    public void puntosVida(){
        if(objetoSeleccionado.getText() == "KIT MAYOR"){
            puntos = "20";
        }
        if(objetoSeleccionado.getText() == "KIT MENOR"){
            puntos = "30";
        }
        if(objetoSeleccionado.getText() == "RESTAURADOR"){
            puntos = "50% DE VIDA";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        infoArmas = new javax.swing.JLabel();
        infoKit1 = new javax.swing.JLabel();
        verArmas = new javax.swing.JButton();
        elegirKit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ptsKit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        infoObjeto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        objetoSeleccionado = new javax.swing.JLabel();
        infoCosto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        costoObjeto = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        siNo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("TIENDA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        subtitulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setText("OBJETOS DISPONIBLES");
        getContentPane().add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 40));

        infoArmas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoArmas.setForeground(new java.awt.Color(255, 255, 255));
        infoArmas.setText("ARMAS CREADAS");
        getContentPane().add(infoArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        infoKit1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoKit1.setForeground(new java.awt.Color(255, 255, 255));
        infoKit1.setText("KITS REPARADORES");
        getContentPane().add(infoKit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 30));

        verArmas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        verArmas.setForeground(new java.awt.Color(0, 0, 0));
        verArmas.setText("LSTADO");
        verArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verArmasActionPerformed(evt);
            }
        });
        getContentPane().add(verArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 150, 40));

        elegirKit.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        elegirKit.setForeground(new java.awt.Color(0, 0, 0));
        elegirKit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "KIT MENOR", "KIT MAYOR", "RESTAURADOR" }));
        elegirKit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                elegirKitItemStateChanged(evt);
            }
        });
        getContentPane().add(elegirKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 150, 30));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PUNTOS DE VIDA QUE RECUPERA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        ptsKit.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        ptsKit.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ptsKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, 40));

        jPanel3.setBackground(new java.awt.Color(24, 53, 38));

        infoObjeto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoObjeto.setForeground(new java.awt.Color(255, 255, 255));
        infoObjeto.setText("OBJETO SELECCIONADO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        objetoSeleccionado.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        objetoSeleccionado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(objetoSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(objetoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        infoCosto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoCosto.setForeground(new java.awt.Color(255, 255, 255));
        infoCosto.setText("COSTO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        costoObjeto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        costoObjeto.setForeground(new java.awt.Color(0, 0, 0));

        q.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        q.setForeground(new java.awt.Color(0, 0, 0));
        q.setText("  Q");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(q)
                .addGap(18, 18, 18)
                .addComponent(costoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        comprar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        comprar.setForeground(new java.awt.Color(0, 0, 0));
        comprar.setText("COMPRAR");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(infoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(comprar)
                        .addGap(40, 40, 40)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(infoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(infoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(infoCosto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 420, 330));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPARA A UN VEHICULO DESTRUIDO?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        siNo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(siNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verArmasActionPerformed
        ArmasTienda armas = new ArmasTienda();
        armas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_verArmasActionPerformed

    private void elegirKitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_elegirKitItemStateChanged
        elegirKit();
    }//GEN-LAST:event_elegirKitItemStateChanged

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        puntosVida();
        Objeto objeto = new Objeto(objetoSeleccionado.getText(), puntos);
        listadoObjetos.add(objeto);
        JOptionPane.showMessageDialog(null, "COMPRA REALIZADA");
        objetoSeleccionado.setText(null);
        costoObjeto.setText(null);
    }//GEN-LAST:event_comprarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel costoObjeto;
    private javax.swing.JComboBox<String> elegirKit;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel infoArmas;
    private javax.swing.JLabel infoCosto;
    private javax.swing.JLabel infoKit1;
    private javax.swing.JLabel infoObjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel objetoSeleccionado;
    private javax.swing.JLabel ptsKit;
    private javax.swing.JLabel q;
    private javax.swing.JButton salir;
    private javax.swing.JLabel siNo;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton verArmas;
    // End of variables declaration//GEN-END:variables
}
