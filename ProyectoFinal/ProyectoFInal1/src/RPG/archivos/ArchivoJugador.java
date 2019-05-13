
package RPG.archivos;

import RPG.jugador.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoJugador {
    
    FileOutputStream archivoJugadores = null;
    ObjectOutputStream objetoArchivo;
    FileInputStream archivoSalida;
    
    public void guardarArchivo(ArrayList jugadores){
        try{
            archivoJugadores = new FileOutputStream("Jugadores.dat");
            objetoArchivo =  new ObjectOutputStream(archivoJugadores);
            objetoArchivo.writeObject(jugadores);
        }
        catch(IOException ex){
        }
    }
    
    public ArrayList leerArchivo(){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        try{
            archivoSalida = new FileInputStream("Jugadores.dat");
            ObjectInputStream salidaArchivo = new ObjectInputStream(archivoSalida);
            jugadores = (ArrayList<Jugador>) salidaArchivo.readObject();
        }
        catch(ClassNotFoundException ex){
        }
        catch(IOException ex){
        }
        return jugadores;
    }
}
