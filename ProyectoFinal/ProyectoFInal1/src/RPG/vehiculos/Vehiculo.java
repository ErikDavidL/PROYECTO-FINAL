
package RPG.vehiculos;

import java.io.Serializable;

public class Vehiculo implements Serializable{

    private String nombre;
    private String tipoVehiculo;
    private String armaIntegrada;
    private String creadorAuto;
    private int identificador;
    private int vida;
    private int ataque;
    private int defensa;
    private int posFila;
    private int posColumna;
    private int eliminaciones;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    public String getArmaIntegrada() {
        return armaIntegrada;
    }
    public void setArmaIntegrada(String armaIntegrada) {
        this.armaIntegrada = armaIntegrada;
    }
    public String getCreadorAuto() {
        return creadorAuto;
    }
    public void setCreadorAuto(String creadorAuto) {
        this.creadorAuto = creadorAuto;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getPosFila() {
        return posFila;
    }
    public void setPosFila(int posFila) {
        this.posFila = posFila;
    }
    public int getPosColumna() {
        return posColumna;
    }
    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    public int getEliminaciones() {
        return eliminaciones;
    }

    public void setEliminaciones(int eliminaciones) {
        this.eliminaciones = eliminaciones;
    }
    
    public Vehiculo(String nombre, String tipoVehiculo, String armaIntegrada, String creadorAuto, int identificador,int vida,int ataque, int defensa,int posFila,int posColumna,int eliminaciones) {
        this.nombre = nombre;
        this.tipoVehiculo = tipoVehiculo;
        this.armaIntegrada = armaIntegrada;
        this.creadorAuto = creadorAuto;
        this.identificador = identificador;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posFila = posFila;
        this.posColumna = posColumna;
        this.eliminaciones = eliminaciones;
    }
    
    
    
}
