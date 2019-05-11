
package RPG.interfaz;

import RPG.armas.Arma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IngresarArma extends javax.swing.JFrame {

    public static ArrayList<Arma> listaArma = new ArrayList<Arma>();
    
    private int precioAtaque,precioPunteria,precioTotal;
    private final int precioArma = 100;
    private String mostrarPrecio = "";
    private String valorAtaque, valorPunteria,categoria;
    
    public IngresarArma() {
        initComponents();
        this.setLocationRelativeTo(null);
        costoAtaque.setText("50");
        costoPunteria.setText("65");        
    }
    
    public void mostrarCostoAtaque(){
        if(ingresarAtaque.getSelectedItem() == "10"){
            costoAtaque.setText("50");
        }
        if(ingresarAtaque.getSelectedItem() == "15"){
            costoAtaque.setText("60");
        }
        if(ingresarAtaque.getSelectedItem() == "20"){
            costoAtaque.setText("75");
        }
        if(ingresarAtaque.getSelectedItem() == "25"){
            costoAtaque.setText("100");
        }
    }
    
    public void mostrarCostoPunteria(){
        if(ingresarPunteria.getSelectedItem() == "60"){
            costoPunteria.setText("65");
        }
        if(ingresarPunteria.getSelectedItem() == "70"){
            costoPunteria.setText("75");
        }
        if(ingresarPunteria.getSelectedItem() == "80"){
            costoPunteria.setText("85");
        }
        if(ingresarPunteria.getSelectedItem() == "90"){
            costoPunteria.setText("100");
        }
    } 
    
    public int obtenerCosto(){
        valorAtaque = costoAtaque.getText();
        valorPunteria = costoPunteria.getText();        
        
        precioAtaque = Integer.valueOf(valorAtaque);
        precioPunteria = Integer.valueOf(valorPunteria);
        precioTotal = precioAtaque + precioPunteria + precioArma;
        
        return precioTotal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        ingresarNombre = new javax.swing.JTextField();
        infoTipo = new javax.swing.JLabel();
        ingresarTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ingresarAtaque = new javax.swing.JComboBox<>();
        infoAtaque2 = new javax.swing.JLabel();
        infoPunteria = new javax.swing.JLabel();
        ingresarPunteria = new javax.swing.JComboBox<>();
        infoPunteria2 = new javax.swing.JLabel();
        dibujo = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        infoCosto = new javax.swing.JLabel();
        infoCosto2 = new javax.swing.JLabel();
        infoComplementos = new javax.swing.JLabel();
        infoCC = new javax.swing.JLabel();
        costoAtaque = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        costoPunteria = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        panelTotal = new javax.swing.JPanel();
        infoCostoTotal = new javax.swing.JLabel();
        mostrarTotal = new javax.swing.JLabel();
        otroExtra = new javax.swing.JLabel();
        verTotal = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVA ARMA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        infoNombre.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoNombre.setForeground(new java.awt.Color(255, 255, 255));
        infoNombre.setText("NOMBRE");
        getContentPane().add(infoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        ingresarNombre.setBackground(new java.awt.Color(255, 255, 255));
        ingresarNombre.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        ingresarNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ingresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 310, 40));

        infoTipo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoTipo.setForeground(new java.awt.Color(255, 255, 255));
        infoTipo.setText("TIPO DE ARMA");
        getContentPane().add(infoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        ingresarTipo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        ingresarTipo.setForeground(new java.awt.Color(0, 0, 0));
        ingresarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pistola", "Escopeta", "Rifle Francotirador", "Revolver", "Explosivo", "Ametralladora", "Fusil de Asalto", "Bazooka", "Lanza Granadas", "Bomba Atomica", "Misil", " ", " " }));
        getContentPane().add(ingresarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 310, 40));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATAQUE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 30));

        ingresarAtaque.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        ingresarAtaque.setForeground(new java.awt.Color(0, 0, 0));
        ingresarAtaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "20", "25" }));
        ingresarAtaque.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ingresarAtaqueItemStateChanged(evt);
            }
        });
        getContentPane().add(ingresarAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, 30));

        infoAtaque2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoAtaque2.setForeground(new java.awt.Color(255, 255, 255));
        infoAtaque2.setText("PUNTOS");
        getContentPane().add(infoAtaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 30));

        infoPunteria.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoPunteria.setForeground(new java.awt.Color(255, 255, 255));
        infoPunteria.setText("PUNTERÍA");
        getContentPane().add(infoPunteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 30));

        ingresarPunteria.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        ingresarPunteria.setForeground(new java.awt.Color(0, 0, 0));
        ingresarPunteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "60", "70", "80", "90" }));
        ingresarPunteria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ingresarPunteriaItemStateChanged(evt);
            }
        });
        getContentPane().add(ingresarPunteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 80, 30));

        infoPunteria2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 20)); // NOI18N
        infoPunteria2.setForeground(new java.awt.Color(255, 255, 255));
        infoPunteria2.setText("%");
        getContentPane().add(infoPunteria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 30, 30));

        dibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/arma.png"))); // NOI18N
        getContentPane().add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 530, 160));

        guardar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(0, 0, 0));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, 60));

        cancelar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("SALIR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 120, 60));

        infoCosto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        infoCosto.setForeground(new java.awt.Color(255, 255, 255));
        infoCosto.setText("COSTO DEL ARMA");
        getContentPane().add(infoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        infoCosto2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoCosto2.setForeground(new java.awt.Color(255, 255, 255));
        infoCosto2.setText("Q 100.00");
        getContentPane().add(infoCosto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        infoComplementos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        infoComplementos.setForeground(new java.awt.Color(255, 255, 255));
        infoComplementos.setText("COMPLEMENTOS :");
        getContentPane().add(infoComplementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        infoCC.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoCC.setForeground(new java.awt.Color(255, 255, 255));
        infoCC.setText("COSTO ");
        getContentPane().add(infoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        costoAtaque.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        costoAtaque.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(costoAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 70, 30));

        q1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setText("Q");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 20, 30));

        costoPunteria.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        costoPunteria.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(costoPunteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 70, 30));

        q2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setText("Q");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 20, 30));

        panelTotal.setBackground(new java.awt.Color(255, 255, 255));

        infoCostoTotal.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        infoCostoTotal.setForeground(new java.awt.Color(0, 0, 0));
        infoCostoTotal.setText(" COSTO TOTAL");

        mostrarTotal.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        mostrarTotal.setForeground(new java.awt.Color(0, 0, 0));

        otroExtra.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        otroExtra.setForeground(new java.awt.Color(0, 0, 0));
        otroExtra.setText("  Q");

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(infoCostoTotal)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(otroExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoCostoTotal)
                .addGap(10, 10, 10)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otroExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 120, 90));

        verTotal.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        verTotal.setForeground(new java.awt.Color(0, 0, 0));
        verTotal.setText("VER TOTAL");
        verTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTotalActionPerformed(evt);
            }
        });
        getContentPane().add(verTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 120, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 730, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarAtaqueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingresarAtaqueItemStateChanged
        mostrarCostoAtaque();
    }//GEN-LAST:event_ingresarAtaqueItemStateChanged

    private void ingresarPunteriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ingresarPunteriaItemStateChanged
        mostrarCostoPunteria();
    }//GEN-LAST:event_ingresarPunteriaItemStateChanged

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        obtenerCosto();
        mostrarPrecio = Integer.toString(precioTotal);
        valorAtaque = (String)ingresarAtaque.getSelectedItem();
        valorPunteria = (String)ingresarPunteria.getSelectedItem();
        categoria = (String)ingresarTipo.getSelectedItem();
               
        Arma arma = new Arma(ingresarNombre.getText(),categoria,valorAtaque,valorPunteria, mostrarPrecio);
        listaArma.add(arma);
        
        JOptionPane.showMessageDialog(null, "ARMA CREADA CON ÉXITO");
        ingresarNombre.setText(null);
        mostrarTotal.setText(null);
    }//GEN-LAST:event_guardarActionPerformed

    private void verTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTotalActionPerformed
        obtenerCosto();
        mostrarPrecio = Integer.toString(precioTotal);        
        mostrarTotal.setText(mostrarPrecio);
    }//GEN-LAST:event_verTotalActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        OpcionesCrear opcionCrear = new OpcionesCrear();
        opcionCrear.setVisible(true);
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
            java.util.logging.Logger.getLogger(IngresarArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarArma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarArma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel costoAtaque;
    private javax.swing.JLabel costoPunteria;
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel infoAtaque2;
    private javax.swing.JLabel infoCC;
    private javax.swing.JLabel infoComplementos;
    private javax.swing.JLabel infoCosto;
    private javax.swing.JLabel infoCosto2;
    private javax.swing.JLabel infoCostoTotal;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JLabel infoPunteria;
    private javax.swing.JLabel infoPunteria2;
    private javax.swing.JLabel infoTipo;
    private javax.swing.JComboBox<String> ingresarAtaque;
    private javax.swing.JTextField ingresarNombre;
    private javax.swing.JComboBox<String> ingresarPunteria;
    private javax.swing.JComboBox<String> ingresarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mostrarTotal;
    private javax.swing.JLabel otroExtra;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton verTotal;
    // End of variables declaration//GEN-END:variables
}
