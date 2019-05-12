
package RPG.jugador;

import java.io.Serializable;

public class Jugador implements Serializable{
    
   private String nombre;
   private int nivel;
   private int experiencia;
   private int identificador;
   private int dinero;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public Jugador(String nombre,int nivel,int experiencia, int identificador,int dinero) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.identificador = identificador;
        this.dinero = dinero;
    }
   
    
    
    
}
