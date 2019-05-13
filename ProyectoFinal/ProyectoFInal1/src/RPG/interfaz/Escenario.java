
package RPG.interfaz;

import RPG.archivos.ArchivoJugabilidad;
import RPG.escenario.IconoAvion;
import RPG.escenario.IconoEnemigo;
import RPG.escenario.IconoTanque;
import RPG.escenario.Terreno;
import RPG.jugabilidad.Atacar;
import RPG.jugabilidad.AtaqueEnemigo;
import RPG.jugabilidad.DadoPartida;
import RPG.jugabilidad.IconoFlecha;
import RPG.jugabilidad.Jugabilidad;
import RPG.jugabilidad.MoverVehiculo;
import RPG.jugabilidad.Verificador;
import RPG.vehiculos.Vehiculo;
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

    //variables utilizadas para el funcionamiento del escenario junto con la jugabilidad
    ArchivoJugabilidad archivoPartida = new ArchivoJugabilidad();
    Vehiculo[] vehiculosPartida = new Vehiculo[3];
    int codigoVehiculo;
    int codigoMovimiento = 0;
    String mostrarTipoVehiculo;
    public static int recibirFila,recibirColumna;
    public static int[][] posiciones;
    public static String[][] codigoTerreno;
    IconoEnemigo iconoEnemigo = new IconoEnemigo();
    IconoEnemigo iconoEnemigoDos = new IconoEnemigo();
    IconoEnemigo iconoEnemigoTres = new IconoEnemigo();
    
    JButton[][] escenario;
    JLabel[][] matriz;
    Border borde = LineBorder.createBlackLineBorder();
    Terreno terrenos = new Terreno();
    String[][] tipoVehiculos;
    String recibirTipo ="Tanque";

    int codigoUno =0,codigoDos =0,codigoTres =0;
    Icon iconoVehiculo;
    IconoAvion iconoAvion = new IconoAvion();
    IconoTanque iconoTanque = new IconoTanque();
    IconoFlecha iconoFlecha = new IconoFlecha();
    
    int[][] movimientos;
    int filas,columnas;
    String tipo;
    String trueFalse;
    String seleccionDireccion = "vacio";
    
    Boolean criterioImagenAtaque = false, criterioAtaque = false;
    Boolean criterioImagenMovimiento = false, criterioMovimiento = false;
    Boolean criterioImagenComodin = false, criterioComodin = false;
    Boolean direccionElegida = false;
    Boolean vehiculoElegido = false;
    Boolean ganoJuego = false;
    Boolean perdioJuego = false;
    
    DadoPartida mostrarDado = new DadoPartida();
    Jugabilidad jugabilidad = new Jugabilidad();
    MoverVehiculo moverse = new MoverVehiculo();
    Atacar atacar = new Atacar();
    AtaqueEnemigo ataqueEnemigo = new AtaqueEnemigo();
    Verificador verificar = new Verificador();
    int contadorVehiculo = 3;
    Boolean duplicado = false;
    
    public Escenario() {
        initComponents();
        this.setLocationRelativeTo(null);
        recibirFila = IniciarJuego.fila;
        recibirColumna = IniciarJuego.columna;
        generarEscenario(recibirFila,recibirColumna);
        mostrarTipo.setText("vacio");
        valoresIniciales();
    }
    //metodo que ingresa los valores iniciales del escenario, como tablas, iconos, etc
    public void valoresIniciales(){    
        verJugador.setText(ListadoJugador.nombre);
        verNivel.setText(String.valueOf(ListadoJugador.nivel));
        vehiculosPartida = archivoPartida.leerVehiculo();
        inicioDados();
        mostrarVida();
        mostrarAtaque();
        mostrarTablaSeleccion();
        mostrarPosiciones();
        mostrarFlechas();
        enemigoUno();
        enemigoDos();
        enemigoTres();
        mostrarEnemigos();
    }
    //metodos para insertar los iconos de los enemigos y guardar su ubicacion
    public void enemigoUno(){
        int fila = jugabilidad.randomFilas(recibirFila);
        int columna = jugabilidad.randomColumnas(recibirColumna);
        escenario[fila][columna].setIcon(iconoEnemigo.insertarIcono(recibirFila, codigoTerreno[fila][columna]));
        posiciones[fila][columna] = IconoEnemigo.codigoEnemigo;
        Jugabilidad.enemigos[0].setPosColumna(columna);
        Jugabilidad.enemigos[0].setPosFila(fila);
    }
    public void enemigoDos(){
        int fila = jugabilidad.randomFilas(recibirFila);
        int columna = jugabilidad.randomColumnas(recibirColumna);
        if(posiciones[fila][columna]==2){
            enemigoDos();
        }else{
            escenario[fila][columna].setIcon(iconoEnemigo.insertarIcono(recibirFila, codigoTerreno[fila][columna]));
            posiciones[fila][columna] = IconoEnemigo.codigoEnemigo;
            Jugabilidad.enemigos[1].setPosColumna(columna);
            Jugabilidad.enemigos[1].setPosFila(fila);
        }
    }
    public void enemigoTres(){
        int fila = jugabilidad.randomFilas(recibirFila);
        int columna = jugabilidad.randomColumnas(recibirColumna);
        if(posiciones[fila][columna]==2){
            enemigoTres();
        }else{
            escenario[fila][columna].setIcon(iconoEnemigo.insertarIcono(recibirFila, codigoTerreno[fila][columna]));
            posiciones[fila][columna] = IconoEnemigo.codigoEnemigo;
            Jugabilidad.enemigos[2].setPosColumna(columna);
            Jugabilidad.enemigos[2].setPosFila(fila);
        }
    }
    //metodo para mostrar la tabla de vida
    public void mostrarVida(){
        tablaVida.setModel(new javax.swing.table.DefaultTableModel(jugabilidad.vidaVehiculo(vehiculosPartida), new String [] {"VEHICULO", "TIPO VEHICULO", "PUNTOS DE VIDA (HP)"}));
    }
    //metodo para mostrar la tabla de ataque
    public void mostrarAtaque(){
        tablaAtaqueDefensa.setModel(new javax.swing.table.DefaultTableModel(jugabilidad.ataqueDefensaVehiculo(vehiculosPartida), new String [] {"VEHICULO", "PUNTOS ATAQUE","PUNTOS DEFENSA"}));
    }
    //metodo para mostrar la tabla de enemigos
    public void mostrarEnemigos(){
        tablaEnemigo.setModel(new javax.swing.table.DefaultTableModel(jugabilidad.mostrarEnemigos(), new String [] {
        "ENEMIGO", "ATAQUE","VIDA","FILA","COLUMNA"
        }));
    }
    //metodo para mostrar la tabla de posiciones
    public void mostrarPosiciones(){
        tablaPos.setModel(new javax.swing.table.DefaultTableModel(jugabilidad.posicionVehiculo(vehiculosPartida), new String [] {
        "VEHICULO", "FILA", "COLUMNA"
        }));
    }
    public void mostrarTablaSeleccion(){
        tablaSeleccion.setModel(new javax.swing.table.DefaultTableModel(jugabilidad.seleccionVehiculo(vehiculosPartida),new String [] {"SELECCIONE UN VEHICULO"}));
    }
    //metodo para gener el escenario y para colocar lso vehiculos
    public void generarEscenario(int entradaFila,int entradaColumna){
        filas = entradaFila;
        columnas = entradaColumna;
        escenario = new JButton[filas][columnas];
        tipoVehiculos = new String[filas][columnas];
        posiciones = new int[filas][columnas];
        codigoTerreno = new String[filas][columnas];
        
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                escenario[fila][columna] = new JButton();
                //agregamos un borde a cada boton
                escenario[fila][columna].setBorder(borde);
                escenario[fila][columna].setIcon(terrenos.insertarIcono(filas));
                codigoTerreno[fila][columna] = Terreno.codigoTerreno;
                posiciones[fila][columna] = 0;
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
    //evento al dar click
    private class ImagenVehiculo implements ActionListener{
        //metodo para realizar una accion al momento de hacer click
        @Override
        public void actionPerformed(ActionEvent click) {
            for( int fila = 0 ; fila < recibirFila ; fila ++ ) {            
                for( int columna = 0 ; columna < recibirColumna ; columna ++ ) {
                    
                    if(click.getSource().equals(escenario[fila][columna])){                                              
                        tipo = codigoTerreno[fila][columna];                        
                        
                        if(contadorVehiculo !=1 && contadorVehiculo !=2 && contadorVehiculo !=3){
                            JOptionPane.showMessageDialog(null, "LOS VEHICULOS YA ESTAN COLOCADOS");
                        }else{
                            if(duplicado==false){
                                if(posiciones[fila][columna]==1){
                                    JOptionPane.showMessageDialog(null, "UN VEHICULO SE ENCUENTRA EN ESTA CASILLA");
                                }
                                if(posiciones[fila][columna]==2){                        
                                    JOptionPane.showMessageDialog(null, "SE ENCUENTRA UN ENEMIGO EN ESTA POSICION");
                                } 
                                if(posiciones[fila][columna]==0){
                                    definirVehiculo(tipo,fila,columna);
                                    escenario[fila][columna].setIcon(iconoVehiculo);
                                    mostrarPosiciones();
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "EL VEHICULO YA ESTA POSICIONADO, SELECCIONE OTRO VEHICULO");
                            }
                        }
                        prueba.setText(codigoTerreno[fila][columna]);
                        panelEscenario.updateUI();                        
                    }
                }
            }
        }     
    }
    public void mostrarFlechas(){
        botonIzquierda.setIcon(iconoFlecha.izquierda());
        botonDerecha.setIcon(iconoFlecha.derecha());
        botonArriba.setIcon(iconoFlecha.arriba());
        botonAbajo.setIcon(iconoFlecha.abajo());
    }
    public void pruebaUno(int fila, int columna){
        if(posiciones[fila][columna] == 1){
            JOptionPane.showMessageDialog(null, "el numero es 1");
        }
    }
    public Icon definirVehiculo(String tipo,int fila,int columna){                
        if(mostrarTipo.getText().equals("Tanque")){
            iconoVehiculo = iconoTanque.insertarIcono(filas, tipo);
            posiciones[fila][columna] = IconoTanque.reductorContador;
            jugabilidad.guardarPosicion(contadorVehiculo, fila, columna);
            
            jugabilidad.guardarPosiciones(vehiculosPartida, contadorVehiculo, fila, columna);
            contadorVehiculo = contadorVehiculo - IconoTanque.reductorContador;
            duplicado = IconoTanque.yaIngresado;
        }
        if(mostrarTipo.getText().equals("Avión")){ 
            iconoVehiculo = iconoAvion.insertarIcono(filas, tipo);
            posiciones[fila][columna] = IconoAvion.reductorContador;
            jugabilidad.guardarPosicion(contadorVehiculo, fila, columna);
            
            jugabilidad.guardarPosiciones(vehiculosPartida, contadorVehiculo, fila, columna);
            contadorVehiculo = contadorVehiculo - IconoAvion.reductorContador;
            duplicado = IconoAvion.yaIngresado;
        }
        if(mostrarTipo.getText().equals("vacio")){
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UN VEHICULO");
            if(codigoTerreno[fila][columna].equals("llanura")){
                iconoVehiculo = terrenos.llanura();
            }
            if(codigoTerreno[fila][columna].equals("mountain")){
                iconoVehiculo = terrenos.montana();
            }
            if(codigoTerreno[fila][columna].equals("lake")){
                iconoVehiculo = terrenos.agua();
            }
            posiciones[fila][columna] = 0;
        }
        return iconoVehiculo;    
    }
    public void inicioDados(){
        dadoSeisCaras.setIcon(mostrarDado.seleccionMovimiento(criterioImagenMovimiento));
        dadoCienCaras.setIcon(mostrarDado.seleccionAtaque(criterioImagenAtaque));
        comodin.setIcon(mostrarDado.seleccionComodin(criterioImagenComodin));
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfo = new javax.swing.JPanel();
        rendirse = new javax.swing.JButton();
        dadoSeisCaras = new javax.swing.JButton();
        dadoCienCaras = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        comodin = new javax.swing.JButton();
        flechaComodin = new javax.swing.JLabel();
        flechaAtaque = new javax.swing.JLabel();
        flechaMov = new javax.swing.JLabel();
        panelPtsAtaque1 = new javax.swing.JPanel();
        resultadoComodin = new javax.swing.JLabel();
        panelPtsAtaque = new javax.swing.JPanel();
        porcentajeAtaque = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelNoMov = new javax.swing.JPanel();
        numeroCasillas = new javax.swing.JLabel();
        infoMov2 = new javax.swing.JLabel();
        infoMov = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        infoComodin = new javax.swing.JLabel();
        panelPosicionar = new javax.swing.JPanel();
        infoPos = new javax.swing.JLabel();
        mostrarTipo = new javax.swing.JLabel();
        addVehiculo = new javax.swing.JButton();
        mostrarNombre = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        infoTipo = new javax.swing.JLabel();
        panelEscenario = new javax.swing.JPanel();
        panelJugabilidad = new javax.swing.JPanel();
        seleccComodin = new javax.swing.JButton();
        seleccMovimiento = new javax.swing.JButton();
        seleccAtacar = new javax.swing.JButton();
        panelAtaque = new javax.swing.JScrollPane();
        tablaAtaqueDefensa = new javax.swing.JTable();
        panelVida = new javax.swing.JScrollPane();
        tablaVida = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        verSeleccVehiculo = new javax.swing.JLabel();
        verRegistro = new javax.swing.JLabel();
        panelEnemigo = new javax.swing.JScrollPane();
        tablaEnemigo = new javax.swing.JTable();
        panelJugador = new javax.swing.JPanel();
        verJugador = new javax.swing.JLabel();
        verNivel = new javax.swing.JLabel();
        infoJugador = new javax.swing.JLabel();
        infoLevel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPos = new javax.swing.JTable();
        botonIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        seleccionAccion = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSeleccion = new javax.swing.JTable();
        prueba = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        verTipoVehiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInfo.setBackground(new java.awt.Color(0, 0, 0));
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rendirse.setText("RENDIRSE");
        rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendirseActionPerformed(evt);
            }
        });
        panelInfo.add(rendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 110, 34));

        dadoSeisCaras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoSeisCarasActionPerformed(evt);
            }
        });
        panelInfo.add(dadoSeisCaras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 150, 80));

        dadoCienCaras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoCienCarasActionPerformed(evt);
            }
        });
        panelInfo.add(dadoCienCaras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 150, 80));

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        panelInfo.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 90, 110, 30));

        cargar.setText("CARGAR");
        panelInfo.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 150, 110, 30));
        panelInfo.add(comodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 150, 80));

        flechaComodin.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        flechaComodin.setForeground(new java.awt.Color(255, 255, 255));
        panelInfo.add(flechaComodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 110, 30));

        flechaAtaque.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        flechaAtaque.setForeground(new java.awt.Color(255, 255, 255));
        panelInfo.add(flechaAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 30));

        flechaMov.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        flechaMov.setForeground(new java.awt.Color(255, 255, 255));
        panelInfo.add(flechaMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 30));

        panelPtsAtaque1.setBackground(new java.awt.Color(255, 255, 255));

        resultadoComodin.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        resultadoComodin.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelPtsAtaque1Layout = new javax.swing.GroupLayout(panelPtsAtaque1);
        panelPtsAtaque1.setLayout(panelPtsAtaque1Layout);
        panelPtsAtaque1Layout.setHorizontalGroup(
            panelPtsAtaque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPtsAtaque1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadoComodin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelPtsAtaque1Layout.setVerticalGroup(
            panelPtsAtaque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultadoComodin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelInfo.add(panelPtsAtaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 150, 30));

        panelPtsAtaque.setBackground(new java.awt.Color(255, 255, 255));
        panelPtsAtaque.setForeground(new java.awt.Color(255, 255, 255));

        porcentajeAtaque.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        porcentajeAtaque.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("%");

        javax.swing.GroupLayout panelPtsAtaqueLayout = new javax.swing.GroupLayout(panelPtsAtaque);
        panelPtsAtaque.setLayout(panelPtsAtaqueLayout);
        panelPtsAtaqueLayout.setHorizontalGroup(
            panelPtsAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPtsAtaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(porcentajeAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPtsAtaqueLayout.setVerticalGroup(
            panelPtsAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(porcentajeAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelInfo.add(panelPtsAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, 30));

        panelNoMov.setBackground(new java.awt.Color(255, 255, 255));

        numeroCasillas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        numeroCasillas.setForeground(new java.awt.Color(0, 0, 0));

        infoMov2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        infoMov2.setForeground(new java.awt.Color(0, 0, 0));
        infoMov2.setText("MOVIMIENTOS");

        javax.swing.GroupLayout panelNoMovLayout = new javax.swing.GroupLayout(panelNoMov);
        panelNoMov.setLayout(panelNoMovLayout);
        panelNoMovLayout.setHorizontalGroup(
            panelNoMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroCasillas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoMov2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        panelNoMovLayout.setVerticalGroup(
            panelNoMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numeroCasillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoMov2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelInfo.add(panelNoMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 190, 30));

        infoMov.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        infoMov.setForeground(new java.awt.Color(255, 255, 255));
        infoMov.setText("PODRÁ REALIZAR ");
        panelInfo.add(infoMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 20));

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EL PORCENTAJE DE DAÑO ES");
        panelInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 190, 20));

        infoComodin.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        infoComodin.setForeground(new java.awt.Color(255, 255, 255));
        infoComodin.setText("EL COMODIN ES DE");
        panelInfo.add(infoComodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 20));

        panelPosicionar.setBackground(new java.awt.Color(255, 255, 255));

        infoPos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        infoPos.setForeground(new java.awt.Color(0, 0, 0));
        infoPos.setText("SELECCIONE EL VEHICULO PARA UBICARLO");

        mostrarTipo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        mostrarTipo.setForeground(new java.awt.Color(0, 0, 0));

        addVehiculo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        addVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        addVehiculo.setText("COLOCAR VEHICULOS");
        addVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehiculoActionPerformed(evt);
            }
        });

        mostrarNombre.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        mostrarNombre.setForeground(new java.awt.Color(0, 0, 0));

        infoNombre.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        infoNombre.setForeground(new java.awt.Color(0, 0, 0));
        infoNombre.setText("NOMBRE");

        infoTipo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 12)); // NOI18N
        infoTipo.setForeground(new java.awt.Color(0, 0, 0));
        infoTipo.setText("TIPO");

        javax.swing.GroupLayout panelPosicionarLayout = new javax.swing.GroupLayout(panelPosicionar);
        panelPosicionar.setLayout(panelPosicionarLayout);
        panelPosicionarLayout.setHorizontalGroup(
            panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPosicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPosicionarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPosicionarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPosicionarLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(mostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(mostrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPosicionarLayout.createSequentialGroup()
                                .addComponent(infoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(infoTipo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelPosicionarLayout.setVerticalGroup(
            panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPosicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoTipo)
                    .addComponent(infoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPosicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelInfo.add(panelPosicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 300, 170));

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 790, 1340, 210));

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

        getContentPane().add(panelEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1340, 720));

        panelJugabilidad.setBackground(new java.awt.Color(0, 0, 0));
        panelJugabilidad.setForeground(new java.awt.Color(0, 0, 0));
        panelJugabilidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seleccComodin.setText("CAMBIAR ");
        seleccComodin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccComodinActionPerformed(evt);
            }
        });
        panelJugabilidad.add(seleccComodin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 110, 40));

        seleccMovimiento.setText("MOVERSE");
        seleccMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccMovimientoActionPerformed(evt);
            }
        });
        panelJugabilidad.add(seleccMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 40));

        seleccAtacar.setText("ATACAR");
        seleccAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccAtacarActionPerformed(evt);
            }
        });
        panelJugabilidad.add(seleccAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 110, 40));

        tablaAtaqueDefensa = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaAtaqueDefensa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "VEHICULOS", "PUNTOS ATAQUE", "PUNTOS DEFENSA"
            }
        ));
        panelAtaque.setViewportView(tablaAtaqueDefensa);

        panelJugabilidad.add(panelAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 420, 80));

        tablaVida = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaVida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "VEHICULO", "TIPO VEHICULO", "PUNTOS DE VIDA (HP)"
            }
        ));
        panelVida.setViewportView(tablaVida);

        panelJugabilidad.add(panelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(verSeleccVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verSeleccVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(verRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJugabilidad.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 770, 420, 30));

        tablaEnemigo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaEnemigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ENEMIGO", "ATAQUE", "VIDA(HP)", "FILA", "COLUMNA"
            }
        ));
        panelEnemigo.setViewportView(tablaEnemigo);

        panelJugabilidad.add(panelEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 410, 80));

        panelJugador.setBackground(new java.awt.Color(255, 255, 255));

        verJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        verJugador.setForeground(new java.awt.Color(0, 0, 0));

        verNivel.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        verNivel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelJugadorLayout = new javax.swing.GroupLayout(panelJugador);
        panelJugador.setLayout(panelJugadorLayout);
        panelJugadorLayout.setHorizontalGroup(
            panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugadorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(verJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelJugadorLayout.setVerticalGroup(
            panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(verNivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelJugabilidad.add(panelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 420, 50));

        infoJugador.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoJugador.setForeground(new java.awt.Color(255, 255, 255));
        infoJugador.setText("JUGADOR DE LA PARTIDA");
        panelJugabilidad.add(infoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 30));

        infoLevel.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 16)); // NOI18N
        infoLevel.setForeground(new java.awt.Color(255, 255, 255));
        infoLevel.setText("NIVEL");
        panelJugabilidad.add(infoLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 19, 60, 30));

        tablaPos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "VEHICULO", "POSICION DE FILA", "Y"
            }
        ));
        jScrollPane1.setViewportView(tablaPos);

        panelJugabilidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 420, 90));

        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panelJugabilidad.add(botonIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 60, 40));

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panelJugabilidad.add(botonArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 60, 40));

        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panelJugabilidad.add(botonDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 60, 40));

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panelJugabilidad.add(botonAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 60, 40));

        seleccionAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONE UNA ACCION-", "ATACAR", "MOVERSE", "CAMBIAR VEHICULO", " " }));
        seleccionAccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                seleccionAccionItemStateChanged(evt);
            }
        });
        panelJugabilidad.add(seleccionAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 420, 40));

        tablaSeleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "SELECCIONE UN VEHICULO"
            }
        ));
        tablaSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSeleccionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaSeleccion);

        panelJugabilidad.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, 280, 80));

        getContentPane().add(panelJugabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 40, 470, 960));

        prueba.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFondo/verde.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1070));
        getContentPane().add(verTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 830, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendirseActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rendirseActionPerformed
    public void mostrarDatosVehiculo(int indice){
            mostrarTipo.setText(vehiculosPartida[indice].getTipoVehiculo());
            mostrarNombre.setText(vehiculosPartida[indice].getNombre());
            duplicado = false;
    }
    private void addVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehiculoActionPerformed
        if(contadorVehiculo ==3){
            mostrarDatosVehiculo(0);
        }
        if(contadorVehiculo ==2){
            mostrarDatosVehiculo(1);
        }
        if(contadorVehiculo ==1){
            mostrarDatosVehiculo(2);
        }
        if(contadorVehiculo !=1 && contadorVehiculo !=2 && contadorVehiculo !=3){
            JOptionPane.showMessageDialog(null, "VEHICULOS YA COLOCADOS");
        }
    }//GEN-LAST:event_addVehiculoActionPerformed

    public Icon moverVehiculo(String tipo,int fila,int columna,String tipoVehiculo){                
        if(tipoVehiculo.equals("Tanque")){
            iconoVehiculo = iconoTanque.insertarIcono(filas, tipo);
            posiciones[fila][columna] = 1;
            Boolean insertado = IconoTanque.yaIngresado;
            guardarPosicion(insertado,fila,columna);    
            
        }
        if(tipoVehiculo.equals("Avión")){ 
            iconoVehiculo = iconoAvion.insertarIcono(filas, tipo);
            posiciones[fila][columna] = 1;
            Boolean insertado = IconoAvion.yaIngresado;
            guardarPosicion(insertado,fila,columna);
        }
        return iconoVehiculo;    
    }
    public void guardarPosicion(Boolean guardar, int fila, int columna){
        if(guardar == true){
                    moverse.nuevaPosicion(codigoVehiculo, fila, columna, vehiculosPartida);
                }else{}
    }
    public void insertarTerreno(int fila,int columna){
        Boolean errorTanque = IconoTanque.yaIngresado;
        Boolean errorAvion = IconoAvion.yaIngresado;
            if(errorTanque == false || errorAvion == false){
            }else{
                posiciones[fila][columna] = 0;
                escenario[fila][columna].setIcon(terrenos.reinsertarIcono(recibirFila,codigoTerreno[fila][columna]));
         }
    }
    public void moverVehiculos(){
        String casillas = numeroCasillas.getText();
        String codigo;
           
        if(criterioMovimiento == true){
            if(vehiculoElegido == true){
                int cambioCasilla = moverse.moverse(casillas, vehiculosPartida,codigoVehiculo,seleccionDireccion, recibirFila, recibirColumna);
                int filaVehiculo = moverse.filaVehiculo(codigoVehiculo, vehiculosPartida);
                int columnaVehiculo = moverse.columnaVehiculo(codigoVehiculo, vehiculosPartida);
                
                if(codigoMovimiento == 0){
                    JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UNA DIRECCION");
                }            
                if(codigoMovimiento == 1){
                    if(posiciones[cambioCasilla][columnaVehiculo]==1){
                        JOptionPane.showMessageDialog(null, "UN VEHICULO SE ENCUENTRA EN ESTA CASILLA");
                    }
                    if(posiciones[cambioCasilla][columnaVehiculo]==2){                        
                        JOptionPane.showMessageDialog(null, "SE ENCUENTRA UN ENEMIGO EN ESTA POSICION");
                    } 
                    if(posiciones[cambioCasilla][columnaVehiculo]==0){
                        codigo = codigoTerreno[cambioCasilla][columnaVehiculo];                    
                        escenario[cambioCasilla][columnaVehiculo].setIcon(moverVehiculo(codigo,cambioCasilla,columnaVehiculo,mostrarTipoVehiculo));
                        insertarTerreno(filaVehiculo,columnaVehiculo);
                    }
                }
                if(codigoMovimiento == 2){
                    if(posiciones[filaVehiculo][cambioCasilla]==1){
                        JOptionPane.showMessageDialog(null, "UN VEHICULO SE ENCUENTRA EN ESTA CASILLA");
                    }
                    if(posiciones[filaVehiculo][cambioCasilla]==2){                        
                        JOptionPane.showMessageDialog(null, "SE ENCUENTRA UN ENEMIGO EN ESTA POSICION");
                    } 
                    if(posiciones[filaVehiculo][cambioCasilla]==0){
                        codigo = codigoTerreno[filaVehiculo][cambioCasilla];                    
                        escenario[filaVehiculo][cambioCasilla].setIcon(moverVehiculo(codigo,filaVehiculo,cambioCasilla,mostrarTipoVehiculo));
                        insertarTerreno(filaVehiculo,columnaVehiculo);
                    }
                }
                ataqueEnemigo.ataqueEnemigo(recibirColumna,recibirFila, posiciones, vehiculosPartida);
                
            }else{
                JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UN VEHICULO");
            }
        }else{
            JOptionPane.showMessageDialog(null, "NO TIENE SELECCIONADA LA OPCION MOVERSE");
        }
        mostrarPosiciones();
    }
    private void seleccMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccMovimientoActionPerformed
        moverVehiculos();
        panelEscenario.updateUI();
    }//GEN-LAST:event_seleccMovimientoActionPerformed
    public void verificarAtaque(int indice){
        if(vehiculosPartida[indice].getVida() > 0 && codigoVehiculo == vehiculosPartida[indice].getIdentificador()){
            empezarAtaque();
        }else{
            JOptionPane.showMessageDialog(null, "EL VEHICULO  "+ vehiculosPartida[indice].getNombre()+"  ESTA MUERTO, NO PUEDE ATACAR");
        }
    }
    public void realizarAtaque(){
        ganoJuego = verificar.vidaEnemigos();
        perdioJuego = verificar.vidaVehiculosPartida(vehiculosPartida);
        if(ganoJuego ==false && perdioJuego == false){
            if(criterioAtaque == true){
                if(codigoVehiculo == vehiculosPartida[0].getIdentificador()){
                    verificarAtaque(0);
                }
                if(codigoVehiculo == vehiculosPartida[1].getIdentificador()){
                    verificarAtaque(1);
                }
                if(codigoVehiculo == vehiculosPartida[2].getIdentificador()){
                    verificarAtaque(2);
                }                       
            }else{
                JOptionPane.showMessageDialog(null,"NO HA SELECCIONADO LA OPCIÓN ATACAR");
            }
            mostrarEnemigos();
            mostrarVida();
        }
        if(ganoJuego == true){
            JOptionPane.showMessageDialog(null,"EL JUGADOR  "+verJugador.getText()+ "  HA GANADO, TODOS LOS ENEMIGOS HAN MUERTO");
            verificar.victoriaPartida();
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.setVisible(false);
        }
        if(perdioJuego == true){
            JOptionPane.showMessageDialog(null, "HAS PERDIDO, TODOS TUS VEHICULOS HAN SIDO DESTRUIDOS");
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.setVisible(false);

        }
    }
    public void empezarAtaque(){
        atacar.atacar(porcentajeAtaque.getText(),seleccionDireccion, posiciones, recibirColumna, recibirFila,codigoVehiculo, vehiculosPartida);
        ataqueEnemigo.ataqueEnemigo(recibirColumna,recibirFila, posiciones, vehiculosPartida);
    }
    private void seleccAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccAtacarActionPerformed
        realizarAtaque();
    }//GEN-LAST:event_seleccAtacarActionPerformed

    private void seleccComodinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccComodinActionPerformed
        if(contadorVehiculo == 0){
            criterioImagenComodin = true;
            criterioImagenAtaque = false;
            criterioImagenMovimiento = false;
            criterioAtaque = false;
            criterioMovimiento = false;
            criterioComodin = true;
            flechaAtaque.setText(null);
            flechaMov.setText(null);
            flechaComodin.setText("SELECCIONADO");
            dadoSeisCaras.setIcon(mostrarDado.seleccionMovimiento(criterioImagenMovimiento));
            dadoCienCaras.setIcon(mostrarDado.seleccionAtaque(criterioImagenAtaque));
            comodin.setIcon(mostrarDado.seleccionComodin(criterioImagenComodin));
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE LOS VEHICULOS Y COLOQUELOS EN UNA POSICION");
        }
    }//GEN-LAST:event_seleccComodinActionPerformed

    private void dadoSeisCarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoSeisCarasActionPerformed
        if(criterioMovimiento == true){
            numeroCasillas.setText(jugabilidad.mostrarMovimientos());
        }else{
            JOptionPane.showMessageDialog(null, "NO TIENE SELECCIONADO MOVERSE");
        }
    }//GEN-LAST:event_dadoSeisCarasActionPerformed

    private void dadoCienCarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoCienCarasActionPerformed
        if(criterioAtaque == true){
            porcentajeAtaque.setText(jugabilidad.mostrarPorcentaje());
        }else{
            JOptionPane.showMessageDialog(null, "NO TIENE SELECCIONADO ATACAR");
        }
    }//GEN-LAST:event_dadoCienCarasActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
    }//GEN-LAST:event_guardarActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        seleccionDireccion ="arriba";
        direccionElegida = true;
        codigoMovimiento = 1;
        if(criterioMovimiento == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO SE MOVERA HACIA ARRIBA");
        }
        if(criterioAtaque == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO ATACARÁ HACIA ARRIBA");
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    public void definirAccion(){
        if(seleccionAccion.getSelectedItem() == "MOVERSE"){
            if(contadorVehiculo == 0){       
                criterioImagenMovimiento = true;
                criterioImagenAtaque = false;
                criterioImagenComodin = false;
                criterioAtaque = false;
                criterioMovimiento = true;
                criterioComodin = false;
                flechaAtaque.setText(null);
                flechaMov.setText("SELECCIONADO");
                flechaComodin.setText(null);
                dadoSeisCaras.setIcon(mostrarDado.seleccionMovimiento(criterioImagenMovimiento));
                dadoCienCaras.setIcon(mostrarDado.seleccionAtaque(criterioImagenAtaque));
                comodin.setIcon(mostrarDado.seleccionComodin(criterioImagenComodin));
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE LOS VEHICULOS Y COLOQUELOS EN UNA POSICION");
        }
        }
        if(seleccionAccion.getSelectedItem() == "ATACAR"){
            if(contadorVehiculo == 0){
                criterioImagenAtaque = true;
                criterioImagenMovimiento = false;
                criterioImagenComodin = false;
                criterioAtaque = true;
                criterioMovimiento = false;
                criterioComodin = false;
                flechaAtaque.setText("SELECCIONADO");
                flechaMov.setText(null);
                flechaComodin.setText(null);
                dadoSeisCaras.setIcon(mostrarDado.seleccionMovimiento(criterioImagenMovimiento));
                dadoCienCaras.setIcon(mostrarDado.seleccionAtaque(criterioImagenAtaque));
                comodin.setIcon(mostrarDado.seleccionComodin(criterioImagenComodin));
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE LOS VEHICULOS Y COLOQUELOS EN UNA POSICION");
            }
        }
    }
    
    private void seleccionAccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seleccionAccionItemStateChanged
        definirAccion();
    }//GEN-LAST:event_seleccionAccionItemStateChanged

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        seleccionDireccion ="abajo";
        direccionElegida = true;
        codigoMovimiento = 1;
        if(criterioMovimiento == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO SE MOVERA HACIA ABAJO");
        }
        if(criterioAtaque == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO ATACARÁ HACIA ABAJO");
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        seleccionDireccion ="izquierda";
        direccionElegida = true;
        codigoMovimiento = 2;
        if(criterioMovimiento == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO SE MOVERA HACIA LA IZQUIERDA");
        }
        if(criterioAtaque == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO ATACARÁ HACIA LA IZQUIERDA");
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        seleccionDireccion ="derecha";
        direccionElegida = true;
        codigoMovimiento = 2;
        if(criterioMovimiento == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO SE MOVERA HACIA LA DERECHA");
        }
        if(criterioAtaque == true){
            JOptionPane.showMessageDialog(null, "EL VEHICULO ATACARÁ HACIA LA DERECHA");
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void tablaSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSeleccionMouseClicked
        int fila = this.tablaSeleccion.getSelectedRow();
        codigoVehiculo = vehiculosPartida[fila].getIdentificador();
        mostrarTipoVehiculo = vehiculosPartida[fila].getTipoVehiculo();
        String nombreVehiculo = vehiculosPartida[fila].getNombre();
        String verCo = String.valueOf(codigoVehiculo);
        verSeleccVehiculo.setText(nombreVehiculo);
        verRegistro.setText(mostrarTipoVehiculo);
        vehiculoElegido = true;
    }//GEN-LAST:event_tablaSeleccionMouseClicked

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
    private javax.swing.JButton addVehiculo;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton cargar;
    private javax.swing.JButton comodin;
    private javax.swing.JButton dadoCienCaras;
    private javax.swing.JButton dadoSeisCaras;
    private javax.swing.JLabel flechaAtaque;
    private javax.swing.JLabel flechaComodin;
    private javax.swing.JLabel flechaMov;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel infoComodin;
    private javax.swing.JLabel infoJugador;
    private javax.swing.JLabel infoLevel;
    private javax.swing.JLabel infoMov;
    private javax.swing.JLabel infoMov2;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JLabel infoPos;
    private javax.swing.JLabel infoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mostrarNombre;
    private javax.swing.JLabel mostrarTipo;
    private javax.swing.JLabel numeroCasillas;
    private javax.swing.JScrollPane panelAtaque;
    private javax.swing.JScrollPane panelEnemigo;
    private javax.swing.JPanel panelEscenario;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelJugabilidad;
    private javax.swing.JPanel panelJugador;
    private javax.swing.JPanel panelNoMov;
    private javax.swing.JPanel panelPosicionar;
    private javax.swing.JPanel panelPtsAtaque;
    private javax.swing.JPanel panelPtsAtaque1;
    private javax.swing.JScrollPane panelVida;
    private javax.swing.JLabel porcentajeAtaque;
    private javax.swing.JLabel prueba;
    private javax.swing.JButton rendirse;
    private javax.swing.JLabel resultadoComodin;
    private javax.swing.JButton seleccAtacar;
    private javax.swing.JButton seleccComodin;
    private javax.swing.JButton seleccMovimiento;
    private javax.swing.JComboBox<String> seleccionAccion;
    private javax.swing.JTable tablaAtaqueDefensa;
    private javax.swing.JTable tablaEnemigo;
    private javax.swing.JTable tablaPos;
    private javax.swing.JTable tablaSeleccion;
    private javax.swing.JTable tablaVida;
    private javax.swing.JLabel verJugador;
    private javax.swing.JLabel verNivel;
    private javax.swing.JLabel verRegistro;
    private javax.swing.JLabel verSeleccVehiculo;
    private javax.swing.JLabel verTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}
