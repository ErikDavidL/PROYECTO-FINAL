
package RPG.excepciones;

public class Enteros {
    //metodo para las excepciones cuando lo que se inngresa no es un numero
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
}
