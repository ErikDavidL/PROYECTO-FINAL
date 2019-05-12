
package RPG.archivos;

import RPG.armas.Arma;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoArma {
 
    FileOutputStream archivoVehiculos = null;
    ObjectOutputStream objetoArchivo;
    FileInputStream archivoSalida;
    
    public void guardarArchivo(ArrayList jugadores){
        try{
            archivoVehiculos = new FileOutputStream("Armas.dat");
            objetoArchivo =  new ObjectOutputStream(archivoVehiculos);
            objetoArchivo.writeObject(jugadores);
        }
        catch(IOException ex){
        }
    }
    
    public ArrayList leerArchivo(){
        
        ArrayList<Arma> armas = new ArrayList<>();
        
        try{
            archivoSalida = new FileInputStream("Armas.dat");
            ObjectInputStream salidaArchivo = new ObjectInputStream(archivoSalida);
            armas = (ArrayList<Arma>) salidaArchivo.readObject();
        }
        catch(ClassNotFoundException ex){
        }
        catch(IOException ex){     
        }
        return armas;
    }
}
