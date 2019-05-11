
package RPG.jugabilidad;

public class Movimiento {
   
    public int moverse(String cantidadCasillas,String nombre,String direccion,int filasEscenario,int columnasEscenario){
        int casillas = Integer.parseInt(cantidadCasillas);
        int valorRetorno =0;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,Jugabilidad.vehiculoUno.getPosFila(),Jugabilidad.vehiculoUno.getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,Jugabilidad.vehiculoDos.getPosFila(),Jugabilidad.vehiculoDos.getPosColumna(),filasEscenario,columnasEscenario);
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            valorRetorno = seleccionarDireccion(casillas,direccion,Jugabilidad.vehiculoTres.getPosFila(),Jugabilidad.vehiculoTres.getPosColumna(),filasEscenario,columnasEscenario);
        }     
        return valorRetorno;
    }
    public int columnaVehiculo(String nombre){
        int columna = 0;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            columna = Jugabilidad.vehiculoUno.getPosColumna();
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            columna = Jugabilidad.vehiculoUno.getPosColumna();
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            columna = Jugabilidad.vehiculoUno.getPosColumna();
        }
        return columna;
    }
    public int filaVehiculo(String nombre){
        int fila = 0;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            fila = Jugabilidad.vehiculoUno.getPosFila();
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            fila = Jugabilidad.vehiculoUno.getPosFila();
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            fila = Jugabilidad.vehiculoUno.getPosFila();
        }
        return fila;
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
    public void nuevaPosicion(String nombre, int fila, int columna){
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            Jugabilidad.vehiculoUno.setPosColumna(columna);
            Jugabilidad.vehiculoUno.setPosFila(fila);
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            Jugabilidad.vehiculoDos.setPosColumna(columna);
            Jugabilidad.vehiculoDos.setPosFila(fila);
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            Jugabilidad.vehiculoTres.setPosColumna(columna);
            Jugabilidad.vehiculoTres.setPosFila(fila);
        }
    }
}
