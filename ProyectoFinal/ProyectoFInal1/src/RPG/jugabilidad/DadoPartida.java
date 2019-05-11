
package RPG.jugabilidad;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DadoPartida {
    ImageIcon imagen;
    ImageIcon imagenDado;
    ImageIcon imagenMovimiento;
    ImageIcon imagenAtaque;
    ImageIcon imagenComodin;
    public Icon seleccionAtaque(Boolean criterioSeleccion){
        if(criterioSeleccion == false){
            desusoAtaque();
        }else{
            dadoAtaque();
        }
        return imagenAtaque;
    }
    public Icon seleccionMovimiento(Boolean criterioSeleccion){
        if(criterioSeleccion == false){
            desusoMovimiento();
        }else{
            dadoMovimiento();
        }
        return imagenMovimiento;
    }
    public Icon seleccionComodin(Boolean criterioSeleccion){
        if(criterioSeleccion == false){
            desusoComodin();
        }else{
            interrogacionComodin();
        }
        return imagenComodin;
    }
    public Icon desusoAtaque(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/ataqueDesuso.jpg"));
        imagenAtaque = new ImageIcon(imagen.getImage().getScaledInstance(200, 130, Image.SCALE_DEFAULT));
        return imagenAtaque;
    }
    public Icon dadoAtaque(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/dadosBlancos.gif"));
        imagenAtaque = new ImageIcon(imagen.getImage().getScaledInstance(200, 130, Image.SCALE_DEFAULT));
        return imagenAtaque;
    }
    public Icon desusoMovimiento(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/movimientoDesuso.jpg"));
        imagenMovimiento = new ImageIcon(imagen.getImage().getScaledInstance(200, 130, Image.SCALE_DEFAULT));
        return imagenMovimiento;
    }
    public Icon dadoMovimiento(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/dadoAmarillo.gif"));
        imagenMovimiento = new ImageIcon(imagen.getImage().getScaledInstance(200, 130, Image.SCALE_DEFAULT));
        return imagenMovimiento;
    }
    public Icon desusoComodin(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/interrogacionDesuso.png"));
        imagenComodin = new ImageIcon(imagen.getImage().getScaledInstance(200, 130, Image.SCALE_DEFAULT));
        return imagenComodin;
    }
    public Icon interrogacionComodin(){
        imagen = new ImageIcon(getClass().getResource("/imagenesJugabilidad/signoInterrogacion.gif"));
        imagenComodin = new ImageIcon(imagen.getImage().getScaledInstance(150, 80, Image.SCALE_DEFAULT));
        return imagenComodin;
    }
}
