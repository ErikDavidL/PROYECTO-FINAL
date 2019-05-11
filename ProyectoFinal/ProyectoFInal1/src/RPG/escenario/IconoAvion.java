
package RPG.escenario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IconoAvion {
    
    ImageIcon imagen;
    ImageIcon avion;
    int ancho, alto;
    public static int reductorContador;
    public static Boolean yaIngresado;
    
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
        return avion;
    }
    
    public Icon seleccTerreno(String tipo){
        if(tipo.equals("llanura")){
            avionLlanura();
            reductorContador = 1;
            yaIngresado = true;
        }
        if(tipo.equals("lake")){
            avionLake();
            reductorContador = 1;
            yaIngresado = true;
        }
        if(tipo.equals("mountain")){
            JOptionPane.showMessageDialog(null, "LOS AVIONES NO PUEDEN ESTAR EN LAS MONTAÑAS");
            mountain();
            reductorContador = 0;
            yaIngresado = false;
        }
        return avion;
    }
    
    public Icon avionLake(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/avionLake.jpg"));
        avion = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return avion;
    }
    
    public Icon avionLlanura(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/avionLlanura.jpg"));
        avion = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return avion;
    }
    
    public Icon mountain(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/mountain.jpg"));
        avion = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return avion;
    }
}
