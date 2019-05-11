
package RPG.jugabilidad;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconoFlecha {
  
    ImageIcon imagen;
    ImageIcon flecha;
    int ancho = 60;
    int alto = 40;
    
    public Icon arriba(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/flechaArriba.png"));
        flecha = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return flecha;
    }
    
    public Icon abajo(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/flechaAbajo.png"));
        flecha = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return flecha;
    }
    
    public Icon derecha(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/flechaDerecha.png"));
        flecha = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return flecha;
    }
    public Icon izquierda(){   
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/flechaIzquierda.png"));
        flecha = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return flecha;
    }
}
