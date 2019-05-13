
package RPG.jugabilidad;

import RPG.archivos.ArchivoJugabilidad;
import RPG.archivos.ArchivoJugador;
import RPG.archivos.ArchivoVehiculo;
import RPG.interfaz.ListadoJugador;
import RPG.jugador.Jugador;
import RPG.vehiculos.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Verificador {

    private ArchivoJugador archivoJugador = new ArchivoJugador();
    private ArchivoVehiculo archivoVehiculo = new ArchivoVehiculo();
    private ArchivoJugabilidad archivoPartida = new ArchivoJugabilidad();
    private ArrayList<Jugador> listadoJugador =  new ArrayList<>();
    private ArrayList<Vehiculo> listadoVehiculos =  new ArrayList<>();
    private Jugador jugadorPartida = null;
    private Vehiculo[] vehiculosPartida;
    private Boolean ganoJuego = false;
    private Boolean perdiojuego = false;
    Boolean busqueda = false;
    
    public ArrayList leerVehiculos(){
        listadoVehiculos = archivoVehiculo.leerArchivo();
        return listadoVehiculos;
    }
    public ArrayList leerJugadores(){
        listadoJugador = archivoJugador.leerArchivo();
        return listadoVehiculos;
    }
    public Jugador leerJugador(){
        jugadorPartida = archivoPartida.leerJugador();
        return jugadorPartida;
    }
    public Vehiculo[] leerVehiculosPartida(){
        vehiculosPartida = archivoPartida.leerVehiculo();
        return vehiculosPartida;
    }
    
    public Boolean vidaEnemigos(){
        if(Jugabilidad.enemigos[0].getVida() <= 0 && Jugabilidad.enemigos[1].getVida() <= 0 && Jugabilidad.enemigos[2].getVida() <= 0){
            ganoJuego = true;
        }else{
            ganoJuego = false;
        } 
        return ganoJuego;
    }
    public Boolean vidaVehiculosPartida(Vehiculo[] vehiculosPartida){
        if(vehiculosPartida[0].getVida() <= 0 && vehiculosPartida[1].getVida() <= 0 && vehiculosPartida[2].getVida() <= 0){
            perdiojuego = true;
        }else{
            perdiojuego = false;
        } 
        return perdiojuego;
    }
    
    public void victoriaPartida(){ 
        leerJugadores();
        leerVehiculosPartida();
        leerJugador();
        leerVehiculosPartida();
        //actualizarVehiculo(0);
        //actualizarVehiculo(1);
        //actualizarVehiculo(2);
        actualizarJugador();
        //archivoVehiculo.guardarArchivo(listadoVehiculos);
        JOptionPane.showMessageDialog(null, "El JUGADOR "+ListadoJugador.nombre+"\n HA GANADO EXPERIENCIA +1000 \n DINERO +400");
        
    }
    public ArrayList actualizarVehiculo(int codigo){
        int identificador = vehiculosPartida[codigo].getEliminaciones();
        
        int i=0;
        int identificadorEncontrado =0;
        int eliminaciones;
        
        while(i <  listadoVehiculos.size() && busqueda == false){
            if(listadoVehiculos.get(i).getIdentificador() == identificador){
                busqueda = true;
                identificadorEncontrado = i;
            }
            i++;
        }
        if(busqueda == true){
            eliminaciones = listadoVehiculos.get(identificadorEncontrado).getEliminaciones() + vehiculosPartida[identificadorEncontrado].getEliminaciones();
            listadoVehiculos.get(identificadorEncontrado).setEliminaciones(eliminaciones);
        }
        
        return listadoVehiculos;
    }    
    public void actualizarJugador(){
        int identificador = jugadorPartida.getIdentificador();
        int i=0;
        int identificadorEncontrado =0;
        int dinero;
        int nivel;
        int experiencia;
        while(i <  listadoJugador.size() && busqueda == false){
            if(listadoJugador.get(i).getIdentificador() == identificador){
                busqueda = true;
                identificadorEncontrado = i;
            }
            i++;
        }
        //AREGLAR ESTA PARTE darse cuenta en la sentencia  y ver lo del ataque 
        if(busqueda == true){
            dinero = listadoJugador.get(identificadorEncontrado).getDinero()+400;
            listadoJugador.get(identificadorEncontrado).setDinero(dinero);
            experiencia = listadoJugador.get(identificadorEncontrado).getExperiencia()+1000;
            listadoJugador.get(identificadorEncontrado).setExperiencia(experiencia);
            
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 0){
                listadoJugador.get(identificadorEncontrado).setNivel(1);
            }
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 1500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 500){
                listadoJugador.get(identificadorEncontrado).setNivel(2);
            }
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 2500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 1500){
                listadoJugador.get(identificadorEncontrado).setNivel(3);
            }
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 3500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 2500){
                listadoJugador.get(identificadorEncontrado).setNivel(4);
            }
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 4500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 3500){
                listadoJugador.get(identificadorEncontrado).setNivel(5);
            }
            if(listadoJugador.get(identificadorEncontrado).getExperiencia() <= 5500 && listadoJugador.get(identificadorEncontrado).getExperiencia() > 4500){
                listadoJugador.get(identificadorEncontrado).setNivel(6);
            }  
        }
        
    archivoJugador.guardarArchivo(listadoJugador);
            
    }
    
    
}
