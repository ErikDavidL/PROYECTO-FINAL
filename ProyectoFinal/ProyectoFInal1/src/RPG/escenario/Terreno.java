
package RPG.escenario;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Terreno {

    ImageIcon imagen;
    ImageIcon imagenTerreno;
    int aleatorio;
    int alto;
    int ancho;
    String nombreTerreno;
    public static String nombreTemporal;

    public String getNombreTemporal() {
        return nombreTemporal;
    }
    
     public static int noTerreno(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(3)+1;
    }
    
    public int numeroAleatorio(){
        
        return aleatorio;
    }
     
    public Icon definirTerreno(){
        aleatorio = noTerreno();
        switch(aleatorio){
            case 1:
                llanura();
                break;
            case 2:
                montana();
                break;
            case 3:
                agua();
                break;    
        }
        return imagenTerreno;
    }
    public Icon insertarIcono(int valorDimension){
        switch(valorDimension){
            case 4:
                alto = 200;
                ancho = 350;
                definirTerreno();
                break;
            case 6:
                alto = 150;
                ancho = 350;
                definirTerreno();
                break;
            case 8:
                alto = 100;
                ancho = 240;
                definirTerreno();
                break;
        }
        return imagenTerreno;
    }
    
    public Icon insertarVehiculo(){
        
        
        return imagenTerreno;
    }
    public Icon llanura(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/llanura.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "llanura";
        return imagenTerreno;
    }
    public Icon montana(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/mountain.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "mountain";
        return imagenTerreno;
    }
    public Icon agua(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/lake.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "lake";
        return imagenTerreno;
    }
    
}
