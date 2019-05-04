
package RPG.vehiculos;

public class Vehiculo {

    private String nombre;
    private String tipoVehiculo;
    private String armaIntegrada;
    private String creadorAuto; 

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

    
    public Vehiculo(String nombre, String tipoVehiculo, String armaIntegrada, String creadorAuto) {
        this.nombre = nombre;
        this.tipoVehiculo = tipoVehiculo;
        this.armaIntegrada = armaIntegrada;
        this.creadorAuto = creadorAuto;
    }
    
    
    
}
