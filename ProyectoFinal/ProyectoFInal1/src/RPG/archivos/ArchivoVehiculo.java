
package RPG.archivos;

import RPG.vehiculos.Vehiculo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoVehiculo {
 
    FileOutputStream archivoVehiculos = null;
    ObjectOutputStream objetoArchivo;
    FileInputStream archivoSalida;
    
    public void guardarArchivo(ArrayList jugadores){
        try{
            archivoVehiculos = new FileOutputStream("Vehiculos.dat");
            objetoArchivo =  new ObjectOutputStream(archivoVehiculos);
            objetoArchivo.writeObject(jugadores);
        }
        catch(IOException ex){
        }
    }
    
    public ArrayList leerArchivo(){
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        try{
            archivoSalida = new FileInputStream("Vehiculos.dat");
            ObjectInputStream salidaArchivo = new ObjectInputStream(archivoSalida);
            vehiculos = (ArrayList<Vehiculo>) salidaArchivo.readObject();
        }
        catch(ClassNotFoundException ex){
        }
        catch(IOException ex){     
        }
        return vehiculos;
    }
}
