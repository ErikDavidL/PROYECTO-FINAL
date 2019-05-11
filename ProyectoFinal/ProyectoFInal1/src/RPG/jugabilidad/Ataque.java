
package RPG.jugabilidad;

import java.util.Random;
import javax.swing.JOptionPane;


public class Ataque {
 
    public static Boolean contarMuerte = false;
    public void atacar(String porcentajeAtaque,String direccion, int[][] posicionesEnemigos,int columnasEscenario,int filasEscenario, String nombreVehiculo,String ataqueVehiculo){
        int valorAtaque = Integer.parseInt(ataqueVehiculo);
        if(direccion.equals("arriba")){
          atacarArriba(porcentajeAtaque,posicionesEnemigos,nombreVehiculo,valorAtaque);
      }
      if(direccion.equals("abajo")){
          atacarAbajo(porcentajeAtaque,filasEscenario,posicionesEnemigos,nombreVehiculo,valorAtaque);
      }
      if(direccion.equals("derecha")){
          atacarDerecha(porcentajeAtaque,columnasEscenario,posicionesEnemigos,nombreVehiculo,valorAtaque);
      }
      if(direccion.equals("izquierda")){
          atacarIzquierda(porcentajeAtaque,posicionesEnemigos,nombreVehiculo,valorAtaque);
      }
    }
    public void atacarDerecha(String porcentajeAtaque,int columnasEscenario,int[][] posiciones,String nombreVehiculo,int ataqueVehiculo){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int i;
        int fila = posicionFila(nombreVehiculo);
        int columna = posicionColumna(nombreVehiculo);
        i = columna;
        while(i < columnasEscenario && busqueda == false) {
            if(posiciones[fila][i] == 2){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i++;
        }  
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "ATAQUE EXITOSO, DAÑO HECHO");
            reducirVida(verificarFila,verificarColumna,10);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ATAQUE HA FALLADO");
        }
    }
    public void atacarIzquierda(String porcentajeAtaque,int[][] posiciones,String nombreVehiculo,int ataqueVehiculo){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(nombreVehiculo);        
        int columna = posicionColumna(nombreVehiculo);
        int i = columna;
        while(i >=0 && busqueda == false) {
            if(posiciones[fila][i] == 2){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i--;
        }
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "ATAQUE EXITOSO, DAÑO HECHO");
            reducirVida(verificarFila,verificarColumna,10);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ATAQUE HA FALLADO");
        }
    }
    public void atacarArriba(String porcentajeAtaque,int[][] posiciones,String nombreVehiculo,int ataqueVehiculo){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(nombreVehiculo);
        int columna = posicionColumna(nombreVehiculo);      
        int i = fila;
        while(i >= 0 && busqueda == false) {
            if(posiciones[i][columna] == 2){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i--;
        }  
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "ATAQUE EXITOSO, DAÑO HECHO");
            reducirVida(verificarFila,verificarColumna,10);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ATAQUE HA FALLADO");
        }
    }
    public void atacarAbajo(String porcentajeAtaque,int filasEscenario,int[][] posiciones,String nombreVehiculo,int ataqueVehiculo){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posicionFila(nombreVehiculo);
        int columna = posicionColumna(nombreVehiculo);
        int eliminaciones = eliminaciones(nombreVehiculo);
        int i = fila;
        while(i < filasEscenario && busqueda == false) {
            if(posiciones[i][columna] == 2){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i++;
        }   
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "ATAQUE EXITOSO, DAÑO HECHO");
            reducirVida(verificarFila,verificarColumna,10);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ATAQUE HA FALLADO");
        }
    }
    public int posicionFila(String nombre){
        int fila = 0;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            fila = Jugabilidad.vehiculoUno.getPosFila();
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            fila = Jugabilidad.vehiculoDos.getPosFila();
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            fila = Jugabilidad.vehiculoTres.getPosFila();
        }
        return fila;
    }
    public int posicionColumna(String nombre){
        int columna = 1;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            columna = Jugabilidad.vehiculoUno.getPosColumna();
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            columna = Jugabilidad.vehiculoDos.getPosColumna();
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            columna = Jugabilidad.vehiculoTres.getPosColumna();
        }
        return columna;
    }
    public int eliminaciones(String nombre){
        int eliminaciones = 0;
        if(nombre.equals(Jugabilidad.vehiculoUno.getNombre())){
            eliminaciones = Jugabilidad.vehiculoUno.getEliminaciones();
            eliminaciones++;
            Jugabilidad.vehiculoUno.setEliminaciones(eliminaciones);
        }
        if(nombre.equals(Jugabilidad.vehiculoDos.getNombre())){
            eliminaciones = Jugabilidad.vehiculoDos.getEliminaciones();
            eliminaciones++;
            Jugabilidad.vehiculoDos.setEliminaciones(eliminaciones);
        }
        if(nombre.equals(Jugabilidad.vehiculoTres.getNombre())){
            eliminaciones = Jugabilidad.vehiculoTres.getEliminaciones();
            eliminaciones++;
            Jugabilidad.vehiculoTres.setEliminaciones(eliminaciones);
        }
        return eliminaciones;
    }
    public void reducirVida(int fila, int columna, int ataque){
        if(fila == Jugabilidad.enemigos[0].getPosFila() && columna == Jugabilidad.enemigos[0].getPosColumna()){
            int vida = Jugabilidad.enemigos[0].getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "ENEMIGO MUERTO");
                
                vida = 0;
            }
            Jugabilidad.enemigos[0].setVida(vida);
            
        }
        if(fila == Jugabilidad.enemigos[1].getPosFila() && columna == Jugabilidad.enemigos[1].getPosColumna()){
            int vida = Jugabilidad.enemigos[1].getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "ENEMIGO MUERTO");
                vida = 0;
            }
            Jugabilidad.enemigos[1].setVida(vida);
        }
        if(fila == Jugabilidad.enemigos[2].getPosFila() && columna == Jugabilidad.enemigos[2].getPosColumna()){
            int vida = Jugabilidad.enemigos[2].getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "ENEMIGO MUERTO");
                vida = 0;
            }
            Jugabilidad.enemigos[2].setVida(vida);
        }
    }
    public void ataqueEnemigo(int columnasEscenario,int filasEscenario,int[][] posiciones){
        int enemigo = noEnemigo();
        switch(enemigo){
            case 1:
                if(Jugabilidad.enemigos[0].getVida() <= 0){
                    ataqueEnemigo(columnasEscenario,filasEscenario,posiciones);
                }else{
                    JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[0].getNombre());
                    direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[0].getPosFila(),Jugabilidad.enemigos[0].getPosColumna());
                }
                break;
            case 2:
                if(Jugabilidad.enemigos[1].getVida() <= 0){
                    ataqueEnemigo(columnasEscenario,filasEscenario,posiciones);
                }else{
                JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[1].getNombre());
                direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[1].getPosFila(),Jugabilidad.enemigos[1].getPosColumna());
                }
                break;
            case 3:
                if(Jugabilidad.enemigos[2].getVida() <= 0){
                    ataqueEnemigo(columnasEscenario,filasEscenario,posiciones);
                }else{
                JOptionPane.showMessageDialog(null, "ATACARÁ EL ENEMIGO "+Jugabilidad.enemigos[2].getNombre());
                direccionAtaqueEnemigo(columnasEscenario,filasEscenario,posiciones,Jugabilidad.enemigos[2].getPosFila(),Jugabilidad.enemigos[2].getPosColumna());
                }
                break;
        }
    }
    public void direccionAtaqueEnemigo(int columnasEscenario,int filasEscenario,int[][] posiciones, int posFila, int posColumna){
        int direccion = noDireccion();
        switch(direccion){
            case 1:
                derechaEnemigo(columnasEscenario,posiciones,18,posFila,posColumna);
                break;
            case 2:
                izquierdaEnemigo(posiciones,18,posFila,posColumna);
                break;
            case 3:
                arribaEnemigo(posiciones,18,posFila,posColumna);
                break;
            case 4: 
                abajoEnemigo(filasEscenario,posiciones,18,posFila,posColumna);
                break;    
        }
    
    }
    public int noDireccion(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(3)+1;
    }
    public int noEnemigo(){
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(2)+1;
    }
    public void derechaEnemigo(int columnasEscenario,int[][] posiciones,int ataqueEnemigo,int posFila,int posColumna){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int i;
        int fila = posFila;
        int columna = posColumna;
        i = columna;
        while(i < columnasEscenario && busqueda == false) {
            if(posiciones[fila][i] == 1){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i++;
        }  
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO TE HA HECHO DAÑO");
            reducirVidaVehiculo(verificarFila,verificarColumna,16);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO FALLÓ");
        }
    }
    public void izquierdaEnemigo(int[][] posiciones,int ataqueEnemigo,int posFila,int posColumna){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;        
        int columna = posColumna;
        int i = columna;
        while(i >=0 && busqueda == false) {
            if(posiciones[fila][i] == 1){
                busqueda = true;
                verificarFila = fila;
                verificarColumna = i;
            }
            i--;
        }
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO TE HA HECHO DAÑO");
            reducirVidaVehiculo(verificarFila,verificarColumna,16);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO FALLÓ");
        }
    }
    public void arribaEnemigo(int[][] posiciones,int ataqueEnemigo,int posFila,int posColumna){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;
        int columna = posColumna;      
        int i = fila;
        while(i >= 0 && busqueda == false) {
            if(posiciones[i][columna] == 1){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i--;
        }  
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO TE HA HECHO DAÑO");
            reducirVidaVehiculo(verificarFila,verificarColumna,16);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO FALLÓ");
        }
    }
    public void abajoEnemigo(int filasEscenario,int[][] posiciones,int ataqueEnemigo,int posFila,int posColumna){
        Boolean busqueda = false;
        int verificarFila = 0;
        int verificarColumna = 0;
        int fila = posFila;
        int columna = posColumna;
        int i = fila;
        while(i < filasEscenario && busqueda == false) {
            if(posiciones[i][columna] == 1){
                busqueda = true;
                verificarFila = i;
                verificarColumna = columna;
            }
            i++;
        }   
        if(busqueda == true){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO TE HA HECHO DAÑO");
            reducirVidaVehiculo(verificarFila,verificarColumna,16);
        }
        if(busqueda == false){
            JOptionPane.showMessageDialog(null, "EL ENEMIGO FALLÓ");
        }
    }
    public void reducirVidaVehiculo(int fila, int columna, int ataque){
        if(fila == Jugabilidad.vehiculoUno.getPosFila() && columna == Jugabilidad.vehiculoUno.getPosColumna()){
            int vida = Jugabilidad.vehiculoUno.getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+Jugabilidad.vehiculoUno.getNombre() +" HA MUERTO");
                vida = 0;
            }
            Jugabilidad.vehiculoUno.setVida(vida);
            
        }
        if(fila == Jugabilidad.vehiculoDos.getPosFila() && columna == Jugabilidad.vehiculoDos.getPosColumna()){
            int vida = Jugabilidad.vehiculoDos.getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO "+Jugabilidad.vehiculoDos.getNombre() +" HA MUERTO");
                vida = 0;
            }
            Jugabilidad.vehiculoDos.setVida(vida);
        }
        if(fila == Jugabilidad.vehiculoTres.getPosFila() && columna == Jugabilidad.vehiculoTres.getPosColumna()){
            int vida = Jugabilidad.vehiculoTres.getVida() - ataque;
            if(vida <= 0){
                JOptionPane.showMessageDialog(null, "EL VEHICULO  "+Jugabilidad.vehiculoTres.getNombre() +"  HA MUERTO");
                vida = 0;
            }
            Jugabilidad.vehiculoTres.setVida(vida);
        }
    }
}    
