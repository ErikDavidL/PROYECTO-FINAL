
package RPG.jugador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ArchivoJugador {

    public void escribirJugador(Jugador jugador){
        try {
            File f = new File("jugador.txt");
            if(f.exists()){
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
