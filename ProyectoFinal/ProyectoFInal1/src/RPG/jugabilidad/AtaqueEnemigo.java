
package RPG.jugabilidad;

import RPG.vehiculos.Vehiculo;
import java.util.Random;
import javax.swing.JOptionPane;


public class AtaqueEnemigo {

    public void ataqueEnemigo(int columnasEscenario,int filasEscenario,int[][] posiciones,Vehiculo[] vehiculosPartida){
        int enemigo = noEnemigo();
        switch(enemigo){
            case 1:
                if(Jugabilidad.enemigos[0].getVida() <= 0){
                    JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[0].getNombre()+" NO ATACARA YA QUE ESTÁ MUERTO");
                    //ataqueEnemigo(columnasEscenario,filasEscenario,posiciones,vehiculosPartida);
                }else{
                    JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[0].getNombre());
                    direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[0].getPosFila(),Jugabilidad.enemigos[0].getPosColumna(),vehiculosPartida);
                }
                break;
            case 2:
                if(Jugabilidad.enemigos[1].getVida() <= 0){
                    JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[1].getNombre()+" NO ATACARA YA QUE ESTÁ MUERTO");
                    //ataqueEnemigo(columnasEscenario,filasEscenario,posiciones,vehiculosPartida);
                }else{
                JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[1].getNombre());
                direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[1].getPosFila(),Jugabilidad.enemigos[1].getPosColumna(),vehiculosPartida);
                }
                break;
            case 3:
                if(Jugabilidad.enemigos[2].getVida() <= 0){
                    JOptionPane.showMessageDialog(null, "EL ENEMIGO "+Jugabilidad.enemigos[2].getNombre()+" NO ATACARA YA QUE ESTÁ MUERTO");
                    //ataqueEnemigo(columnasEscenario,filasEscenario,posiciones,vehiculosPartida);
                }else{
                JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[2].getNombre());
                direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[2].getPosFila(),Jugabilidad.enemigos[2].getPosColumna(),vehiculosPartida);
                }
                break;
        }
    }
    public void direccionAtaqueEnemigo(int columnasEscenario,int filasEscenario,int[][] posiciones, int posFila, int posColumna,Vehiculo[] vehiculosPartida){
        int direccion = noDireccion();
        switch(direccion){
            case 1:
                derechaEnemigo(columnasEscenario,posiciones,posFila,posColumna,vehiculosPartida);
                break;
            case 2:
                izquierdaEnemigo(posiciones,posFila,posColumna,vehiculosPartida);
                break;
            case 3:
                arribaEnemigo(posiciones,posFila,posColumna, vehiculosPartida);
                break;
            case 4: 
                abajoEnemigo(filasEscenario,posiciones,posFila,posColumna,vehiculosPartida);
                break;    
        }
    
    }
    public int noDireccion(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(4)+1;
    }
    public int noEnemigo(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(3)+1;
    }
    public void derechaEnemigo(int columnasEscenario,int[][] posiciones,int posFila,int posColumna,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int i;
        int fila = posFila;
        int columna = posColumna;
        i = columna;
        while(i < columnasEscenario && busqueda == false) {
            if(posiciones[fila][i] == 1){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
              
            }
            i++;
        }  
        realizarAtaque(busqueda, verificarFila,verificarColumna,vehiculosPartida);
    }
    public void izquierdaEnemigo(int[][] posiciones,int posFila,int posColumna,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;        
        int columna = posColumna;
        int i = columna;
        while(i >=0 && busqueda == false) {
            if(posiciones[fila][i] == 1){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
                
            }
            i--;
        }
        realizarAtaque(busqueda, verificarFila,verificarColumna,vehiculosPartida);
    }
    public void arribaEnemigo(int[][] posiciones,int posFila,int posColumna,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;
        int columna = posColumna;      
        int i = fila;
        while(i >= 0 && busqueda == false) {
            if(posiciones[i][columna] == 1){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
              
            }
            i--;
        }  
        realizarAtaque(busqueda, verificarFila,verificarColumna,vehiculosPartida);
    }
    public void abajoEnemigo(int filasEscenario,int[][] posiciones,int posFila,int posColumna,Vehiculo[] vehiculosPartida){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;
        int columna = posColumna;
        int i = fila;
        while(i < filasEscenario && busqueda == false) {
            if(posiciones[i][columna] == 1){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            
            }
            i++;
        }   
        realizarAtaque(busqueda, verificarFila,verificarColumna,vehiculosPartida);
    }
    public void realizarAtaque(Boolean atacar, int fila,int columna, Vehiculo[] vehiculosPartida){
        if(atacar == true){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO TE HA HECHO DAÑO");
            reducirVidaVehiculo(fila,columna,17,vehiculosPartida);
        }
        if(atacar == false){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO FALLÓ");
        }
    }
    
    public void reducirVidaVehiculo(int fila, int columna, int ataque,Vehiculo[] vehiculosPartida){
        if(fila == vehiculosPartida[0].getPosFila() && columna == vehiculosPartida[0].getPosColumna()){
            
                int vida = vehiculosPartida[0].getVida() - ataque;
                ataqueHecho(vida,0,vehiculosPartida);
            /*if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+ vehiculosPartida[0].getNombre() +" HA MUERTO");
                vida = 0;
                vehiculosPartida[0].setVida(vida);
            }
            if( vida > 0){
            JOptionPane.showMessageDialog(null, "EL VEHICULO "+vehiculosPartida[0].getNombre() +" HA RECIBIDO DAÑO");
                vehiculosPartida[0].setVida(vida);
            }*/
            
        }
        if(fila == vehiculosPartida[1].getPosFila() && columna == vehiculosPartida[1].getPosColumna()){
                int vida = vehiculosPartida[1].getVida() - ataque;
                ataqueHecho(vida,1,vehiculosPartida);
            /*if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+ vehiculosPartida[1].getNombre() +" HA MUERTO");
                vida = 0;
                vehiculosPartida[1].setVida(vida);
            }
            if( vida > 0){
            JOptionPane.showMessageDialog(null, "EL VEHICULO "+vehiculosPartida[1].getNombre() +" HA RECIBIDO DAÑO");
                vehiculosPartida[2].setVida(vida);
            }*/
        }
        if(fila == vehiculosPartida[2].getPosFila() && columna == vehiculosPartida[2].getPosColumna()){
                int vida = vehiculosPartida[2].getVida() - ataque;
                ataqueHecho(vida,2,vehiculosPartida);
            /*if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+ vehiculosPartida[2].getNombre() +" HA MUERTO");
                vida = 0;
                vehiculosPartida[2].setVida(vida);
            }
            if( vida > 0){
            JOptionPane.showMessageDialog(null, "EL VEHICULO "+vehiculosPartida[2].getNombre() +" HA RECIBIDO DAÑO");
                vehiculosPartida[2].setVida(vida);
            }*/
        }
    }
    
    public Vehiculo[] ataqueHecho(int actualVida,int indice,Vehiculo[] vehiculosPartida){
        if(actualVida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+ vehiculosPartida[indice].getNombre() +" HA MUERTO");
                actualVida = 0;
                vehiculosPartida[indice].setVida(actualVida);
        }
        if( actualVida > 0){
            JOptionPane.showMessageDialog(null, "EL VEHICULO "+vehiculosPartida[indice].getNombre() +" HA RECIBIDO DAÑO");
                vehiculosPartida[indice].setVida(actualVida);
        }
        
        return vehiculosPartida;
    }
}
