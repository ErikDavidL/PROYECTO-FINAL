
package RPG.escenario;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IconoTanque {
    
    ImageIcon imagen;
    ImageIcon tanque;
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
        return tanque;
    }
    
    public Icon seleccTerreno(String tipo){
        if(tipo.equals("llanura")){
            tanqueLlanura();
            reductorContador =1;
            yaIngresado = true;
        }
        if(tipo.equals("lake")){
            JOptionPane.showMessageDialog(null, "LOS TANQUES NO PUEDEN ESTAR EN LOS LAGOS");
            lake();
            reductorContador =0;
            yaIngresado = false;
        }
        if(tipo.equals("mountain")){
            tanqueMountain();
            reductorContador =1;
            yaIngresado = true;
        }
        return tanque;
    }
    
    public Icon lake(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/lake.jpg"));
        tanque = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return tanque;
    }
    
    public Icon tanqueLlanura(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/tanqueLlanura.jpg"));
        tanque = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return tanque;
    }
    
    public Icon tanqueMountain(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesVehiculos/tanqueMountain.jpg"));
        tanque = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return tanque;
    }
    
}
