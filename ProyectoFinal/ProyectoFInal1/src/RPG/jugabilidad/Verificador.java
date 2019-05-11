
package RPG.jugabilidad;

import RPG.interfaz.IngresarJugador;
import RPG.interfaz.ListadoJugador;
import RPG.jugador.Jugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Verificador {

    private Boolean ganoJuego = false;
    private Boolean perdiojuego = false;
    public static ArrayList<Jugador> listaJugador = new ArrayList<Jugador>();
    Boolean busqueda = false;
    
    public Boolean vidaEnemigos(){
        if(Jugabilidad.enemigos[0].getVida() <= 0 && Jugabilidad.enemigos[1].getVida() <= 0 && Jugabilidad.enemigos[2].getVida() <= 0){
            ganoJuego = true;
        }else{
            ganoJuego = false;
        } 
        return ganoJuego;
    }
    public Boolean vidaVehiculos(){
        if(Jugabilidad.vehiculoUno.getVida() <= 0 && Jugabilidad.vehiculoDos.getVida() <= 0 && Jugabilidad.vehiculoTres.getVida() <= 0){
            perdiojuego = true;
        }else{
            perdiojuego = false;
        } 
        return perdiojuego;
    }
    public void victoriaPartida(){
        listaJugador = (ArrayList<Jugador>) IngresarJugador.listaJugador.clone();
        busquedaJugador(ListadoJugador.identificador);  
        JOptionPane.showMessageDialog(null, "El JUGADOR "+ListadoJugador.nombre+"\n HA GANADO EXPERIENCIA +1000 \n DINERO +100");
        
    }
    public void busquedaJugador(String identificador){
        int i=0;
        int nombreEncontrado = 0;
        int modificar;
        int experiencia;
        int nivel;
        while(i < listaJugador.size() && busqueda == false){
            if(listaJugador.get(i).getIdentificador() == identificador){
                busqueda = true;
                nombreEncontrado = i;
            }
            i++;
        }
        if(busqueda == false){
            
        }
        else{
            modificar = listaJugador.get(nombreEncontrado).getDinero()+100;
            experiencia = listaJugador.get(nombreEncontrado).getExperiencia()+1000;
            listaJugador.get(nombreEncontrado).setExperiencia(experiencia);
            listaJugador.get(nombreEncontrado).setDinero(modificar);
            if(experiencia <=2000){
                nivel = 1;
            }else{
                nivel = listaJugador.get(nombreEncontrado).getNivel()+1;
            }
            listaJugador.get(nombreEncontrado).setNivel(nivel);
            
        }
    }
    
}
