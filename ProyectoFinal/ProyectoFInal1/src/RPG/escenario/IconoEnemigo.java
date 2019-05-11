
package RPG.escenario;
    
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IconoEnemigo {
   
    ImageIcon imagen;
    ImageIcon enemigo;
    int ancho, alto;
    public static int codigoEnemigo;
    
    public Icon insertarIcono(int criterioDimension,String terreno){
        switch(criterioDimension){
            case 4:
                alto = 200;
                ancho = 350;
                seleccTerreno(terreno);
                break;
            case 6:
                alto = 150;
                ancho = 350;
                seleccTerreno(terreno);
                break;
            case 8:
                alto = 100;
                ancho = 240;
                seleccTerreno(terreno);
                break;
        }
        return enemigo;
    }
    
    public Icon seleccTerreno(String tipo){
        if(tipo.equals("llanura")){
            enemigoLlanura();      
        }
        if(tipo.equals("lake")){
            enemigoLake();           
        }
        if(tipo.equals("mountain")){
            enemigoMountain();
        }
        return enemigo;
    }
    
    public Icon enemigoLake(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/enemigoLake.jpg"));
        enemigo = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        codigoEnemigo = 2;
        return enemigo;
    }
    
    public Icon enemigoLlanura(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/enemigoLlanura.jpg"));
        enemigo = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        codigoEnemigo = 2;
        return enemigo;
    }
    
    public Icon enemigoMountain(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/enemigoMountain.jpg"));
        enemigo = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        codigoEnemigo = 2;
        return enemigo;
    }
    public int randomFilas(int filas){
        Random posFila = new Random();
        return posFila.nextInt(filas);
    }
    public int randomColumnas(int columnas){
        Random posColumna = new Random();
        return posColumna.nextInt(columnas);
    }
}
