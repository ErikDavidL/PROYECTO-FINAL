
package RPG.archivos;

import RPG.jugador.Jugador;
import RPG.vehiculos.Vehiculo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoJugabilidad {
    
    FileOutputStream archivoVehiculos = null;
    ObjectOutputStream objetoArchivo;
    FileInputStream archivoSalida;
    
    public void guardarJugador(Jugador jugador){
        try{
            archivoVehiculos = new FileOutputStream("JugadorPartida.dat");
            objetoArchivo =  new ObjectOutputStream(archivoVehiculos);
            objetoArchivo.writeObject(jugador);
        }
        catch(IOException ex){
        }
    }
    
    public Jugador leerJugador(){
        
        Jugador jugador= null;
        
        try{
            archivoSalida = new FileInputStream("JugadorPartida.dat");
            ObjectInputStream salidaArchivo = new ObjectInputStream(archivoSalida);
            jugador = (Jugador) salidaArchivo.readObject();
        }
        catch(ClassNotFoundException ex){
        }
        catch(IOException ex){     
        }
        return jugador;
    }
    
    public void guardarVehiculos(Vehiculo[] vehiculos){
        try{
            archivoVehiculos = new FileOutputStream("VehiculosPartida.dat");
            objetoArchivo =  new ObjectOutputStream(archivoVehiculos);
            objetoArchivo.writeObject(vehiculos);
        }
        catch(IOException ex){
        }
    }
    
    public Vehiculo[] leerVehiculo(){
        
        Vehiculo[] vehiculo= null;
        
        try{
            archivoSalida = new FileInputStream("VehiculosPartida.dat");
            ObjectInputStream salidaArchivo = new ObjectInputStream(archivoSalida);
            vehiculo =  (Vehiculo[]) salidaArchivo.readObject();
        }
        catch(ClassNotFoundException ex){
        }
        catch(IOException ex){     
        }
        return vehiculo;
    }
}
