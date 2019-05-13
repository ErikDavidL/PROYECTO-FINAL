
package RPG.jugabilidad;

import RPG.vehiculos.Vehiculo;
import javax.swing.JOptionPane;

public class Atacar {
      
    public void atacar(String porcentajeAtaque,String direccion, int[][] posicionesEnemigos,int columnasEscenario,int filasEscenario, int identificador,Vehiculo[] vehiculosPartida){
        
        if(direccion.equals("arriba")){
            atacarArriba(porcentajeAtaque,posicionesEnemigos,identificador,vehiculosPartida);
        }
        if(direccion.equals("abajo")){
            atacarAbajo(porcentajeAtaque,filasEscenario,posicionesEnemigos,identificador,vehiculosPartida);
        }
        if(direccion.equals("derecha")){
            atacarDerecha(porcentajeAtaque,columnasEscenario,posicionesEnemigos,identificador,vehiculosPartida);
        }
        if(direccion.equals("izquierda")){
            atacarIzquierda(porcentajeAtaque,posicionesEnemigos,identificador,vehiculosPartida);
        }
    }
    
    public void atacarDerecha(String porcentajeAtaque,int columnasEscenario,int[][] posiciones, int identificador,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int i;
        int fila = posicionFila(identificador, vehiculosPartida);
        int columna = posicionColumna(identificador, vehiculosPartida);
        i = columna;
        while(i < columnasEscenario && busqueda == false) {
            if(posiciones[fila][i] == 2){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i++;
        }  
        realizarAtaque(busqueda,verificarFila,verificarColumna, vehiculosPartida,identificador);      
    }
    
    public void atacarIzquierda(String porcentajeAtaque,int[][] posiciones,int identificador, Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(identificador, vehiculosPartida);        
        int columna = posicionColumna(identificador, vehiculosPartida);
        int i = columna;
        while(i >=0 && busqueda == false) {
            if(posiciones[fila][i] == 2){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i--;
        }
        realizarAtaque(busqueda,verificarFila,verificarColumna,vehiculosPartida,identificador);
    }
    public void atacarArriba(String porcentajeAtaque,int[][] posiciones,int identificador,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(identificador,vehiculosPartida);
        int columna = posicionColumna(identificador,vehiculosPartida);      
        int i = fila;
        while(i >= 0 && busqueda == false) {
            if(posiciones[i][columna] == 2){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i--;
        }  
        realizarAtaque(busqueda,verificarFila,verificarColumna,vehiculosPartida,identificador);
    }
    public void atacarAbajo(String porcentajeAtaque,int filasEscenario,int[][] posiciones, int identificador ,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(identificador,vehiculosPartida);
        int columna = posicionColumna(identificador,vehiculosPartida);
        int i = fila;
        while(i < filasEscenario && busqueda == false) {
            if(posiciones[i][columna] == 2){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i++;
        }   
        realizarAtaque(busqueda,verificarFila,verificarColumna,vehiculosPartida,identificador);
    }
    
    public void realizarAtaque(Boolean acertado, int filaEnemigo, int columnaEnemigo,Vehiculo[] vehiculosPartida,int identificador){
        if(acertado == true){
            JOptionPane.showMessageDialog(null, "ATAQUE EXITOSO, DAÑO HECHO");
            reducirVida(filaEnemigo,columnaEnemigo,vehiculosPartida, identificador);
        }
        if(acertado == false){
            JOptionPane.showMessageDialog(null, "EL ATAQUE HA FALLADO");
        }
    }
    
    public void reducirVida(int fila, int columna, Vehiculo[] vehiculosPartida, int identificador){
        if(fila == Jugabilidad.enemigos[0].getPosFila() && columna == Jugabilidad.enemigos[0].getPosColumna()){
            
            if(Jugabilidad.enemigos[0].getVida() > 0){
                int vida = Jugabilidad.enemigos[0].getVida() - valorAtaque(vehiculosPartida,identificador);            
                verificarAtaque(vida,0,vehiculosPartida,identificador);
            }
            if(Jugabilidad.enemigos[0].getVida() <= 0){
                JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[0].getNombre() +" YA ESTÁ MUERTO");
            }
        }
        if(fila == Jugabilidad.enemigos[1].getPosFila() && columna == Jugabilidad.enemigos[1].getPosColumna()){
            
            if(Jugabilidad.enemigos[1].getVida() > 0){
                int vida = Jugabilidad.enemigos[0].getVida() - valorAtaque(vehiculosPartida,identificador);            
                verificarAtaque(vida,1,vehiculosPartida,identificador);
            }
            if(Jugabilidad.enemigos[1].getVida() <= 0){
                JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[1].getNombre() +" YA ESTÁ MUERTO");
            }
        }
        if(fila == Jugabilidad.enemigos[2].getPosFila() && columna == Jugabilidad.enemigos[2].getPosColumna()){
            
            if(Jugabilidad.enemigos[2].getVida() > 0){
                int vida = Jugabilidad.enemigos[2].getVida() - valorAtaque(vehiculosPartida,identificador);            
                verificarAtaque(vida,2,vehiculosPartida,identificador);
            }
            if(Jugabilidad.enemigos[2].getVida() <= 0){
                JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[2].getNombre() +" YA ESTÁ MUERTO");
            }
        }       
    }
    public void verificarAtaque(int vidaActual,int indice, Vehiculo[] vehiculosPartida, int identificador){
        if(vidaActual <= 0){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[indice].getNombre() +" HA SIDO ELIMINADO");
            nuevaEliminacion(vehiculosPartida,identificador);
            vidaActual = 0;
        }
        if(vidaActual > 0){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[indice].getNombre() +" HA RECIBIDO DAÑO");
        }
            Jugabilidad.enemigos[indice].setVida(vidaActual);
    }
    public Vehiculo[] nuevaEliminacion(Vehiculo[] vehiculosPartida, int identificador){
        int eliminados;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            eliminados = vehiculosPartida[0].getEliminaciones()+1;
            vehiculosPartida[0].setEliminaciones(eliminados);
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            eliminados = vehiculosPartida[1].getEliminaciones()+1;
            vehiculosPartida[1].setEliminaciones(eliminados);
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            eliminados = vehiculosPartida[2].getEliminaciones()+1;
            vehiculosPartida[2].setEliminaciones(eliminados);
        }
        return vehiculosPartida;
    }
    public int valorAtaque(Vehiculo[] vehiculosPartida, int identificador){
        int ataque = 0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            ataque = vehiculosPartida[0].getAtaque();
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            ataque = vehiculosPartida[1].getAtaque();
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            ataque = vehiculosPartida[2].getAtaque();
        }
        return ataque;
    }
    public int posicionFila(int identificador, Vehiculo[] vehiculosPartida){
        int fila = 0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            fila = vehiculosPartida[0].getPosFila();
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            fila = vehiculosPartida[1].getPosFila();
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            fila = vehiculosPartida[2].getPosFila();
        }
        return fila;
    }
    public int posicionColumna(int identificador, Vehiculo[] vehiculosPartida){
        int columna = 0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            columna = vehiculosPartida[0].getPosColumna();
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            columna = vehiculosPartida[1].getPosColumna();
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            columna = vehiculosPartida[2].getPosColumna();
        }
        return columna;
    }
}
