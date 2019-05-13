
package RPG.jugabilidad;

import RPG.archivos.ArchivoJugabilidad;
import RPG.enemigos.Enemigo;
import RPG.escenario.IconoEnemigo;
import RPG.interfaz.IniciarJuego;
import RPG.interfaz.ListadoVehiculo;
import RPG.vehiculos.Vehiculo;
import java.util.Random;

public class Jugabilidad {
  
    ArchivoJugabilidad archivoPartida = new ArchivoJugabilidad();
    Vehiculo[] vehiculosPartida = new Vehiculo[3];
    public static Vehiculo vehiculoUno = ListadoVehiculo.vehiculoUno;
    public static Vehiculo vehiculoDos = ListadoVehiculo.vehiculoDos;
    public static Vehiculo vehiculoTres = ListadoVehiculo.vehiculoTres;
    public static Enemigo[] enemigos = IniciarJuego.enemigo.clone();
    IconoEnemigo iconoEnemigo = new IconoEnemigo();
    
    public Vehiculo[] vehiculosPartida(){
         return vehiculosPartida = archivoPartida.leerVehiculo();
    }
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
        String cadena;
        String[][] verEnemigos = new String[3][6];
        for (int i = 0; i < 3; i++) {
            verEnemigos[i][0]= enemigos[i].getNombre();
            verEnemigos[i][1]= enemigos[i].getAtaque();
            verEnemigos[i][2]= cadena = String.valueOf(enemigos[i].getVida());
            verEnemigos[i][3]= cadena = String.valueOf(enemigos[i].getPosFila()+1);
            verEnemigos[i][4]= cadena = String.valueOf(enemigos[i].getPosColumna()+1);
        }
        return verEnemigos;
    }
    public String[][] vidaVehiculo(Vehiculo[] vehiculosPartida){
        String[][] listado = new String[3][3];
        String cadena;        
        for (int i = 0; i < 3; i++) {
            listado[i][0]= vehiculosPartida[i].getNombre();
            listado[i][1]= vehiculosPartida[i].getTipoVehiculo();
            listado[i][2]= cadena = String.valueOf(vehiculosPartida[i].getVida());
        }
        return listado;    
    }
    public String[][] ataqueDefensaVehiculo(Vehiculo[] vehiculosPartida){
        String[][] listado = new String[3][3];
        String cadena;        
        for (int i = 0; i < 3; i++) {
            listado[i][0]= vehiculosPartida[i].getNombre();
            listado[i][1]= cadena = String.valueOf(vehiculosPartida[i].getAtaque());
            listado[i][2]= cadena = String.valueOf(vehiculosPartida[i].getDefensa());
        }
        return listado;    
    }
    public String[][] seleccionVehiculo(Vehiculo[] vehiculosPartida){
        String[][] listado = new String[3][1];
        String cadena;        
        for (int i = 0; i < 3; i++) {
            listado[i][0]= vehiculosPartida[i].getNombre();
        }
        return listado;    
    }
    public String[][] posicionVehiculo(Vehiculo[] vehiculosPartida){
        String[][] listado = new String[3][3];
        String cadena;        
        for (int i = 0; i < 3; i++) {
            listado[i][0]= vehiculosPartida[i].getNombre();
            listado[i][1]= cadena = String.valueOf(vehiculosPartida[i].getPosFila()+1);
            listado[i][2]= cadena = String.valueOf(vehiculosPartida[i].getPosColumna()+1);
        }
        return listado;    
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
    
    public void guardarCoordenadas(int fila,int columna,int indice,Vehiculo[] vehiculosPartida){
        vehiculosPartida[indice].setPosFila(fila);
        vehiculosPartida[indice].setPosColumna(columna);
    }
    public void guardarPosiciones(Vehiculo[] vehiculosPartida,int identificador,int fila, int columna){
        if(identificador == 3){
            guardarCoordenadas(fila,columna,0,vehiculosPartida);            
        }
        if(identificador == 2){
            guardarCoordenadas(fila,columna,1,vehiculosPartida);            
        }
        if(identificador == 1){
            guardarCoordenadas(fila,columna,2,vehiculosPartida);            
        }
    }
    
    
}
