
package RPG.vehiculos;

public class Vehiculo {

    private String nombre;
    private String tipoVehiculo;
    private String armaIntegrada;
    private String creadorAuto;
    private String identificador;
    private int vida;
    private String ataque;
    private String defensa;
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
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getAtaque() {
        return ataque;
    }
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    public String getDefensa() {
        return defensa;
    }
    public void setDefensa(String defensa) {
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
    
    public Vehiculo(String nombre, String tipoVehiculo, String armaIntegrada, String creadorAuto, String identificador,int vida,String ataque, String defensa,int posFila,int posColumna,int eliminaciones) {
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
