
package RPG.jugabilidad;

import RPG.enemigos.Enemigo;
import RPG.escenario.IconoEnemigo;
import RPG.interfaz.IniciarJuego;
import RPG.interfaz.ListadoVehiculo;
import RPG.vehiculos.Vehiculo;
import java.util.Random;

public class Jugabilidad {
  
    public static Vehiculo vehiculoUno = ListadoVehiculo.vehiculoUno;
    public static Vehiculo vehiculoDos = ListadoVehiculo.vehiculoDos;
    public static Vehiculo vehiculoTres = ListadoVehiculo.vehiculoTres;
    public static Enemigo[] enemigos = IniciarJuego.enemigo.clone();
    IconoEnemigo iconoEnemigo = new IconoEnemigo();
    
    public int noMovimientos(){
        Random movimmientoAleatorio = new Random();
        return movimmientoAleatorio.nextInt(6)+1;
    }
    public int porcentajeAtaque(){
        Random porcentajeAleatorio = new Random();
        return porcentajeAleatorio.nextInt(100)+1;
    }
    public String mostrarMovimientos(){
        String movimiento = Integer.toString(noMovimientos());        
        return movimiento;
    }
    public String mostrarPorcentaje(){
        String porcentaje = Integer.toString(porcentajeAtaque());        
        return porcentaje;
    }
    public String[][] mostrarEnemigos(){
        String vida;
        String[][] verEnemigos = new String[3][6];
        verEnemigos[0][0] = enemigos[0].getNombre();
        verEnemigos[1][0] = enemigos[1].getNombre();
        verEnemigos[2][0] = enemigos[2].getNombre();
        verEnemigos[0][1] = enemigos[0].getAtaque();
        verEnemigos[1][1] = enemigos[1].getAtaque();
        verEnemigos[2][1] = enemigos[2].getAtaque();
        verEnemigos[0][2] = vida = String.valueOf(enemigos[0].getVida());
        verEnemigos[1][2] = vida = String.valueOf(enemigos[1].getVida());
        verEnemigos[2][2] = vida = String.valueOf(enemigos[2].getVida());
        verEnemigos[0][3] = vida = String.valueOf(enemigos[0].getPosFila()+1);
        verEnemigos[1][3] = vida = String.valueOf(enemigos[1].getPosFila()+1);
        verEnemigos[2][3] = vida = String.valueOf(enemigos[2].getPosFila()+1);
        verEnemigos[0][4] = vida = String.valueOf(enemigos[0].getPosColumna()+1);
        verEnemigos[1][4] = vida = String.valueOf(enemigos[1].getPosColumna()+1);
        verEnemigos[2][4] = vida = String.valueOf(enemigos[2].getPosColumna()+1);
        return verEnemigos;
    }
    public String[][] mostrarVidaJugador(){
       String[][] vidaVehiculos = new String[3][4];
       String vida;
       vidaVehiculos[0][0] = vehiculoUno.getNombre();
       vidaVehiculos[1][0] = vehiculoDos.getNombre();
       vidaVehiculos[2][0] = vehiculoTres.getNombre();
       vidaVehiculos[0][1] = vehiculoUno.getTipoVehiculo();
       vidaVehiculos[1][1] = vehiculoDos.getTipoVehiculo();
       vidaVehiculos[2][1] = vehiculoTres.getTipoVehiculo();
       vidaVehiculos[0][2] = vida = String.valueOf(vehiculoUno.getVida());
       vidaVehiculos[1][2] = vida = String.valueOf(vehiculoDos.getVida());
       vidaVehiculos[2][2] = vida = String.valueOf(vehiculoTres.getVida());
       return vidaVehiculos;
    }
    public String[][] mostrarAtaqueJugador(){
       String[][] ataqueVehiculos = new String[3][3];
       String cadena;
       ataqueVehiculos[0][0] = vehiculoUno.getNombre();
       ataqueVehiculos[1][0] = vehiculoDos.getNombre();
       ataqueVehiculos[2][0] = vehiculoTres.getNombre();
       ataqueVehiculos[0][1] = cadena = String.valueOf(vehiculoUno.getAtaque());
       ataqueVehiculos[1][1] = cadena = String.valueOf(vehiculoDos.getAtaque());
       ataqueVehiculos[2][1] = cadena = String.valueOf(vehiculoTres.getAtaque());
       return ataqueVehiculos;
    }
    public String[][] mostrarDefensaJugador(){
       String[][] defensaVehiculos = new String[3][3];
       String cadena;
       defensaVehiculos[0][0] = vehiculoUno.getNombre();
       defensaVehiculos[1][0] = vehiculoDos.getNombre();
       defensaVehiculos[2][0] = vehiculoTres.getNombre();
       defensaVehiculos[0][1] = cadena = String.valueOf(vehiculoUno.getDefensa());
       defensaVehiculos[1][1] = cadena = String.valueOf(vehiculoDos.getDefensa());
       defensaVehiculos[2][1] = cadena = String.valueOf(vehiculoTres.getDefensa());
       return defensaVehiculos;
    }
    public String[][] mostrarAtaqueDefensaJugador(){
       String[][] ataqueDefensaVehiculos = new String[3][4];
       String cadena;
       ataqueDefensaVehiculos[0][0] = vehiculoUno.getNombre();
       ataqueDefensaVehiculos[1][0] = vehiculoDos.getNombre();
       ataqueDefensaVehiculos[2][0] = vehiculoTres.getNombre();
       ataqueDefensaVehiculos[0][1] = cadena = String.valueOf(vehiculoUno.getAtaque());
       ataqueDefensaVehiculos[1][1] = cadena = String.valueOf(vehiculoDos.getAtaque());
       ataqueDefensaVehiculos[2][1] = cadena = String.valueOf(vehiculoTres.getAtaque());
       ataqueDefensaVehiculos[0][2] = cadena = String.valueOf(vehiculoUno.getDefensa());
       ataqueDefensaVehiculos[1][2] = cadena = String.valueOf(vehiculoDos.getDefensa());
       ataqueDefensaVehiculos[2][2] = cadena = String.valueOf(vehiculoTres.getDefensa());
       return ataqueDefensaVehiculos;
    }
    public int moverse(String cantidadCasillas,String nombre,String direccion,int filasEscenario,int columnasEscenario){
        int casillas = Integer.parseInt(cantidadCasillas);
        int valorRetorno =0;
        if(nombre.equals(vehiculoUno.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculoUno.getPosFila(),vehiculoUno.getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(nombre.equals(vehiculoDos.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculoDos.getPosFila(),vehiculoDos.getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(nombre.equals(vehiculoTres.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculoTres.getPosFila(),vehiculoTres.getPosColumna(),filasEscenario,columnasEscenario);
        }     
        return valorRetorno;
    }
    public int columnaVehiculo(String nombre){
        int columna = 0;
        if(nombre.equals(vehiculoUno.getNombre())){
            columna = vehiculoUno.getPosColumna();
        }
        if(nombre.equals(vehiculoDos.getNombre())){
            columna = vehiculoUno.getPosColumna();
        }
        if(nombre.equals(vehiculoTres.getNombre())){
            columna = vehiculoUno.getPosColumna();
        }
        return columna;
    }
    public int filaVehiculo(String nombre){
        int fila = 0;
        if(nombre.equals(vehiculoUno.getNombre())){
            fila = vehiculoUno.getPosFila();
        }
        if(nombre.equals(vehiculoDos.getNombre())){
            fila = vehiculoUno.getPosFila();
        }
        if(nombre.equals(vehiculoTres.getNombre())){
            fila = vehiculoUno.getPosFila();
        }
        return fila;
    }
    public int seleccionarDireccion(int cantidadMover,String direccion,int filaInicial,int columnaInicial, int filasEscenario, int columnasEscenario){
        int valor = 0;
        
        if(direccion.equals("arriba")){
            valor = moverArriba(cantidadMover,filaInicial);
        }
        if(direccion.equals("abajo")){
            valor = moverAbajo(cantidadMover,filaInicial,filasEscenario);
        }
        if(direccion.equals("derecha")){
        
        }
        if(direccion.equals("izquierda")){
        
        }
        return valor;
        
    }
    public int moverArriba(int cantidadMover,int filaInicial){
        filaInicial++;
        int nuevaFila;
        
        if(cantidadMover < filaInicial){
            nuevaFila = filaInicial-cantidadMover;
                nuevaFila--;
        }else{
            nuevaFila = 0;
        }
        return nuevaFila;
    }
    public int moverAbajo(int cantidadMover,int filaInicial,int filasEscenario){
        filaInicial++;
        int nuevaFila;
        int diferencia = filasEscenario - filaInicial;
        if(cantidadMover < diferencia){
            nuevaFila = filaInicial + cantidadMover;
            nuevaFila--;
        }else{
            nuevaFila = filasEscenario-1;
        }
        return nuevaFila;
    }
    public void moverDerecha(){
        
    }
    public int ataque(String recibirPorcentaje, String valorAtaque){
        int porcentaje = Integer.parseInt(recibirPorcentaje);
        int ataque = Integer.parseInt(valorAtaque);
        
        return ataque;
    }
    public int randomFilas(int filas){
        Random posFila = new Random();
        return posFila.nextInt(filas);
    }
    public int randomColumnas(int columnas){
        Random posColumna = new Random();
        return posColumna.nextInt(columnas);
    }
    public void coordenadasVehiculoUno(int fila,int columna){
        vehiculoUno.setPosFila(fila);
        vehiculoUno.setPosColumna(columna);
    }
    public void coordenadasVehiculoDos(int fila,int columna){
        vehiculoDos.setPosFila(fila);
        vehiculoDos.setPosColumna(columna);
    }
    public void coordenadasVehiculoTres(int fila,int columna){
        vehiculoTres.setPosFila(fila);
        vehiculoTres.setPosColumna(columna);
    }
    public void guardarPosicion(int identificador,int fila, int columna){
        if(identificador == 3){
            coordenadasVehiculoUno(fila,columna);            
        }
        if(identificador == 2){
            coordenadasVehiculoDos(fila,columna);            
        }
        if(identificador == 1){
            coordenadasVehiculoTres(fila,columna);            
        }
    }
    public void nuevaPosicion(String nombre, int fila, int columna){
        if(nombre.equals(vehiculoUno.getNombre())){
            vehiculoUno.setPosColumna(columna);
            vehiculoUno.setPosFila(fila);
        }
        if(nombre.equals(vehiculoDos.getNombre())){
            vehiculoDos.setPosColumna(columna);
            vehiculoDos.setPosFila(fila);
        }
        if(nombre.equals(vehiculoTres.getNombre())){
            vehiculoTres.setPosColumna(columna);
            vehiculoTres.setPosFila(fila);
        }
    }
    public String[][] mostrarPosicion(){
       String[][] posicionVehiculos = new String[3][3];
       String posX,posY;
       posicionVehiculos[0][0] = vehiculoUno.getNombre();
       posicionVehiculos[1][0] = vehiculoDos.getNombre();
       posicionVehiculos[2][0] = vehiculoTres.getNombre();
       posicionVehiculos[0][1] = posX = String.valueOf(vehiculoUno.getPosFila()+1);
       posicionVehiculos[1][1] = posX = String.valueOf(vehiculoDos.getPosFila()+1);
       posicionVehiculos[2][1] = posX = String.valueOf(vehiculoTres.getPosFila()+1);
       posicionVehiculos[0][2] = posY = String.valueOf(vehiculoUno.getPosColumna()+1);
       posicionVehiculos[1][2] = posY = String.valueOf(vehiculoDos.getPosColumna()+1);
       posicionVehiculos[2][2] = posY = String.valueOf(vehiculoTres.getPosColumna()+1);
       return posicionVehiculos;
    }
    
    
    
}
