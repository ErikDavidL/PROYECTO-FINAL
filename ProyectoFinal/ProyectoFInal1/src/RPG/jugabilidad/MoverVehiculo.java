
package RPG.jugabilidad;

import RPG.vehiculos.Vehiculo;

public class MoverVehiculo {
    public int moverse(String cantidadCasillas, Vehiculo[] vehiculosPartida,int identificador,String direccion,int filasEscenario,int columnasEscenario){
        int casillas = Integer.parseInt(cantidadCasillas);
        int valorRetorno =0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculosPartida[0].getPosFila(),vehiculosPartida[0].getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculosPartida[1].getPosFila(),vehiculosPartida[1].getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            valorRetorno = seleccionarDireccion(casillas,direccion,vehiculosPartida[2].getPosFila(),vehiculosPartida[2].getPosColumna(),filasEscenario,columnasEscenario);
        }     
        return valorRetorno;
    }
    public int seleccionarDireccion(int cantidadMover,String direccion,int filaInicial,int columnaInicial, int filasEscenario, int columnasEscenario){
        int valor = 0;
        
        if(direccion.equals("arriba")){
            valor = moverArriba(cantidadMover,filaInicial);
        }
        if(direccion.equals("abajo")){
            valor = moverAbajo(cantidadMover,filaInicial,filasEscenario);
        }
        if(direccion.equals("derecha")){
            valor = moverDerecha(cantidadMover,columnaInicial,columnasEscenario);
        }
        if(direccion.equals("izquierda")){
            valor = moverIzquierda(cantidadMover,columnaInicial);
        }
        return valor;
        
    }
    public int columnaVehiculo(int identificador, Vehiculo[] vehiculosPartida){
        int columna = 0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            columna = vehiculosPartida[0].getPosColumna();
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            columna = vehiculosPartida[1].getPosColumna();
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            columna = vehiculosPartida[2].getPosColumna();
        }
        return columna;
    }
    public int filaVehiculo(int identificador, Vehiculo[] vehiculosPartida){
        int fila = 0;
        if(identificador == vehiculosPartida[0].getIdentificador()){
            fila = vehiculosPartida[0].getPosFila();
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            fila = vehiculosPartida[1].getPosFila();
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            fila = vehiculosPartida[2].getPosFila();
        }
        return fila;
    }
    public String tipoVehiculo(int identificador, Vehiculo[] vehiculosPartida){
        String tipoVehiculo = null;
        
        return tipoVehiculo;
    }
    public void nuevaPosicion(int identificador, int fila, int columna, Vehiculo[] vehiculosPartida){
        if(identificador == vehiculosPartida[0].getIdentificador()){
            vehiculosPartida[0].setPosColumna(columna);
            vehiculosPartida[0].setPosFila(fila);
        }
        if(identificador == vehiculosPartida[1].getIdentificador()){
            vehiculosPartida[1].setPosColumna(columna);
            vehiculosPartida[1].setPosFila(fila);
        }
        if(identificador == vehiculosPartida[2].getIdentificador()){
            vehiculosPartida[2].setPosColumna(columna);
            vehiculosPartida[2].setPosFila(fila);
        }
    }
    public int moverArriba(int cantidadMover,int filaInicial){
        filaInicial++;
        int nuevaFila;
        
        if(cantidadMover < filaInicial){
            nuevaFila = filaInicial-cantidadMover;
                nuevaFila--;
        }else{
            nuevaFila = 0;
        }
        return nuevaFila;
    }
    public int moverAbajo(int cantidadMover,int filaInicial,int filasEscenario){
        filaInicial++;
        int nuevaFila;
        int diferencia = filasEscenario - filaInicial;
        if(cantidadMover < diferencia){
            nuevaFila = filaInicial + cantidadMover;
            nuevaFila--;
        }else{
            nuevaFila = filasEscenario-1;
        }
        return nuevaFila;
    }
    public int moverDerecha(int cantidadMover,int columnaInicial,int columnasEscenario){
        columnaInicial++;
        int nuevaColumna;
        int diferencia = columnasEscenario - columnaInicial;
        if(cantidadMover < diferencia){
            nuevaColumna = columnaInicial + cantidadMover;
            nuevaColumna--;
        }else{
            nuevaColumna = columnasEscenario-1;
        }
        return nuevaColumna;
    }
    public int moverIzquierda(int cantidadMover,int columnaInicial){
        columnaInicial++;
        int nuevaColumna;
        
        if(cantidadMover < columnaInicial){
            nuevaColumna = columnaInicial-cantidadMover;
                nuevaColumna--;
        }else{
            nuevaColumna = 0;
        }
        return nuevaColumna;
    }
}
