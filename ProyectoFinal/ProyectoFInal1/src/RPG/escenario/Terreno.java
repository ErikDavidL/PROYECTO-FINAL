
package RPG.escenario;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Terreno {

    //variables para implementar el icono del terreno
    ImageIcon imagen;
    ImageIcon imagenTerreno;
    int aleatorio;
    int alto;
    int ancho;
    String nombreTerreno;
    public static String nombreTemporal;
    public static String codigoTerreno; 
    
    public String getNombreTemporal() {
        return nombreTemporal;
    }
    
    public static int noTerreno(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(3)+1;
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
    //metod para ingresar la dimension y el icono del terreno
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
    //metodo para reinsertar un terreno
    public Icon reinsertarIcono(int valorDimension,String criterio){
        switch(valorDimension){
            case 4:
                alto = 200;
                ancho = 350;
                insertarEscenario(criterio);
                break;
            case 6:
                alto = 150;
                ancho = 350;
                insertarEscenario(criterio);
                break;
            case 8:
                alto = 100;
                ancho = 240;
                insertarEscenario(criterio);
                break;
        }
        return imagenTerreno;
    }
    //metodo para insertar el tipo de terreno
    public Icon insertarEscenario(String criterio){  
        if(criterio.equals("llanura")){
            llanura();
        }
        if(criterio.equals("mountain")){
            montana();
        }
        if(criterio.equals("lake")){
            agua();
        }
        return imagenTerreno;
    }
    //metodos para insertar la imagen en base al tipo de terreno
    public Icon llanura(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/llanura.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "llanura";
        codigoTerreno = "llanura";
        return imagenTerreno;
    }
    public Icon montana(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/mountain.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "mountain";
        codigoTerreno = "mountain";
        return imagenTerreno;
    }
    public Icon agua(){
        imagen = new ImageIcon(getClass().getResource("/imagenesTerreno/lake.jpg"));
        imagenTerreno = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        nombreTemporal = "lake";
        codigoTerreno = "lake";
        return imagenTerreno;
    }
    
}
