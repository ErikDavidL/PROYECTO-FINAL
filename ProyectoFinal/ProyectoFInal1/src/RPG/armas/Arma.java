
package RPG.armas;

import java.io.Serializable;

public class Arma implements Serializable{
    //atributos del objeto arma 
    private String nombre;
    private String tipoArma;
    private String ataque;
    private String punteria;
    private String precio;

    //metodos getters y setters para los atributos de Arma
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getPunteria() {
        return punteria;
    }

    public void setPunteria(String punteria) {
        this.punteria = punteria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    //metodo constructor para la clase Arma
    public Arma(String nombre, String tipoArma, String ataque, String punteria, String precio) {
        this.nombre = nombre;
        this.tipoArma = tipoArma;
        this.ataque = ataque;
        this.punteria = punteria;
        this.precio = precio;
    }
    
    
    
}
